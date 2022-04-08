package com.hong;

/**
 * @author hong
 */
public abstract class CourseFactory {
    abstract ICourse create();
    abstract INote createNote();
    abstract IVideo createVideo();
}
