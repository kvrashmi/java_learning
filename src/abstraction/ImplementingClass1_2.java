package abstraction;

//A class can implement more than one interface
//The class ImplementingClass1_2 should define methods from the both the interfaces 
//If you borrow money from two different, then make sure you pay off both of them.
public class ImplementingClass1_2 implements Interface1,Interface2 {

	public static void main(String[] args) {
		ImplementingClass1_2 ic1_2 = new ImplementingClass1_2(); // Regular way of 
		ic1_2.interfaceMtd1(); // methods from Interface1 
		ic1_2.interfaceMtd2(); // methods from Interface1 
		ic1_2.interfaceMtd3(); // methods from Interface2
		ic1_2.interfaceMtd4(); // methods from Interface2
	}

	
	@Override
	public void interfaceMtd3() {
		System.out.println("Implementing Mtd3 from Interface2");
	}

	@Override
	public void interfaceMtd4() {
		System.out.println("Implementing Mtd4 from Interface2");
	}
	
	@Override
	public void interfaceMtd1() {
		System.out.println("Implementing Mtd1 from Interface1");
	}

	@Override
	public void interfaceMtd2() {
		System.out.println("Implementing Mtd2 from Interface1");
	}
	
}
