package abstraction;

public interface Interface4 {
	
	//Default method - default definition
	//This method may or may not be implemented 
	default void interfaceMtd7()
	{
		System.out.println("This is from a defualt method. This can be overriden by the class implementing it.");
	}
	
	//Abstract method - no definition
	//This method must be implemented.
	void interfaceMtd8();
	
}
