package com.hong;

import lombok.Data;

/**
 * @author hong
 * @date 2022年4月7日
 */
@Data
public class PythonCourse implements ICourse{
    private String name;

    public PythonCourse() {
        this.name = "Python";
    }

    @Override
    public void study() {
        System.out.println("Studying "+name);
    }
}
