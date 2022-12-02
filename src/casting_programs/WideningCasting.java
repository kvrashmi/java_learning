package casting_programs;

public class WideningCasting {

	public static void main(String[] args) {
		byte b=100;
		short s =b;
		char c = '\u0010';
		int i = c;
		long l=i;
		float f = l;
		double d =f;
		System.out.println("Byte:"+b);
		System.out.println("Short:"+s);
		System.out.println("Int:"+i);
		System.out.println("Char:"+(char)i);
		System.out.println("Long:"+l);
		System.out.println("Float:"+f);
		System.out.println("Double:"+d);

		
	}

}
