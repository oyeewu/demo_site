package com.echo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wumeng5 on 2017/9/12.
 */
@RestController
@RequestMapping("/user")
@Api("test相关API")
public class SwaggerController {

    @ApiOperation("测试方法")
    @RequestMapping("/getUser")
    public String getTest(@RequestParam("name") String name) {
        System.out.println("name :" + name);
        return name;
    }
}
