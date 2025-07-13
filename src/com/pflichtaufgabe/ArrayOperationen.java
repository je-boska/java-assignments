package com.pflichtaufgabe;

import java.util.Arrays;

public class ArrayOperationen {
    public double mittelwertBerechnen(double[] array, int startIndex, int endIndex) {
        if (array == null) {
            throw new NullPointerException("null-Array");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Leeres Array");
        }

        if (startIndex > endIndex || endIndex > array.length || startIndex < 0) {
            throw new IllegalArgumentException("Ungültiger Index");
        }

        double sum = 0.0;
        int amountOfElements = endIndex - startIndex + 1;

        for (int i = startIndex; i <= endIndex; i++) {
            sum += array[i];
        }

        return sum / amountOfElements;
    }

    public void arrayAusgeben(double[] array) {
        if (array == null) {
            throw new NullPointerException("null-Array");
        }

        System.out.print("[");
        for (int i = 0; i <= array.length - 1; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + " | ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public double[] duplikateEntfernen(double[] array) {
        if (array == null) {
            throw new NullPointerException("null-Array");
        }

        double[] tmp = new double[array.length];
        int mengeNichtDuplikate = 0;
        boolean istDuplikat = false;

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i] == tmp[j]) {
                    istDuplikat = true;
                    break;
                }
            }
            if (!istDuplikat) {
                tmp[mengeNichtDuplikate] = array[i];
                mengeNichtDuplikate ++;
            }
            istDuplikat = false;
        }

        double[] arrayOhneDuplikate = new double[mengeNichtDuplikate];

        for (int i = 0; i < mengeNichtDuplikate; i++) {
            arrayOhneDuplikate[i] = tmp[i];
        }

        return arrayOhneDuplikate;
    }

    public boolean enthaeltDuplikate(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Leeres Array");
        }

        double[] tmp = new double[array.length];
        boolean istDuplikat = false;

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i] == tmp[j]) {
                    istDuplikat = true;
                    break;
                }
            }
            if (istDuplikat) {
                break;
            }
            tmp[i] = array[i];
        }
        return istDuplikat;
    }

    public double[] arrayQuadrierenUndSortieren(double[] array) {
        if (array == null) {
            throw new NullPointerException("null-Array");
        }

        double[] squares = new double[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            squares[i] = array[i] * array[i];
        }

        double[] sortedArray = new double[squares.length];
        sortedArray[0] = squares[0];

        for (int i = 1; i <= squares.length - 1; i++) {
            double key = squares[i];
            int j = i - 1;
            System.out.println("Iteration: " + i);

            while (j >= 0 && sortedArray[j] > key) {
                double tmp = sortedArray[j];
                sortedArray[j] = key;
                sortedArray[j + 1] = tmp;
                j--;
            }
            sortedArray[j + 1] = key;
        }

        return sortedArray;
    }
}
