package abstraction;

public abstract class AbstractClass9 {
	
	static int i=10;
	final int j=20;
	public int k=30;
	
	public AbstractClass9(int i)
	{
		AbstractClass9.i=AbstractClass9.i+i+this.j+this.k;
	}
	
	public abstract int comp();

}
