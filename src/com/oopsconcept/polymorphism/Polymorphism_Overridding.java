package com.oopsconcept.polymorphism;

class Male {
	public void marrige() {
		System.out.println("Male Marrige With Women ");
	}
}

class Female extends Male {
	public void marrige() {
		System.out.println("Female Marrige With Man");
	}
}

public class Polymorphism_Overridding {
	public static void main(String[] args) {

		Male mmarrige = new Female(); // will always use child class overridden method

		mmarrige.marrige();
	}

}
