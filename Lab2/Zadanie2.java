package com.company;

import java.util.Scanner;

public class Zadanie2 {
        public static int jeden(int n)
        {
            int suma=0;
            Scanner in = new Scanner(System.in);
            for (int i=0;i<n;i++) {
                if (in.nextInt() % 2 == 1) {
                    suma += 1;
                }
            }
            return suma;
        }
    public static int dwa(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            int liczba= in.nextInt();
            if (liczba % 3 == 0 && liczba % 5 !=0 ) {
                suma += 1;
            }
        }
        return suma;
    }
    public static int trzy(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            double liczba= in.nextInt();
            if (Math.sqrt(liczba)%2==0) {
                suma += 1;
            }
        }
        return suma;
    }
    public static int cztery(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        double array[]=new double[n];
        for (int i=0;i<n;i++){
            array[i]= in.nextInt();
        }
        for (int i=1;i<n-1;i++) {
            if (array[i]<(array[i-1]+array[i+1])/2) {
                suma += 1;
            }
        }
        return suma;
    }
    private static int silnia(int i)
    {
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }
    public static int piec(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        double array[]=new double[n];
        for (int i=0;i<n;i++){
            array[i]= in.nextInt();
        }
        for (int i=0;i<n;i++) {
            if (Math.pow(2,i+1)<array[i] && array[i]<silnia(i+1)) {
                suma += 1;
            }
        }
        return suma;
    }
    public static int szesc(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        double array[]=new double[n];
        for (int i=0;i<n;i++){
            array[i]= in.nextInt();
        }
        for (int i=0;i<n;i++) {
            if (i%2==0 && array[i]%2==0) {
                suma += 1;
            }
        }
        return suma;
    }
    public static int siedem(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            int liczba = in.nextInt();
            if (liczba % 2 == 1 && liczba>=0) {
                suma += 1;
            }
        }
        return suma;
    }
    public static int osiem(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            int liczba = in.nextInt();
            if (Math.abs(liczba)<Math.pow(liczba,2)) {
                suma += 1;
            }
        }
        return suma;
    }
}
