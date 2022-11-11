package classes_and_objects;

import classes_and_objects.ImmutableClass;

public class AccessImmutableClass {

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass("jAvaTpoint",2013);
		System.out.println("Name: "+ic.getName());
		System.out.println("Date: "+ic.getDate());
	}

}
