/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org;

/**
 *
 * @author guiba
 */
public class PairMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pair<Integer> numeros = new Pair<>();
        numeros.setFirst(10);
        numeros.setSecond(20);
        System.out.println("Maior numero: " + numeros.max());

        Pair<String> palavras = new Pair<>();
        palavras.setFirst("banana");
        palavras.setSecond("maca");
        System.out.println("Maior palavra: " + palavras.max());

        Pair<Double> decimais = new Pair<>();
        decimais.setFirst(3.14);
        decimais.setSecond(2.71);
        System.out.println("Maior decimal: " + decimais.max());
    }

}
