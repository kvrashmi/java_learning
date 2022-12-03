package casting_programs;

public class AutoBoxingUnBoxing4 {

	public static void main(String[] args) {
		Double x = new Double(10);
        double i = x.doubleValue();
        System.out.print(i + " " + x);
	}

}
/*
Options:
A. Compile-time error
B. 10 10
C. 10.0 10.0
D. 10 10.0

Answer: C. 10.0 10.0

Explanation: x is a Double type object. Therefore when x is printed it will be auto-unboxed and 10.0 will be printed. 
Whereas, doubleValue() is a method for unboxing a Double object into double. Therefore, i will also have a value of 10.0.

*/