/*
Gabriel Loterena
7/18/2016
Hackerrank 
Day 7: Reverse an array, very popular question.
*/

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        while(--n!=-1){
            System.out.print(arr[n]+" ");
        }
    }
}