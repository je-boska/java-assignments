package com.pflichtaufgabe;

import java.util.Arrays;

public class StringOperationen {
    String name = "Fred";
    static int age = 24;
    static int[] nums = {2, 56, 2, 11, 147};

    public static void printNums() {
        System.out.print(Arrays.toString(nums));
    }

    private void test() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        System.out.println("Fred, " + age);
        System.out.println(Arrays.toString(nums));
        StringOperationen stringOperationen = new StringOperationen();
        System.out.println("Name: " + stringOperationen.name);
        printNums();
    }
}
