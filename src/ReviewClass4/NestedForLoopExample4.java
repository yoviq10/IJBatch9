package ReviewClass4;

public class NestedForLoopExample4 {

	public static void main(String[] args) {
		
		
		
		for(int i=0; i<5; i=i+2) { 
				
			System.out.println("i");
			
				for(int j=0; i<5; j=j-i) { //When we enter the loop, these 2 statements (int j=0; & i<5;) will be executed. j=j-i is the important part
					
					System.out.println(i+" "+j);
					i++;
					
				}
					System.out.println("i");
			
				
			}
		
		/*//When we enter the loop, these 2 statements (int j=0; & i<5;) will be executed. 
		 * j=j-i is the important part
		 */
		
		
		

	}

}
