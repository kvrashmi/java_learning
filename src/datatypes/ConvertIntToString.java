package datatypes;

public class ConvertIntToString {

	public static void main(String[] args) {
		//Using Integer.toString() method
		int i=1234;
		String s=Integer.toString(i);
		System.out.println(s.getClass().getName());
		
		//Using String.valueOf()
		Integer a = new Integer(12345);
		String s1 = String.valueOf(a);
		System.out.println(a.getClass().getName());
		System.out.println(s1.getClass().getName());
		
		//Using StringBuilder/StringBuffer
		Integer b = new Integer(123);
	    StringBuilder sb = new StringBuilder(); // or StringBuffer
	    sb.append(b);
	    StringBuffer sbf = new StringBuffer();
	    sbf.append(b);
	    System.out.println(sb.getClass().getName());
	    System.out.println(sbf.getClass().getName());
	    
	    //Using format method
	    System.out.println(String.format("Converted %d and %d and %d to string.", i,a,b));
	    
	    //Using concatenation
	    System.out.println("We are all strings now: "+a+" "+b+" "+i);

	}

}
