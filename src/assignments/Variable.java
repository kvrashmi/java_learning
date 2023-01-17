package assignments;
import java.util.Scanner;


public class Variable {
	
	int s;      // created instance variables 
	String r;  // instance variable
	
	static String name="TechFios"; // static variable
	
	//operation
	public void charusMethod() // non static method
	{
		int s=100;
		System.out.println("Marks:"+s);							
		System.out.println("RollNo:"+this.s);  //10
		System.out.println("Name:"+this.r);    // Shahiba
	}
		
	public static void askRashmi()
	{
		
	}
	
      public static void main(String[] args) { //static method
		Variable v1 = new Variable();
		System.out.println("Static Variable Name v1:"+v1.name);
		
		Variable v2 = new Variable();
		System.out.println("Static Variable Name v2:"+v2.name);
		
		v1.name="ObjectSpy";
		System.out.println("Static Variable Name v1:"+Variable.name);
		System.out.println("Static Variable Name v2:"+Variable.name);
		
		Variable.name="Infosys";
		System.out.println("Static Variable Name v1:"+v1.name);
		System.out.println("Static Variable Name v2:"+v2.name);
		
		name="Wipro";
		System.out.println("Static Variable Name v1:"+v1.name);
		System.out.println("Static Variable Name v2:"+v2.name);
		
		
		

		
		
		
		
		
		
		
		
		
			
	}

}
