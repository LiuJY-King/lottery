package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author liujinyu
 * @date 2021/1/29 15:10
 * @info：
 * @modified：
 */
@RestController
@RequestMapping("Lottery")
public class TestController {

    @RequestMapping("testUrl/{num}")
    public String chooseLottery(@PathVariable("num") int num) {
        String s = "";
        for (int i = 0; i < num; i++) {
            s += elevenChooseFive() + "<br>";
        }
        return s;
    }

    private String elevenChooseFive() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        Set<Integer> resultSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(11 - i);
            int s = list.get(index);
            resultSet.add(s);
            list.remove(index);
        }
        System.out.println(resultSet.toString());
        return resultSet.toString();
    }
}
