package Sorting;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Time Complexity: O(n^2)
//Worst Case Comparisons: n^2
public class BubbleSort {
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void bubbleSort(int[] arr){
        //In every iteration of outer loop, one element from right end got at its correct place.
        for(int i=0;i<arr.length-1;i++) {
            boolean swap_flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap_flag = true;
                    swap(arr, j, j + 1);
                }
            }
            if(!swap_flag)
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO BUBBLE SORTING PROGRAM\n");
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
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("\nThank You :)\n");
    }
}
