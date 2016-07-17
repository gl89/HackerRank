/*
Gabriel Loterena
7/17/2016
Hackerrank 
Staircase: Simple printing algorithms
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
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
            sb.append(" ");      
        
        for(int i=n-1;i>-1;i--){
            sb.setCharAt(i,'#');
            System.out.println(sb);
        }
    }
}