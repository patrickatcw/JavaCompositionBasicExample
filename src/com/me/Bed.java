package com.me;
//from ceiling class
//step 14 create bed class
public class Bed {

    //step 15 fields
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    //step 16 constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    //step 18 create method for make in bedroom class makebed method
    //next make a lamp class
    public void make(){
        System.out.println("Bed -> Making");
    }

    //step 17 getters
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}

//next make a lamp class, step 19
