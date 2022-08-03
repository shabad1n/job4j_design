package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIt implements Iterator<Integer> {
    private final int[][] data;
    private int row = 0;
    private int column = 0;

    public MatrixIt(int[][] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
       while (data.length > row && column >= data[row].length) {
           row++;
           column = 0;
       }
       return data.length > row;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[row][column++];
    }

    public static void main(String[] args) {
        int[][] in = {{5}, {}, {}};
        MatrixIt matrixIt = new MatrixIt(in);
        while (matrixIt.hasNext()) {
            System.out.println(matrixIt.next());
        }
        System.out.println(matrixIt.row + " " + matrixIt.column);
    }
}
