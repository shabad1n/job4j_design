package ru.job4j.generic;

public class Predator extends Animal {
    private int numOfTeeth;

    public Predator(String name, int age, int numOfTeeth) {
        super(name, age);
        this.numOfTeeth = numOfTeeth;
    }

    @Override
    public String toString() {
        return "Predator{"
                + "numOfTeeth="
                + numOfTeeth + '}';
    }
}
