package ReviewClass4;

public class Recap {

	public static void main(String[] args) {
		
		//loops recap
		
		
		int i=10;
		
		System.out.println("int i-10; \n"+i);
		i=i+20; //adding +10 from the int ==30
		System.out.println("int i-10; \n"+i);
		i=i+10;// i is now 30 + 10 from the int ==40
		System.out.println("int i-10; \n"+i);
		i++; //increment it by 1 ==41
		System.out.println("int i-10; \n"+i);
		++i;  // increment by 1 (same way as above) ==42
		System.out.println("int i-10; \n"+i);
		
		System.out.println("int i-10; \t"+i);
		
		//output 10,30,40,42,42
		
		System.out.println("--------------------");
		
		i=10;           // (increment by 1 ++i in parenthesis FIRST & then by the other ++i by 1)
		System.out.println("++i "+(++i+(++i)));  // 10+1 =11, > 11+(1=12)) > (11+(12))=23 output
		System.out.println("i++ "+(i+++i++));
		System.out.println("i "+i);
		
		
		
		

	}

}
