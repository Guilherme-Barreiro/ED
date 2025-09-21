/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_ficha1;

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
    }
}
