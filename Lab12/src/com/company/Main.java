package com.company;


import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> pracownicy = new LinkedList<String>();
        pracownicy.add("Nowak");
        pracownicy.add("Andrzej");
        pracownicy.add("Gołota");
        pracownicy.add("None");
        pracownicy.add("Nana");
        Metody.redukuj(pracownicy,2);
        //System.out.println(pracownicy);
        Metody.odwroc(pracownicy);
        //System.out.println(pracownicy);
        Stack<String> stack = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        String theString="Ala ma kota. Jej kot lubi myszy.";
        //Metody.odwroc(theString);
        //Metody.cyfry(2015);
        Metody.primes(10);
        Metody.print(pracownicy);








    }
}
