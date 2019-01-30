package com.github.meow;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.provider.MediaStore;

public class Object {
    private String name;
    private int image;
    private int sound;

    public Object(String name, int image, int sound){
        this.name = name;
        this.image = image;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getSound() {
        return sound;
    }
}
