package com.hong;

public class PythonCourseFactory extends CourseFactory{
    @Override
    ICourse create() {
        return new PythonCourse();
    }

    @Override
    INote createNote() {
        return new PythonNote();
    }

    @Override
    IVideo createVideo() {
        return new PythonVideo();
    }
}
