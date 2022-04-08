package com.hong.deepclones;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @author hong
 */

@Data
public class Student implements Serializable {
    /** 姓名 */
    private String name;
    /** 年龄 */
    private String age;
    /** 爱好 */
    private List<String> hobbies;

    public Student deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Student) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
