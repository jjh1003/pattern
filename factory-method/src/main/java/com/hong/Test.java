package com.hong;

/**
 * @author hong
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourseFactory().create();
        javaCourse.study();
        ICourse pythonCourse = new PythonCourseFactory().create();
        pythonCourse.study();
    }
}
