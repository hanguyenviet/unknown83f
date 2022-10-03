/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0006;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DUNG HOANG PC
 */
public class BinarySearch {
    static int getInputLimitInt(int min,int max, String messageInfor,
            String messageError, String messageOutRange) {
        System.out.println(messageInfor);
        //loop to re-input
        while (true) {
            //User enter input
            Scanner getInput = new Scanner(System.in);
            String input = getInput.nextLine();
            try {
                //Check input is positive number or not
                int size = Integer.parseInt(input); 
                if (size > min && size < max) {
                    //return value of input
                    return size;
                } else {
                    System.out.println(messageOutRange);
                }
            } catch (Exception e) {
                System.out.println(messageError);
            }
        }
    }
    static int getInput(int min,int max, String messageInfor,
            String messageError, String messageOutRange) {
        System.out.println(messageInfor);
        //loop to re-input
        while (true) {
            //User enter input
            Scanner getInput = new Scanner(System.in);
            String input = getInput.nextLine();
            try {
                //Check input is positive number or not
                int size = Integer.parseInt(input); 
                if (size > min && size < max) {
                    //return value of input
                    return size;
                } else {
                    System.out.println(messageOutRange);
                }
            } catch (Exception e) {
                System.out.println(messageError);
            }
        }
    }
    static int[] generateRandomArray(int size) {
        Random ran = new Random();
        //create array with size user input
        int[] array = new int[size];
        //random element in array
        //access from first to last element in array
        for (int i = 0; i < size - 1; i++) {
            array[i] = ran.nextInt(20);
        }
        return array;
    }

    static void displayArray(int[] array, String message) {
        System.out.print(message);
        System.out.print(Arrays.toString(array));
    }
    static void sort(int[] arr) {
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n-1; i++){  
            for(int j=0; j < n-1-i; j++){  
                if(arr[j] > arr[j+1]){  
                    //swap elements  
                    temp = arr[j+1];  
                    arr[j+1] = arr[j];  
                    arr[j] = temp;  
                }  
            }     
        }  
    }
    static int binarySearch(int[] arr, int l, int r, int searchTerm) {
        if(r > l) {
            int mid = l + ((r - l)/2);
            // If the element is present at the middle itself
            if(arr[mid] == searchTerm) {
                return mid;
            } // If element is smaller than mid, then it can only be present in left subarray
            if(arr[mid] > searchTerm) {
                return binarySearch(arr, l, mid - 1, searchTerm);
            // Else the element can only be present in right subarray
            } else {
                return binarySearch(arr, mid + 1, r, searchTerm);
            }
        }
        return -1;
    }
//    static int linerSearch(int[] arr, int key) {
//        int size = arr.length;
//        for (int i = 0; i < size; i++) {
//            if (arr[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
    static void numSearch(int[] arr, int l, int r, int searchTerm) {
        BinarySearch searcher = new BinarySearch();
        searcher.sort(arr);
        searcher.displayArray(arr, "Sorted aray: ");
        int foundIndex = searcher.binarySearch(arr, 0, arr.length - 1, searchTerm);
        System.out.println("\nFound " + searchTerm + " at index: " + foundIndex);
    }
}
