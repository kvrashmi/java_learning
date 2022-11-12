package encapsulation;

public class DataHiding {

	public static void main(String[] args) {
		Area_Program2 ap2 = new Area_Program2();
		ap2.setLength(20);
		ap2.setBreadth(30);
		int area=ap2.calculateArea();
	
		System.out.println("Length:"+ap2.getLength());
		System.out.println("Breadth:"+ap2.getBreadth());
		System.out.println("Area:"+area);
		
				
	}

}
