package variables;

/*
 Scope of a variable is the part of the program where the variable is accessible. 
 all identifiers are lexically (or statically) scoped, i.e.scope of a variable can determined at compile time and independent of function call stack. 
 A set of curly brackets { } defines a scope.
 In Java we can usually access a variable as long as it was defined within the same set of brackets as the code we are writing or within any 
 curly brackets inside of the curly brackets where the variable was defined.
 Any variable defined in a class outside of any method can be used by all member methods.
 When a method has the same local variable as a member, “this” keyword can be used to reference the current class variable.
 For a variable to be read after the termination of a loop, It must be declared before the body of the loop.
*/
public class VariableScope {

	/* Member Variables/Instance Variables /Attributes
	 * These variables must be declared inside class (outside any function). 
	 * They can be directly accessed anywhere in class. 
	 * All variables defined directly inside a class are member variables.
	 * We can declare class variables anywhere in class, but outside methods.
	 * Access specified of member variables doesn’t affect scope of them within a class. Although a variable is declared as private variable, it is still accessible within the class 
	 * definition and as well as for its object references.
	 * Member variables can be accessed outside a class with following rules
			Modifier      Package  Subclass  World

			public          Yes      Yes     Yes

			protected       Yes      Yes     No

			Default (no
			modifier)       Yes       No     No

			private         No        No     No
	*/
	
    int a;
    private String b;
    
    /* Method level scope:
     * Variables declared inside a method have method level scope and can’t be accessed outside the method. 
     * Local variables do not exist after the method execution is over.
     */
    void method1() 
    {
    	// Local variable (Method level scope)
        int x;
    }
    
    /*
     * Method scope: the variable got passed in as a parameter to the method.
     *  this keyword is used to differentiate between the local and class variables.
     */
    int method2(int a)
    {
    	this.a =a;
    	return this.a;
    }
    
    char c;
	
   
    public static void main(String[] args) {
    	
    	
    	/* Ex1:
    	 * Loop Variable: Block scope 
    	 * A variable declared inside pair of brackets “{” and “}” in a method has scope within the brackets only.
    	 */
    	{
    		// The variable x has scope within
            // brackets
            int x = 10;
            System.out.println(x);
        }
        /* Uncommenting below line would produce error since variable x is out of scope.*/
    	//System.out.println(x);
    	
    	
    	/* Ex2:
    	 * Scope of x declared in for 
    	 */
    	for (int x = 0; x < 4; x++)
        {
            //System.out.println(x);
        }
        // Will produce error
        //System.out.println(x);
    	
    	/*
    	 * Ex3: Correct then above program
    	 */
    	
    	int x=0;
    	for (x = 0; x < 4; x++)
        {
            //System.out.println(x);
        }
    	//System.out.println(x);
    	
    	/*
    	 * Ex4: Variable already declared. the name of the variable of inner and outer loop must be different. 
    	 
    	int a = 5;
        for (int a = 0; a < 5; a++)
        {
            System.out.println(a);
        }
        */
        
        /*
         * Ex5: Duplicate local variable - 
         
        {
            int y = 5;
            {
                int y = 10;
                System.out.println(y);
            }
        }
        */
    	
    	/* Ex6: 
    	 * Duplicate variable declared after the block: inner loop will terminate 
    	 * before the outer loop variable is declared.So the inner loop variable is destroyed 
    	 * first and then the new variable of same name has been created.
    	 */
    	for (int i = 1; i <= 10; i++) 
    	{
            //System.out.println(i);
        }
        int i = 20;
        //System.out.println(i);
        
        
    
        
	}

}
