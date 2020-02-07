package dev.homework;

public class TasksToWrite {

    public static void main(String[] args) {

        System.out.println("Zadanie 1:");

        /*1) Stworz tablice z 1 na dwóch przekątnych

                10001
                01010
                00100
                01010
                10001
       */
        int[][] tab1;
        final int SIZE = 5;
        tab1 = new int[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if ((row == col) || ((col + row) == (SIZE - 1))) {
                    tab1[row][col] = 1;
                } else {
                    tab1[row][col] = 0;
                }
            }
        }

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++)
                System.out.print(" " + tab1[row][col] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Zadanie 2:");

         /* 2) Stworz tablice 0, 1....10
            A.oblicz sume wszystkich elementów
            B.oblicz srednia
            C.oblicz sume liczb patrzystych
            D.oblicz sume liczb nieparzystych
        */
        final int SIZE2 = 11;
        int[] tab2 = new int[SIZE2];
        int sumAll = 0;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < SIZE2; i++) {
            tab2[i] = i;
            sumAll = sumAll + tab2[i];

            System.out.print(tab2[i]);
            System.out.print(" ");

            if (tab2[i] % 2 == 0) {
                sumEven += tab2[i];
            } else {
                sumOdd += tab2[i];
            }

        }


        System.out.println();


        //A.
        System.out.print("suma: ");
        System.out.print(sumAll);
        //B.
        System.out.println();
        System.out.print("srednia: ");
        System.out.print(sumAll / SIZE2);
        //C.
        System.out.println();
        System.out.print("suma parzystych: ");
        System.out.print(sumEven);
        //D.
        System.out.println();
        System.out.print("suma nieparzystych: ");
        System.out.print(sumOdd);

        System.out.println();
        System.out.println();
        System.out.println("Zadanie 3:");

        //3) Oblicz silnie dowolnej liczby

        int factorial = 7;
        int prod = 1;
        for (int i = 1; i <= factorial; i++) {
            prod = prod * i;
        }

        System.out.println(prod);

        System.out.println();
        System.out.println();
        System.out.print("Zadanie 4: ");

        //4) Sprawdz czy liczba jest pierwsza


        int N = 4;

        for (int k = 2; k < N; k++) {
            if (N % k == 0) {
                System.out.print("NOT ");
                break;
            }
        }
        System.out.println("PRIME");


        System.out.println();
        System.out.println("Zadanie 5: ");
        //5) Wyświetl dzielniki("same liczby pierwsze") danej liczby:


        final int b = 140;
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) { // tu znamy dzielniki
                for (int k = 2; k <= i; k++) {
                    if (k==i) { // jesli dotarlismy do samej siebie to dzielnik jest liczba pierwsza
                        System.out.print("  " + i);
                    }
                    if (i % k == 0) {
                        break; //liczba nie jest pierwsza
                    }
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Zadanie 6: ");

        //6) Stwórz tablice wszystkich dzielników wybranej liczby:
             //nie zapisuje do tablicy

        final int a = 128;
        int [] tabD = new int [a];
        int counter = 0; //ile dzielników już zostało znalezione
        for (int i = 1; i <= a; i++) {
            tabD[i-1] = 0;//for jest od 1, a tablica jest indeksowana od 0
            if (a % i == 0) {
                System.out.print("  " + i);
                tabD[counter] = i;
                counter++;
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Zadanie 7: ");

        //7)Podziel zdanie na słowa i policz srednią ilość znaków w słowie.

        /*Lorem ipsum dolor sit amet, consectetur adipiscing elit,
        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
         */

        int spacje = 0;
        int znakiInt = 0; //interpunkcyjne
        String zdanie = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        int litery = zdanie.length();
        for (int i = 0; i < litery; i++) {
            if (zdanie.charAt(i) == ' ') {
                spacje++; //ilośc spacji w zdaniu
            } else if ((zdanie.charAt(i) == '.') || (zdanie.charAt(i) == ',')) { //charAt- wyjmuje spod indeksu znak
                znakiInt++;
            }
        }
        double x = (double)(litery - (spacje + znakiInt)) / spacje; //rzutowanie
        System.out.println(x);


    }
}