package loops;

public class ForLoopComplete {

	public static void main(String[] args) 
	{
		/*Syntax: for(initialization; condition; increment/decrement)
		{
		}
		
		
		for(int i=0;i<10;i++);     // (<: from 0 to 10 exclude 10 - print 0-9)   - forward access  
		for(int i=0;i<=10;i++);    //(<=: from 0 to 10 include 10 - print 0-10)  - forward access
	
		for(int i=5;i>0;i--);     //(>: from 5 to 0 exclude 0 - print 5-1)   - backward access
		for(int i=5;i>=0;i--);     //(>=: from 5 to 0 include 0 - print 5-0)   - backward access
		
		
		int j;
		for(j=0;j<=10;j++)
		{
			//System.out.println(j);
		}
		System.out.println(j); //last value of j - the value for which the loop condition fails
		
		// Is it possible to access j here? Yes- because it is declared outside of for loop
		
		for(int k=0;k<=10;k++)
		{
			System.out.println(k); // all the values of k within the acceptable range will be printed. 
		}
		//System.out.println(k); // k is out of scope
		
		for(int m=0;m<=5;m++); // body will not be executed but only the first for statement that will be printed
		{
			//System.out.println(m);
		}
		
		for(int n=0;n>=5;n++) //Only comparative operators >,<,>=,<= are allowed
		{
			//System.out.println(m);
		}
		
		for(int o=0;o==5;o++) //Not allowed - but can be used as a second condition
		{
			//System.out.println(o);
		}
		
		int flag=1;
		for(int a=0;(a<=5 && flag==0);a++) //== but can be used as a second condition
		{
			System.out.println(" A: "+ a);
		}
		
		
		//For loop-break Initially loop is set to run from 0-9
		for (int j=0;j<10;j++)
		{
			for (int i = 0; i < 10; i++) 
	        {
	            System.out.println("Before break: i: " + i);
	            // terminate loop when i is 5.
	            if (i == 5) 
	            {
	                break;
	            }
	            System.out.println("After Break: i: " + i);
	        }
			System.out.println("j:"+ j);
		}
        
		//For-continue
		for (int i = 0; i < 10; i++) 
        {
            // terminate loop when i is 5.
            if (i == 5) 
            {
                continue; //meaning of continue in java: skip the current iteration and go for the next iteration.
            }
            System.out.println("i: " + i);
        }
        */
		
		//In order for a 'for' loop to go on , the condition should be true.
		//If the condition fails even in the first step/iteration, the for loop will just exit.
		int i;
		for(i=0;i==3;i++)                     
		{
			System.out.println(i);
			
		}
		System.out.println("Last value of i:"+i);//This value was the last value of i - for which the for loop ended/failed.
	
	}
}
