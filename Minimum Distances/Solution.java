/*
Gabriel Loterena
7/18/2016
Hackerrank 
Minimum distances: Find the minimim distance between A[i] & A[j], where i != j;
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        int min = -1; 
        boolean con = false; 
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                if(A[i]==A[j]){
                    if(con==false){
                        min=(j-i);
                        con=true;
                    }
                    if(con && min > j-i){
                        min=(j-i);
                    }
                }  
            }
        }
        System.out.println(min);
    }
}