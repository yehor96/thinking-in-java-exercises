package com.exercises.chapters.containersindepth.ex23;

import com.exercises.chapters.containersindepth.ex15.MapEntry;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    private static final int SIZE = 997;
    private int length = 0;

    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;

        if (buckets[index] == null)
            buckets[index] = new LinkedList<>();
        LinkedList<MapEntry<K, V>> bucket = buckets[index];

        MapEntry<K, V> pair = new MapEntry<>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }

        if (!found) {
            buckets[index].add(pair);
            length++;
        }
        return oldValue;
    }

    @Override
    public V remove(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;

        if (buckets[index] == null)
            return null;

        V value = null;
        for (MapEntry<K, V> iPair : buckets[index]) {
            if (iPair.getKey().equals(key)) {
                value = iPair.getValue();
                if (buckets[index].size() == 1) {
                    buckets[index] = null;
                } else {
                    iPair.setValue(null);
                    iPair.setKey(null);
                }
                length--;
            }
        }
        return value;
    }

    @Override
    public void clear() {
        buckets = new LinkedList[SIZE];
        length = 0;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key) != null;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;

        if (buckets[index] == null)
            return null;

        for (MapEntry<K, V> iPair : buckets[index]) {
            if (iPair.getKey().equals(key))
                return iPair.getValue();
        }

        return null;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = new HashSet<>();

        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket != null)
                set.addAll(bucket);
        }
        return set;
    }
}
