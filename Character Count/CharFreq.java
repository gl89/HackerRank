import java.util.*;
import java.io.*;

public class CharFreq{
   public static void main(String[] args)throws Exception{
   
   Map<Character,Integer> freq = new HashMap<Character,Integer>();

    String  thisLine = null;
      try{
      // open input stream textfile.txt for reading purpose.

      BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        
      while ((thisLine = br.readLine())!= null){
         System.out.println(thisLine);    
         for(int i=0; i<thisLine.length();i++){
            if(freq.containsKey(thisLine.charAt(i))){
               int count = freq.get(thisLine.charAt(i));
               freq.put(thisLine.charAt(i),count+1);
            }else{
               freq.put(thisLine.charAt(i),1);
            }
         }
      }
      
      System.out.println(freq.entrySet());
      
      }catch(Exception e){
         e.printStackTrace();
      }


   }
}