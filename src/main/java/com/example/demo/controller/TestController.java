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
@RequestMapping("lottery")
public class TestController {
    /**
     * @info: 11选5生成号码
     * @params: total  生成总组数
	 * @params: num    每组个数
     * @return: java.lang.String
     * @author: liujinyu
     * @create 2021/2/1
     * @update
     */
    @RequestMapping("testUrl/{total}/{num}")
    public String chooseLottery(@PathVariable("total") int total,@PathVariable("num") int num) {
        String s = "";
        for (int i = 0; i < total; i++) {
            s += elevenChooseFive(num) + "<br>";
        }
        return s;
    }
    private String elevenChooseFive(int num) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i + 1);
        }
        Set<Integer> resultSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            int index = random.nextInt(11 - i);
            int s = list.get(index);
            resultSet.add(s);
            list.remove(index);
        }
        System.out.println(resultSet.toString());
        return resultSet.toString();
    }
}
