package com.company;
import java.util.Scanner;
import java.lang.*;
public class Zadanie1 {
        public static int jeden(int n)
        {
            int suma=0;
            Scanner in = new Scanner(System.in);
            for (int i=0;i<n;i++)
            {
                suma=suma+in.nextInt();
            }
            return suma;
        }
        static int dwa(int n)
        {
            int suma=1;
            Scanner in = new Scanner(System.in);
            for (int i=0;i<n;i++)
            {
                suma=suma*in.nextInt();
            }
            return suma;
        }

        static int trzy(int n)
        {
            int suma=0;
            Scanner in = new Scanner(System.in);
            for (int i=0;i<n;i++) {
                suma = Math.abs(suma)+Math.abs(in.nextInt());
            }
            return suma;
        }
    static double cztery(int n)
    {
        double suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            suma = suma+Math.sqrt(Math.abs(in.nextInt()));
        }
        return suma;
    }
    static int piec(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            suma = suma*Math.abs(in.nextInt());
        }
        return suma;
    }
    static int szesc(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            suma = (int) (suma+Math.pow(in.nextInt(),2));
        }
        return suma;
    }
    public static String siedem(int n)
    {
        int suma=0;
        int wynik=1;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            int liczba = in.nextInt();
            suma = suma+liczba;
            wynik = wynik*liczba;
        }
        return "suma = "+suma+", wynik ="+wynik;
    }
    public static int osiem(int n)
    {
        int suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            int liczba = in.nextInt();
            if (i%2==0)
            {
                suma = suma+liczba;
            }
            else {
                suma = suma-liczba;
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
    static double dziewiec(int n)
    {
        double suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            suma=suma+(Math.pow(-1,i+1)*in.nextInt())/silnia(i);
        }
        return suma;
    }
    private static int[] lista(int n,int arr[]){
        Scanner in = new Scanner(System.in);
        int arr1[]=new int[n];
        for (int i=1;i<n;i++) {
            arr1[i-1]=arr[i];
        }
        arr1[n-1]=arr[0];
        return arr1;
    }
    static void ostatnie(int n){
        Scanner in = new Scanner(System.in);
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        for (int i=0;i<n;i++) {
            System.out.println(lista(n,arr)[i]);
        }
    }
}


