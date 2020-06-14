package com.jian.finallinux.dao;

import com.jian.finallinux.BaseTest;
import com.jian.finallinux.entity.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: qtj
 * @Date: 2020/6/13 11:49
 * @Version
 */
public class InfoDaoTest extends BaseTest {
    @Autowired
    InfoDao infoDao = null;
    @Test
    public void getPersonTest(){
        Person person ;
        person=infoDao.getPerson(1l);
        if (person != null){
            System.out.println("姓名："+ person.getPersonName());
            System.out.println("学号："+ person.getPersonNumber());
        }


    }
}
