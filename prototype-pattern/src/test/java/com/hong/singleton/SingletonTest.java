package com.hong.singleton;

/**
 * @author hong
 */
public class SingletonTest {
    public static void main(String[] args) {
        Student prototype = Student.getInstance();
        Student cloneType = prototype.clone();
        System.out.println(prototype==cloneType);
    }
}
