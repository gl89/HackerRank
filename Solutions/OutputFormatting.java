import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                StringBuffer sb = new StringBuffer();
                int x=sc.nextInt();
                
                for(int j=0;j<15-s1.length();j++){
                    sb.append(" ");
                }
                if(x - 10 < 0){
                    System.out.println(s1 + sb + "00" + x);
                }else if(x - 100 < 0){
                    System.out.println(s1 + sb + "0" + x);
                }else{
                    System.out.println(s1 + sb + x);
                }
            }
            System.out.println("================================");

    }
}

