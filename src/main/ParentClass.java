package main;

public class ParentClass {
	
	ParentClass(){
		System.out.println("executing parent class");
	}
	
	public void parentClass() {
		System.out.println("hi i'm parent class");
	}
	
	public void overrideThis() {
		System.out.println("This overrideThis() function is from ParentClass");
	}
	
	public void sampleMethodOverloading() {
		System.out.println("Hi i am sampleMethodOverloadingFunction");
	}
	
	public void sampleMethodOverloading(int x) {
		System.out.println("Hi i am also sampleMethodOverloadingFunction. x = " + x);
	}
	
	public void sampleMethodOverloading(String x) {
		System.out.println("Hi i am also sampleMethodOverloadingFunction. The message is" + x);
	}

}
