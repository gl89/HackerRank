/*
Gabriel Loterena
7/18/2016
Hackerrank 
Day 6: Given a String print its even-indexed and odd-indexed characters as  
2 space-separated strings on a single line.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T=scan.nextInt();
        scan.nextLine();
        while(T-->0){
            String str =scan.nextLine();
            for(int i=0;i<str.length();i+=2)
                System.out.print(str.charAt(i));
            System.out.print(" ");
            for(int j=1;j<str.length();j+=2)
                System.out.print(str.charAt(j));
            System.out.println();
        }
    }
}