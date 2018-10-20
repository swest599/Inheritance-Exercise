package com.company;

public class Fruit {
    private String name;
    private String color;
    private String flavor;
    private int seedCount;

    public int age;

    public Fruit(String name,
                 String color,
                 String flavor,
                 int seedCount){
        this.name = name;
        this.color = color;
        this.flavor = flavor;
        this.seedCount = seedCount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getSeedCount() {
        return seedCount;
    }
    public void printCharacteristics(){
        System.out.println("I am a " + color + name + ". I am " + flavor + ". I have " + seedCount + " seeds.");
    }
}
