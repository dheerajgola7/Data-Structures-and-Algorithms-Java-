package Searching;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int x){
        for (int i = 0; i <= arr.length/2; i++) {
            if(arr[i]==x)
                return i;
            if(arr[arr.length-1-i]==x)
                return arr.length-1-i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("\nWELCOME TO LINEAR SEARCH PROGRAM\n");
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
        int res = linearSearch(arr, sc.nextInt());
        if(res == -1)
            System.out.println("Sorry, Element Not Found!! :(");
        else
            System.out.println("Element found at index "+res);
        System.out.println("\nThank You :)\n");
    }
}
