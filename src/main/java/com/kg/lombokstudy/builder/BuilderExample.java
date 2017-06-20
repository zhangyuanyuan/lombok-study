package com.kg.lombokstudy.builder;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;

/**
 * Created by quanquan on 2017/6/20.
 */
@Builder
public class BuilderExample {
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
}
