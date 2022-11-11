package jump_statements;

public class ContinueInWhileLoop {

	public static void main(String[] args) {
		// Initializing a variable say it count  to a value
        // greater than the value greater among the loop
        // values
        int count = 20;
 
        // While loop for iteration
        while (count >= 0) {
            if (count == 7 || count == 15) {
                count--;
                // Decrementing variable initialized above
 
                // Showing continue execution inside loop
                // skipping when count==7 or count==15
                continue;
            }
 
            // Printing values after continue statement
            System.out.print(count + " ");
 
            // Decrementing the count variable
            count--;
        }
	}

}
