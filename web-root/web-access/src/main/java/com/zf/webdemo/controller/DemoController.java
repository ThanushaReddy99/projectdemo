package com.zf.webdemo.controller;

import com.zf.webdemo.domain.Person;
import com.zf.webdemo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mrjyn on 2018/9/15.
 */
@RestController
@RequestMapping(value = "/demo/")
public class DemoController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello hello ";
    }

    @RequestMapping(value = "/getOne",method = RequestMethod.GET)
    public String getPerson(int idCard){
        Person person = personMapper.getPersonByIdCard(idCard);
        String name = person.getName();
        return name;

    }

}
