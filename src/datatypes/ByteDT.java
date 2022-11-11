package datatypes;

/*
 * byte: 
 * The byte data type is an 8-bit signed two's complement integer. 
 * It has a minimum value of -128 and a maximum value of 127 (inclusive).
 * The byte data type can be useful 
 * for saving memory in large arrays, where the memory savings actually matters. 
 * They can also be used in place of int where their limits help to clarify your code;
 */
public class ByteDT {

	public static void main(String[] args) {
		/* 1 byte = 8 bits
		 * Mathematical equation used: -2^(n-1) to (2^(n-1))-1 => -2^(8-1) to (2^(8-1))-1 => -2^7 to (2^7)-1 = -128 to (128-1) => -128 to 127
		 * Range of values: -128 to 127
		 * -128 to -1: 128 values
		 * 0 to 127: 128 values 
		 * Total: 256 values
		 * byte 100 + byte 40 = byte 140 = 256-140 = -116
		 */
		//Byte Addition
		byte a =(byte)100;
		byte b=(byte)40;
		byte c = (byte)(a+b); 
		System.out.println("Byte addition:"+c);
		
		//Byte Subtraction
		byte a1 =(byte)100;
		byte b1=(byte)40;
		byte c1 = (byte)(a1-b1); 
		System.out.println("Byte subtraction:"+c1);
		
		//Byte Multiplication
		byte a2 =(byte)100;
		byte b2=(byte)40;
		byte c2 = (byte)(a1*b1); 
		System.out.println("Byte multiplication:"+c2);
		
		//Byte Division
		byte a3 =(byte)127;
		byte b3=(byte)20;
		byte c3 = (byte)(a3/b3); 
		System.out.println("Byte division:"+c3);
}

}
