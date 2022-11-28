package encapsulation;

public class Area_Program2 { //Data Hiding
	private int length; // this.length
	private int breadth;
	
	
	/*
	public Area_Program2(int len,int bre)
	{
		this.length=len;
		this.breadth=bre;
	}
	*/
							   //20
	public void setLength(int length ) {  // this refers to the object
	      this.length = length;
	      //duncanHouse.length=length;
	}
	
	public int getLength() {
		return this.length;
	}
								//30
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getBreadth() {
		return this.breadth;
	}
	
	public int calculateArea()
	{
		return this.length*this.breadth;
	}
}
