package com.oopsconcept.inharitance;

class GrandParrent{
	public void eat() {
		System.out.println(" Grand Parrent : Eat");
	}
	public void hobbies() {
		System.out.println(" Grand Parrent : Book Reading");
	}
}

class Parrent extends GrandParrent{
	public void sleep() {
		System.out.println(" Parrent : Sleep");
	}
	public void walk() {
		System.out.println(" Parrent : Walk");
	}
	public void hobbies() {
		System.out.println(" Parrent : Football");
	}
}

class Child extends Parrent {
	public void run() {
		System.out.println(" Child : Run");
	}
	public void hobbies() {
		System.out.println(" Child :  Chess ");
	}
}
public class Inharitance{
	public static void main (String[] args) {
		System.out.println("\n----------------------\n GrandParrent refrence variable \n & using Child class constructor.\n");
		
		GrandParrent gp = new Child();
		gp.eat();
		gp.hobbies();
		System.out.println("\n----------------------\n Parrent refrence variable \n & using Child class constructor.\n");
		
		Parrent p  = new Child();
		p.eat();
		p.walk();
		p.sleep();
		p.hobbies();
		System.out.println("\n----------------------\n Child class refrence variable \n & using Child class constructor.\n");
		
		Child c = new Child();
		c.eat();
		c.sleep();
		c.walk();
		c.run();
		c.hobbies();
		System.out.println("\n----------------------\n Parrent class refrence variable \n & using Child class constructor.\n");
				
		Parrent ch =new Child();
		ch.eat();
//		ch.run();
		ch.sleep();
		ch.walk();
		ch.hobbies();
		System.out.println("\n----------------------\n Parrent class refrence variable \n & using Parrent class constructor.\n");
		
		Parrent pr = new Parrent();
		pr.eat();
//		pr.run();
		pr.sleep();
		pr.walk();
		pr.hobbies();
		
		
		
		
		
		
		
	}
	
}