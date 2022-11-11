package strings;

public class RemoveCharFromAString {

	public static void main(String[] args) {
		String str="RemoveCharFromAString";
		char c='m';
		System.out.println(str.replaceAll("m", " "));
		System.out.println(str.replaceAll(Character.toString(c), " "));
		System.out.println(str);
		
		//Replace the second occurance
		int fOcc=str.indexOf('m');
		int sOcc=str.indexOf('m', fOcc);
		System.out.println(str.replaceAll(Character.toString(str.charAt(sOcc)), " "));
		
		int first=str.indexOf('l');
		int second=str.indexOf('m', first);
		String newstr= str.substring(0, second+1);
		String newstr2= str.substring(second+1, str.length()).replaceFirst("m", " ");
		System.out.println(newstr+newstr2);
	}

}
