package com.pflichtaufgabe;

public class TestArrayOperationen {

    // Wrapper-methode um wiederholung der try-catch-block zu vermeiden
    public static void mittelwertBerechnenMitAusnahmeBehandlung(double[] array1, int startIndex, int endIndex) {
        double mittelwert;
        ArrayOperationen arrayOperationen = new ArrayOperationen();

        try {
            mittelwert = arrayOperationen.mittelwertBerechnen(array1, startIndex, endIndex);
            System.out.println("Mittelwert: " + mittelwert);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException abgefangen");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException abgefangen");
        }
    }

    // Ausfuehrung von tests
    public static void main(String[] args) {
        mittelwertBerechnenMitAusnahmeBehandlung(null, 0, 0);

        double[] array = new double[]{-1.3, 6.7, 2.5, -1.0, -0.5, 0.0};

        mittelwertBerechnenMitAusnahmeBehandlung(array, 2, 5);
        mittelwertBerechnenMitAusnahmeBehandlung(array, 3, 3);
        mittelwertBerechnenMitAusnahmeBehandlung(array, 3, 2);

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