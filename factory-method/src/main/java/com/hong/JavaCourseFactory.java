package com.hong;

/**
 * @author hong
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
