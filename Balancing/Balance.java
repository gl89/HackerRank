/*
Gabriel Loterena
7/22/2016
You learn from mistakes
*/

import java.util.*;

public class Balance{
   
   
   public static boolean isBalanced(String str){
      Map<Character,Character> m = new HashMap<Character,Character>();
      Stack<Character> stack = new Stack<Character>();
   
      //Nice way to match K,V
      m.put('{','}');
      m.put('(',')');
      m.put('[',']');
      if(str.length()==0)
         return false;
      if(str.length()%2!=0)
         return false;
      
      for(int i=0;i<str.length();i++){
         if(m.containsKey(str.charAt(i))){
            stack.push(str.charAt(i));
         }else if(stack.empty()||(str.charAt(i)!= m.get(stack.pop()))){ //the key acts a match for the vaule
            return false;
         }
      }
      return true;
   }
   
   public static void main(String[] args){ 
      System.out.println(isBalanced("[]"));
      System.out.println(isBalanced("[][]{}{}()()"));
      System.out.println(isBalanced("()()()()()())"));
      System.out.println(isBalanced(""));
   }
}