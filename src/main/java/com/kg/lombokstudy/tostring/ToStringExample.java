package com.kg.lombokstudy.tostring;

import lombok.Getter;
import lombok.ToString;

/**
 * Created by quanquan on 2017/6/20.
 */
@ToString(exclude = "id")
public class ToStringExample {
    private static final int STATIC_VAR = 10;
    @Getter
    private String name;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    private int id;

    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
