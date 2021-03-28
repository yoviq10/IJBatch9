package ReviewClass4;

public class recap1 {

	public static void main(String[] args) {
		
		
		
		int i=0;
		
		System.out.println("int i-10; \n"+i);
		i=i-20; // 0-20 =-20 output
		System.out.println("int i-10; \n"+i);
		i=i-10;// i is now -20 & decremented by 10 so -20 - 10 =-30 output
		System.out.println("int i-10; \n"+i);
		i--; // -30 -1 = -31 output
		System.out.println("int i-10; \n"+i);
		--i;  // -31 -1 = -32 output
		System.out.println("int i-10; \n"+i);
		
		
	System.out.println("--------------------");
		
		i=10;   // fresh new value of 10 now        
		System.out.println("--i "+(--i));  // first decrement the value then use it
		System.out.println("i-- "+(i--)); // first use the value then decrement 
		System.out.println("i "+i); //in the next line updated value will reflect in i
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
