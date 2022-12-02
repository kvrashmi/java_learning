package conversion_programs;

public class OctalToDecimalSolTwo {

	public static void main(String[] args) {
		int octNum=157;
		System.out.print("The decimal equivalent of "+octNum+" is ");
		int decNum=0,i=0;
		while(octNum>0)
		{
			decNum+=Math.pow(8, i++)*(octNum%10);
            octNum /= 10;
		}
		String decStr=Integer.toString(decNum);
        int dec= Integer.parseInt(decStr);
        System.out.print(dec);
	}
}
