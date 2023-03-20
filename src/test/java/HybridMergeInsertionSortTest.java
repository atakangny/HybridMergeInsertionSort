import org.atakang.HybridMergeInsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class HybridMergeInsertionSortTest {

    private static int INSERTION_SORT_THRESHOLD;

    @BeforeEach
    void setUp() {
        INSERTION_SORT_THRESHOLD = 4;
    }

    @Test
    void testSortString() {
        HybridMergeInsertionSort<String> stringSorter = new HybridMergeInsertionSort<>();
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi", "mango", "pear", "pineapple", "tomato", "onion", "garlic", "carrot"};
        String[] expectedResult = {"apple", "banana", "carrot", "garlic", "grape", "kiwi", "mango", "onion", "orange", "pear", "pineapple", "tomato"};

        stringSorter.sort(arr);
        System.out.println(Arrays.toString(arr)); // output: [apple, banana, carrot, garlic, grape, kiwi, mango, onion, orange, pear, pineapple, tomato]

        Assertions.assertArrayEquals(expectedResult, arr);
    }

    @Test
    void testSortInteger() {
        HybridMergeInsertionSort<Integer> integerSorter = new HybridMergeInsertionSort<>(INSERTION_SORT_THRESHOLD);
        Integer[] arr = {4, 10, 1, -23, 100, 3, -4, 32, 1993, -999, 13, 99, 2, -5, -109, -9988};
        Integer[] expectedResult = {-9988, -999, -109, -23, -5, -4, 1, 2, 3, 4, 10, 13, 32, 99, 100, 1993};
        integerSorter.sort(arr);
        System.out.println(Arrays.toString(arr)); // output: [-9988, -999, -109, -23, -5, -4, 1, 2, 3, 4, 10, 13, 32, 99, 100, 1993]

        Assertions.assertArrayEquals(expectedResult, arr);
    }
}