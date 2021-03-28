package com.class17;

public class Students {

	/*  Create a Class called Students
	Create three  variables  studentName, studentID and numberOfStudents
	Create three objects of the Students Class 
	Set the value for  studentName, studentID and increment the numberOfStudents for each object
	Print out  total number of students
	 */
	
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	public static void main(String [] args) {
		Students yovannaobj=new Students();
		yovannaobj.studentName="Yovanna";
		yovannaobj.studentID=123;
		yovannaobj.numberOfStudents++; //value becomes increment by 1
		System.out.println(yovannaobj.studentID+" name "+yovannaobj.studentName+" Number of students "+yovannaobj.numberOfStudents);
		
		
		
		
		Students nelsonobj=new Students();
		nelsonobj.studentName="Nelson";
		nelsonobj.studentID=111;
		nelsonobj.numberOfStudents++; //value increments by 1, turns to 2
		System.out.println(nelsonobj.studentID+" name "+nelsonobj.studentName+" Number of students "+nelsonobj.numberOfStudents);
		System.out.println(numberOfStudents);//stays the same
		
		
		
		
		
		
	}
	
	
}
