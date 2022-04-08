package com.hong.shallowclones;

import lombok.Data;

import java.util.List;

/**
 * @author hong
 */

@Data
public class Student implements Cloneable {
    //姓名
    private String name;
    //年龄
    private String age;
    //爱好
    private List<String> hobbies;

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
