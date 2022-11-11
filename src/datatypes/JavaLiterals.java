package datatypes;

public class JavaLiterals {
	
	public static String convertToHex(int decimal){    
	     int rem;  
	     String hex="";   
	     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
	     while(decimal>0)  
	     {  
	       rem=decimal%16;   
	       hex=hexchars[rem]+hex;   
	       decimal=decimal/16;  
	     }  
	    return hex;  
	}    
	
	public static String convertToOct(int decimal){    
	     int rem;  
	     String oct="";   
	     char octchars[]={'0','1','2','3','4','5','6','7'};  
	     while(decimal>0)  
	     {  
	       rem=decimal%8;   
	       oct=octchars[rem]+oct;   
	       decimal=decimal/8;  
	     }  
	    return oct;  
	}    
	
	public static String convertToBinary(int decimal) {
		int rem;  
	     String bin="";   
	     char binchars[]={'0','1'};  
	     while(decimal>0)  
	     {  
	       rem=decimal%2;   
	       bin=binchars[rem]+bin;   
	       decimal=decimal/2;  
	     }  
	    return bin;  
	}
	
	public static void main(String[] args) {
		int a=100;
		System.out.println("Integer Literal - Decimal: "+a);
		
		int b=067;
		System.out.println("Integer Literal - Octal to Decimal: "+b);

		int c=0x5A;
		System.out.println("Integer Literal - HexaDecimal to Decimal: "+c);
		
		int d=0b110011;
		System.out.println("Integer Literal - Binary to Decimal: "+d);
		
		//Decimal to Octal
		System.out.println("Decimal to Octal: 99-> "+(Integer.toOctalString(99))); 
		System.out.println("Decimal to Octal: 99-> "+(convertToOct(99)));  


		//Decimal to HexString.
		System.out.println("Decimal to HexaDecimal: 289-> "+(Integer.toHexString(289)));
		System.out.println("Decimal to HexaDecimal: 99-> "+(convertToHex(289)));  


		//Decimal to Binary
		System.out.println("Decimal to Binary: 16-> "+(Integer.toBinaryString(256)));  
		System.out.println("Decimal to Binary: 16-> "+(convertToBinary(256)));  

		
		
		
		


	}

}
