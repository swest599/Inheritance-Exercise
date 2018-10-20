package com.company;

public class Main {

    public static void main(String[] args) {
//    Fruit pear = new Fruit("Pear","Green Barlett","Pearish",8);
//    pear.printCharacteristics();
//
//    Apple apple = new Apple("Apple","Red","Sweet and sharp",12);
//    apple.printCharacteristics();
//
//    Orange mandarin = new Orange("Mandarin Orange", "Orange", "Sour and Tangy",9);
//    mandarin.citrusFruit();
//    Peach peach = new Peach("..","..","..", 0);
//    peach.printCharacteristics();
        Fruit pear = new Fruit("Pear","Green","Sweet", 8);
        pear.printCharacteristics(); // Method ran as expected
        Fruit apple = new Apple("Apple", "Red","Sweet and Sharp",12);
        apple.printCharacteristics(); // Method ran as expected
        Fruit orange = new Orange("Orange","Orange","Sweet and Tangy",9);
        orange.printCharacteristics(); // Method ran as expected
        Fruit peach = new Peach("Peach","Yellow/Red","Tangy and Sour", 1);
        peach.printCharacteristics(); // Method ran as expected override feature allowed the parameter inputs to be overwritten for peaches statement
    }
}
