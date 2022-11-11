package operators;

/*
 * Shift Operators perform bit manipulation of data
 * By shifting the bits of its first operand right or left
 * The shift operator is a java operator that is used to shift bit patterns right or left.
 * Name of operator 		Sign 		Description
	Signed Left Shift		<<			The left shift operator moves all bits by a given number of bits to the left.
	Signed Right Shift		>>			The right shift operator moves all bits by a given number of bits to the right.
	Unsigned Right Shift	>>>			It is the same as the signed right shift, but the vacant leftmost position is filled with 0 instead of the sign bit.
 */
public class ShiftOperators 
{
	public static void main(String[] args) {
		
		/*
		 * Ex1: Left Shift
		 */
		byte a = 64, b;
        b = (byte)(a << 2);
        //System.out.println("Original value of a: " + a);
        //System.out.println("After left shifting two times:"+b);
        
        /*
         * Ex2: Left Shift 
         */
        //int number = 2; 
        //int Ans = number << 2;
        //System.out.println(Ans);
        
        /*
         * Ex3: Right Shift - >> - Arithmetic right shift
         */
        int number = 8;
        int Ans = number >> 2;
        System.out.println(Ans); 
        
        /*
         * Ex4: Right Shift: - >>> - Logical right shift
         */
	}
}
