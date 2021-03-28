package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		int day = 4;
		String weekDay;

		if (day == 1) { //works with conditions, it evaluates if condition is True or False
			weekDay="Monday";
		} else if (day == 2) {
			weekDay="Tuesday";
		} else if (day == 3) {
			weekDay="Wednesday";
		} else if (day == 4) {
			weekDay="Thursday";
		} else if (day == 5) {
			weekDay="Friday";
		} else if (day == 6) {
			weekDay="Saturday";
		} else if (day==7) {
			weekDay="Sunday";
		}else {
			weekDay="Invalid";
		}
		
		if(!weekDay.equals("Invalid")) {
		System.out.println("Today is "+weekDay);
		
		}

		System.out.println("----------using SWITCH STATEMENT-----------");
		
		String weekDay1; 
		switch(day) { //SWITCH is a value based..jumps right away to the matching case
		//cannot have duplicate cases
		//values MUST match a variable type Ex:int=int cases, double =double cases
		//we must HAVE BREAK in every case
		
		case 1:
			weekDay1="Monday";
			break;
		case 2:
			weekDay1="Tuesday";
			break;
		case 3:
			weekDay1="Wedneday";
			break;
		case 4:
			weekDay1="Thursday";  //jumps to case4
			break;
		case 5:
			weekDay1="Friday";
			break;
		case 6:
			weekDay1="Saturday";
			break;
		case 7:
			weekDay1="Sunday";
			break;
		default:
			weekDay1="Invalid";
			break; // <don't really need a break here since its on the last one
		
		}
		
		if(!weekDay.equals("Invalid")) {
			System.out.println("Today is "+weekDay1);
		}
		
		
		
	}

}
