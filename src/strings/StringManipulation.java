package strings;

public class StringManipulation {
	public static void main(String[] args) {
		
		String var1 = "apple";
		System.out.println("Length of the string: "+var1.length());
		System.out.println("Character at Position 2: "+var1.charAt(2));
		System.out.println("Concat with Apple: "+var1.concat(" is a sweet fruit"));
		System.out.println("Check if the string contains z: "+var1.contains("ze"));
		System.out.println("Does apple start with Ap: "+var1.startsWith("Ap"));
		System.out.println("Does apple end with le: "+var1.endsWith("le"));
		System.out.println("Are these two strings equal: "+var1.equals("Apple"));
		System.out.println("What is the index of letter p in apple: "+var1.indexOf('p'));
		System.out.println("Is the string var1 empty? "+var1.isEmpty());
		System.out.println("Replace pp with zz :"+var1.replace('p', 'z'));
		System.out.println("Get the substring  ple in Apple :"+var1.substring(2, 5));
		//System.out.println("Convert apple into char array :"+var1.toCharArray());
		System.out.println("Convert all chars to Uppercase: "+var1.toUpperCase());
		System.out.println("Convert all chars to Lowercase: "+var1.toLowerCase());
		System.out.println("Trim all the spaces from apple:"+" apple fruit".trim());
		

	    

	}

}
