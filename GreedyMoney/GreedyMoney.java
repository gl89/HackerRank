//interview question
//Gabriel Loterena
//Back at it
//3/8/2018
//git

public class GreedyMoney{
   
	// m is size of coins array (number of different coins)
    static int minCoins(int coins[], int m, int V)
    {
       // base case
       if (V == 0) return 0;
      
       // Initialize result
       int res = Integer.MAX_VALUE;
      
       // Try every coin that has smaller value than V
       for (int i=0; i<m; i++)
       {
         if (coins[i] <= V)
         {
             int sub_res = minCoins(coins, m, V-coins[i]);
      
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                res = sub_res + 1;
         }
       }
       return res;
    }
   
   public static void main(String[] args){
	   int[] coins = {1,5,10,25};
	   int m = coins.length;
	   int V = 32;
	   System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
   }
}