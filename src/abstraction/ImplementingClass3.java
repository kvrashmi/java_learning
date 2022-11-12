package abstraction;

public class ImplementingClass3 implements Interface3{

	public static void main(String[] args) {
		ImplementingClass3 ic3= new ImplementingClass3();
		ic3.interfaceMtd1();
		ic3.interfaceMtd2();
		ic3.interfaceMtd3();
		ic3.interfaceMtd4();
		ic3.interfaceMtd5();
		ic3.interfaceMtd6();
	}

	@Override
	public void interfaceMtd1() {
		System.out.println("Implementing Mtd1 from Interface3");
	}

	@Override
	public void interfaceMtd2() {
		System.out.println("Implementing Mtd2 from Interface3");
	}

	@Override
	public void interfaceMtd3() {
		System.out.println("Implementing Mtd3 from Interface3");
	}

	@Override
	public void interfaceMtd4() {
		System.out.println("Implementing Mtd4 from Interface3");
	}

	@Override
	public void interfaceMtd5() {
		System.out.println("Implementing Mtd5 from Interface3");
	}

	@Override
	public void interfaceMtd6() {
		System.out.println("Implementing Mtd6 from Interface3");
		
	}

}
