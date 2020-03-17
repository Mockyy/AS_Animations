package com.example.animation;

import android.media.Image;

public class Pokemon_info {

    private int anim;
    private String name;
    private String type;

    public Pokemon_info(int anim, String name, String type) {
        this.anim = anim;
        this.name = name;
        this.type = type;
    }

    public int getAnim() {
        return anim;
    }

    public void setAnim(int anim) {
        this.anim = anim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
