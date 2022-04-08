package com.hong;

import lombok.Data;

/**
 * @author hong
 */
@Data
public class JavaVideo implements IVideo{

    private String video;
    public JavaVideo() {
        this.video = "Java";
    }

    @Override
    public void play() {
        System.out.println("Play "+video);
    }
}
