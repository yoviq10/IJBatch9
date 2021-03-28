package com.class13;

public class AnotherExampleDogs {
	

	public String color;
	public String breed;
	public int age;
	public String size;
	
	
	public void sleep() {
		System.out.println("ZZZzZZZz");
	}
	
	
	public void bark() {
		System.out.println("woof woof");
	}
	
	public void eat() {
		for(int i=0;i<5;i++) {
		System.out.println("yum yumymmm");
		}
	}
	
	public void look() {
		System.out.println("Hi I am a dog my color is "+color);
	}
	
	
	public static void main(String[] args) {
		
		AnotherExampleDogs Dog1=new AnotherExampleDogs();
		
		Dog1.breed="Bulldog";
		Dog1.size="Large";
		Dog1.color="Black";
		Dog1.age=5;
		Dog1.bark();
		Dog1.eat();
		Dog1.sleep();
		Dog1.look();
		
		

		AnotherExampleDogs Dog2=new AnotherExampleDogs();
		
		Dog2.breed="Husky";
		Dog2.size="Large";
		Dog2.color="Gray";
		Dog2.age=4;
		Dog2.look();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
