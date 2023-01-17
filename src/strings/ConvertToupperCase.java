package strings;

import java.util.Scanner;

public class ConvertToupperCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		System.out.println("Before converting to uppercase:" + s + ", after converting to uppercase:"+s.toUpperCase());
	}

}
