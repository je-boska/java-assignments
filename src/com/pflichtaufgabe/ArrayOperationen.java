package com.pflichtaufgabe;

public class ArrayOperationen {
    public double mittelwertBerechnen(double[] array, int startIndex, int endIndex) throws NullPointerException, IllegalArgumentException {
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

    public void arrayAusgeben(double[] array) throws NullPointerException {
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

    public double[] duplikateEntfernen(double[] array) throws NullPointerException {
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

    public boolean enthaeltDuplikate(double[] array) throws IllegalArgumentException {
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

    public double[] arrayQuadrierenUndSortieren(double[] array) throws NullPointerException {
        if (array == null) {
            throw new NullPointerException("null-Array");
        }

        double[] squares = new double[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            squares[i] = array[i] * array[i];
        }

        for (int i = 1; i <= squares.length - 1; i++) {
            double key = squares[i];
            int j = i - 1;

            while (j >= 0 && squares[j] > key) {
                double tmp = squares[j];
                squares[j] = key;
                squares[j + 1] = tmp;
                j--;
            }
            squares[j + 1] = key;
        }

        return squares;
    }
}
