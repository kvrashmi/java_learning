package conversion_programs;

public class CharToIntConversion {

	public static void main(String[] args) {
		char c='3';
		System.out.println("Char value: "+c);
		int i=c-'0';
		System.out.println("Int value: "+i);
		
		// Declaring and initializing a character
        char ch = '8';
        // Printing the character value
        System.out.println("Char value: " + ch);
        // Converting the character to it's integer value
        // using valueOf() method
        int a = Integer.parseInt(String.valueOf(ch));
        // Printing the integral value
        // corresponding to its character value
        System.out.println("Int value: " + a);
        
        char ch1='\u0025';
        System.out.println("Char value: " + ch1);
        int j=Character.getNumericValue(ch1);
        System.out.println("Int value: " + j);

        
        
	}

}
