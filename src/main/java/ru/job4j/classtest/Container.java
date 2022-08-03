package ru.job4j.classtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Container {
    public static void reverse(List<?> list) {
        rev(list);
    }

    private static <T> void rev(List<T> list) {
        List<T> tmp = new ArrayList<T>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size() - i - 1));
        }
    }

    public static <T extends Comparable<T>> T max(Collection<T> coll) {
        T candidate = coll.iterator().next();
        for (T elt : coll) {
            if (candidate.compareTo(elt) < 0) {
                candidate = elt;
            }
        }
        return candidate;
    }



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(max(list));
    }
}
