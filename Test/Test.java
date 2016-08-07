/*
Gabriel Loterena
7/31/2016
Find largest sub array
were sum of sub array <= to k
*/

public class Test{
    static int maxLength(int[] a, int k) {
        int longest=0;
        int current=0;
        int prev_sum=0;
        
        int j=0;
        
        for(int i=0;i<a.length;i++){
            
            if(a[i]<=k && prev_sum+a[i]<=k){
                current++;
                prev_sum+=a[i];
            }else if(a[i]<=k && prev_sum+a[i]>k){
                prev_sum+=a[i];
                current++; //don't forget we do add the next element while trying to reduce larger ones from the front
                while(prev_sum>k){
                    prev_sum-=a[j];
                    j++;
                    current--;
                }
            } else if(a[i]>k){
                current=0;
                j=i+1;
                prev_sum=0;  
            }
                    
            if(current>longest)
               longest=current;  
        }
        return longest;
    }

}