/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org;

import java.awt.Point;

/**
 *
 * @author guiba
 */
public class TwoTypePairMain {

    public static void main(String[] args) {

        TwoTypePair<Integer, String> pair1 = new TwoTypePair<>(1, "um");
        TwoTypePair<Integer, String> pair2 = new TwoTypePair<>(2, "dois");
        TwoTypePair<Integer, String> pair3 = new TwoTypePair<>(1, "um");

        System.out.println("Pair1:");
        System.out.println(pair1);

        System.out.println("\nPair2:");
        System.out.println(pair2);

        System.out.println("\nPair1 == Pair3? " + pair1.equals(pair3));
        System.out.println("Pair1 == Pair2? " + pair1.equals(pair2));

        TwoTypePair<Double, Boolean> pair4 = new TwoTypePair<>(3.14, true);
        System.out.println("\nPair4:\n" + pair4);
        
        
        System.out.println("\n\n\n\n\nEx2 Parte 2\n");
        
//        Point[] a = new Point[10];
//        Object[] b;
//        b = a;
//        b[0] = new Point(10, 20);

//        Point[] a = new Point[10];
//        Object[] b;
//        b = a;
//        b[0] = "Magical Mystery Tour";
        
//        Point[] a = new Point[10];
//        Object[] b;
//        b = a;
//        a[0] = "Magical Mystery Tour";
    }
}
