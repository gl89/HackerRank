/*
Gabriel Loterena
7/17/2016
Hackerrank 
Kangaroo: Jumping at different speeds and locations and seeing if they ever meet.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void determineKangaroos(int x1, int v1, int x2, int v2) {
    int dx = x1 - x2;//difference of starting area
    int dv = v2 - v1;//difference of velocities

    if(dv == 0) {//obviously same rate doesn't work otherwise they would have same starting point
        System.out.println("NO");
    } else if((dx % dv == 0) && (dx / dv > 0)) {//they need to have a rate that allows them to meet and they don't mov too fast
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        determineKangaroos(x1,v1,x2,v2);
    }
}
