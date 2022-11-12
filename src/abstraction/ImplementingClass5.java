package abstraction;

public class ImplementingClass5 implements Interface5 {

	public static void main(String[] args) {
		ImplementingClass5 ic5 = new ImplementingClass5();
		ic5.interfaceMtd9();
	}

	@Override
	public void interfaceMtd9() {
		System.out.println("Printing the value of interface variable:"+Interface5.var);
	}

}
