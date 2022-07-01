package com.jiyun.demo1.web;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
    @RequestMapping("/1")
    public String heloo(){
        return "hello";
    }
}
