package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class BubbleSortingTest {

    @Test
    public void firstSortedArrayNumberSmallerThanLast(){
        int [] array1 = {7, 2, 75, 0, 15, 15, 33, 40};
        int firstArrayNumber = 0;
        int lastArrayNumber = 0;
        BubbleSorting bubbleSorting = new BubbleSorting();

        int [] arrayAfterSorting = bubbleSorting.sorting(array1);
        for (int i = 0; i < arrayAfterSorting.length; i++){
            firstArrayNumber = arrayAfterSorting[0];
            lastArrayNumber = arrayAfterSorting[arrayAfterSorting.length-1];
        }
        Assertions.assertTrue(firstArrayNumber < lastArrayNumber);
    }

    @Test
    public void elementsAreSortedFromSmallestToBiggest(){

        int [] array1 = {10, 7, 55, 90, 24};
        int [] sortedArrayManually = {7, 10, 24, 55, 90};

        BubbleSorting bubbleSorting = new BubbleSorting();

        int []  sortedArray = bubbleSorting.sorting(array1);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(sortedArrayManually));
    }
}