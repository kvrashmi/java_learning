package inheritance;

public class Rectangle extends Polygon{ // 0 field, 1 constructor, 0 method
	
	public Rectangle(int height,int width)
	{
		super(height, width);	
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,40);
		System.out.println("Area:"+rect.calculateArea());

	}

}
