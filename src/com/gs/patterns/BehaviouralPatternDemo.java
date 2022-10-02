package com.gs.patterns;

public class BehaviouralPatternDemo {

	public static void main(String[] args) {
		Animal dog = new Dog("Bow Bow", () -> "House");
		Animal duck = new Duck("Quack Quack", () -> "Water");
		System.out.println(dog.animalFeatures());
		System.out.println(duck.animalFeatures());
	}

}

class Dog extends Animal {
	public Dog(String sound, Home home) {
		super(sound, home);
	}

	public String animalFeatures() {
		return this.getClass().getSimpleName() + " lives in " + home.animalHome() + " makes " + this.sound;
	}
}

class Duck extends Animal {
	public Duck(String sound, Home home) {
		super(sound, home);
	}

	public String animalFeatures() {
		return this.getClass().getSimpleName() + " lives in " + home.animalHome() + " makes " + this.sound;
	}
}

abstract class Animal {
	String sound;
	Home home;

	public Animal(String sound, Home home) {
		this.sound = sound;
		this.home = home;
	}

	public abstract String animalFeatures();
}

interface Home {
	public String animalHome();
}
