package Sorting;

/* Quick Sort
This algorithm is based on divide and conquer algorithm (We take the bigger problem , break it down to the smaller problem, try to solve the solution to
smaller problem and then join the smaller solutions to get the final result
concept of quick sort algorithm
===============================
At each step it finds "pivot" (Means point of division)and then make sure that all the smaller elements are at left side of the pivot and all bigger
elements are at right side of pivot. This we will do multiple times(Recursively) so that we get the final answer
*/
//Quicksort implements Partitioning logic.

//Time Complexity: Best Case: O(nlogn)
//Time Complexity: Worst Case & Average Case: O(n^2) => [2,3,5,7,9]
//Unstable and In-place Sorting
//Space Complexity: Constant Space only for storing recursion calls

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class QuickSort {
    public static void sort(int arr[], int start, int end)
    {
        if (start < end) {
            int pivot = partition(arr, start, end);
            // recursively calling the method here
            // left side of array
            sort(arr, start, pivot-1 );
            // right side of array
            sort(arr, pivot + 1,end);
        }
    }
    // here in this partition method we are going to break down the array
    // main logic of quick sort
    public static int partition(int arr[], int p , int q )
    {
        int pivot= q;
        int i = p-1;
        for(int j =p; j<=q;j++)
        {
            if(arr[j]<=arr[pivot])
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } // end of the loop
        return i;
    }
    public static void display(int arr[])
    {
        for(int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO QUICK SORTING PROGRAM\n");
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
        sort(arr,0,arr.length-1);
        System.out.println("Sorted Array: ");
        display(arr);
        System.out.println("\nThank You :)\n");
    }
}
