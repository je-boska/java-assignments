package com.pflichtaufgabe;

public class ArrayOperationen {
    // Diese methode berechnet mittelwerte von arrays von doubles
    public static double mittelwertBerechnen(double[] array, int startIndex, int endIndex) throws NullPointerException, IllegalArgumentException {
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

    // Diese methode gibt ein formatiertes Array auf der Konsole aus
    public static void arrayAusgeben(double[] array) throws NullPointerException {
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

    // Diese methode entfertn Duplikate
    public static double[] duplikateEntfernen(double[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("null-Array");
        }

        double[] tmp = new double[array.length];
        int mengeNichtDuplikate = 0;
        boolean istDuplikat = false;

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j < mengeNichtDuplikate; j++) {
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

        // Array ohne duplikate kann kurzer sein als gegebene Array
        // Deswegen initialisieren wir ein neues Array in die richtige laenge
        double[] arrayOhneDuplikate = new double[mengeNichtDuplikate];

        for (int i = 0; i < mengeNichtDuplikate; i++) {
            arrayOhneDuplikate[i] = tmp[i];
        }

        return arrayOhneDuplikate;
    }

    // Diese methode prueft ob es Duplikate gibt
    public static boolean enthaeltDuplikate(double[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("null-Array");
        }

        double[] original = duplikateEntfernen(array);
        return original.length != array.length;
    }

    // Diese methode quadriert und sortiert double arrays
    public static double[] arrayQuadrierenUndSortieren(double[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("null-Array");
        }

        double[] squares = new double[array.length];

        // Quadrierung
        for (int i = 0; i <= array.length - 1; i++) {
            squares[i] = array[i] * array[i];
        }

        // Insertion sort in place
        for (int i = 1; i <= squares.length - 1; i++) {
            double key = squares[i];
            int j = i - 1;

            while (j >= 0 && squares[j] > key) {
                squares[j + 1] = squares[j];
                j--;
            }
            squares[j + 1] = key;
        }

        return squares;
    }
}
