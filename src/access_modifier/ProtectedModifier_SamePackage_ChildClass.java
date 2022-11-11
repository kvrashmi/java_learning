package access_modifier;

public class ProtectedModifier_SamePackage_ChildClass extends AccessModifier_Protected{
	
	public static void main(String[] args) {
		ProtectedModifier_SamePackage_ChildClass amp= new ProtectedModifier_SamePackage_ChildClass();
		amp.text="I am from ProtectedModifier_SamePackage_ChildClass Class.\nSame Package Different Class Child Class.";
		amp.showText();

	}

}
