package com.bjpowernode.controller;

import com.bjpowernode.model.Cat;
import com.bjpowernode.model.SysUser;
import com.bjpowernode.model.Zoo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * 徐梦凡
 * 2021/6/25
 */
@Controller
public class ThymeleafController {

    //标准变量表达式
    @GetMapping("/exp1")
    public String exp1(Model model){
        model.addAttribute("name", "动力节点");
        model.addAttribute("site", "http://www.bjpowernode.com");

        SysUser su1 = new SysUser(1001, "张三", "m", 21);
        model.addAttribute("user", su1);

        return "01-exp1";
    }


    //选择表达式
    @GetMapping("/exp2")
    public String exp2(Model model){
        SysUser su1 = new SysUser(1002, "李四", "m", 20);
        model.addAttribute("user", su1);
        return "02-exp2";
    }

    //链接表达式
    @GetMapping("/exp3")
    public String exp3(Model model){
        model.addAttribute("stuId", "1600");
        model.addAttribute("name", "lisi");
        model.addAttribute("schoolname", "powernode");
        return "03-exp3";
    }

        @GetMapping("/query/account")
        @ResponseBody
    public String queryAccount(Integer id){
        return "查询账号，id=" + id;
    }

    @GetMapping("/find/student")
    @ResponseBody
    public String findStudent(String name,String schoolname){
        return "查找学生：name=" + name + ",school=" + schoolname;
    }

    //Thymeleaf属性
    @GetMapping("/prop")
    public String doProperty(Model model){
        model.addAttribute("url", "/find/school");
        model.addAttribute("method", "post");
        model.addAttribute("name", "lisi");
        model.addAttribute("id", "myName");
        return "04-prop";
    }

    //循环list<String>
    @GetMapping("/eachList")
    public String eachList(Model model){
        List<String> strList = new ArrayList<>();
        strList.add("三国演义");
        strList.add("水浒传");
        strList.add("西游记");
        strList.add("红楼梦");
        model.addAttribute("strList", strList);

        //添加对象到list
        List<SysUser> users = new ArrayList<>();
        users.add(new SysUser(1001, "施耐庵", "m", 20));
        users.add(new SysUser(1002, "罗贯中", "f", 22));
        users.add(new SysUser(1003, "曹雪芹", "m", 26));
        users.add(new SysUser(1004, "吴承恩", "m", 27));
        model.addAttribute("users", users);

        return "05-eachlist";
    }

    //循环array
    @GetMapping("/eachArray")
    public String eachArray(Model model){
       SysUser []users = new SysUser[3];
       users[0] = new SysUser(1001, "施耐庵", "m", 20);
       users[1] = new SysUser(1002, "罗贯中", "f", 22);
       users[2] = new SysUser(1003, "曹雪芹", "m", 26);
        model.addAttribute("users", users);
        return "06-eacharray";
    }


    //循环map
    @GetMapping("/eachMap")
    public String eachMap(Model model){
        Map<String,SysUser> maps = new HashMap<>();
        maps.put("user1", new SysUser(1001, "施耐庵1", "m", 21));
        maps.put("user2", new SysUser(1002, "施耐庵2", "m", 22));
        maps.put("user3", new SysUser(1003, "施耐庵3", "m", 23));
        maps.put("user4", new SysUser(1004, "施耐庵4", "m", 24));
        model.addAttribute("users", maps);
        return "07-eachmap";
    }

    //判断if和unless
    @GetMapping("/ifunless")
    public String ifunless(Model model){

        model.addAttribute("name", "lisi");
        model.addAttribute("nick", "");
        model.addAttribute("login", true);
        model.addAttribute("marry", false);
        return "08-ifunless";
    }

    //判断if和unless
    @GetMapping("/inline")
    public String inline(Model model){

        model.addAttribute("name", "徐梦凡");
        model.addAttribute("nick", "小仙女");
        model.addAttribute("login", true);
        model.addAttribute("marry", false);
        return "09-inline";
    }

    //内置对象
    @GetMapping("/inObject")
    public String inObject(Model model, HttpServletRequest request, HttpSession session){
        request.setAttribute("name", "李四");
        session.setAttribute("myName", "李四兄弟");
        return "10-inobject";
    }

    //工具类对象
    @GetMapping("/utilobject")
    public String utilobject(Model model){
        model.addAttribute("mydate", new Date());
        model.addAttribute("mystr", "bjpowernode");
        model.addAttribute("mynum", 26.695);
        List<String> list = Arrays.asList("spring","springmvc","springboot");
        model.addAttribute("strlist", list);

        Cat cat = new Cat();
        cat.setName("蓝猫");
        Zoo zoo = new Zoo();
//        zoo.setCat(cat); 如果没有给cat赋值，也就是为null
        model.addAttribute("zoo", zoo);
        return "11-utilobject";
    }


}
