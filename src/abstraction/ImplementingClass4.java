package abstraction;

public class ImplementingClass4 implements Interface4{

	public static void main(String[] args) {
		ImplementingClass4 ic4 = new ImplementingClass4();
		//ic4.interfaceMtd7();
		ic4.interfaceMtd8();
	}

	@Override
	public void interfaceMtd8() {
		System.out.println("Implementing Mtd8 from Interface4");
	}
	
}
