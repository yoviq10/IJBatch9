package com.class19;

public class constructorWithThisKeyword {

	String name;
	double salary;
	double bonus;
	int numberOfDaysWorked;
	double bonusPercentage;
	
	constructorWithThisKeyword(String name, double salary, int numberOfDaysWorked, double bonusPercentage){
		this.name=name;
		this.salary=salary;
		this.bonus=10000;
		this.numberOfDaysWorked=numberOfDaysWorked;
		this.bonusPercentage=bonusPercentage;
	}
	
		void printBonus() {
			
			//int numberOfHoursWorked=0; not needed// only when there is a conflict
			if(this.numberOfDaysWorked>300) {
				bonus=1000;
			}else {
				bonus=500;
			}
				
				
		}
	
	
	public static void main(String[] args) {
		
constructorWithThisKeyword obj1=new constructorWithThisKeyword("yovanna",100000,300,100);

		System.out.println(obj1.name);
		System.out.println(obj1.salary);
		System.out.println(obj1.bonus);
		System.out.println(obj1.numberOfDaysWorked);
		System.out.println(obj1.bonusPercentage);
		obj1.printBonus();
	}

}
