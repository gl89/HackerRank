import java.util.Arrays;

public class Sort{
   
   public static int[] merge(int[] a, int[] b) {

      int[] answer = new int[a.length + b.length];
      int i = 0, j = 0, k = 0;

      while (i < a.length && j < b.length)
      {
        if (a[i] < b[j])       
            answer[k++] = a[i++];

        else        
            answer[k++] = b[j++];               
      }

      while (i < a.length)  
            answer[k++] = a[i++];


      while (j < b.length)    
         answer[k++] = b[j++];

      return answer;
   }

   
   static int partition(int arr[], int left, int right){
      int i = left, j = right;
      int tmp;
      int pivot = arr[(left + right) / 2];
     
      while (i <= j) {
            while (arr[i] < pivot)
                  i++;
            while (arr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  i++;
                  j--;
            }
      }
     
      return i;
   }
    
   static void quickSort(int arr[], int left, int right) {
      int index = partition(arr, left, right);
      if (left < index - 1)
            quickSort(arr, left, index - 1);
      if (index < right)
            quickSort(arr, index, right);
   }

   public static void SelectionSort ( int [ ] num ){
     int i, j, first, temp;  
     for ( i=num.length-1; i > 0;i-- ) {
          first = 0;   //initialize to subscript of first element
          for(j = 1; j <= i; j ++){   //locate smallest element between positions 1 and i.
               if( num[ j ] < num[ first ] )         
                 first = j;
          }
          temp = num[ first ];   //swap smallest found with element in position i.
          num[ first ] = num[ i ];
          num[ i ] = temp; 
      }           
   }

   public static void InsertionSort( int [] num){
     int j;                     // the number of items sorted so far
     int key;                // the item to be inserted
     int i;  

     for (j = 1; j < num.length; j++) {   // Start with 1 (not 0)
           key = num[ j ];
           for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)  { // Smaller values are moving up
                 num[ i+1 ] = num[ i ];
          }
         num[ i+1 ] = key;    // Put the key in its proper location
     }
  }


   public static void main(String[] args){
   
   System.out.println("Selection Sort");
   int[] a = new int[]{2,3,5,71,120,343,1,43,56,65,343};
   InsertionSort(a);
   System.out.println(Arrays.toString(a));
   
   System.out.println("Insertion Sort");
   int[] b = new int[]{2,3,5,71,120,343,1,43,56,65,343};
   SelectionSort(b);
   System.out.println(Arrays.toString(b));
   
   System.out.println("Quick Sort");
   int[] c = new int[]{2,3,5,71,120,343,1,43,56,65,343};
   quickSort(c,0,c.length-1);
   System.out.println(Arrays.toString(c));
   
   System.out.println("Merge Sort"); 
   int[] d = new int[]{1,2,3,4,5,6,7,8,9,10};
   int[] f = new int[]{3,5,6,7,8,11,13,14};
   System.out.println(Arrays.toString(merge(d,f)));
   
   }
}