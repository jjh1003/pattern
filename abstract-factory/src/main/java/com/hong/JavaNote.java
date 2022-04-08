package com.hong;

import lombok.Data;

/**
 * @author hong
 */
@Data
public class JavaNote implements INote{
    private String note;

    public JavaNote() {
        this.note = "Java";
    }

    @Override
    public void read() {
        System.out.println("Read "+ note);
    }
}
