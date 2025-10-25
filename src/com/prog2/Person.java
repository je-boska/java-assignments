package com.prog2;

public class Person {
    private int age;
    private String name;

    /**
     * Constructor
     * @param age
     * @param name
     */
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Instance method
     */
    public void speak() {
        System.out.println("Hi, I'm " + name + ", and I'm " + age + " years old.");
    }

    /**
     * Class(static) method
     */
    public static void staticSpeak(String name, int age) {
        System.out.println("Hi, you're " + name + ", and you are " + age + " years old.");
    }
}
