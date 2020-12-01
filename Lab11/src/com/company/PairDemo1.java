package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class PairDemo1 {

    public static void main(String[] args)
    {
//        String[] words = { "Ala", "ma", "psa", "i", "kota" };
//        for (String x:words) {
//            System.out.println(x);
//        }
//        System.out.println();
//        Pair<String> mm = ArrayAlg.minmax(words);
//
//        System.out.println("min = " + mm.getFirst());
//        System.out.println("max = " + mm.getSecond());
//        mm = PairUtil.swap(mm);
//        System.out.println("min = " + mm.getFirst());
//        System.out.println("max = " + mm.getSecond());

        ArrayList<Integer> inty = new ArrayList<>(3);
        inty.add(3);
        inty.add(2);
        inty.add(5);
        ArrayList<Integer> inty2 = new ArrayList<>(inty);
        Collections.sort(inty2);
        System.out.println(ArrayUtil.isSorted(inty2));
        System.out.println(ArrayUtil.isSorted(inty));
        System.out.println(ArrayUtil.binSearch(inty,4));
        ArrayUtil.mergeSort(inty);
        System.out.println(inty);


    }
}