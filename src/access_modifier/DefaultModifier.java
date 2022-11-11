package access_modifier;


public class DefaultModifier {
	
	int data=90;
	
	void showData()
	{
		System.out.println("Data and methods will be visible only inside this class:"+(this.data));
	}

	public static void main(String[] args) {
		//This class is within the same package
		AccessModifier_Default acd=new AccessModifier_Default();
		acd.data=20;
		acd.showData();
		
		//This is within the same class
		DefaultModifier dm = new DefaultModifier();
		dm.showData();
		
	}

}


