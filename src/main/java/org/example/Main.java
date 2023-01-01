package org.example;

/*
* Task 3: Write bubble sort using only java simple arrays ( type of sorting data: int)
3.1) Think about complexity value of your sorting method ( O(?) )

* */
public class Main {
    public static void main(String[] args) {

        int[] arrayData = {17, 99, 10, 25, 2, 78};
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.sorting(arrayData);
    }
}