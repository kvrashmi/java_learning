package arrays;

public class Class_Room{
	
	int student_no;      //attributes, properties, instance variables / class variables
	String name;
	String grade;
	
	
	public String getDetails()
	{
		return this.grade + this.name + this.student_no;
	}
	
	Class_Room(int no,String name,String grade)
	{
		this.student_no=no;
		this.name=name;
		this.grade=grade;
	}
	
	
	public static void main(String[] args) {
		//Array of objects
		Class_Room student1 = new Class_Room(1,"Tony","First");
		Class_Room student2 = new Class_Room(2,"Jimmy","First");
		Class_Room student3= new Class_Room(3,"Maddy","First");
		Class_Room student4 = new Class_Room(4,"Jone","First");
		Class_Room student5 = new Class_Room(5,"Jack","First");
		Class_Room student6= new Class_Room(6,"Tommy","First");
		
		Class_Room[] class_first=new Class_Room[10];
		
		class_first[0]=student1;
		class_first[1]=student2;
		class_first[2]=student3;
		class_first[3]=student4;
		class_first[4]=student5;
		class_first[5]=student6;

		
		for(Class_Room each_student: class_first)
		{
			if(each_student!=null)
			{
				System.out.println("Student Info: "+ each_student.getDetails());
			}
		}
		
		/*
		for(int i=0;i<=5;i++)
		{
			System.out.println(class_first[i].getDetails());
		}
		
		String who_is_student5 = class_first[5].getDetails();
		System.out.println(who_is_student5);
		*/
	}

}
