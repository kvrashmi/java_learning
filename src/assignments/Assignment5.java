package assignments;
import java.util.Scanner;

/*
 * Assignment:

Build a basic calculator (Plus, Minus, Multiplication, Division)
(Ask user for a number and then ask for the second number
– then ask for the operation: ADD, SUB, MULTI, DIV)

Two of the math operation needs to be a static Methods and two of them to be non-static methods. All 4 operations should be in a separate class.
Use “IF and ELSE” or “SWITCH”
 
Ask the USER for a string and print if the string is palindrome // wow = wow
 
Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.
 
How to Submit?
Create a YouTube account. Login to YouTube using your account and upload the video explanation of your work. Once upload is complete, share the video link in your teamwork chat group.
 */
public class Assignment5 {

	public static void mathCalculator()
	{
		Assignment5Helper a5Helper = new Assignment5Helper();
		Scanner mathOperation = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Do you want to start - Math Calculator? Type 'Yes' to start or 'No' to quit..."); 
		String state=mathOperation.nextLine().toLowerCase();
		
		while((state.trim()).equals("yes"))
		{
			String mathOpInput;
			System.out.println("Enter the type of operation:ADD/SUB/MUL/DIV:");
			mathOpInput=mathOperation.nextLine().toLowerCase();
			
			System.out.println("Enter number1:");
			int n1=userInput.nextInt();
			System.out.println("Enter number2:");
			int n2=userInput.nextInt();
			
			int result;
			switch(mathOpInput)
			{
				case "add":
					result=Assignment5Helper.add(n1,n2);
					System.out.println("The result is:"+result);
					break;
					
				case "sub":
					result=Assignment5Helper.sub(n1,n2);
					System.out.println("The result is:"+result);
					break;
					
				case "mul":
					result=a5Helper.mul(n1,n2);
					System.out.println("The result is:"+result);
					break;
					
				case "div":
					result=a5Helper.div(n1,n2);
					System.out.println("The result is:"+result);
					break;
			}
			System.out.println("Press 'Yes' to continue again or 'No' to exit:");
	    	state=mathOperation.nextLine().toLowerCase();
		}
		System.out.println("Quitting out of math calculator...");
	}
	
	public static void isPalidrome()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to start - Check Palindrome? Type 'Yes' to start or 'No' to quit..."); 
		String state=sc.nextLine().toLowerCase();
		
		while((state.trim()).equals("yes"))
		{
			System.out.println("Enter the string that you want to check:");
			String str1= sc.nextLine(); //mom
			String str2="";
			
			//Reversing the string
			for(int i=str1.length()-1;i>=0;i--)
			{
				str2+=str1.charAt(i);
			}
			
			if(str1.trim().equals(str2.trim()))
			{
				System.out.println("The entered string is a palindrome...");
			}
			else
			{
				System.out.println("The entered string is not a palindrome...");
			}
			
			System.out.println("Press 'Yes' to continue again or 'No' to exit:");
			state=sc.nextLine().toLowerCase(); //while  loop terminating condition...
		}
		System.out.println("Quitting out of palindrome...");
	}
	
	public static void checkEvenOrOdd()
	{
		Assignment5Helper a5Helper = new Assignment5Helper();
		Scanner scInt = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to start - Check Even or Odd? Type 'Yes' to start or 'No' to quit..."); 
		String state=sc.nextLine().toLowerCase();
		
		while((state.trim()).equals("yes"))
		{
			System.out.println("Enter a number to check whether is even or odd:");
			int num = scInt.nextInt();
			boolean result = a5Helper.checkEvenOrOdd(num);
			if(result == true)
			{
				System.out.println("Entered number is even...");
			}
			else
			{
				System.out.println("Entered number is odd...");
			}
			System.out.println("Press 'Yes' to continue again or 'No' to exit:");
			state=sc.nextLine().toLowerCase(); //while  loop terminating condition...
		}
		System.out.println("Quitting out of even or odd...");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Program1: MathCalculator:");
		mathCalculator();
		System.out.println("Program1: MathCalculator Completed...");
		
		System.out.println("Program2: Check if a string is palindrome:"); // mom == mom 
		isPalidrome();
		System.out.println("Program2: Palidrome Completed...");
		
		System.out.println("Program3: Check if a number is even or odd:");
		checkEvenOrOdd();
		System.out.println("Program3: Even or odd completed...");
		
	}

}
