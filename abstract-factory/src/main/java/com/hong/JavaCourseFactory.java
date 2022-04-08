package com.hong;

/**
 * @author hong
 */
public class JavaCourseFactory extends CourseFactory{
    @Override
    ICourse create() {
        return new JavaCourse();
    }

    @Override
    INote createNote() {
        return new JavaNote();
    }

    @Override
    IVideo createVideo() {
        return new JavaVideo();
    }
}
