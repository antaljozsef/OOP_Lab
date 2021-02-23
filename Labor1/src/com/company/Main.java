package com.company;

import javax.swing.*;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

/**
 * Ahol indokolt és még az IDE is ajánlja használj új típusú for-ciklust: lásd (1)
 * Próbáld a feladatokat külön függvényekbe rendezni
 */
public class Main {

    public static double maxElement( double array[] ){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // I Egyszeru main - 1Feladat
        System.out.println("Jozsi");

        // 2Feladat
        String nev = "Antal Jozsef";
        for (int i = 0; i < nev.length(); ++i) {
            System.out.println(nev.charAt(i));
        }

        System.out.printf("\n");

        // 3Feladat
        String szo = "ALMAFA";

        int l;
        l = szo.length();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c", szo.charAt(j));
            }
            System.out.printf("%c\n", szo.charAt(i));
        }

        /**
         * Nincs értelme printf-et használni ebben az esetben.
         * Tökéletesen megfelel az egyszerű print is.
         */
        System.out.print("\n");

        // 4feladat

        String[] tomb;
        String nev2 = "Kerekes Bálint Ádám József";
        tomb = nev2.split(" ");

        /**
         * (1) Például itt
         */
        for (String s : tomb) {
            System.out.printf("%c", s.charAt(0));
        }

        System.out.printf("\n\n");

        // II Fugvenyenk - 1feladat

        double x[] ={7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));

    }
}
