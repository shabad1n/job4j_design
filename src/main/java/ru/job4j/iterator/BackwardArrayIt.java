package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import java.util.Iterator;


public class BackwardArrayIt implements Iterator<Integer> {
    private final int[] data;
    private int point = 0;

    public BackwardArrayIt(int[] data) {
        this.data = data;
        point = data.length - 1;
    }

    @Override
    public boolean hasNext() {
        return point >= 0;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[point--];
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        BackwardArrayIt backwardArrayIt = new BackwardArrayIt(array);
        while (backwardArrayIt.hasNext()) {
            System.out.println(backwardArrayIt.next());
        }
    }
}
