package techfios_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenRanNos {
	
	//Method to generate 500 random numbers and put the numbers in an array
	
	public static int[] genRandNosAndStoreInArray()
	{
		int[] randomNoArray = new int[500];    //if we have only if inside our method - then have a return statement inside 
											  // the if and outside the if also.
											   //if we have if and else - then one return inside if and one inside else.
		Random ran = new Random();
		for(int i=0;i<500;i++)
		{
			int n = ran.nextInt(500);
			randomNoArray[i]= n; 	
		}
		return randomNoArray;
	}
	
	public static void printMyArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the nth smallest number that you would like to know:");
		int n = sc.nextInt();
		int[] nArray=genRandNosAndStoreInArray();
		Arrays.sort(nArray);
		printMyArray(nArray);
		System.out.format("The %dth smallest number in the array is %d",n,nArray[n]);

	}

}
