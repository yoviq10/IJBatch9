package ReviewClass4;

public class Recap2 {

	public static void main(String[] args) {
	
		
		int i=10;
		int j=20;
		
		i=i+j+20; // (you are using the 10 and 20 from int)>>> 30+20 =50 output
		System.out.println("int i-10; \n"+i);
		i+=i+10;//  (50+10+50) >>> i=i+10+i = 110 output
		System.out.println("int i-10; \n"+i);
		i++; //  (+1) = 111 output
		System.out.println("int i-10; \n"+i);
		++i;  // (+1) =112 output
		System.out.println("int i-10; \n"+i);
		
		
		
		System.out.println("--------------------");
		
		i=10;           // (increment by 1 ++i in parenthesis FIRST & then by the other ++i by 1)
		System.out.println("++i "+(++i));  // 10+1 =11, > 11+(1=12)) > (11+(12))=23 output
		System.out.println("i++ "+(i++));
		System.out.println("i "+i);
		
		
		

	}

}
