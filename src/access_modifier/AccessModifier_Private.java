package access_modifier;



/*
 * Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
 */
public class AccessModifier_Private 
{
	private int data=20;
	
	private void showData()
	{
		System.out.println("I will be visible only inside this class:"+(this.data));
	}
	
	public static void main(String[] args) {
		PrivateModifier pm = new PrivateModifier();
		//Access the field data 
		//System.out.println("PrivateModifier.data:"+pm.data); // Not visible - compile time error
		//Access the method
		//System.out.println("Trying to invoke PrivateModifier -> showData():" + pm.showData()); // Compile Time Error
		
		/*
		 * The following statements will work fine because main method is within the same class
		 */
		AccessModifier_Private apm = new AccessModifier_Private();
		//Access the field data 
		System.out.println("PrivateModifier.data:"+apm.data); // Not visible
		//Access the method
		System.out.println("Trying to invoke PrivateModifier -> showData():"); 
		apm.showData();
	}

}

