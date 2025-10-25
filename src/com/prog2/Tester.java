package com.prog2;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Javadoc[] jd = new Javadoc[8];
        jd[2] = new Javadoc();
        jd[5] = new Javadoc();
        jd[2].print("bucko");
        System.out.println(Arrays.toString(jd));
    }
}
