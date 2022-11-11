package strings;



public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Rashmi");
		sb.append("Kanuppa");
		System.out.println("Sb:"+sb);
		System.out.println("Capacity:"+sb.capacity());
		sb.replace(6, 16, "Kanduluva");
		System.out.println("Sb:"+sb);
		sb.deleteCharAt(2);
		System.out.println("Sb:"+sb);
		char[] a = new char[10];
		sb.getChars(0, 10,a ,0);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Char["+i+"]"+a[i]);
		}
		System.out.println(sb.chars().anyMatch(null));
	}

}
