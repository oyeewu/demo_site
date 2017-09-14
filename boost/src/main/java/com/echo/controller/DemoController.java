package com.echo.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wumeng5 on 2017/8/23.
 */
@RestController
@EnableAutoConfiguration
public class DemoController {

    @RequestMapping("/index")
    String index() {
        return "Hello World";
    }

    @RequestMapping("/fox")
    String fox(@ApiParam(name="name", value = "姓名") @RequestParam String name) {
        return name;
    }
}
