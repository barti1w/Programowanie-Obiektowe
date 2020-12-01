package com.company;

public class PairUtil {

    public static <T> Pair<T> swap(Pair<T> para){
        para.swap();
        return para;
    }
}
