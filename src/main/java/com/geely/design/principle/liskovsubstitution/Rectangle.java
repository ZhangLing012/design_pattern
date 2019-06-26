package com.geely.design.principle.liskovsubstitution;

/**
 * Created by geely
 */
public class Rectangle implements Quadrangle {
    private long length;
    private long width;

    @Override
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
