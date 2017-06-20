package com.kg.lombokstudy.nonnull;

import lombok.NonNull;

/**
 * Created by quanquan on 2017/6/20.
 */
public class NonNullExample {

    private String name;

    /**
     * 最后解析形式如
     * <p>
     * public NonNullExample(@NonNull Person person) {
     * super("Hello");
     * if (person == null) {
     * throw new NullPointerException("person");
     * }
     * this.name = person.getName();
     * }
     * </p>
     *
     * @param person
     */
    public NonNullExample(@NonNull Person person) {
        this.name = person.getName();
    }

    public static void main(String[] args) {
        NonNullExample nonNullExample = new NonNullExample(null);
    }
}
