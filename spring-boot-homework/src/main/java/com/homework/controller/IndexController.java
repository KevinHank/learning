package com.homework.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Hukai
 * 2018/9/13 23:31
 */
@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        log.info("=========================>  这是首页");

        return "index";
    }
}
