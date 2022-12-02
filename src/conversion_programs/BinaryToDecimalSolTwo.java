package conversion_programs;

public class BinaryToDecimalSolTwo {

	public static void main(String args[])
	{
		int binNum=100001;
		System.out.println("The decimal equivalent of "+binNum+" is ");
		int decNum=0,i=0;
		while(binNum>0)
		{
			decNum+=((int)Math.pow(2, i++))*(binNum%10);
			binNum/=10;
		}
		String decStr = Integer.toString(decNum);
		int dec = Integer.parseInt(decStr);
		System.out.println(dec);
	}
}
