package datatypes;

/*
 * 1. Using ASCII Values
   2. Using String.valueOf() Method
   3. Using Character.getNumericValue() Method

 */

public class ConvertCharToInt {
	
	/*
	 * This method uses TypeCasting to get the ASCII value of the given character. 
	 * The respective integer is calculated from this ASCII value by 
	 * subtracting it from the ASCII value of 0.
	 * In other words, this method converts the char to int by finding the difference between the ASCII value of this char and the 
	 * ASCII value of 0.
	 */
	public static void useASCIIValues(char ch)
	{
        System.out.println("Converting char to int using ascii values: ");
		// Printing the character value
        System.out.println("char value: " + ch);
 
        // Converting character to its integer value
        int a = ch - '0';
 
        // Printing the integer value
        System.out.println("int value: " + a);
    }

	/*
	 * The method valueOf() of class String can convert various types of values to a String value. 
	 * It can convert int, char, long, boolean, float, double, object, and char array to String, which can be converted to an int value 
	 * by using the Integer.parseInt() method.  
	 */
	public static void useValueOf(char ch)
	{
        System.out.println("Converting char to int using valueOf: ");
		// Printing the character value
        System.out.println("char value: " + ch);
 
        // Converting the character to it's integer value
        // using valueOf() method
        int a = Integer.parseInt(String.valueOf(ch));
 
        // Printing the integral value
        // corresponding to its character value
        System.out.println("int value: " + a);
	}
	
	
	/*
	 * The getNumericValue() method of class Character is used to get the integer value of any specific character.
	 * For example, the character ‘9’ will return an int having a value of 9. 
	 */
	
	public static void useGetNumericValue(char ch)
	{
		System.out.println("Converting char to int using Character.getNumericValue(): ");
		// Printing the character value
        System.out.println("char value: " + ch);
        // Converting the Character to it's int value
        // using getNumericValue() method of Character Class
        int a = Character.getNumericValue(ch);
        // Printing the corresponding integral value
        System.out.println("int value: " + a);   
	}
	
	public static void main(String[] args) {
			char ch='q';
			useASCIIValues(ch);
			
			char sh='9';
			useValueOf(sh);
			
			char mh='8';
			useGetNumericValue(mh);
			
	}

}
