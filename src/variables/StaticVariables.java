package variables;

public class StaticVariables {

	/*Static Variables:
	 They are another type of class variable.
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

	public static void main(String[] args) {
		
		System.out.println("Static Variable:"+StaticVariables.staticVariable1);
		
		/*
		  Change a static variable.
		*/
		Variable.staticVariable1="Hello Class";
		System.out.println("Static Variable Update:"+Variable.staticVariable1);
		
		/*
			We can also use a reference variable to access a static variable- no error will be thrown-but not a good programming practice.
		*/
		
		/*
		  Difference between instance variable and static variable:
		  1. Each object will have its own copy of an instance variable, whereas we can only have one copy of a static variable per class, irrespective of how many objects we create.
    	  2. Changes made in an instance variable using one object will not be reflected in other objects as each object has its own copy of the instance variable. 
        	In the case of a static variable, changes will be reflected in other objects as static variables are common to all objects of a class.
          3.We can access instance variables through object references, and static variables can be accessed directly using the class name.
		*/
		StaticVariables sv = new StaticVariables();
		sv.staticVariable1="Hello Mates";
		System.out.println("Static Variable Update:"+sv.staticVariable1);
		
		/*
		 Static local variables are not allowed.
		 only class can have a static variable
		 static method cannot have a static local variable
		
			static int staticLocalVariable1=100;
			System.out.println("Static Local Variable:"+(staticLocalVariable));
		 */


	}

}
