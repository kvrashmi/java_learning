package strings;
import java.util.*;

public class NextLineNextIntIssue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name:");
		String name=sc.next();
		
		System.out.println("Age:");
		int  age=sc.nextInt();
		
		System.out.println("Gender:");
		String gender = sc.next();
		
		System.out.println("Work:");
		String work = sc.nextLine();
		System.out.println("Done...");
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Work:"+work); 


	}

}
