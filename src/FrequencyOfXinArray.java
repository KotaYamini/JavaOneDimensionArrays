/*
* Given an integer array A. Find and return the frequency of number B in array A.
* Problem Constraints
1 <= |A| <= 10^5
1 <= A[i] <= 10^9
1 <= B <= 10^9
* */

public class FrequencyOfXinArray {
    public static void main(String[] args) {
    int[] arr = {2,9, 10, 45, 78, 2, 8, 10, 2, 99, 67};
    int N = arr.length;
    int B = 2;
    int count = 0;
     for(int i=0; i<N; i++){
      if(arr[i] == B){
          count++;
      }
     }
     System.out.println(count);
    }
}
