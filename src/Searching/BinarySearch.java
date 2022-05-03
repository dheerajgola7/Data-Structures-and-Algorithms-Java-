package Searching;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
    //RECURSIVE APPROACH
    public static int binarySearch(int[] arr, int start, int end, int x){
        if(start<end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, start, mid-1, x);
            return binarySearch(arr, mid+1, end, x);
        }
        return -1;
    }

    //ITERATIVE APPROACH
    public static int binarySearch(int[] arr, int x){
        int start=0, end=arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("\nWELCOME TO BINARY SEARCH PROGRAM\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int[] arr = new int[0];
        try {
            arr = new int[sc.nextInt()];
        } catch (NegativeArraySizeException | InputMismatchException e) {
            System.out.println(e);
            return;
        }
        System.out.print("Enter " + arr.length + " elements of array in sorted order: ");
        for (int i = 0; i < arr.length; i++) {
            try {arr[i] = sc.nextInt();}
            catch (InputMismatchException e) {System.out.println(e); return;}
        }
        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.print("Enter an element to search: ");
        int res = binarySearch(arr, 0, arr.length-1, sc.nextInt());
        if(res == -1)
            System.out.println("Sorry, Element Not Found!! :(");
        else
            System.out.println("Element found at index "+res);
        System.out.println("\nThank You :)\n");
    }
}
