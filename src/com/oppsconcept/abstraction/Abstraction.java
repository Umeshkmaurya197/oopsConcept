package com.oppsconcept.abstraction;

public abstract class Abstraction implements Animal {

	public void Abstraction_demo() {
	}

	public void eat(String animal) {
		System.out.println(animal + " can eat ");
	}

	public void run(String animal) {
		System.out.println(animal + " can run ");
	}

	public abstract void legs(String animal, int legs);

}