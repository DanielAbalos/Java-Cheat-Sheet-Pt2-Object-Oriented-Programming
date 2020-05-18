package main;

public class Main {

	public static void main(String[] args) {
		
		/*to use the objects that we created first we have to instantiate
		it first. Instantiating an object is the same as initializing a
		variable. First you have to determine the type, in this case
		the type is the name of the class or object that you will use.
		In this case 'Car' is the object.Second is declare the variable 
		name that you will use to access the object. In this case 'car'
		is the variable name. Last part is to initialize it with the new
		keyword to the Object you want it to be.*/
		
		Car car = new Car();
		
		/*To use the object's methods, use the variable then add a period
		then the function name.*/
		car.printDetails();
		car.startEngine();
		car.forward();
		car.reverse();
		
		System.out.println("\n\n");
		
		/*Remember that we have a constructor in the House class that takes values
		and assigns them to the local variables in that class? Here's how to 
		use it. Just like adding values to the parameters of a function*/
		House house = new House("Clay", 5, 6, 800.5);
		house.printDetails();
		
		System.out.println("\n\n");
		
		/*Since 'ChildClass' extends 'ParentClass', 'ChildClass' is the child of
		'ParentClass'. When using the child class, you inherit the states and
		behaviors of its parent. In this case the every time you instantiate the
		ChildClass, the constructor of the ParentClass also gets executed and
		the methods of ParentClass is accessible to the child class. But the
		child methods is not accessible from the parent.*/
		
		ParentClass pc = new ParentClass();
		pc.parentClass();
		
		ChildClass cc = new ChildClass();
		cc.childClass();
		cc.parentClass();
		
		System.out.println("\n\n");
		
		//METHOD OVERLOADING
		
		/*Method overloading only means that you can have multiple methods with the
		same name but with different parameters. The parameter you will pass to 
		the function will determine which function you executed.*/
		
		//Since you didn't pass any parameter, the first sampleMethodOverloading will be executed
		pc.sampleMethodOverloading();
		//Since you passed a string, the third sampleMethodOverloading will be executed
		pc.sampleMethodOverloading("RAWR");
		//since you passed an int, the second sampleMethodOverloading will be executed
		pc.sampleMethodOverloading(5);
		
		System.out.println("\n\n");
		
		//METHOD OVERRIDING
		
		/*this just says that if a parent class and a child class has the same method,
		the parent class' method will be overriden by the child class'*/
		pc.overrideThis();
		cc.overrideThis();
		

	}

}
