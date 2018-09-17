package com.zf.webdemo.mapper;

import com.zf.webdemo.domain.Person;

/**
 * Created by mrjyn on 2018/9/17.
 */
public interface PersonMapper {

    Person getPersonByIdCard(int idCard);
}
