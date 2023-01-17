package abstraction;

public class DerivedClass9 extends AbstractClass9{

	public DerivedClass9(int i) {
		super(i);
	}

	public static void main(String[] args) {
		DerivedClass9 der = new DerivedClass9(10);
		der.k=70;
		System.out.println(der.comp());
	}

	@Override
	public int comp() {
		System.out.println(this.k);
		System.out.println(this.j);
		return AbstractClass9.i;
		
	}

}
