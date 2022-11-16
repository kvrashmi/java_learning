package inheritance;

public class Polygon { //2 fields , 1 constructor , 1 method
	int height;
	int width;
	
	Polygon(int height,int width)
	{
		this.height=height;
		this.width=width;
	}
	
	public int calculateArea()
	{
		return this.height*this.width;
	}
}
