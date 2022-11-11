package classes_and_objects;

/*
 * In Java, when we create an object of an immutable class, we cannot change its value. For example, String is an immutable class. 
 * Hence, we cannot change the content of a string once created.
 * Besides, we can also create our own custom immutable classes. Here's what we need to do to create an immutable class.
	1. declare the class as final so it cannot be extended
    2. all class members should be private so they cannot be accessed outside of class
    3. shouldn't contain any setter methods to change the value of class members
    4. the getter method should return the copy of class members
    5. class members are only initialized using constructor
 */
final class ImmutableClass {
	
	// private class members
	private String name;
	private int date;

	ImmutableClass(String name, int date) {

	 // class members are initialized using constructor
	 this.name = name;
	 this.date = date;
	}

	// getter method returns the copy of class members
	public String getName() {
	 return name;
	}

	public int getDate() {
	 return date;
	}

	public static void main(String[] args) {
		
		// create object of Immutable class
		 ImmutableClass obj = new ImmutableClass("Programiz", 2011);

		 System.out.println("Name: " + obj.getName());
		 System.out.println("Date: " + obj.getDate());
		 
		 //This is possible since it is within the same class
		 //This is not possible for the classes that extend this class
		 obj.name="GeeksForGeeks";
		 obj.date=2012;
		 
		 System.out.println("Name: " + obj.getName());
		 System.out.println("Date: " + obj.getDate());

	}

}

