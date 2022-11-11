package constructors;

public class ConstructorChaining1 {
	//block that will be executed before any constructor
	{
		System.out.println("This block would be executed before any constructor is called...");
	}
	
	{
		System.out.println("This is the next block that would be executed...");
	}
	
	//Constructor with no arg
	ConstructorChaining1()
	{
		System.out.println("Default constructor");
	}
	//Parameterized constructor
	ConstructorChaining1(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		ConstructorChaining1 cc=new ConstructorChaining1();
		ConstructorChaining1 cc1 = new ConstructorChaining1(5);
	}

}
