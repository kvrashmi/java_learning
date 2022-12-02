package conversion_programs;


/*Algorithm:
Convert the binary number to a decimal number.
Now, for this converted decimal number, run a while loop till this number becomes 0.
In every iteration of the loop, get the remainder by dividing the number by 8.
Multiply this remainder with increasing powers of 10.
Finally divide the original number by 8.
*/

public class BinaryToOctalSolOne {

	public static void main(String[] args) {
		int binNum=1010;
		System.out.print("The octal equivalent of "+binNum+" is ");
		int decNum=0,i=0;
		while(binNum>0)
		{
			decNum+=Math.pow(2, i++)*(binNum%10);
			binNum/=10;
		}
		int octNum=0,j=0;
		while(decNum!=0) {
			octNum+=((int)Math.pow(10, j++))*(decNum%8);
			decNum/=8;	
		}
		System.out.println(octNum);
	}

}
