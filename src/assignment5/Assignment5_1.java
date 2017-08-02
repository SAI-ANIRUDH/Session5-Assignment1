package assignment5;// Package is compulsory.
/*
 * Program to determine abstract class and abstract methods.
 */

public abstract class Assignment5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p = new Child(); // Instantiating the abstract parent class and calling the child class. 
p.age(); // Calling the child method age
	}

}
abstract class Parent{
String name = "Krishna"; // Declaring and initializing the variables in Parent class.
int age =45;
abstract void age(); // Creating the abstract method age
{
	System.out.println("Father name"+name + " " + age);
}
}
class Child extends Parent // Creating the ineritance of parent class i.e. Child class 
{ 
	String name = "Arjun"; // Declaring and initializing the variables in Parent class.
	int age = 31;
	void age() {	// Calling the method age
		System.out.println("Child name"+name + " " + age); 
	}
}


