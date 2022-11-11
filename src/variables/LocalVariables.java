package variables;

public class LocalVariables {

	/*Local Variables:
	 Method Parameters and variables declared inside a method/constructor/block are called local variables
	 localVariable1,localVariable2,localVariable3 cannot be accessed outside the method/constructor/block. 
	 Hence localVariables scope are only inside the method/constructor/block.
	*/
	void addLocalVariables(int localVariable1,int localVariable2)
	{
		int localVariable3;
		System.out.println("LocalVaribale1:"+(localVariable1));
		System.out.println("LocalVaribale1:"+(localVariable2));
		localVariable3=localVariable1+localVariable2;
		System.out.println("Sum is:"+(localVariable3));
	}
	
	
	public static void main(String[] args) {
		
		LocalVariables lv1 = new LocalVariables();
		/*
		  Difference between Parameter and Argument:
		  the argument is the actual value supplied to a function, whereas the parameter is the variable inside the definition of the function. 
		  We can say that a parameter is a type that appears in function definitions, while an argument is an instance that appears in function calls.
		*/
		lv1.addLocalVariables(20, 30);
	}

}
