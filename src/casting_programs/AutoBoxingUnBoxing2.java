package casting_programs;

public class AutoBoxingUnBoxing2 {

	public static void main(String[] args) {
		Double x1, y1, z1;
        double x2, y2, z2;
        x1 = 10.0; // Autoboxing double -> Double
        y1 = 4.0; // Autoboxing double -> Double
        z1 = x1 * x1 + y1 * y1; // Unboxing: Double->double  Autobox: double->Double 116.0
        x2 = 10.0; // Autoboxing double -> Double
        y2 = 4.0; // Autoboxing double -> Double
        z2 = x2 * x2 + y2 * y2; // 116.0  // Unboxing: Double->double  Autobox: double->Double 116.0
        System.out.print(z1 + " "); // 116.0 116.0
        System.out.println(z2);
	}

}
/*
Options:
A. 116.0 116.0
B. Run-time error
C. Compile-time error
D. 116 116.0
*/

/*
Explanation:
First, the values 10.0 and 4.0 are auto-boxed in x1 and y1 respectively. 
Then for calculating z1, x1 and y1 are unboxed and the expression is evaluated, then the result is boxed into z1. 
While, printing z1, it is auto-unboxed, the value is printed then reboxed. 
z2 is calculated normally using primitive data-types.
*/