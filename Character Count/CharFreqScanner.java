import java.io.*;
import java.util.Scanner;
import java.util.*;

public class CharFreqScanner{

    public static void main(String[] args){
 
    Map<Character,Integer> freq = new HashMap<Character,Integer>();
    File file = new File("text.txt");

    try {
        Scanner sc = new Scanner(new FileReader(file));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            for(int i=0; i<line.length();i++){
               if(freq.containsKey(line.charAt(i))){
                  int count = freq.get(line.charAt(i));
                  freq.put(line.charAt(i),count+1);
               }else{
                  freq.put(line.charAt(i),1);
               }
            }
        }
        sc.close();
        System.out.println(freq.entrySet());
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
    }
}
