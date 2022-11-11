package operators;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		
		//Increment/Decrement
		//++ / --
		//i++ ===> i=i+1; ++
		//i/=2 ===> i=i+2;  += , -=, *=, /=
		
		int i=10; 
		System.out.print("PostIncrement i: "); 
		System.out.print(i);//10
		System.out.println();
		System.out.print("During PostIncrement:i: ");
	    System.out.print(i--); //10
		System.out.println();
		System.out.print("After PostIncrement i: "); // 9
		System.out.print(i); 
		System.out.println();

		
		
		
		
		i=10;
		System.out.println("PreIncrement i:"+(i));//10
		System.out.println("During PreIncrement:i:"+(--i)); // 9
		System.out.println("After PreIncrement i:"+(i));//9
		
		
		
		
	}

}
