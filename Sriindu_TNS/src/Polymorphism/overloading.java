package Polymorphism;

public class overloading {
	public void show()
	{
		System.out.println("No parameter method");
	}
    public void show(int a, int b)
    {
    	System.out.println("int a="+a+" float b="+b);
    }
    public void show(int a, float b, double c)
    {
    	System.out.println("int a="+a+" float b="+b+" double c="+c);
    }
	
}
