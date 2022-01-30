package com.annakhuda.automation.module6.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> baseMap = new HashMap<>();
        baseMap.put(1, "a");
        baseMap.put(2, "aa");
        baseMap.put(3, "a");
        baseMap.put(4, "aa");
        baseMap.put(5, "a");
        for (Map.Entry<String, Collection<Integer>> entry : swapKeyValue(baseMap).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static <K, V> Map<V, Collection<K>> swapKeyValue(Map<K, V> baseMap) {
        Map<V, Collection<K>> swappedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : baseMap.entrySet()) {
            if (swappedMap.containsKey(entry.getValue())) {
                swappedMap.get(entry.getValue()).add(entry.getKey());
            } else {
                Collection<K> listOfValues = new ArrayList<K>();
                listOfValues.add(entry.getKey());
                swappedMap.put(entry.getValue(), listOfValues);
            }
        }
        return swappedMap;
    }
}
