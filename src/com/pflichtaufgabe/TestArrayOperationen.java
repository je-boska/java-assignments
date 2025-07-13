package com.pflichtaufgabe;

import java.util.Arrays;

public class TestArrayOperationen {

    public static void berechnen(double[] array1, int startIndex, int endIndex) {
        double mittelwert;
        ArrayOperationen arrayOperationen = new ArrayOperationen();

        try {
            mittelwert = arrayOperationen.mittelwertBerechnen(array1, startIndex, endIndex);
            System.out.println("Mittlewert: " + mittelwert);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException abgefangen");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException abgefangen");
        }
    }

    public static void main(String[] args) {
        berechnen(null, 0, 0);

        double[] array1 = new double[]{-1.3, 6.7, 2.5, -1.0, -0.5, 0.0};
        berechnen(array1, 2, 5);

        berechnen(array1, 3, 3);

        berechnen(array1, 3, 2);

        ArrayOperationen arrayOperationen = new ArrayOperationen();

        double[] emptyArray = {};

        double[] testArray1 = arrayOperationen.duplikateEntfernen(emptyArray);
        boolean leer = testArray1.length == 0;
        if (leer) {
            System.out.println("Array ist leer: " + leer);
        }

        double[] testArray2 = new double[]{1.0, 3.5, -2.1, 12.6, 2.0};
        arrayOperationen.arrayAusgeben(arrayOperationen.duplikateEntfernen(testArray2));

        double[] testArray3 = new double[]{1.0, 3.5, 1.0, -2.1, 12.6, 2.0, 1.0};
        arrayOperationen.arrayAusgeben(arrayOperationen.duplikateEntfernen(testArray3));

        double[] testArray4 = new double[]{1.0, 2.0, 3.0};
        System.out.println("Enthält Duplikate: " + arrayOperationen.enthaeltDuplikate(testArray4));

        double[] testArray5 = new double[]{1.0, -1.0, 2.0, 2.0, 3.0};
        System.out.println("Enthält Duplikate: " + arrayOperationen.enthaeltDuplikate(testArray5));

        arrayOperationen.arrayAusgeben(arrayOperationen.arrayQuadrierenUndSortieren(emptyArray));

        double[] testArray6 = new double[]{1.5, -2.0, 3.0, -4.5};
        arrayOperationen.arrayAusgeben(arrayOperationen.arrayQuadrierenUndSortieren(testArray6));
    }
}