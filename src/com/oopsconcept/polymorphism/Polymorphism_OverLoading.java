package com.oopsconcept.polymorphism;

public class Polymorphism_OverLoading {
	public void add(int num1, int num2) {
		System.out.println("  " + num1 + " +" + num2 + " = " + (num1 + num2));
	}

	public void add(double num1, double num2) {
		System.out.println("  " + num1 + " +" + num2 + " = " + (num1 + num2));
	}

	public static void main(String[] args) {

		Polymorphism_OverLoading po = new Polymorphism_OverLoading();

		po.add(34, 66);
		po.add(34.1, 65.9);
	}
}