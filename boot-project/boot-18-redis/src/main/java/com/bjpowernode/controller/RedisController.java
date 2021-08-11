package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.PublicKey;

/**
 * 徐梦凡
 * 2021/6/24
 */
@RestController
public class RedisController {

    //注入创建好的redis模板类对象
    @Resource
    private RedisTemplate redisTemplate;

    //StringRedisTemplate就是
    //这是key内容使用字符串
    //redisTemplate.setKeySerializer(new StringRedisSerializer());
    //这是value内容使用字符串
    //redisTemplate.setValueSerializer(new StringRedisSerializer());
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/add")
    public String addKey(String name,String value){
        //使用opsForXXX方法获取对应的类型，使用这个类型的方法操作redis数据
        redisTemplate.opsForValue().set(name, value);
        return "添加数据到redis";
    }

    @GetMapping("/get")
    public Object getString(String k){
        ValueOperations vo = redisTemplate.opsForValue();
        Object v = vo.get(k);
        return v;
    }

    //使用字符串序列化,把数据变成字符的方式存储
    @PostMapping("/addstr")
    public String addSttring(String k,String v){
        //先设置redisTemplate要是用的序列化方式
        //这是key内容使用字符串
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        ////这是value内容使用字符串
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        redisTemplate.opsForValue().set(k, v);
        return "使用字符串序列化";
    }

    @GetMapping("/getstr")
    public String getStr(String k){
        //先设置redisTemplate要是用的序列化方式
        //这是key内容使用字符串
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        ////这是value内容使用字符串
        redisTemplate.setValueSerializer(new StringRedisSerializer());

        return (String) redisTemplate.opsForValue().get(k);
    }


    @PostMapping("/addString")
    public String addString(String k,String v){
        stringRedisTemplate.opsForValue().set(k, v);
        return "add string";
    }
}
