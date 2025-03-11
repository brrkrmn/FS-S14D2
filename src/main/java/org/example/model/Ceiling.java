package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private PaintColor color;
    private int height;

    public Ceiling(int height, PaintColor color) {
        this.color = color;
        this.height = height;
    }

    public void create() {
        System.out.println("Ceiling has been built.");
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }
}
