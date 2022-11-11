package access_modifier;

public class AccessModifier_Default {
	
	int data=40;
	
	void showData()
	{
		System.out.println("Data will be visible only inside this class and classes within the package:"+(this.data));
	}	

}
