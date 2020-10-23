package com.company;

public class IntegerSet {
    private final boolean []tablicaBool= new boolean[100];
    public IntegerSet(){
        for (int i = 0; i < 100; i++) {
            tablicaBool[i]=false;
        }
    }
    public static IntegerSet union (IntegerSet a, IntegerSet b){
        IntegerSet uni = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if(a.tablicaBool[i]||b.tablicaBool[i]){
                uni.tablicaBool[i]=true;
            }
        }
        return uni;
    }
    public static IntegerSet intersection  (IntegerSet a, IntegerSet b){
        IntegerSet uni = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if(a.tablicaBool[i]&&b.tablicaBool[i]){
                uni.tablicaBool[i]=true;
            }
        }
        return uni;
    }
    public void insertElement(int a){
        this.tablicaBool[a-1]=true;
    }
    public void deleteElement(int a){
        this.tablicaBool[a-1]=false;
    }
    public String toString(){
        StringBuilder str= new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if(this.tablicaBool[i]){
                str.append(i+1).append(" ");
            }
        }
        return str.toString();
    }
    public boolean equals(IntegerSet a){
        for (int i = 0; i < 100; i++) {
            if(a.tablicaBool[i]!=this.tablicaBool[i]){
                return false;
            }
        }
        return true;
    }
}
