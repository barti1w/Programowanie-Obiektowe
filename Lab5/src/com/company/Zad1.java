package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Zad1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        for (int i = 0; i < b.size(); i++) {
            a.add(b.get(i));
        }
        return a;
    }
    public static ArrayList<Integer>merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> nowy= new ArrayList<>();
        int c = Math.min(a.size(),b.size());
        for (int i = 0; i < c ; i++) {
            nowy.add(a.get(i));
            nowy.add(b.get(i));
        }
        ArrayList<Integer> lista= new ArrayList<>();
        if(a.size()==c){
            lista.addAll(b);
        }
        else{
            lista.addAll(a);
        }
        for (int i=c;i<Math.max(a.size(),b.size());i++){
            nowy.add(lista.get(i));
        }
        return nowy;
    }
    public static ArrayList<Integer>mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> nowy;
        nowy=merge(a,b);
        Collections.sort(nowy);
        return nowy;
    }
    public static ArrayList<Integer>reversed(ArrayList<Integer> a){
        ArrayList<Integer> nowy= new ArrayList<>();
        for (int i=a.size()-1;i>-1;i--){
            nowy.add(a.get(i));
        }
        return nowy;
    }
    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> nowy= (ArrayList<Integer>) a.clone();
        a.clear();
        for (int i = nowy.size()-1; i >-1 ; i--) {
            a.add(nowy.get(i));
        }
    }
}
