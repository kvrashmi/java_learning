package basic;

public class Employee { //Class - logical entity, blue print or a template of how an object should be
	                    //- no memory required

		// attributes - represents state
		public int eId;
		public String eName;
		public String job;
		public int empSal;
		
		//methods - behavior
		public void display()
		{
			System.out.println("EmployeeId :"+(eId));
			System.out.println("EName: "+(eName));
			System.out.println("Job: "+(job));
			System.out.println("EmpSal: "+(empSal));
		}
	   
		public void getMonthlySalary()
		{
			System.out.println("MSal:"+ (empSal*.25));
		}
	        
	public static void main(String[] args) 
	{
		// An object is an instance of a class
		// Any no of objects can be created for one class
		// Objects are independent of each other 
		// Object creation / instantiation
		Employee e1 = new Employee(); //objects - physical entity - occupies space
		
		e1.eId=101;
		e1.eName="Saranya";
		e1.job="Manager";
		e1.empSal=10000;
		
		e1.display();
		e1.getMonthlySalary();
		
		Employee e2 = new Employee(); //objects
		
		e2.eId=102;
		e1.eName="Shalini";
		e1.job="Manager";
		e1.empSal=10005;
		
		e1.display();
		e1.getMonthlySalary();
	}

}
