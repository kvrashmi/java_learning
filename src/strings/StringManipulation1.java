package strings;

/*
 * Given a string and an index, return a string length 2 starting at the given index. 
//	    If the index is too big or too small to define a string length 2, use the first 2 chars. 
//	    The string length will be at least 2.
//
//
//				twoChar("java", 0) → "ja"
//				twoChar("java", 2) → "va"
//				twoChar("java", 3) → "ja"
 */
public class StringManipulation1 {

	public static String returnStrOfLen2(int index,String str)
	{   
		    //14                    //-1       //15+
		if(index==str.length()-1 || index<0 || index>=str.length() )
		{
			
			return str.substring(0,2);
		}
		else
		{
			
			return str.substring(index,index+2);
		}
		
	}
	public static void main(String[] args) {
		String str="ComputerScience";
		System.out.println("The Entered String is:"+str);
		System.out.println("The Returned String is for index 4:"+returnStrOfLen2(4,str));
		System.out.println("The Returned String is for index -1:"+returnStrOfLen2(-1,str));
		System.out.println("The Returned String is for index 15:"+returnStrOfLen2(1,str));
		System.out.println("The Returned String is for index 14:"+returnStrOfLen2(14,str));
		System.out.println("The Returned String is for index 13:"+returnStrOfLen2(13,str));



	}

}
