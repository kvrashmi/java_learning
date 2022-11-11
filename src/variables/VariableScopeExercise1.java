package variables;

public class VariableScopeExercise1 {
	
	static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
    	VariableScopeExercise1 t = new VariableScopeExercise1();
        this.x = 22;
        y = 44;
 
        System.out.println("Test.x: " + VariableScopeExercise1.x); //22
        System.out.println("t.x: " + t.x); //22
        System.out.println("t.y: " + t.y); //33 - class variable y
        System.out.println("y: " + y); //44 - local variable y
    }

	public static void main(String[] args) {
		VariableScopeExercise1 t = new VariableScopeExercise1();
        t.method1(5);

	}

}
