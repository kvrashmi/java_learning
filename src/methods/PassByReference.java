package methods;

public class PassByReference {

	int a, b;
	 
    // Function to assign the value
    // to the class variables
	PassByReference(int x, int y)
    {
        a = x;
        b = y;
    }
 
    // Changing the values of class variables
    void ChangeValue(PassByReference obj)
    {
        obj.a += 10;
        obj.b += 20;
    }
    
	public static void main(String[] args) {
		// Instance of class is created
        // and value is assigned using constructor
        PassByReference object = new PassByReference(10, 20);
 
        System.out.println("Value of a: "
                           + object.a
                           + " & b: "
                           + object.b);
 
        // Changing values in class function
        object.ChangeValue(object);
 
        // Displaying values
        // after calling the function
        System.out.println("Value of a: "
                           + object.a
                           + " & b: "
                           + object.b);
		}

}
