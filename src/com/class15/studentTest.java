package com.class15;

public class studentTest {

	public static void main(String[] args) {
		// from student class
		
		Student ramObj=new Student(); // creating an object
		ramObj.name="Ram";
		ramObj.age=25;
		ramObj.studentId="cs123";
		ramObj.schoolName="Syntax";
		ramObj.study();
		ramObj.payTuition();
		
		
		System.out.println("--creating a new object--");
		
		Student yovannaObj=new Student();
		
		yovannaObj.name="Yovanna";
		yovannaObj.age=29;
		yovannaObj.studentId="YQ123";
		yovannaObj.schoolName="Syntax";
		yovannaObj.study();
		yovannaObj.payTuition();
		
		
		System.out.println(yovannaObj.getStudentAge());
		
	}

}
