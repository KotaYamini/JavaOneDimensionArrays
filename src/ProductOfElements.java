/*
* Write a program that returns the product of all elements present in the array.
*
Constraints:
1 <= |A| <= 100
1 <= A <= 100
Note: It is guaranteed that the resultant product will be <= 10^15
* */

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long product = 1L;
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<N; i++){
            product = product * arr[i];
        }

        System.out.println(product);
    }
}
