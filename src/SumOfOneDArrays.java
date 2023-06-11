/*
* Write a program to print sum of elements of the input array A of size N.
Note: the size element is removed from the list passed as input to the function main, that is only elements are present.
*  User is supposed to add them up and return the result
* */
import java.lang.*;
import java.util.*;
public class SumOfOneDArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int A[] = new int[n];
        //  iterating over the values in array length and storing the values into the array 'A'
        for(int i=0; i< A.length; i++){
            A[i]= scn.nextInt();
        }

        // calling the function named 'SumOfElementsInA'
        SumOfElementsInA(A);
    }
    static void SumOfElementsInA(int arr[]){
        // Summation of all the elements in the Array 'A'
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }

}
