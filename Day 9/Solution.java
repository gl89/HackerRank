/*
Gabriel Loterena
7/21/2016
Hackerrank 
Day 9: factorial via recursion
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
       
    //note Factorial or factorial 
    public static int factorial(int n){
            if(n==1)
                return 1;
            else
                return n * factorial(n-1);
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(factorial(x));
     
    }
}