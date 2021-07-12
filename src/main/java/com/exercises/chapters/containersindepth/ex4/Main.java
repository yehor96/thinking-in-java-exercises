package com.exercises.chapters.containersindepth.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        final String filePath = "src\\main\\resources\\Words.txt";

        List<String> wordsAsIs = new ArrayList<>(
                CollectionInitializer.getWordsAsListFrom(filePath));
        List<String> wordsInOrder = new ArrayList<>(
                CollectionInitializer.getWordsAsListInOrderFrom(filePath));
        List<String> wordsInReversedOrder = new ArrayList<>(
                CollectionInitializer.getWordsAsListInReversedOrderFrom(filePath));

        Set<String> allUniqueWords = new TreeSet<>(wordsAsIs);
        allUniqueWords.addAll(wordsInOrder);
        allUniqueWords.addAll(wordsInReversedOrder);

        System.out.println("wordsAsIs: " + wordsAsIs);
        System.out.println("wordsInOrder: " + wordsInOrder);
        System.out.println("wordsInReversedOrder " + wordsInReversedOrder);
        System.out.println("allUniqueWords " + allUniqueWords);
    }
}
