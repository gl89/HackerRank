public class GreedyMoney{
   
   static void coinCount(int n){
      int[] coins = new int[]{25,10,5,1};
      int[] amount = new int[coins.length];
      int l = coins.length;
      
      for(int i=0;i<l;i++){
         while(n>=coins[i]){
            n-=coins[i];
            amount[i]++;
         }
      }
      for(int i=0;i<l;i++){
         System.out.print(amount[i]+" ");
      } 
      System.out.println();  
   }
   
   public static void main(String[] args){
      GreedyMoney.coinCount(100);
      GreedyMoney.coinCount(14);
      GreedyMoney.coinCount(99);
      GreedyMoney.coinCount(20);
   }
}