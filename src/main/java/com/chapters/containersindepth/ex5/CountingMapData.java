package com.chapters.containersindepth.ex5;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountingMapData extends AbstractMap<Integer, String> {

    private static final String[] CHARS = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
    private int size;

    public CountingMapData(int size) {
        if (size < 0) this.size = 0;
        this.size = size;
    }

    private static class Entry implements Map.Entry<Integer, String> {
        int index;

        Entry(int index) {
            this.index = index;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Integer) {
                return Integer.valueOf(index).equals(o);
            }
            return false;
        }

        public Integer getKey() {
            return index;
        }

        public String getValue() {
            return CHARS[index % CHARS.length] + index / CHARS.length;
        }

        public String setValue(String value) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            return Integer.valueOf(index).hashCode();
        }
    }

    static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {
        private int size;

        EntrySet(int size) {
            if (size < 0)
                this.size = 0;
            else
                this.size = Math.min(size, CHARS.length);
        }

        public int size() {
            return size;
        }

        private class Iter implements Iterator<Map.Entry<Integer, String>> {
            private Entry entry = new Entry(-1);

            public boolean hasNext() {
                return entry.index < size - 1;
            }

            public Map.Entry<Integer, String> next() {
                entry.index++;
                return entry;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public Iterator<Map.Entry<Integer, String>> iterator() {
            return new Iter();
        }
    }

    private static final Set<Map.Entry<Integer, String>> entries = new EntrySet(CHARS.length);

    public Set<Map.Entry<Integer, String>> entrySet() {
        return entries;
    }

    public static void main(String[] args) {
        System.out.println(new CountingMapData(60));
    }
}