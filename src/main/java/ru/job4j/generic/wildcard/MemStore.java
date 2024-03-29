package ru.job4j.generic.wildcard;

import java.util.HashMap;
import java.util.Map;

public final class MemStore<T extends Base> implements Store<T> {

    private final Map<String, T> storage = new HashMap<>();

    @Override
    public void add(T model) {
        storage.putIfAbsent(model.getId(), model);
    }

    @Override
    public T findById(String id) {
        return storage.get(id);
    }

    @Override
    public boolean replace(String id, T model) {
        return storage.replace(id, storage.get(id), model);
    }

    @Override
    public boolean delete(String id) {
        return storage.remove(id, storage.get(id));
    }

    public static void main(String[] args) {
        MemStore<User> store = new MemStore<>();
    }
}