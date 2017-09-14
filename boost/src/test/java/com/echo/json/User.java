package com.echo.json;

import java.sql.Timestamp;

/**
 * Created by wumeng5 on 2017/9/8.
 */
public class User {
    String userName;
    Timestamp st;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getSt() {
        return st;
    }

    public void setSt(Timestamp st) {
        this.st = st;
    }
}
