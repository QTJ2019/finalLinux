package com.jian.finallinux.service.impl;

import com.jian.finallinux.dao.InfoDao;
import com.jian.finallinux.entity.Person;
import com.jian.finallinux.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: qtj
 * @Date: 2020/6/13 12:27
 * @Version
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoDao infoDao = null;

    @Override
   public Person getPersonInfo(Long id){
       return infoDao.getPerson(id);
   }
}
