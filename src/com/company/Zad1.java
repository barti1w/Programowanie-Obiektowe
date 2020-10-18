package com.company;

public class Zad1 {
    public int parzyste=0;
    public int nieparzyste=0;

    public void a(int []arr, int n){
        for (int i=0;i<n;i++){
            if(arr[i]%2==0){
                this.parzyste+=1;
            }
            else{
                this.nieparzyste+=1;
            }
        }
    }
}
