package Sorting;

/* Merge Sort
Merge Sort is a divide and conquer algorithm. It works by recursively breaking down a problem into two or more sub-problems.
Merge Sort first divides the array into equal halves and then combines them in a sorted manner.
===============================
Step 1: If it is only one element in the list it is already sorted, return.
Step 2: Divide the list recursively into two halves until it can no more be divided.
Step 3: Merge the smaller lists into new list in sorted order.

Useful for sorting linked lists.
Stable & Out of Place Sorting

Worst Case Time Complexity [ Big-O ]: O(n*log n)
Best Case Time Complexity [Big-omega]: O(n*log n)
Average Time Complexity [Big-theta]: O(n*log n)

Space Complexity: O(n)
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<L.length;i++)
            L[i]=arr[l+i];
        for(int j=0;j<R.length;j++)
            R[j]=arr[m+1+j];
        int i=0, j=0, k=l;
        while(i<L.length && j<R.length){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i<L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int start, int end)
    {
        if (start < end) {
            int mid = (start+end)/2;
            // recursively calling the method here
            // left side of array
            sort(arr, start, mid );
            // right side of array
            sort(arr, mid + 1,end);
            //Merging left and right parts of the array
            merge(arr,start,mid,end);
        }
    }

    public static void display(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        System.out.println("\nWELCOME TO MERGE SORTING PROGRAM\n");
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
        System.out.print("Sorted Array: ");
        display(arr);
        System.out.println("\nThank You :)\n");
    }
}
