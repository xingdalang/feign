package com.cloud.feign.controller;

import com.cloud.feign.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xingguanghui
 * @create 2017-11-08 17:56
 **/
@Controller
public class FeignController {
    @Autowired
    SchedualService schedualService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public String sayHi(@RequestParam String n) {
        return schedualService.sayHiFromClientOne(n);
    }
}
