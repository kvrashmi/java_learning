package strings;
public class W3resource1 {

	/*
	 *  Write a Java program to get the character at the given index within the String.
	 */
	public static void main(String[] args) {
		String a="This is my sample string"; //Immutable, length is a method  - a.length()
		
		//char[] b = {'a','e','i','o','u'};
		
		CharSequence ch = "This is my sample string"; //Mutable , length is a method - ch.length()
		//System.out.println(ch);
		ch="This is my sample text";
		//System.out.println(ch.length());
		
		
		String[] b = a.split(" "); //Array - length is a property - b.length
		for(int i=0;i<b.length;i++)
		{
			//System.out.println("Array Val:"+b[i]);
		}
		
		String[] c = a.split(" ",5); //Array - length is a property - b.length
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Array Val:"+c[i]);
		}
		
		 //System.out.println(a.replaceAll("mouse", "text"));
		 //System.out.println(a);
		 
		 
	}

}
