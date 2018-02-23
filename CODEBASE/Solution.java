

/*Given N  integers, count the number of pairs of integers whose difference is K.
Input Format
The first line contains N and K . 
The second line contains  numbers of the set. All the  numbers are unique.
Constraints
• Each integer will be greater than 0 and at least  smaller than 2^32-1.

Output Format
An integer that tells the number of pairs of integers whose difference is K.

Sample Input
5 2  
1 5 3 4 2  
Sample Output
3
Explanation
There are 3 pairs of integers in the set with a difference of 2.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pairs(int k, int[] arr) {
        // Complete this function
        int count = 0;
       int length = arr.length;
        boolean flag;
            for(int i=0; i<length-1; i++){
                flag=false;
                for(int j = 0; j<length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    }
                }
                
                if(flag==false){
                break;
                }
            }
                // 1,2,3,4,5
                for(int right = length-1; right>=0; right--){
                    for(int left = 0; left<=right;left++){
                         if(arr[right]-arr[left]==k){
                                count++; 
                                break;     
                         }
                     
                }
              }
              return count; 
                
                
               
        }
        
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
         System.out.println("Enter the values");
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }
}

