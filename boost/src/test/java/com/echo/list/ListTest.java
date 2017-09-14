package com.echo.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wumeng5 on 2017/8/24.
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<=10; i++) {
            list.add(i);
        }
        System.out.println(list);


        Class c = List[].class;
        System.out.println(c.getComponentType());
        System.out.println(c.getClassLoader());
    }
}
