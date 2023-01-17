/*
Pre-Requisite:
=============
Must have Java and Eclipse Installed
Assignment:
===========
Ask and Capture answer to the following questions:
What is your name?
How old are you?
What is your gender?
Where are you from?
Where do you live now?
Where do you work?
What is your job role?
What is your salary?
How much raise are you getting next year?
 
Based on the answer from part 1, Print out the following paragraph:
My name is James Bond. I am 40 years old, male. I work at IBM as Automation Engineer. I currently live in New York. 
I am originally from England. I make 100000.00 dollar. 
I will get 50000.00 as annual raise so my total salary would be 150000.00 dollar next year.

How to Submit?
Create a YouTube account. Login to YouTube using your account and upload the video explanation of your work. 
Once upload is complete, share the video link in your teamwork chat group.
*/

package assignments;
import java.util.*;
public class Assignment2 {

	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		String name;
		System.out.println("What is your name?");
		name=sc.nextLine();
		
		int age;
		System.out.println("How old are you?");
		age=sc.nextInt();
		//sc.nextLine();
		
		String gender;
		System.out.println("What is your gender?");
		gender=sc.next();
		
		String location;
		System.out.println("Where do you live now?");
		location=sc.nextLine();
		
		String companyName;
		System.out.println("Where do you work?");
		companyName=sc.nextLine();
		
		String jobRole;
		System.out.println("Where do your job role?");
		jobRole=sc.nextLine();
		
		float salary;
		System.out.println("What is your salary?");
		salary=sc.nextFloat();
		sc.nextLine();
		float raise;
		System.out.println("How much raise are you getting next year?");
		raise=sc.nextFloat();
		System.out.print("My name is "+name+".");
		System.out.print("I am "+age+" old, "+gender+".");
		System.out.print("I work at "+companyName+" as "+jobRole+".");
		System.out.println("I currently live in "+location+".");
		System.out.print("I am originally from England.");
		System.out.print("I make "+ (salary) +" dollars.");
		System.out.print("I will get " + (raise) + " as annual raise so my total salary would be "+ (salary+raise) + " dollars next year.");		
	}

}
