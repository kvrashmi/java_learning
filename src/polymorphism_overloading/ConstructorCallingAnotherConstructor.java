package polymorphism_overloading;

public class ConstructorCallingAnotherConstructor {
	
	int sum;
	
	ConstructorCallingAnotherConstructor() //third line
	{
		this(10,20); //fourth line
	}
	
	ConstructorCallingAnotherConstructor(int a,int b) //fifth line , eleventh line
	{
		this.sum=a+b; // sixth line , twelth line 70
	}
	
	void display() { //eight line , fourteenth line 
	    System.out.println("Sum is: " + this.sum); //nineth line =>30, fifteenth line => 70
	  }
	
	public static void main(String[] args) { //This is the first line to execute
		ConstructorCallingAnotherConstructor ccac = new ConstructorCallingAnotherConstructor(); //second line
		ccac.display(); // seventh line 30
		ConstructorCallingAnotherConstructor ccac1 = new ConstructorCallingAnotherConstructor(30,40); //tenth line
		ccac1.display(); //thirteenth line 70
	}

}
