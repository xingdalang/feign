package com.cloud.feign.service.impl;

import com.cloud.feign.service.SchedualService;
import org.springframework.stereotype.Component;

/**
 * @author xingguanghui
 * @create 2017-11-08 18:11
 **/
@Component
public class SchedualServiceHiHystric implements SchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
