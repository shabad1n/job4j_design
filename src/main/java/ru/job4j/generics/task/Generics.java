package ru.job4j.generics.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Generics gen = new Generics();
        List<Animal> first = new ArrayList<>();
        List<Predator> second = new ArrayList<>();
        List<Tiger> third = new ArrayList<>();
        first.add(new Animal("Барсик", 5));
        second.add(new Predator("Рыжик", 4, 17));
        third.add(new Tiger("Маркус", 3, 17, 42));

        gen.printObject(first);
        gen.printObject(second);
        gen.printObject(third);
        System.out.println();

        /*gen.printBoundedWildCard(first);*/
        gen.printBoundedWildCard(second);
        gen.printBoundedWildCard(third);
        System.out.println();

        gen.printLowerBoundedWildCard(first);
        gen.printLowerBoundedWildCard(second);
        /*gen.printLowerBoundedWildCard(third);*/
    }

    public void printObject(List<?> list) {
        for (Iterator<?> it = list.iterator(); it.hasNext();) {
            Object next = it.next();
            System.out.println("Текущий элемент: " + next);
            for (int i = 0; i != 10; i++) {
                System.out.println("Hello, gerls");
            }
        }
    }

    public void printObject(int a, int b) {
        System.out.println(a + b);
    }

    public void printBoundedWildCard(List<? extends Predator> list) {
        for (Iterator<? extends Predator> it = list.iterator(); it.hasNext();) {
            Object next = it.next();
            System.out.println("Текущий элемент: " + next);
        }
    }

    public void printLowerBoundedWildCard(List<? super Predator> list) {
        for (Iterator<? super Predator> it = list.iterator(); it.hasNext();) {
            Object next = it.next();
            System.out.println("Текущий элемент: " + next);
        }
    }
}