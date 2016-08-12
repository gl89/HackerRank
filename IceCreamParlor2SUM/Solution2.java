/*
Gabriel Loterena
8/11/2016
2SUM Problem: The slow, but defitely easiest way to do it. 
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int test_cases=scan.nextInt();
        
        for(int i=0;i<test_cases;i++){
            
            int money=scan.nextInt();
            int flavors=scan.nextInt();
            scan.nextLine();//get to the next line
            String line = scan.nextLine();
            String[] count = line.split(" ");
            int[] counti = new int[flavors];
            
            for(int j=0;j<flavors;j++){
                counti[j]=Integer.parseInt(count[j]);  
            }
            
            for(int k=0;k<flavors;k++){
                 for(int l=k+1;l<flavors;l++){
                     if(counti[k]+counti[l]==money){
                        System.out.println((k+1)+" "+(l+1));
                    }  
                 }
            }            
        }
    }
}