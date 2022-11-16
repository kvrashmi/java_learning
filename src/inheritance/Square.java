package inheritance;

public class Square extends Polygon {
	
	
	public Square(int side)	
	{
		super(side,side);
	}
	
	public int calculateArea()
	{
		return (int) Math.pow(this.height, 2);
	}
	
	public int volume( int thirddim)
	{
		return this.height*this.width*thirddim;
	}
	
	public static void main(String[] args) {
		Square sq = new Square(4);
		System.out.println("Area:"+sq.calculateArea());
		System.out.println("Volume:"+sq.volume(30));
	}

}
