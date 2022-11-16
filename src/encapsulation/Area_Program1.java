package encapsulation;

public class Area_Program1 {
	 // fields to calculate area
	  int length; 
	  int breadth;

	  
	  // constructor to initialize values
	  Area_Program1(int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }
      
	  // method to calculate area
	  public void getArea() {
	    int area = this.length * this.breadth;
	    System.out.println("Area: " + area);
	  }

}
