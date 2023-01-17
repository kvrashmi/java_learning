/*
 * Pre-Req: Must have Java and Eclipse Installed
   Assignment:
	Set up a project in Eclipse and print out “Hello, my name is ___” in the console
	Create a *.java file using notepad of the same program (part 1) and run it using CMD
 	How to Submit?
	Create a YouTube account. Login to YouTube using your account and upload the video explanation of your work. 
	Once upload is complete, share the video link in your teamwork chat group.
*/

	package assignments;
	
	import java.util.*;

	public class Assignment1{

		public static void main(String[] args){
			//Variable to store the user input
			String name;
			// Scanner class is used to get input 
			Scanner sc = new Scanner(System.in);
			//sc has methods that helps the user to provide input
			System.out.println("Please enter your name?");
			name=sc.next();
			System.out.println("Hello, my name is "+name);
		}
	}

	