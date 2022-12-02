package conversion_programs;

public class DecimalToBinarySolOne {

	public static void main(String[] args) {
		int decNum=678;
		int binNum=0,i=0;
		while(decNum!=0)
		{
			binNum+=((int)Math.pow(10, i++))*(decNum%2);
			decNum/=2;
		}
		System.out.println(binNum);
	}

}
