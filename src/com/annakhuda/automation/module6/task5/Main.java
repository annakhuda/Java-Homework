package com.annakhuda.automation.module6.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<Integer> smallArray = new ArrayList<>();
        smallArray.add(1);
        smallArray.add(2);
        smallArray.add(3);

        List<String> bigArray = new ArrayList<>();
        bigArray.add("One");
        bigArray.add("Two");
        bigArray.add("Three");
        bigArray.add("Four");
        bigArray.add("Five");

        // Variant 1
        for (Map.Entry<Integer, String> entry : convertCollectionsToMap_v1(smallArray, bigArray).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        for (Map.Entry<String, Integer> entry : convertCollectionsToMap_v1(bigArray, smallArray).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        // Variant 2
        try {
            for (Map.Entry<Integer, String> entry : convertCollectionsToMap_v2(smallArray, bigArray).entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (NotEnoughKeysException e) {
            System.out.println("Key is not enough for map");
        } catch (NotEnoughValuesException e) {
            System.out.println("Value is not enough for map");
        }

        try {
            for (Map.Entry<String, Integer> entry : convertCollectionsToMap_v2(bigArray, smallArray).entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (NotEnoughKeysException e) {
            System.out.println("Key is not enough for map");
        } catch (NotEnoughValuesException e) {
            System.out.println("Value is not enough for map");
        }

    }

    // Variant 1
    public static <K, V> Map<K, V> convertCollectionsToMap_v1(List<K> array1, List<V> array2) {
        Map<K, V> sortedMap = new TreeMap<>();
        if (array1.size() >= array2.size()) {
            int delta = array1.size() - array2.size();
            for (int i = 0; i < array1.size() - delta; i++) {
                sortedMap.put(array1.get(i), array2.get(i));
            }
            for (int i = array1.size() - delta; i < array1.size(); i++) {
                sortedMap.put(array1.get(i), null);
            }
        } else {
            for (int i = 0; i < array1.size(); i++) {
                sortedMap.put(array1.get(i), array2.get(i));
            }
        }
        return sortedMap;
    }

    // Variant 2
    public static <K, V> Map<K, V> convertCollectionsToMap_v2(List<K> array1, List<V> array2) {
        if (array1.size() < array2.size()) {
            throw new NotEnoughKeysException();
        } else if (array2.size() < array1.size()) {
            throw new NotEnoughValuesException();
        } else {
            Map<K, V> sortedMap = new TreeMap<>();
            for (int i = 0; i < array1.size(); i++) {
                sortedMap.put(array1.get(i), array2.get(i));
            }
            return sortedMap;
        }
    }
}
