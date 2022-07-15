package com.oppsconcept.abstraction;

class Elephant extends Abstraction{
	@Override
	public void legs(String animal, int legs) {
		System.out.println(animal+" have "+legs+" Legs");
	}
}

class Snake extends Abstraction{
	@Override
	public void legs(String animal, int legs) {
		System.out.println(animal+" have "+legs+" Legs");	
	}
}

class Kangaroo extends Abstraction{
	@Override
	public void legs(String animal, int legs) {
		System.out.println(animal+" have "+legs+" Legs");		
	}
}

public class Abstraction_Demo {
	public static void main(String[] args) {

		Elephant el = new Elephant();
		Snake sn = new Snake();
		Kangaroo kn = new Kangaroo();

		el.eat("Elephant");
		el.run("Elephant");
		el.legs("Elephant", 4);
		System.out.println("");

		sn.eat("Sanke");
		sn.run("Sanke");
		sn.legs("Sanke", 0);
		System.out.println("");

		kn.eat("Kangaroo");
		kn.run("Kangaroo");
		kn.legs("Kangaroo", 2);
	}
}
