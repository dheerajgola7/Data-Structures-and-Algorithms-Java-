package Sorting;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Time Complexity: O(n^2)
//Worst Case Comparisons: Less than n^2
//Optimized version of Bubble Sort
//Array is imagined to be in two parts: Unsorted and Sorted
//Each element is picked from unsorted part and put at its right position in sorted part.
//With every iteration size of sorted part increases and size of unsorted part decreases then at last array only has sorted part.
//It is named insertion because we are inserting elements.

public class InsertionSort {
    public static void insertionSort(int[] a){
        for(int i=1;i<a.length;i++) {
            int temp = a[i], j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO INSERTION SORTING PROGRAM\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int[] arr = new int[0];
        try {
            arr = new int[sc.nextInt()];
        } catch (NegativeArraySizeException | InputMismatchException e) {
            System.out.println(e);
            return;
        }
        System.out.print("Enter " + arr.length + " elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            try {arr[i] = sc.nextInt();}
            catch (InputMismatchException e) {System.out.println(e); return;}
        }
        System.out.println("Input Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("\nThank You :)\n");
    }
}

