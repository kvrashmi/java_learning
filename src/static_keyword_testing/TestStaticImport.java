package static_keyword_testing;

import static static_keyword.StaticImport.*;

//import static_keyword.StaticImport;

public class TestStaticImport {

	public static void main(String[] args) {
		//static methods can be invoked without an instance var or classname when the corresponding class import is static.
		method2();
		//non static methods should be invoked using an object only and the import shoould also be non-static
		/*
		StaticImport st1 = new StaticImport();
		st1.method1();
		*/
		
	}

}
