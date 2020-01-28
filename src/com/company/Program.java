package com.company;

import java.util.Arrays;

class Program {
    protected void main(String[] args) {
        int [] arr = {5, -2, 23, 7, 87, -42, 509};
        System.out.println("The original array is: ");
        for (int num: arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr, 3, 6);
        System.out.println("\nThe sorted array (from position 3 to 6) is: ");
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }
}



