/*
* Take input an array A of size N and write a program to print maximum and minimum elements of the input.
* The only line of the input would contain a single integer N that represents the length of the array followed by
* the N elements of the input array A.

 * */

import java.util.Scanner;

public class MaxAndMinofArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = scn.nextInt();
        }

        System.out.println(minArray(A) + " ");
        System.out.println(maxArray(A));
    }

    public static int minArray(int[] arr){
        int N = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxArray(int[] arr){
        int N = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
