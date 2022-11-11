package classes_and_objects;

/*
 * There are four ways to create objects in java. Strictly speaking there is only one way(by using new keyword), and the rest internally use new keyword. 

1. Using new keyword: It is the most common and general way to create an object in java. Example:
	// creating object of class Test
	Test t = new Test();
2. Using Class.forName(String className) method: There is a pre-defined class in java.lang package with name Class. The forName(String className) method 
returns the Class object associated with the class with the given string name. We have to give a fully qualified name for a class. On calling new Instance() method on this Class object returns new instance of the class with the given string name.

	// creating object of public class Test
	// consider class Test present in com.p1 package
	Test obj = (Test)Class.forName("com.p1.Test").newInstance();

3.Using clone() method: clone() method is present in Object class. It creates and returns a copy of the object.
        
	// creating object of class Test
	Test t1 = new Test();
	// creating clone of above object
	Test t2 = (Test)t1.clone();

4. Deserialization: De-serialization is a technique of reading an object from the saved state in a file. Refer Serialization/De-Serialization in java
            
	FileInputStream file = new FileInputStream(filename);
	ObjectInputStream in = new ObjectInputStream(file);
	Object obj = in.readObject();
	
 */
public class ObjectCreationVariation {
	
	public void display()
	{
		System.out.println("Display...");
	}

	public static void main(String[] args) {
		//ObjectCreationVariation ocv = new ObjectCreationVariation();
		
		//ObjectCreationVariation ocv = (ObjectCreationVariation)Class.forName("ObjectCreationVariation").newInstance();
		
		// creating object of class ObjectCreationVariation
		//ObjectCreationVariation t1 = new ObjectCreationVariation();
		// creating clone of above object
		//ObjectCreationVariation t2 = (ObjectCreationVariation)t1.clone();
		
	}

}
