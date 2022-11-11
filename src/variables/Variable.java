package variables;

public class Variable {
	
	/* 1. Instance Variables
	 Instance Variables - variables declared inside a class are called Instance variable.
	 They are otherwise known as non-static variables.
	 They are not declared within a method or constructor or block.
	 They are created when an object is created and destroyed when an object is destroyed.
	 They can be accessed only by creating objects of their respective class.
	 Unlike local variables, we may use access specifiers for instance variables. 
	 If we do not specify any access specifier, then the default access specifier will be used.
	 Initialization of an instance variable is not mandatory. Its default value is 0.
	 Declare them outside the class methods.
	 Access specifier does not affect the scope of them with in the class.
	*/
	int instanceVariable1;
	String instanceVariable2;
	
	/* 2. Static Variables
	 These variables are declared similarly as instance variables. 
	 The difference is that static variables are declared using the static keyword within a class outside of any method, constructor or block.
     Unlike instance variables, we can only have one copy of a static variable per class, 
     irrespective of how many objects we create.
     Static variables are created at the start of program execution and destroyed automatically when execution ends.
	 Initialization of a static variable is not mandatory. Its default value is 0.
     If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. 
     The compiler will replace the object name with the class name automatically.
	 If we access a static variable without the class name, the compiler will automatically append the class name. 
	 */
	 static String staticVariable1="Hello World";
	 
	 
	 
	/* 3. Local Variables
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
	
	void printInstanceVariable()
	{
		/* static int staticVariable2=0; This is not possible */
		System.out.println("ValueOfInstanceVariable1:"+(instanceVariable1));
		System.out.println("ValueOfInstanceVariable2:"+(instanceVariable2));
	}
	public static void main(String[] args) {
		/*
		 	variable - is a data container for saving the data value during program execution.
		 	variable - is a named memory location for storing data 
		 	variable - is a name given to a memory location - basic unit of storage in a program
		 	variable - every variable is assigned a datatype  
		 	Java is strictly typed language
		 	
		 	datatype - designates what type and quantity/range of a value can be stored in a variable
		 	datatype - also specifies the amount of memory to be allocated.
		 */
		
		//4. Reference Variable
		Variable referenceVariable = new Variable();
		Variable referenceVariable1 = new Variable();

		
		/*
		  Difference between instance variable and static variable:
		  1. Each object will have its own copy of an instance variable, whereas we can only have one copy of a static variable per class, irrespective of how many objects we create.
      	  2. Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of the instance variable. 
          In the case of a static variable, changes will be reflected in other objects as static variables are common to all objects of a class.
          3.We can access instance variables through object references, and static variables can be accessed directly using the class name.
		*/
		System.out.println("Printing First Reference Variable");
		System.out.println("Static Variable:"+Variable.staticVariable1);
		referenceVariable.instanceVariable1=10;
		referenceVariable.instanceVariable2="Joy";
		
		/*
		  Difference between Parameter and Argument:
		  the argument is the actual value supplied to a function, whereas the parameter is the variable inside the definition of the function. 
		  We can say that a parameter is a type that appears in function definitions, while an argument is an instance that appears in function calls.
		*/
		referenceVariable.addLocalVariables(10, 20);
		referenceVariable.printInstanceVariable();
		
		
		System.out.println("Printing Second Reference Variable");
		referenceVariable1.instanceVariable1=20;
		referenceVariable1.instanceVariable2="Kinder";
		System.out.println("Static Variable:"+Variable.staticVariable1);
		referenceVariable.addLocalVariables(30, 40);
		referenceVariable.printInstanceVariable();
		
		/*
		  Change a static variable.
		  We can also use a reference variable to access a static variable- no error will be thrown-but not a good programming practice.
		*/
		Variable.staticVariable1="Hello Class";
		System.out.println("Static Variable Update:"+Variable.staticVariable1);
		
		referenceVariable1.staticVariable1="Hello Mates";
		System.out.println("Static Variable Update:"+referenceVariable1.staticVariable1);
		
		/* static local variable is not permitted in JAVA
		only class can have a static variable
		static method cannot have a static local variable
		
		static int staticLocalVariable1=100;
		System.out.println("Static Local Variable:"+(staticLocalVariable));
		*/
	}

}
