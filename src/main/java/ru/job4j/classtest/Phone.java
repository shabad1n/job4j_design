package ru.job4j.classtest;

public class Phone extends Product {

    private String model;
    public Phone(String name, int price, String model) {
        super(name, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
