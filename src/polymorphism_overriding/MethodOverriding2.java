package polymorphism_overriding;

//ClassA,ClassB and ClassC required.
public class MethodOverriding2 {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		//a.m1(); //From ClassA;
		System.out.println("S:"+a.s); // 10
		
		ClassA b = new ClassB(); 
		//b.m1(); //From ClassB
		System.out.println("S:"+b.s); // 10
		
		ClassC c = new ClassC();
		//c.m1(); //From ClassC
		System.out.println("S:"+c.s); // 20
		
		ClassC d = new ClassD();   // ClassA s=10, ClassC s=20;
		d.m1(); //From ClassC
		System.out.println("S:"+d.s); //20
		d.m2(); //Class C's m2 is called
		
		ClassD d1 = new ClassD();
		d1.m2();//Class D's m2 is called.
		
	}

}
