package com.company.model;

public class SaveFileDto{
    private float x;
    private float y;
    public SaveFileDto(){};

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public SaveFileDto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "SaveFileDto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
