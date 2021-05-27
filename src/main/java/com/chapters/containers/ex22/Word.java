package com.chapters.containers.ex22;

public class Word implements Comparable<Word> {

    private String word;
    private int counter;

    public Word(String word) {
        this(word, 1);
    }

    public Word(String word, int counter) {
        this.word = word.toLowerCase();
        this.counter = counter;
    }

    public void incrementCounter() {
        counter++;
    }

    @Override
    public String toString() {
        return word + " = " + counter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Word)) {
            return false;
        }

        Word object = (Word) o;
        return object.word.equals(word);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + word.hashCode();
        return result;
    }

    @Override
    public int compareTo(Word o) {
        return this.word.compareTo(o.word);
    }
}
