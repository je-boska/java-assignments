package com.prog2;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Javadoc[] jd = new Javadoc[8];
        jd[2] = new Javadoc();
        jd[5] = new Javadoc();
        jd[2].print("bucko");
        System.out.println(Arrays.toString(jd));

        Person joe = new Person(24, "Joe");
        joe.speak();
        joe.staticSpeak("Alice", 39);

        Student fred = new Student(23, "Fred", "Philosophy");
        fred.speak();
        fred.tellCourse();
    }
}
