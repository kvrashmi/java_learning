package loops;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit:");
		int limit = sc.nextInt();
		int fact=1; int n=limit;
		while(n>=1)
		{
			fact=fact*(n);
			n--;
		}
		System.out.println("Factorial of 5 is:"+fact);
	}

}
