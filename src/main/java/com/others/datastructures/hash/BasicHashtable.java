package com.others.datastructures.hash;

public class BasicHashtable<K, V> {
    private Entry[] data;
    private int capacity;
    private int size;

    public BasicHashtable(int capacity) {
        this.capacity = capacity;
        data = new Entry[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int calculateHash(K key) {
        int hash = key.hashCode() % capacity;
        while (data[hash] != null && !data[hash].getKey().equals(key)) {
            hash = (hash + 1) % capacity;
        }
        return hash;
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        int hash = calculateHash(key);
        if (data[hash] == null) {
            return null;
        } else {
            return (V) data[hash].getValue();
        }
    }

    public void put(K key, V value) {
        int hash = calculateHash(key);
        System.out.println(hash);
        data[hash] = new Entry<>(key, value);
        size++;
    }

    public V delete(K key) {
        V value = get(key);
        if (value != null) {
            int hash = calculateHash(key);
            data[hash] = null;
            size--;
            hash = (hash + 1) % capacity;
            while (data[hash] != null) {
                @SuppressWarnings("unchecked") Entry<K, V> entry = data[hash];
                data[hash] = null;
                put(entry.getKey(), entry.getValue());
                size--;
                hash = (hash + 1) % capacity;
                System.out.println("Rehashing");
            }
        }
        return value;
    }

    public boolean hasKey(K key) {
        int hash = calculateHash(key);
        if (data[hash] == null)
            return false;

        return data[hash].getKey().equals(key);
    }

    public boolean hasValue(V value) {
        for (int i = 0; i < capacity; i++) {
            @SuppressWarnings("unchecked") Entry<K, V> entry = data[i];

            if (entry != null && entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
