package com.me;
//from bed class
//step 19 make Lamp class
public class Lamp {

    //step 20 fields
    private String style;
    private boolean battery;
    private int globeRating;

    //step 21 constructor
    public Lamp(String style, boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    //step 23 create a method to turn on lamp, then....
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    //step 22 getters
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}

// step 24 make sure all errors are gone in bedroom class
