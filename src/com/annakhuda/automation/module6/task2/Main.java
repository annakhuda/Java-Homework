package com.annakhuda.automation.module6.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringsWithDuplicates = new ArrayList<>();
        stringsWithDuplicates.add("text");
        stringsWithDuplicates.add("text1");
        stringsWithDuplicates.add("text2");
        stringsWithDuplicates.add("text");
        stringsWithDuplicates.add("text3");
        stringsWithDuplicates.add("text5");
        stringsWithDuplicates.add("text3");
        for (String i : deleteDuplicates(stringsWithDuplicates)) {
            System.out.print(i + " ");
        }
    }

    public static <V> List<V> deleteDuplicates(List<V> collectionWithDuplicates) {
        List<V> collectionWithoutDuplicates = new ArrayList<V>();
        for (V element : collectionWithDuplicates) {
            if (!collectionWithoutDuplicates.contains(element)) {
                collectionWithoutDuplicates.add(element);
            }
        }
        return collectionWithoutDuplicates;
    }
}
