public class fizz{
   
   static void say(int n){
      for(int i=0;i<n;i++){
         if(i%2==0){
            System.out.println(i+" fizz");
         }else if(i%3==0){
            System.out.println(i+" buzz");
         }else{
            System.out.println(i+" bang");
         }
      }
   }

   public static void main(String[] args){
      fizz.say(1000);
   }
}