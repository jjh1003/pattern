package com.hong;

/**
 * @author hong
 * @date 2022年4月7日
 */
public class CourseFactory {
    public ICourse create(Class<? extends  ICourse> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
