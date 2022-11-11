package access_modifier;

public class AccessModifier_Protected {
	
	protected String text="I am from AccessModifier_Protected Class. Same Package Same Class.";
	
	protected void showText()
	{
		System.out.println(this.text);
		
	}

	public static void main(String[] args) {
		
		AccessModifier_Protected amp= new AccessModifier_Protected();
		amp.showText();

	}

}
