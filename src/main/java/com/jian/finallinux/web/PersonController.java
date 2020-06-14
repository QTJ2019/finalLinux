package com.jian.finallinux.web;

import com.jian.finallinux.entity.Person;
import com.jian.finallinux.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: qtj
 * @Date: 2020/6/12 18:37
 * @Version
 */
@Controller
@RequestMapping("/info")
public class PersonController {
    @Autowired
    private InfoService infoService;

    @RequestMapping("/getpersoninfo/{id}")
    @ResponseBody
    private Map<String, Object> getTest(@PathVariable("id") Long id){
        Map<String, Object> modelMap = new HashMap<>();
        List<Person> personList = new ArrayList<>();
        if (id >-1){
            Person person = infoService.getPersonInfo(id);
            personList.add(person);
            modelMap.put("success", true);
            modelMap.put("personList", personList);
        }else {
            modelMap.put("success",false);
            modelMap.put("errMsg", "查询失败");
        }
        return modelMap;
    }


}
