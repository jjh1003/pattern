package com.hong.singleton;

/**
 * @author hong
 */
public class Student implements Cloneable {

    private static final Student INSTANCE = new Student();

    private Student() {}

    public static Student getInstance() {
        return INSTANCE;
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
