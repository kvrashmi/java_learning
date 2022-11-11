package access_modifier_sub;

import access_modifier.AccessModifier_Protected;

public class ProtectedModifier_DiffPack_ChildClass extends AccessModifier_Protected{

	public static void main(String[] args) {
		ProtectedModifier_DiffPack_ChildClass amp= new ProtectedModifier_DiffPack_ChildClass();
		amp.text="I am from ProtectedModifier_DiffPack_ChildClass Class.\nDifferent Package Different Class Child Class.";
		amp.showText();

	}

}
