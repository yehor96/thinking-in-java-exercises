package com.exercises.chapters.containersindepth.ex20_21;

import com.exercises.chapters.containersindepth.ex15.MapEntry;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    static final int SIZE = 997;

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
                System.out.println("Collision occurs");
                System.out.println("Removing old value - " + iPair);
                System.out.println("Adding new value - " + pair);
                break;
            }
        }

        if (!found) {
            buckets[index].add(pair);
        }
        return oldValue;
    }

    @Override
    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;

        if (buckets[index] == null)
            return null;

        for (MapEntry<K, V> iPair : buckets[index]) {
            int counter = 1;
            System.out.println("Looking for next " + counter++);
            if (iPair.getKey().equals(key))
                return iPair.getValue();
        }

        return null;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();

        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket != null)
                set.addAll(bucket);
        }
        return set;
    }
}
