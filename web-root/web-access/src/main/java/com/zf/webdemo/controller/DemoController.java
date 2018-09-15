package com.zf.webdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mrjyn on 2018/9/15.
 */
@RestController
@RequestMapping(value = "/demo/")
public class DemoController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello hello ";
    }

}
