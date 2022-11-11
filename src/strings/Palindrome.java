package strings;

public class Palindrome {
	String inputString="";
	
	public Palindrome(String inputString)
	{
		this.inputString=inputString;
	}
	
	public void checkIfStringIsPalindrome1()
	{
		if(this.inputString!="" || this.inputString!=null)
		{
			StringBuilder sBuilder = new StringBuilder(this.inputString);
			if(sBuilder.reverse().toString().equalsIgnoreCase(this.inputString)) 
			{
				System.out.println("Given String is a Palindrome.");
			}
			else
			{
				System.out.println("Given String is not a Palindrome.");
			}	
		}
	}
	
	public void checkIfStringIsPalindrome2()
	{
		StringBuffer sBuffer = new StringBuffer(this.inputString);
		if(sBuffer.reverse().toString().equalsIgnoreCase(this.inputString))
		{
			System.out.println("Given String is a Palindrome.");
		}
		else
		{
			System.out.println("Given String is not a Palindrome.");
		}
	}

	public void checkIfStringIsPalindrome3()
	{
		boolean flag=false;
		int lenOfStr=this.inputString.length()-1;
		
		for(int i=0;i<this.inputString.length();i++)
		{
			if(this.inputString.toLowerCase().charAt(i)==this.inputString.toLowerCase().charAt(lenOfStr))
			{
				//System.out.println(this.inputString.toLowerCase().charAt(i));
				//System.out.println(this.inputString.toLowerCase().charAt(lenOfStr));
				flag=true;
				lenOfStr--;
				continue;
			}
			else
			{
				flag=false;
				break;
			}
			
		}
		
		if(flag)
		{
			System.out.println("Given String is a Palindrome.");
		}
		else
		{
			System.out.println("Given String is not a Palindrome.");
		}
	}
	
	//Go through only half of the string
	public boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome("Malayalam");
		p.checkIfStringIsPalindrome1();
		p.checkIfStringIsPalindrome2();
		p.checkIfStringIsPalindrome3();
	}

}
