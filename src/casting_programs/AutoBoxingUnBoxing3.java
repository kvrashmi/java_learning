package casting_programs;

public class AutoBoxingUnBoxing3 {

	public static void main(String[] args) {
		Boolean b1 = true; //Autobox: boolean -> Boolean
        Boolean b2 = false; //Autobox: boolean -> Boolean
        System.out.print((b1 == b2) + " "); //false
        System.out.print(b1.equals(b2)); //false
	}

}

/*
Options:
A. Compile-time error
B. false false
C. false true
D. true true


Explanation: The values true and false are auto-boxed in b1 and b2 respectively. 
For b1==b2, b1 and b2 are unboxed and then compared which return false. 
For b1.equals(b2), as b1 and b2 are Boolean objects, they can be compared using equals() method. 
This also returns false as b1 and b2 are not equal.
*/