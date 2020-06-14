package com.jian.finallinux.service;

import com.jian.finallinux.BaseTest;
import com.jian.finallinux.entity.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: qtj
 * @Date: 2020/6/13 19:07
 * @Version
 */
public class InfoServiceImplTest extends BaseTest {
    @Autowired
    InfoService infoService = null;

    @Test
    public void getPersonInfoTest() {
        Person person = infoService.getPersonInfo(1l);
        System.out.println("姓名：" + person.getPersonName());
        System.out.println("学号："+ person.getPersonNumber());
    }
}
