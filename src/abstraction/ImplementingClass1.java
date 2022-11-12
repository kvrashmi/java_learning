package abstraction;

public class ImplementingClass1 implements Interface1 {
	
	@Override
	public void interfaceMtd1() {
		System.out.println("Implementing Mtd1 from Interface1");
		
	}

	@Override
	public void interfaceMtd2() {
		System.out.println("Implementing Mtd2 from Interface1");

	}

	public static void main(String[] args) {
		//ImplementingClass1 ic1 = new ImplementingClass1();
		Interface1 ic1 = new ImplementingClass1();
		//(Interface1 (Interface) => ImplementingClass1 (Class implementing the interface)
		//List (Interface) => ArrayList (Class implementing the interface)
		
		//Interface1 ic1 = new Interface1(); XXX Line 23 no possible instead line 19 is the way.
		
		ic1.interfaceMtd1();
		ic1.interfaceMtd2();
	}

	

}
