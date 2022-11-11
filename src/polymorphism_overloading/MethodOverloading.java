package polymorphism_overloading;

/*
 * Two or more methods can have the same name inside the same class if they accept different arguments. This feature is known as method overloading.
 * Method overloading is achieved by either:
   1. changing the number of arguments.
   2. or changing the data type of arguments.
 * It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.
 */

public class MethodOverloading {
	
	//this method accepts only one parameter int
	private static void display(int a){
        System.out.println("Arguments: " + a);
    }

	//this method accepts two parameters of int.
    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
    
    // this method accepts int
    private static void display(float a){
        System.out.println("Got Float data.");
    }
    
    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object.");
    }
    
    private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }
    
	public static void main(String[] args) {
		display(4);
		display(1,2);
		display(1.2f);
		display("Hello");
		
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.formatNumber(10));
		System.out.println(mo.formatNumber(12345.8907));
		System.out.println(mo.formatNumber("2303"));
	}

}