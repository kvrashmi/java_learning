package math_problems;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void  nonRecursiveFibonacci(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num=sc.nextInt();
		System.out.println("The fibonacci  series is:");
		FibonacciSeries.nonRecursiveFibonacci(num);
	}

}
