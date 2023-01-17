//Description: Assignment4-Loops
//Author: Rashmi KV
//Date:Aug-21-2011

package assignments;
import java.util.Scanner;

/*
 * Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
 * Given N --- Print backward to 0.
   (Ask user for a number and let's assume N is 5 so if the user input 5 – then the program should print: 5 4 3 2 1 0)
 * Ask the user for a word and then print each character out one by one.
   Example: user enters: hello; your program will print out: h e l l o
 */
public class Assignment4 {

	public static void printPattern(int n)
	{
		int i=1;
		System.out.print(i+" ");
		for(i=1;i<=n;i++)
		{
			System.out.print((i*4)+ " ");
		}
	}
	
	public static void printBackwards(int n)
	{
		int i=n;
		while(i>=0)
		{
			System.out.print(i+ " ");
			i--;
		}
	}
	
	public static void printLetterByLetter(String word)
	{
		int strLen = word.length();
		int i=0;
		do { 
			System.out.print(word.charAt(i)+" ");
			i++;
		}while(i<strLen);
	}
	
	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		int n;
		/*
		System.out.println("Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…");
		System.out.println("Please enter N:");
		n=scInt.nextInt();
		printPattern(n);
		*/
		/*
		System.out.println("Given N --- Print backward to 0.");
		System.out.println("Please enter N:");
		n = scInt.nextInt();
		printBackwards(n);
		*/
		
		
		System.out.println("Ask the user for a word and then print each character out one by one:");
		System.out.println("Please enter the word:");
		String word=scStr.nextLine();
		printLetterByLetter(word);
		
		
		
	}

}
