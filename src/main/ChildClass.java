package main;

public class ChildClass extends ParentClass{
	
	/*Using the extends keyword and the Class you want to extend to,
	in this case the 'ParentClass', this class becomes the child 
	class of 'ParentClass'*/
	
	ChildClass(){
		System.out.println("executing child class");
	}
	
	public void childClass() {
		System.out.println("hi i'm child class");
	}
	
	public void overrideThis() {
		System.out.println("This overrideThis() function is from ChildClass");
	}

}
