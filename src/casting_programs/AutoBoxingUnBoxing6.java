package casting_programs;

public class AutoBoxingUnBoxing6 {
	static int funct(Integer x)
    {
        return x;
    }
    public static void main(String args[])
    {
        Integer x = funct(10);
        System.out.println(x);
    }

}

/*
Options:
A. Compile-time error
B. Run-time error
C. 10
D. No output

Answer: C. 10

Explanation: When 10 is passes into funct(), it is autoboxed. 
When the value is returned from funct it is autoboxed and then the value is again auto-boxed in x. 
When x is printed, it is again unboxed.
*/
