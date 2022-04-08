package com.hong;

/**
 * @author hong
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory factory1 = new JavaCourseFactory();
        factory1.create().study();
        factory1.createNote().read();
        factory1.createVideo().play();
        CourseFactory factory2 = new PythonCourseFactory();
        factory2.create().study();
        factory2.createNote().read();
        factory2.createVideo().play();
    }
}
