package polymorphism_overloading;

public class MethodOverloading1 {
	
    static int Multiply(int a, int b)
    {
 
        // Returns product of integer numbers
        return a * b;
    }
 
    static double Multiply(double a, double b)
    {
 
        // Returns product of double numbers
        return a * b;
    }
    
    static int Multiply(int a, int b, int c)
    {
 
        // Return product
        return a * b * c;
    }
    
    public static void main(String args[])
    {
    	System.out.println(MethodOverloading1.Multiply(2, 4));
    	System.out.println(MethodOverloading1.Multiply(5.5, 6.3));
    	System.out.println(MethodOverloading1.Multiply(9,10,11));
    }
}
