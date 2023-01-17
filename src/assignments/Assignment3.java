/*
 * Pre-Req:Must have Java and Eclipse Installed
Assignment:
Ask the USER for a string (it should print “Please enter a String:”)
assume the user enters “hello”
Convert that string to all uppercase and print it (it should print “HELLO”)
Print the length of that string (it should print 5)
Replace ‘O’ with ‘Z’ (it should print “HELLZ”)
Give the last char of the string (it should print “Z”)
Concatenate the string from step 1 with string "Test" (it should print “hello Test”)
How to Submit?
Create a YouTube account. Login to YouTube using your account and upload the video explanation of your work. Once upload is complete, share the video link in your teamwork chat group.
 */
package assignments;
import java.util.*;
public class Assignment3 {
	
	public static void main(String[] args) {
		String userInput;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String:");
		userInput=sc.nextLine();
		//Convert to upper case
		System.out.println("Changing to upper case:"+userInput.toUpperCase());
		
	    userInput.toUpperCase();
		System.out.println("Test:"+userInput);
		
		
		//Length of the string
		System.out.println("Length of the string: "+userInput.length());
		//Replace 'O' with 'Z'
		System.out.println("Replacing O with Z: "+userInput.toUpperCase().replace('O', 'Z'));
		//Give the last char of the string:
		System.out.println("Give the last character: "+userInput.toUpperCase().replace('O', 'Z').charAt(userInput.length()-1));
		//Concatenate the string from step 1 with string "Test" (it should print “hello Test”)
		System.out.println("Concatenate the string from step 1 with string \'Test\':"+userInput + " Test");
		
		Assignment3 as3 = new Assignment3();
	
	}

}
