package Sorting;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Time Complexity: O(n^2)
//Space Complexity: Constant

public class SelectionSort {
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void selectionSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min])
                    min=j;
            }
            if(min!=i)
                swap(a,min,i);
        }
    }
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO SELECTION SORTING PROGRAM\n");
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
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("\nThank You :)\n");
    }
}
