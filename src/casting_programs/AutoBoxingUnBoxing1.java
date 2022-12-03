package casting_programs;

public class AutoBoxingUnBoxing1 {

	public static void main(String[] args) {
		//AutoBoxing
		int i =200;
		Integer i1 = new Integer(i);
		System.out.println("i:"+i);
		System.out.println("i1:"+i1);
		
		//Unboxing
		Integer i2=new Integer(123);
		int j=i2;
		System.out.println("i2:"+i2);
		System.out.println("j:"+j);
		
		// Unboxing
        Character gfg = 'a';
 
        // Autoboxing of Character
        char ch = gfg;
 
        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);
	}

}
