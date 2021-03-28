package com.class17;

public class EmployeeTester {

	public static void main(String[] args) {
		
		
		
		Employee employees=new Employee();
		
		employees.empID="123";
		employees.salary=200000;
		System.out.println(employees.empID+" salary is "+employees.salary+" CEO "+employees.CEO);

		Employee Obj2=new Employee();
		Obj2.empID="11111";
		Obj2.salary=210000;
		System.out.println(Obj2.empID+" salary is "+Obj2.salary+" CEO "+Obj2.CEO);

		Employee obj3=new Employee();
		obj3.empID="22222";
		obj3.salary=220000;
		System.out.println(obj3.empID+" salary is "+obj3.salary+" CEO "+obj3.CEO);

		
		
		
		
	}

}
