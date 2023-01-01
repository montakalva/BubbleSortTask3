package org.example;

import java.util.Arrays;

/*
* Task 3: Write bubble sort using only java simple arrays ( type of sorting data: int)
3.1) Think about complexity value of your sorting method ( O(?) )
* */
public class BubbleSorting {

    int temp;

    public int [] sorting(int [] array) {

        System.out.println("Array to sort: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting: " + Arrays.toString(array));
        return array;
    }
}
