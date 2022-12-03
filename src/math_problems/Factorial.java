package math_problems;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int num)
	{
		if(num==0||num==1)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}
	
	public static int factorial1(int num)
	{
		int fact=1;
		if(num==0|| num==1)
		{
			return 1;
		}
		else if(num>1)
		{
			for(int i=2;i<=num;i++)
			{
				fact=fact*i;
			}
		}
		else
		{
			System.out.println("Please enter a valid number.");
			System.out.println();
			return 0;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num=sc.nextInt();
		int fact=Factorial.factorial(num);
		System.out.format("Factorial of %d is %d",num,fact);
		int fact1 = Factorial.factorial1(num);
		System.out.format("Factorial of %d is %d",num,fact1);

	}

}
