package com.me;
//step 24 make sure all initial errors are gone here
//step 1 make Bedroom class
public class Bedroom {

    //step 2
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    //step 3 constructor
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    //step 4 getter for lamp
    public Lamp getLamp() {
        return lamp;
    }

    //step 5 method for making bed
    public void makeBed(){
        System.out.println("Bedroom -> Making bed");
        bed.make();     //calling method make in bed class
    }

}

//next step 6 is to make wall class
//errors will go away as progress, varify after complete
//classes and associated logic
