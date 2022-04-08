package com.hong;

/**
 * @author hong
 * @date 2022年4月7日
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new CourseFactory().create(JavaCourse.class);
        javaCourse.study();
        ICourse pythonCourse = new CourseFactory().create(PythonCourse.class);
        pythonCourse.study();

    }
}
