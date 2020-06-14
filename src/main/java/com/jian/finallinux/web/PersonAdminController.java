package com.jian.finallinux.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: qtj
 * @Date: 2020/6/13 23:05
 * @Version
 */
@Controller
@RequestMapping("/person")
public class PersonAdminController {

    @RequestMapping("/getpersoninfo")
    public String getPersonInfo(){
        return "/show";
    }

}
