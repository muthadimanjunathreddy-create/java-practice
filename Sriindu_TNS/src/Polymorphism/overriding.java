package Polymorphism;

public class overriding {
	public void show()
	{
		System.out.println("Parent class show method");
	}
}
class Demo extends overriding{
	public void show() 
	{
	    System.out.println("child class show method");	 
	}
	

}
