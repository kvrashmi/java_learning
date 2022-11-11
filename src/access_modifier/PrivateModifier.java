package access_modifier;


/*
 * Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
 */

class PrivateModifier {
	
	private int data=40;
	
	private void showData()
	{
		System.out.println("Data will be visible only inside this class:"+(this.data));
	}	

}
