/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0006;

/**
 *
 * @author DUNG HOANG PC
 */
public class Main {
    public static void main(String[] args) {
           //User enter size of array
        int size = BinarySearch.getInputLimitInt(0,Integer.MAX_VALUE, "Enter number of array: " ,
                "Please enter number!", "Please enter positive number!");
        //Generrate random array
        int number = BinarySearch.getInput(-1, Integer.MAX_VALUE, "Enter search value: ", 
                "Please enter number!", "Please enter number greater or equal to 0!");
        int[] array = BinarySearch.generateRandomArray(size);
        //Sorted array
        BinarySearch.sort(array);
        //Find search value
        BinarySearch.numSearch(array, 0, size - 1, number);
                
    }
}
