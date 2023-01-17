package strings;

public class StringpoolAndHeap {

	public static void main(String[] args) {
		String s = "abc"; //pool
		String s2 = "abc"; 
		String s1= new String("abc").intern(); //heap
		String s3= new String("abc").intern();//heap
		//System.out.println(s.equals(s2));
		System.out.println(s==s2);
		System.out.println(s1==s3);
		
	}

}

/*	 
 
 One multiple reference:
  s=>  |abc|
  s2=> |abc|
  
  Heap:
  s1 => (abc)
  s3 => (abc)  
*/