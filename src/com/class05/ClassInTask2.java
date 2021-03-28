package com.class05;

import java.util.Scanner;

public class ClassInTask2 {

	public static void main(String[] args) {
	
		Scanner score;
		int quiz,midterm,resultsOfExam,gpa;
		char grade;
		score=new Scanner(System.in);

		
		System.out.println("Please enter your score from quiz");
		quiz=score.nextInt();
		
		System.out.println("Please enter your score from midterm");
		midterm=score.nextInt();
		
		System.out.println("Please enter your score from final exam");
		resultsOfExam=score.nextInt();
		
		gpa=(quiz+ midterm + resultsOfExam)/3;
		
		if (gpa>= 90) {

			grade = 'A';

		}else if (gpa>=70 && gpa<90) {

			grade = 'B';

		}else if (gpa>50 && gpa<70) {

			grade= 'C';

		}else {

			grade= 'F';

		}
		
		
		System.out.println("Your grade is "+ grade);
	
		

		if (grade=='A' || grade=='B') {

			System.out.println("I am happy!!");

		}


	}

}
