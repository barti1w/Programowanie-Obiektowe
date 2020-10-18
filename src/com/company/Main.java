package com.company;

public class Main {

    public static void main(String[] args) {
        int n=5;
        int array[]= new int [n];
        for (int i=0;i<n;i++) {
           array[i]= -999 + (int) (Math.random() * ((999 - -999) + 1));
        }
        for (int i=0;i<n;i++) {
            System.out.println(array[i]);
        }
        System.out.println("Zad");
        /* Podpunkt a) Zadanie 1
        Zad1 obiekt = new Zad1();
        obiekt.a(array,n);
        System.out.println("Nieparzyste: " + obiekt.nieparzyste);
        System.out.println("Parzyste: " + obiekt.parzyste);
        */
        //System.out.println(Zad1bg.b(array,n));
        //System.out.println(Zad1bg.c(array,n));
        //System.out.println(Zad1bg.d(array,n));
        //System.out.println(Zad1bg.e(array,n));
        //Zad1bg.f(array,n);
        //Zad1bg.g(array,n,2,5);
        Zad3.zadanie(5,3,4);
    }

}
