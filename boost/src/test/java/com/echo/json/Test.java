package com.echo.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.sql.Timestamp;

/**
 * Created by wumeng5 on 2017/9/8.
 */
public class Test {

    public static void main(String[] args) {
        User u = new User();
        u.setSt(new Timestamp(System.currentTimeMillis()));
        u.setUserName("username");
        System.out.println(JSON.toJSONString(u));

        System.out.println(JSON.toJSONString(u, SerializerFeature.UseISO8601DateFormat));
        System.out.println(JSON.toJSONString(u, SerializerFeature.UseISO8601DateFormat));
        System.out.println(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss.SSS"));



    }
}
