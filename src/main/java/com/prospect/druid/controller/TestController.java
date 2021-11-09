package com.prospect.druid.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ant
 * @Date: 2021/11/9 12:55 下午
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello druid example";
    }

    @GetMapping("/stat")
    public Object stat() {
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
