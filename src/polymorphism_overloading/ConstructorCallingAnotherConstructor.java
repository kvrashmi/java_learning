package polymorphism_overloading;

public class ConstructorCallingAnotherConstructor {
	
	int sum;
	
	ConstructorCallingAnotherConstructor()
	{
		this(10,20);
	}
	
	ConstructorCallingAnotherConstructor(int a,int b)
	{
		this.sum=a+b;
	}
	
	void display() {
	    System.out.println("Sum is: " + this.sum);
	  }
	public static void main(String[] args) {
		ConstructorCallingAnotherConstructor ccac = new ConstructorCallingAnotherConstructor();
		ccac.display();
		ConstructorCallingAnotherConstructor ccac1 = new ConstructorCallingAnotherConstructor(30,40);
		ccac1.display();
	}

}
