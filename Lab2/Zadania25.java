package com.company;
import java.util.Scanner;
public class Zadania25 {
    public static double dwa(int n)
    {
        double suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            double liczba = in.nextDouble();
            if (liczba>0) {
                suma += liczba;
            }
        }
        return 2*suma;
    }
    public static String trzy(int n)
    {
        int dod=0;
        int min=0;
        int zer=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            int liczba = in.nextInt();
            if (liczba>0) {
                dod += 1;
                }
            if (liczba<0) {
                min += 1;
            }
            if(liczba==0)
            {
                zer+=1;
            }

        }
        return "Dodatnich: "+dod+" Ujemnych: "+min+" Zer: "+zer;
    }
    public static String cztery(int n)
    {
        Scanner in = new Scanner(System.in);
        double liczba = in.nextDouble();
        double max=liczba;
        double min=liczba;
        for (int i=1;i<n;i++) {
            liczba = in.nextDouble();
            if (liczba>max)
            {
                max=liczba;
            }
            if (liczba<min)
            {
                min=liczba;
            }
        }
        return "Maksymalna: "+max+" Minimalna: "+min;
    }
    public static int piec(int n)
    {
        int array[]= new int[n];
        int suma=0;
        Scanner in = new Scanner(System.in);
        for (int i=0;i<n;i++) {
             array[i]= in.nextInt();
            }
        for (int i=1;i<n;i++) {
            if(array[i-1]>0 && array[i]>0)
            {
                suma+=1;
            }
        }
        return suma;
    }
}
