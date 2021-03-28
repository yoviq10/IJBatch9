package com.class17;

public class LocalVarsUse {
//ALWAYS TRY TO USE LOCAL VARIABLES
//INSTANCE VARIABLES WILL STAY IN MEMORY
	
	double salary=120000; //INSTANCE=DOUBLE
	void printInfo() {
		String name="Yovanna";
	}
	
	void printSalaryBonus() {
		double bonus=50000;
		System.out.println(salary+bonus);
	}
	
	
	
	public static void main(String[] args) {
	
		
		LocalVarsUse obj=new LocalVarsUse();
		obj.printInfo();
		obj.printSalaryBonus();
		

	}

}
