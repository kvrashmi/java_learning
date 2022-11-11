package classes_and_objects;

public class SingletonClass {
	
	//Rule1: Declare private static instance variable of type SingletonClass(Class)
			private static SingletonClass single_instance=null;
	
			public String s;
	//Rule2: Declare a private constructor - to restrict to this class itself
			private SingletonClass()
			{
				s="Constructor of singleton class...";
			}
			
	
	//Rule3: Static method to create instance of SingletonClass
			public static SingletonClass SingletonClass()
		    {
				// To ensure only one instance is created
		        if (single_instance == null) {
		            single_instance = new SingletonClass();
		        }
		        return single_instance;
		    }
	public static void main(String[] args) {
		SingletonClass sc1 = SingletonClass.SingletonClass();
		SingletonClass sc2 = SingletonClass.SingletonClass();
		
		// Printing the hash code for above variable as declared
        System.out.println("Hashcode of x is "
                           + sc1.hashCode());
        System.out.println("Hashcode of y is "
                           + sc2.hashCode());
        // Condition check
        if (sc1==sc2) 
        {
        	// Print statement
            System.out.println("Two objects point to the same memory location on the heap i.e, to the same object");
        }
        else 
        {
            // Print statement
            System.out.println("Two objects DO NOT point to the same memory location on the heap");
        }
        
        sc1.s=sc1.s.toLowerCase();
        
        System.out.println("Check sc1.s:"+sc1.s);
        System.out.println("Check sc2.s:"+sc2.s);
        
        sc2.s=sc2.s.toUpperCase();
        
        System.out.println("Check sc1.s:"+sc1.s);
        System.out.println("Check sc2.s:"+sc2.s);
        
        

	}

}
