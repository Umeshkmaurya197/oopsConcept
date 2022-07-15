package com.oppsconcept.encapsulation;

public class EncapsulationDemo {

	static int id;
	static String name;
	static String place;
	
	EncapsulationDemo(int id, String name, String place) {
		super();
		EncapsulationDemo.id = id;
		EncapsulationDemo.name = name;
		EncapsulationDemo.place = place;
	}

	public static void person() {
		System.out.println(" id : " + id + "\n Name : " + name + "\n Place : " + place);
	}

	public static void main(String[] args) {
		new EncapsulationDemo(101, "Ashok", "New York");
		person();
	}

}