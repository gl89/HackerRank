/*
Gabriel Loterena
8/18/2016
Pangrams are sentences that include every letter. 
My method is super easy, but seems to be radically different and somewhat ugly than other's. 
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        line = line.toLowerCase();
        
        Map<Character,Boolean> alpha = new HashMap<Character,Boolean>();
        
        alpha.put('a',false);
        alpha.put('b',false);
        alpha.put('c',false);
        alpha.put('d',false);
        alpha.put('e',false);
        alpha.put('f',false);
        alpha.put('g',false);
        alpha.put('h',false);
        alpha.put('i',false);
        alpha.put('j',false);
        alpha.put('k',false);
        alpha.put('l',false);
        alpha.put('m',false);
        alpha.put('n',false);
        alpha.put('o',false);
        alpha.put('p',false);
        alpha.put('q',false);
        alpha.put('r',false);
        alpha.put('s',false);
        alpha.put('t',false);
        alpha.put('u',false);
        alpha.put('v',false);
        alpha.put('w',false);
        alpha.put('x',false);
        alpha.put('y',false);
        alpha.put('z',false);
        
        for(int i=0;i<line.length();i++){
            if(alpha.containsKey(line.charAt(i)))
                alpha.put(line.charAt(i),true);
        }
        
        if(alpha.containsValue(false)){
            System.out.println("not pangram");
        }else if(alpha.containsValue(true)){
            System.out.println("pangram");
        }
    }
}