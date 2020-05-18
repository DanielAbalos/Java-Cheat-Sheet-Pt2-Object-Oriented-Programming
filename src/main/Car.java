package main;

public class Car {
	
	/*An object in Java is like any other objects in the real world like cars,
	house, gadgets etc. Every object in the real world has state and behavior
	for example a dog would have a state like name, breed and age while its
	behaviors are running, barking, eating and playing.
	
	Same thing in Java objects. We can associate the variables as the state
	and the methods or functions as the behavior. In this case we are creating
	the 'Car' object which has the states make, model, fuel etc. And behaviors 
	like start engine, forward and reverse*/
	
	/*Classes are used to create Java Objects. Classes are like the blueprints 
	of objects.
	
	TIP : When creating an object think of it as a real object. First think of 
	the details you need and assign them to variables. Then think of the actions
	that you need from that object and make it as functions. For example you are
	creating a Person object, think of the things you need from the Person Object.
	Possible things are name, age, weight, height. Then, think of the actions that
	the person object may do and make functions for them. Example, work, sleep,
	eat.*/
	
	private String make;
	private String model;
	private double fuel;
	private double engineCC;
	private int numberOfWheels;
	
	
	/*Constructors are functions with the same name as the class name. Constructors
	are always called once the object is instantiated*/
	
	/*This is a default constructor, it has no return type The 'this' keyword is used 
	to refer to a variable or function that is owned by the class*/
	Car(){
		System.out.println("Default constructor called");
		this.make = "Subaru";
		this.model = "WRX STI";
		this.fuel = 50;
		this.engineCC = 3000;
		this.numberOfWheels = 4;
	}
	
	public void startEngine() {
		System.out.println(this.make + " " + this.model + " started engine");
		System.out.println("costs " + this.fuel * .10 + " liters of fuel");
		
	}
	
	public void forward() {
		System.out.println(this.make + " " + this.model + " is going forward");
		System.out.println("costs " + this.fuel * .30 + " liters of fuel");
	}
	
	public void reverse() {
		System.out.println(this.make + " " + this.model + " is going backward");
		System.out.println("costs " + this.fuel * .20 + " liters of fuel");
	}
	
	public void printDetails() {
		System.out.println(this.make + " " + this.model);
		System.out.println("Fuel capacity: " + this.fuel);
		System.out.println("Engine displacement: " + this.engineCC);
		System.out.println("Wheels: " + this.numberOfWheels);
	}
	
	
	

}
