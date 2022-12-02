package conversion_programs;

public class OctalToDecimalSolOne {

	public static void main(String[] args) {
		int octNum =123;
		System.out.print("The decimal equivalent of "+octNum+" is ");
		int decNum=0,i=0;
		while(octNum!=0){
			decNum+=((int)Math.pow(8, i++))*(octNum%10);
			octNum/=10;
		}
		System.out.print(decNum);
	}

}
