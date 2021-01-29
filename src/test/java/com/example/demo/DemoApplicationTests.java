package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("6");
        System.out.println("list:" + list.toString());
        HashSet<Object> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("6");
        System.out.println("set:" + set.toString());
        String[] strings = new String[]{"1","2","3","4","5","6","7"};
        HashSet<Object> set2 = new HashSet<>(Arrays.asList(strings));
        System.out.println("set2:"+set2.toString());
        HashSet<Object> set1 = new HashSet<>();
        list.stream().forEach(s -> set1.add(s));
        System.out.println("set1:"+set1.toString());
    }

}
