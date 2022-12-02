package binding;

public class Dog extends Animal{
	public void eat()
	{
		System.out.println("Dog eats bones.");
	}
	
	private void sniff()
	{
		System.out.println("Dogs can sniff...");
	}
	
	public static void isFriendly()
	{
		System.out.println("They are very friendly...");
	}
	
	public final void kind()
	{
		System.out.println("Dog is a domestic animal");
	}
}
