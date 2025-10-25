package com.prog2;

import java.util.HashMap;

public class MostFrequentElement {
    public static String findMostFrequentElement(String[] arr) {
        HashMap<String, Integer> freqs = new HashMap<>();
        for (String s : arr) {
            int qty = 0;
            if (freqs.containsKey(s)) {
                qty = freqs.getOrDefault(s, 0);
            }
            freqs.put(s, qty + 1);
        }

        int highestFreq = 0;
        String mostFrequentElement = "";

        for (String el : freqs.keySet()) {
            int q = freqs.get(el);
            if (q > highestFreq) {
                highestFreq = q;
                mostFrequentElement = el;
            }
        }

        return mostFrequentElement;
    }
}
