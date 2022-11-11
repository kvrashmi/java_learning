package methods;

public class PassByVal_Primitive {

	public static void change(int x)
	{
		x=10;
	}
	
	public static void main(String[] args) {
		int x=5;
		change(x);
		//Java creates a copy of the variable being passed in the method and then do the manipulations. 
		//Hence the change is not reflected in the main method.
		System.out.println(x);
	}

}
