package org.atakang;

import java.util.Arrays;

public class Main {

    private static int INSERTION_SORT_THRESHOLD = 4;

    public static void main(String[] args) {
        sortInteger();
        sortInteger(INSERTION_SORT_THRESHOLD);
        sortString();
        sortString(INSERTION_SORT_THRESHOLD);
    }

    public static void sortString(){
        HybridMergeInsertionSort<String> sorter = new HybridMergeInsertionSort<>();
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi", "mango", "pear", "pineapple", "tomato", "onion", "garlic", "carrot"};
        sorter.sort(arr);

        System.out.println(Arrays.toString(arr)); // output: [apple, banana, grape, kiwi, mango, orange, pear, pineapple]
    }

    public static void sortString(int insertionSortThreshold){
        HybridMergeInsertionSort<String> sorter = new HybridMergeInsertionSort<>(insertionSortThreshold);
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi", "mango", "pear", "pineapple", "tomato", "onion", "garlic", "carrot"};
        sorter.sort(arr);

        System.out.println(Arrays.toString(arr)); // output: [apple, banana, carrot, garlic, grape, kiwi, mango, onion, orange, pear, pineapple, tomato]
    }

    public static void sortInteger(){
        HybridMergeInsertionSort<Integer> sorter = new HybridMergeInsertionSort<>();
        Integer[] arr = {4, 10, 1, -23, 100, 3, -4, 32, 1993, -999, 13, 99, 2, -5, -109, -9988};
        sorter.sort(arr);

        System.out.println(Arrays.toString(arr)); // output: [-9988, -999, -109, -23, -5, -4, 1, 2, 3, 4, 10, 13, 32, 99, 100, 1993]
    }

    public static void sortInteger(int insertionSortThreshold){
        HybridMergeInsertionSort<Integer> sorter = new HybridMergeInsertionSort<>(insertionSortThreshold);
        Integer[] arr = {4, 10, 1, -23, 100, 3, -4, 32, 1993, -999, 13, 99, 2, -5, -109, -9988};
        sorter.sort(arr);

        System.out.println(Arrays.toString(arr)); // output: [-9988, -999, -109, -23, -5, -4, 1, 2, 3, 4, 10, 13, 32, 99, 100, 1993]
    }

}