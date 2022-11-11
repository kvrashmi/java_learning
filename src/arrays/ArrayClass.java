package arrays;
import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int[] a1= {13,42,95,76,22,71,80,39,57,64};
		for(int b:a1)
		{
			System.out.println("Before Sorting:"+b);
		}
		Arrays.sort(a1);
		for(int a:a1)
		{
			System.out.println("After sorting:"+a);
		}
		
		String fruits="Apple";
		System.out.println(fruits);
		char ch[] = fruits.toCharArray();
		System.out.print("[");
		for(char c:ch)
		{
			System.out.print("'"+c+"',");
		}
		System.out.print("]");

	}

}
