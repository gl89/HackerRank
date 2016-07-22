/*
Gabriel Loterena
7/22/2016
You learn from mistakes
*/

import java.util.*;

public class Balance{

   public static void main(String[] args){
   boolean balanced=true;
   String str="()[]{}"; 
   
   Map<Character,Character> m = new HashMap<Character,Character>();
   Stack<Character> stack = new Stack<Character>();
   
   m.put('{','}');
   m.put('(',')');
   m.put('[',']');
   
   for(int i=0;i<str.length();i++){
      if(m.containsKey(str.charAt(i)))
         stack.push(str.charAt(i));
      else if(stack.empty() || str.charAt(i)==stack.pop());
         balanced=false;
   }
   System.out.print(balanced);
   }
}