package org.example.model;

public class Bedroom{
    private Room room;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(Bed bed, Lamp lamp, Room room) {
        this.room = room;
        this.bed = bed;
        this.lamp = lamp;

    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

}


