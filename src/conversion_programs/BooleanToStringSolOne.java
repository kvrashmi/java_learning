package conversion_programs;

public class BooleanToStringSolOne {

	public static void main(String[] args) {
		//Sol-1: Boolean.toString()
		boolean value1=true;
		String op1 = Boolean.toString(value1);
		System.out.println(op1);
		//Sol-2: Boolean object's toString() method
		Boolean value2= new Boolean(false);
		String op2=value2.toString();
		System.out.println(op2);
	
	}

}
