package com.company;
import java.util.Random;
public class Zad3 {
    public static void zadanie(int m, int n, int k){
        Random rand = new Random();
        int [][] a = new int[m][n];
        int [][] b = new int[n][k];
        int [][] c = new int[m][k];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=rand.nextInt(10);
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<k;j++){
                b[i][j]=rand.nextInt(10);
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<k;j++){
                int suma=0;
                for(int l=0;l<n;l++){
                    suma=suma+a[i][l]*b[l][j];
                    c[i][j]=suma;
                }
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<k;j++){
                System.out.println(c[i][j]);
            }
            System.out.println();
        }
    }
}
