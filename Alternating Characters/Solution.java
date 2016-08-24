/*
Gabriel Loterena
8/24/2016
Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing 
characters A and  B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.
AAAA  A, 3 deletions
BBBBB  B, 4 deletions
ABABABAB  ABABABAB, 0 deletions
BABABA  BABABA, 0 deletions
AAABBB  AB, 4 deletions because to convert it to AB we need to delete 2 A's and 2 B's
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String line;
        int l,count;
        for(int i=0;i<n;i++){
            line=scan.nextLine();
            l=line.length();
            count=0;
            for(int j=0;j<l-1;j++){
                if(line.charAt(j)==line.charAt(j+1))
                    count++;
            }
            System.out.println(count);
        }
    }
}