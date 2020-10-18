package com.company;

public class Zad1bg {
    public static String b(int []arr, int n){
        int dodatnie = 0;
        int ujemne = 0;
        int zero = 0;
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                dodatnie+=1;
            }
            else if (arr[i]<0){
                ujemne+=1;
            }
            else{
                zero+=1;
            }
        }
        return "dodatnich: " +dodatnie+" ujemnych: "+ujemne+" zer: "+zero;
    }
    public static String c(int []arr, int n){
        int max=arr[0];
        int ile=0;
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i=0;i<n;i++){
            if(arr[i]==max){
                ile+=1;
            }
        }
        return "Max: "+max+" ile razy: "+ile;
    }
    public static String d(int []arr,int n){
        int dod=0;
        int uje=0;
        for (int i=0;i<n;i++){
            if(arr[i]>=0){
                dod+=arr[i];
            }
            else{
                uje+=arr[i];
            }
        }
        return "dod: "+dod+" uje: "+uje;
    }
    public static int e(int []arr,int n){
        int ile = 0;
        int max=0;
        for (int i=0;i<n;i++) {
            if (arr[i] > 0) {
                ile += 1;
            }
            if (ile>max){
                max=ile;
            }
            if (arr[i] <= 0) {
                ile = 0;
            }
        }
        return max;
    }
    public static void f(int []arr,int n){
        for (int i=0;i<n;i++) {
            if (arr[i] > 0) {
                arr[i]=1;
            }
            else if (arr[i] < 0) {
                arr[i] = -1;
            }

        }
    }
    public static void g(int []arr,int n, int lewy, int prawy){
        int []array=new int [n];
        lewy-=1;
        prawy-=1;
        for (int i=0;i<n;i++){
            array[i]=arr[i];
        }
        for (int i=0;i<prawy-lewy+1;i++) {
            array[lewy+i]=arr[prawy-i];
        }
        for (int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }

}
