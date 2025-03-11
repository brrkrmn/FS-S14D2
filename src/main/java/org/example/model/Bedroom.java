package org.example.model;

public class Bedroom extends Room {
    private Wardrobe wardrobe;
    private Carpet carpet;
    private Lamp lamp;
    private Bed bed;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(name, wall1, wall2, wall3, wall4, ceiling);
        this.carpet = carpet;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
