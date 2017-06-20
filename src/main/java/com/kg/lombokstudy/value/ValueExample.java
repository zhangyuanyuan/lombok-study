package com.kg.lombokstudy.value;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;

/**
 * @Value 就是 @Data 的不可变版本
 * Created by quanquan on 2017/6/20.
 */
@Value
public class ValueExample {
    String name;

    @Wither(AccessLevel.PACKAGE)
    @NonFinal
    int age;

    double score;

    protected String[] tags;

    @ToString(includeFieldNames=true)
    @Value(staticConstructor="of")
    public static class Exercise<T> {
        String name;
        T value;
    }
}
