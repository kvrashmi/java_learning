package conversion_programs;
/*
Algorithm:
Convert the binary number into a decimal number.
Convert this decimal number to a string of octal number using toOctalString() method.
Convert this string again to an Integer.
*/
public class BinaryToOctalSolTwo {

	public static void main(String[] args) {
		int binNum=1010;
		System.out.print("The octal equivalent of "+binNum+" is ");
		//Convert the binary number into a decimal number.
		
		// variable to store the decimal number
		int decNum=0,i=0;
		
		// loop to extract the digits of the
        // binary number
		while(binNum>0)
		{
			//Binary number mod 10 will give the last digit
			decNum+=Math.pow(2, i++)*(binNum%10);
			// dividing the binary by 10 to remove the last digit
            binNum /= 10;
		}
		
		//using the toOctalString() to convert
        // Integer to String of Octal Number
		String octalStr=Integer.toOctalString(decNum);
		// converting the String of octal number
        // to an Integer
        int octNum = Integer.parseInt(octalStr);
        
        System.out.print(octNum);
		
		
		
		
		
	}

}
