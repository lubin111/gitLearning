package cn.lb.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Helloworld {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }


}
