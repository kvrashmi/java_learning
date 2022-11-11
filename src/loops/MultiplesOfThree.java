package loops;
/*
* Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
*/
import java.util.*;
public class MultiplesOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit:");
		int limit=sc.nextInt();
		int n=1;int result;
		do {
			result=n*3;
			System.out.println(n+" * 3=> "+result);
			n++;
		}while(n<=limit);
	}

}
