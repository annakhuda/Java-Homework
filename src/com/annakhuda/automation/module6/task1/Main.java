package com.annakhuda.automation.module6.task1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world";
        for (Map.Entry<Character, Integer> entry : makeFrequencyDictionary(text).entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static TreeMap<Character, Integer> makeFrequencyDictionary(String text) {
        TreeMap<Character, Integer> frequentDictionary = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = Character.toUpperCase(text.charAt(i));
            if (Character.isAlphabetic(currentChar)) {
                if (!frequentDictionary.containsKey(currentChar)) {
                    frequentDictionary.put(currentChar, 1);
                } else {
                    frequentDictionary.put(currentChar, frequentDictionary.get(currentChar) + 1);
                }
            }
        }
        return frequentDictionary;
    }
}


