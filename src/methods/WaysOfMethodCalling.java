package methods;

public class WaysOfMethodCalling {
	
	public static int i = 0;
	 
    // Constructor of class
    WaysOfMethodCalling()
    {
    	// Counts the number of the objects of the class
        i++;
    }
 
    // Method 1
    // To access static members of the class and
    // and for getting total no of objects
    // of the same class created so far
    public static int get()
    {
        // statements to be executed....
        return i;
    }
 
    // Method 2
    // Instance method calling object directly
    // Can also be called by object directly created in the
    // same class and from another method defined in the
    // same class and return integer value as return type is
    // int.
    public int m1()
    {
 
        // Display message only
        System.out.println(
            "Inside the method m1 by object.");
 
        // Calling m2() method within the same class.
        this.m2();
 
        // Statements to be executed if any
        return 1;
    }
 
    // Method 3
    // Returns nothing
    public void m2()
    {
 
        // Print statement
        System.out.println(
            "In method m2 came from method m1");
    }

	public static void main(String[] args) {
		// Creating object of above class inside the class
        WaysOfMethodCalling obj = new WaysOfMethodCalling();
 
        // Calling method 2 inside main() method
        int i = obj.m1();
 
        // Display message only
        System.out.println(
            "Control returned after method m1 :" + i);
 
        // Call m2() method
        // obj.m2();
        int no_of_objects = WaysOfMethodCalling.get();
 
        // Print statement
        System.out.print(
            "No of instances created till now : ");
        System.out.println(no_of_objects);

	}

}
