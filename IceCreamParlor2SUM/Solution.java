/*
Gabriel Loterena
8/11/2016
2SUM Problem: Trying to do it in O(n), but duplicates are definitely what's making it wrong
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int test_cases=scan.nextInt();
        
        for(int i=0;i<test_cases;i++){
            
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            int money=scan.nextInt();
            int flavors=scan.nextInt();
            scan.nextLine();//get to the next line
            String line = scan.nextLine();
            String[] count = line.split(" ");
            
            for(int j=0;j<count.length;j++){
                map.put(Integer.parseInt(count[j]),j+1);
           
            }
         
            /*
            Set<Integer> keys = map.keySet();  //get all keys
            for(Integer z: keys)
            {
            System.out.println("key "+z+" "+"value "+map.get(z));
            }
            */
            
            for(int k=0;k<count.length;k++){
               int value = money-Integer.parseInt(count[k]);
               if(map.containsKey(value)){
                  System.out.println((k+1)+" "+(map.get(value)));
                  break;                                            
               }
            } 
            map.clear();
        }
    }
}