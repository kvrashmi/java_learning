package methods;

public class PassByVal_NonPrimitive {
	
	int x;
	
	PassByVal_NonPrimitive(int i) 
	{ 
		x = i; 
	}
	
	PassByVal_NonPrimitive()      
	{ 
		x = 0; 
	}

	public static void change(PassByVal_NonPrimitive  t)
    {
        // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main
        //t = new PassByVal_NonPrimitive ();
        t.x = 10;
    }
	
	public static void change1(PassByVal_NonPrimitive  t)
    {
        // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main
		//New object and address location
        t = new PassByVal_NonPrimitive ();
        t.x = 10;
    }
	
	public static void main(String[] args) {
		PassByVal_NonPrimitive t = new PassByVal_NonPrimitive();
		
		// Reference is passed and a copy of reference
        // is created in change()
        change1(t);
 
        // Old value of t.x is printed
        System.out.println(t.x);
        
        PassByVal_NonPrimitive t1 = new PassByVal_NonPrimitive(20);
        change(t1);
        // t1 is updated and  value of t1.x is printed as 10
        System.out.println(t1.x);

	}

}
