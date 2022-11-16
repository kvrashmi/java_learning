package polymorphism_overriding;

public class ClassC extends ClassA{
	int s=20;
	public void m1()
	{
		System.out.println("m1:FromC");
	}
	
	static void m2()
	{
		System.out.println("m2:FromC");
	}
}
