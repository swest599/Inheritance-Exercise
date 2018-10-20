package com.company;

public class Peach extends Fruit {
        public Peach(String name, String color, String flavor, int seedCount) {
        super(name, color, flavor, seedCount);
    }


    @Override
    public void printCharacteristics() {
       //super.printCharacteristics();
             System.out.println("I am a Peach. I refuse to follow your rules - I will make my own, thank you very much...");;
    }
}
