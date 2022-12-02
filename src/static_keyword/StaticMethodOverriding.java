package static_keyword;

/*
 * Static methods can be overridden.
 * If a method is declared as static in parent class, then declare it as static in child class to override it.
 * If a method is declared as non-static method in parent class, then declare it as not static in child class to override it.
 */
public class StaticMethodOverriding extends StaticMethodOverloading {
	
	public static int add(int a1,int a2)
	{
		return a1+a2+100;
	}

	public static void main(String[] args) {
		System.out.println(StaticMethodOverloading.add(10, 20));
		System.out.println(add(1,2));
	}
	
	//Non-static - This can be overloaded and overridden
	public int add(int a2,int a3,int a1,int a4)
	{
		return a1+a2+a3+a4+100;
	}

}

