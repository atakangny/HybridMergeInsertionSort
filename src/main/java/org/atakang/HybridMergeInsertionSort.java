package org.atakang;

import java.util.Arrays;

public class HybridMergeInsertionSort<T extends Comparable<T>> {

    private static final int INSERTION_SORT_THRESHOLD = 10; // threshold for switching to insertion sort

    public void sort(T[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(T[] arr, int low, int high) {
        if (high - low + 1 < INSERTION_SORT_THRESHOLD) { // switch to insertion sort for small subarrays
            insertionSort(arr, low, high);
        } else {
            int mid = low + (high - low) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private void merge(T[] arr, int low, int mid, int high) {
        T[] leftArr = Arrays.copyOfRange(arr, low, mid + 1);
        T[] rightArr = Arrays.copyOfRange(arr, mid + 1, high + 1);
        int i = 0, j = 0, k = low;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }

    private void insertionSort(T[] arr, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= low && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
