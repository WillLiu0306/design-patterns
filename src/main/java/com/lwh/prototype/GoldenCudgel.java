package com.lwh.prototype;

import java.io.Serializable;

/**
 * 金箍棒
 */
public class GoldenCudgel implements Serializable{
    private String color;
    private Long length;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }
}
