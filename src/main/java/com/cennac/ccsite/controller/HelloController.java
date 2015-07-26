package com.cennac.ccsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Cennac on 2015/7/26.
 */
@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("index")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String get(){
        return "hello";
    }

    @RequestMapping(value = "param",method = RequestMethod.GET,params = {"username=1","age!=10"})
    public String param(){
        return "hello";
    }

//    @RequestMapping(value = "param",method = RequestMethod.GET,headers = {})
//    public String header(){
//        return "hello";
//    }


    @RequestMapping("pathvalue/{id}")
    public String pathValue(@PathVariable("id") int id)
    {
        System.out.println("id:"+id);
        return "hello";
    }
}
