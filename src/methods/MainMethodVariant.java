package methods;

public class MainMethodVariant {

	/*Default 
	public static void main(String[] args) {

	}
	*/
	
	/*
	 * Variants of String array arguments: We can place square brackets at different positions for string parameter. 
	 
	 public static void main(String []args) {
		 System.out.println("Main Method");
	 }
	 
	
	  public static void main(String args[]){
		 System.out.println("Main Method");
	 }
	*/
	
	/*
	 * Args or anything: Instead of args we can write anything which is a valid java
	 * identifier. You can write anything here, you can write your name or company’s name or anything you want to write but it must follow the rule of being a java identifier. 
	 
	 public static void main(String[] rashmi) {
		 System.out.println("Instead of args, rashmi..");
	 }
	 */
	
	/*
	 * Var-args instead of String array: According to the rule whenever there is one dimensional array we can replace the array with var-arg parameter.
	 * So here we can change our string array using var-args. (the triple dots instead of []) 
	 
	
	public static void manin(String... args) {
		 System.out.println("var-args main method");
	}
	*/
	
	/*
	 * Final Modifier String argument: We can make String args[] as final. 
	public static void main(final String[] args){
		System.out.println("Final modifier for String sargs");
	}
	*/
	
	/*
	 * Final main method: We can declare the main method with the final keyword.This cannot change the execution or give any error. 
	final public static void main(String[] args)
	{
		System.out.println("Final main method");
	}
	*/
	
	/*
	 * synchronized keyword to static main method: We can make main() synchronized.   
	public synchronized static void main(String[] args)
    {
        System.out.println("Synchronized main method..");
    }
	*/
	
	/*
	 * strictfp keyword to static main method: strictfp can be used to restrict floating point calculations. 
	 * 
	 
	public strictfp static void main(String[] args)
    {
        System.out.println("strict fp in main method...");
    }
    */
	
	//Overloading main method
	// Normal main()
    public static void main(String[] args) {
        System.out.println("Hi Geek (from main)");
        MainMethodVariant.main("Geek");
    }
  
    // Overloaded main methods
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        MainMethodVariant.main("Dear Geek","My Geek");
    }
    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2);
        //MainMethodVariant.main("Rashmi","Kanuppa");
    }
	
}

