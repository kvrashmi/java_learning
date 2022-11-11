package variables;

public class InstanceVariables {
	
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
	
	int id;
	String name;
	
	/*
	 * How to access instance variables inside class methods - using this keyword
	 */
	public void setInstanceVariableVal(int sId,String sSname)
	{
		this.id=sId;
		this.name=sSname;
	}
	
	public void getInstanceVariableVal()
	{
		System.out.println("Id:"+(this.id));
		System.out.println("Name:"+(this.name));
	}
	
	/*
	 * Instance variable hiding - using this keyword
	 * If there is a local variable in a method with the same name as the instance variable, 
	 * then the local variable hides the instance variable. 
	 * Use this keyword to hide instance variable.
	 */
	public void setInstanceVarValThroHiding(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("InstanceVariableHidden: Id:"+(this.id)+"Name:"+(this.name));
	}
	
	public static void main(String[] args) {
		
		InstanceVariables ins1 = new InstanceVariables();
		
		ins1.id=10;
		ins1.name="Rashmi";
		
		InstanceVariables ins2 = new InstanceVariables();
		
		ins2.id=11;
		ins2.name="Charu";
		
		/*
		 * Each object will have its own copy of an instance variables
		 * Changes made in an instance variable using one object will not be 
		 * reflected in other objects as each object has its own copy of the instance variable.
		 * We can access instance variables through object references.
		 */
		System.out.println("Value from Ins1 for ID:"+(ins1.id));
		System.out.println("Value from Ins1 for Name:"+(ins1.name));

		System.out.println("Value from Ins2 for ID:"+(ins2.id));
		System.out.println("Value from Ins2 for Name:"+(ins2.name));

		InstanceVariables ins3 = new InstanceVariables();
		ins3.setInstanceVariableVal(12, "Shalini");
		ins3.getInstanceVariableVal();
		
		InstanceVariables ins4 = new InstanceVariables();
		ins4.setInstanceVarValThroHiding(13,"Saranya");
	}
}
