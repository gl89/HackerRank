
public class staticinit {

	   static boolean flag = true;
	   static Scanner scan = new Scanner(System.in);
	   static int B = scan.nextInt();
	   static int H = scan.nextInt();
	static{
	 
	    
	    if(H >= 0 && B >= 0){
	        flag = true;
	    }else{
	        
	        flag = false;
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }

	}
}
