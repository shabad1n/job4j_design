package ru.job4j.generics.task;

public class Tiger extends Predator {
    private int size;

    public Tiger(String name, int age, int numOfTeeth, int size) {
        super(name, age, numOfTeeth);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tiger{"
                + "size="
                + size + '}';
    }
}
