package com.company;

public class Orange extends Fruit {
    public Orange(String name,
                  String color,
                  String flavor,
                  int seedCount) {
        super(name, color, flavor, seedCount);
    }
    public void citrusFruit(){
        System.out.println("The " + getName() + " is a citrus fruit");
    }

}
