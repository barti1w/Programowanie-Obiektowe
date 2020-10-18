package com.company;

public class Zad2 {
    public static int ileNieparzystych (int tab[]) {
        int ile=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 1) {
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileParzystych (int tab[]) {
        int ile=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileDodatnich (int tab[]) {
        int ile=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileUjemnych (int tab[]) {
        int ile=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] <0) {
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileZerowych (int tab[]) {
        int ile=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileMaksymalnych(int tab[]){
        int max=tab[0];
        int ile=0;
        for (int i=0;i<tab.length;i++){
            if(tab[i]>max){
                max=tab[i];
            }
        }
        for (int i=0;i<tab.length;i++){
            if(tab[i]==max){
                ile+=1;
            }
        }
        return ile;
    }
    public static int sumaDodatnich(int []tab){
        int dod=0;
        for (int i=0;i<tab.length;i++){
            if(tab[i]>=0){
                dod+=tab[i];
            }
        }
        return dod;
    }
    public static int sumaUjemnych(int []tab){
        int uje=0;
        for (int i=0;i<tab.length;i++){
            if(tab[i]<=0){
                uje+=tab[i];
            }
        }
        return uje;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int []tab){
        int ile = 0;
        int max=0;
        for (int i=0;i<tab.length;i++) {
            if (tab[i] > 0) {
                ile += 1;
            }
            if (ile>max){
                max=ile;
            }
            if (tab[i] <= 0) {
                ile = 0;
            }
        }
        return max;
    }
    public static void signum(int []tab){
        for (int i=0;i<tab.length;i++) {
            if (tab[i] > 0) {
                tab[i]=1;
            }
            else if (tab[i] < 0) {
                tab[i] = -1;
            }

        }
    }
    public static void odwrocFragment(int []tab, int lewy, int prawy){
        int []array=new int [tab.length];
        lewy-=1;
        prawy-=1;
        for (int i=0;i<tab.length;i++){
            array[i]=tab[i];
        }
        for (int i=0;i<prawy-lewy+1;i++) {
            array[lewy+i]=tab[prawy-i];
        }
        for (int i=0;i<tab.length;i++){
            System.out.println(array[i]);
        }
    }
}
