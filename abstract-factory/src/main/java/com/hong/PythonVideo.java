package com.hong;

import lombok.Data;

/**
 * @author hong
 */
@Data
public class PythonVideo implements IVideo{
    private String video;

    public PythonVideo() {
        this.video = "Python";
    }

    @Override
    public void play() {
        System.out.println("Play "+video);
    }
}
