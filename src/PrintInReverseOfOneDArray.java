/*
* Write a program to print the input array A of size N
* in reverse order where you have to take integer N and further N elements as input from user.
*
* Problem Constraints
1 <= N <= 1000
1 <= A <= 1000
* */

import java.util.Scanner;

public class PrintInReverseOfOneDArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scn.nextInt();
        }

        for(int i=N-1; i>=0; i--){
            System.out.println(A[i]+" ");
        }
    }
}
