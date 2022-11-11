package access_modifier;

public class DefaultModifier_ChildClass extends DefaultModifier{
	
	void showData()
	{
		System.out.println("Data will be visible inside this child class also as it is in the same package:"+(this.data));
	}	


	public static void main(String[] args) {
		//Data is available for child class within the same package
		DefaultModifier_ChildClass dm_cc=new DefaultModifier_ChildClass();
		dm_cc.data=80;
		dm_cc.showData();
		
		//This is within the same class
		DefaultModifier dm = new DefaultModifier();
		dm.showData();
		
	}
}
