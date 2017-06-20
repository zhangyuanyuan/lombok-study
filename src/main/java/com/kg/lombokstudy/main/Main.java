package com.kg.lombokstudy.main;

import lombok.val;

import java.util.ArrayList;

/**
 * 测试 lombok中 val 的用法
 * var 作为变量申明，val作为常量申明
 * Created by quanquan on 2017/6/20.
 */
public class Main {

    public static String example() {
        val example = new ArrayList<String>();
        example.add("Hello world");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(example());
    }

}
