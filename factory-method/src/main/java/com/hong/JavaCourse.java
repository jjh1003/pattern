package com.hong;

import lombok.Data;

/**
 * @author hong
 * @Date 2022年4月7日
 */
@Data
public class JavaCourse implements ICourse{
    private String name;

    public JavaCourse() {
        this.name = "Java";
    }

    @Override
    public void study() {
        System.out.println("Studying "+name);
    }
}
