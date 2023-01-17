package strings;

public class Print_a1b2c3d4e5 {

	public static void main(String[] args) {
		String str1="a1b2c3d4e5";
		String resStr="";
		for(int i=0;i<str1.length();i++)
		{
			//This is going to be the value to be printed
			if(i==0||i%2==0)
			{
				char temp = str1.charAt(i);
				//System.out.println("Char:"+temp);
				//The next position has the number of times a char needs to be printed.
				int j= i+1;
				char countToPrint=str1.charAt(j);
				int count = Character.getNumericValue(countToPrint);
				//System.out.println("Count:"+ countToPrint);
				//Print
				for(int k=count;k>0;k--)
				{
					//System.out.println(k);
					resStr+=temp;
					//System.out.println(resStr);
				}
			}
			
		}
		System.out.println(resStr);
	}

}
