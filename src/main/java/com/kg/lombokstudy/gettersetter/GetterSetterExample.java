package com.kg.lombokstudy.gettersetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by quanquan on 2017/6/20.
 */
public class GetterSetterExample {

    @Getter
    @Setter
    private int age;

    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Override
    public String toString() {
        return "GetterSetterExample{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
