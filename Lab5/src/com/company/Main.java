package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        cars.add(1);
        cars.add(2);
        cars.add(3);
        cars.add(4);
        ArrayList<Integer> kod = new ArrayList<Integer>();
        kod.add(5);
        kod.add(6);
        //System.out.println(Zad1.reversed(cars));
        Zad1.reverse(cars);
        System.out.println(cars);
    }
}
