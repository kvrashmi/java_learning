package polymorphism_overloading;

public class ConstructorSuperclass {
	
	ConstructorSuperclass(int version1,int version2)
	{
		if(version1>version2)
		{
			System.out.println("The latest version is:"+ version1);		
		}
		else
		{
			System.out.println("The latest version is:"+ version2);		
		}
	}
	
}
