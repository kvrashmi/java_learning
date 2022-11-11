package loops;
/*
 * Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
 *  (Do not use Java built-in method)
 */
import java.util.*;
public class CalculatePower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value:");
		int base=sc.nextInt();
		System.out.println("Enter the power:");
		int pow=sc.nextInt();
		int ans=1;
		for(int i=1;i<=pow;i++)
		{
			ans=ans*base;
		}
		System.out.println(base +" to the power of "+pow+" is=>"+ans);
	}

}
