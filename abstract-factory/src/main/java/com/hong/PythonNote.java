package com.hong;

import lombok.Data;

/**
 * @author hong
 */
@Data
public class PythonNote implements INote{

    private String note;
    public PythonNote() {
        this.note = "Python";
    }

    @Override
    public void read() {
        System.out.println("Read "+ note);
    }
}
