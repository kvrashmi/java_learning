package abstraction;
//Rule2:Can contain constructors
public abstract class AbstractClass2 {
	
	AbstractClass2(String message) //This the constructor - it is of default
	{
		System.out.println("MyMessage:"+message);
		System.out.println("I am from super class -> AbstractClass2");
	}
	
	abstract void fun(); //This is a abstract - it is also of default

}

