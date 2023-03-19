import org.atakang.HybridMergeInsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class HybridMergeInsertionSortTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void testSortString() {
        HybridMergeInsertionSort<String> stringSorter = new HybridMergeInsertionSort<>();
        String[] arr = {"banana", "apple", "orange", "grape", "kiwi", "mango", "pear", "pineapple"};
        String[] expectedResult = {"apple", "banana", "grape", "kiwi", "mango", "orange", "pear", "pineapple"};

        stringSorter.sort(arr);
        System.out.println(Arrays.toString(arr)); // output: [apple, banana, grape, kiwi, mango, orange, pear, pineapple]

        Assertions.assertArrayEquals(expectedResult, arr);
    }

    @Test
    void testSortInteger() {
        HybridMergeInsertionSort<Integer> integerSorter = new HybridMergeInsertionSort<>();
        Integer[] arr = {4, 10, 1, -23, 100, 3, -4};
        Integer[] expectedResult = {-23, -4, 1, 3, 4, 10, 100};
        integerSorter.sort(arr);
        System.out.println(Arrays.toString(arr)); // output: [-23, -4, 1, 3, 4, 10, 100]

        Assertions.assertArrayEquals(expectedResult, arr);
    }
}