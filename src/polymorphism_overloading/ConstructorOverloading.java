package polymorphism_overloading;


public class ConstructorOverloading {
	
	String language;

	  // constructor with no parameter
	  ConstructorOverloading() {
	    this.language = "Java";
	  }

	  // constructor with a single parameter
	                                //Python
	  ConstructorOverloading(String language) {
	    this.language = language; //Python
	  }

	  public void getName() {
	    System.out.println("Programming Langauage: " + this.language);
	  }

	public static void main(String[] args) {
		// call constructor with no parameter
		ConstructorOverloading obj1 = new ConstructorOverloading();
		obj1.getName(); 
	    
		// call constructor with a single parameter
		ConstructorOverloading obj2 = new ConstructorOverloading("Python");
	    obj2.getName();
	}

}

