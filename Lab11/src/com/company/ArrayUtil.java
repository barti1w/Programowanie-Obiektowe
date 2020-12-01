package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> list){
        ArrayList<T>sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        return list.equals(sorted);
    }
    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T obiekt) {
        int l = 0, r = tab.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (tab.get(m).equals(obiekt)){
                return m;
            }
            if (tab.get(m).compareTo(obiekt)<0){
                l = m + 1;
            }
            else{
                r=m-1;
            }
        }
        return -1;

    }
    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab) {
        int i, j, min_idx;
        int n = tab.size();
        // One by one move boundary of unsorted subarray
        for (i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            min_idx = i;
            for (j = i+1; j < n; j++)
                if (tab.get(j).compareTo(tab.get(min_idx))<0)
                    min_idx = j;

            // Swap the found minimum element with the first element
            T temp = tab.get(min_idx);
            T temp2 = tab.get(i);
            tab.set(i,temp);
            tab.set(min_idx,temp2);
        }
    }
    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> tab) {

            if(tab.isEmpty())
            {
                return;
            }

            if(tab.size() > 1)
            {
                int mid = tab.size() / 2;

                // Split left part
                ArrayList<T>left =  new ArrayList<T>(mid);
                for (int i = 0; i < mid; i++) {
                    left.add(tab.get(0));
                }
                for(int i = 0; i < mid; i++)
                {

                    left.set(0,tab.get(i));

                }

                // Split right part
                ArrayList<T>right = new ArrayList<T>(tab.size()-mid);
                for (int i = 0; i < tab.size()-mid; i++) {
                    right.add(tab.get(0));
                }
                for(int i = mid; i < tab.size(); i++)
                {
                    right.set(i-mid,tab.get(i));
                }
                mergeSort(left);
                mergeSort(right);

                int i = 0;
                int j = 0;
                int k = 0;

                // Merge left and right arrays
                while(i < left.size() && j < right.size())
                {
                    if(left.get(i).compareTo(right.get(j))<0)
                    {
                        tab.set(k,left.get(i));
                        i++;
                    }
                    else
                    {
                        tab.set(k,right.get(j));
                        j++;
                    }
                    k++;
                }
                // Collect remaining elements
                while(i < left.size())
                {
                    tab.set(k,left.get(i));
                    i++;
                    k++;
                }
                while(j < right.size())
                {
                    tab.set(k,right.get(j));
                    j++;
                    k++;
                }
            }
    }

}

