package static_keyword;

//Static method: no non static / this - only static var is allowed.
//Non-static method: non-static and static 

/*
 * Static methods can be overloaded
 * Same method name : 												=====|
 * declared as static and non-static (different method signature),		 |
 * different parameters,												 |====> can be overloaded
 * different type of parameters 									=====|
 */
public class StaticMethodOverloading {
	
	 
	public static int add(int a1,int a2)
	{
		return a1+a2;
	}
	
	public static int add(int a1,int a2,int a3)
	{
		return a1+a2+a3;
	}
	
	//Non static - This can be overloaded and overridden
	public int add(int a2,int a3,int a1,int a4)
	{
		return a1+a2+a3+a4;
	}
	
	public static void main(String[] args)
	{
		System.out.println(add(1,90));
		System.out.println(add(1,5,90));
	}
}
