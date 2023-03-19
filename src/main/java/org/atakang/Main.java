package org.atakang;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        sortInteger();
        sortString();
    }

    public static void sortString(){
        HybridMergeInsertionSort<String> sorter = new HybridMergeInsertionSort<>();
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi", "mango", "pear", "pineapple"};
        sorter.sort(arr);

        System.out.println(Arrays.toString(arr)); // output: [apple, banana, grape, kiwi, mango, orange, pear, pineapple]
    }

    public static void sortInteger(){
        HybridMergeInsertionSort<Integer> sorter = new HybridMergeInsertionSort<>();
        Integer[] arr = {4, 10, 1, -23, 100, 3, -4};
        sorter.sort(arr);

        System.out.println(Arrays.toString(arr)); // output: [-23, -4, 1, 3, 4, 10, 100]
    }

}