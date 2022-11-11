package arrays;


public class ArrayManipulation {
	
	int no;
	String name;
	
	ArrayManipulation(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	
	public static void getCount(String[] arr)
    {
        int count = arr.length;
        System.out.println("This array has  : " + count+" items..");
    }  
	
	public static int[] getArrayLiterals()
	{
		int[] a={1,2,3,4,5,6,7,8,9};
		//return a;
		return new int[] {1,2,3,4,5,6,7,8,9};
	}
	
	
	public static void main(String[] args) {
		
		//Method 1: How to declare an array: Both the forms are correct
		//But no memory is allocated. 
		//We only tell the compiler that the variables arr1 and arr2 will hold an array of integer type.
		int[] arr1; //1
		boolean[] arr2;//true 
		double[] arr3;
		String arr4[];
		ArrayManipulation[] arr5; //
		
		//To allocate memory -initialization
		arr1=new int[10];
		arr2=new boolean[2];
		arr3=new double[5];
		arr4=new String[10];
		arr5=new ArrayManipulation[5];
		
		/*
		//How to check the length - by using length property
		System.out.println("Array length:"+arr1.length);
		
		//Default values of Array: Make sure all the arrays are initialized
		for(int i=0;i<arr1.length;i++)
		{
			//Default value for byte,short,int,long =>0
			System.out.println("Default values in arr1:"+arr1[i]); 
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			//Default value for boolean =>false
			System.out.println("Default values in arr2:"+arr2[i]);
		}
		
		for(int i=0;i<arr3.length;i++)
		{
			//Default value for float, double=>0
			System.out.println("Default values in arr3:"+arr3[i]);
		}
		
		for(int i=0;i<arr4.length;i++)
		{
			//Default value for reference types=> null 
			System.out.println("Default values in arr4:"+arr4[i]);
		}
		
		for(int i=0;i<arr5.length;i++)
		{
			System.out.println("Default values in arr5:"+arr5[i]);
		}
		*/
		
		//Assign values to each arrays
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=i+1;
		}
		
		//Assign value for boolean array
		arr2[0]=false;
		arr2[1]=true;
		
		//Assign value for double array
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=i+1;
		}
		
		//Assign value for String array
		for(int i=0;i<arr4.length;i++)
		{
			arr4[i]=(i+1)+"";
		}
		
		//Assign value for reference type array
		arr5[0]=new ArrayManipulation(1,"Rashmi");
		arr5[1]=new ArrayManipulation(2,"Charu");
		arr5[2]=new ArrayManipulation(3,"Shalini");
		arr5[3]=new ArrayManipulation(4,"Sahiba");
		arr5[4]=new ArrayManipulation(5,"Sazia");
		/*
		//Print all the values of arrays
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Default values in arr1:"+arr1[i]); 
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Default values in arr2:"+arr2[i]);
		}
		
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println("Default values in arr3:"+arr3[i]);
		}
		
		for(int i=0;i<arr4.length;i++)
		{
			System.out.println("Values in arr4:"+arr4[i]);
		}
		
		//Accessing arrays using foreach loop
		for(ArrayManipulation a1: arr5)
		{
			System.out.println("Value1:"+a1.no);
			System.out.println("Value1:"+a1.name);
		}
		*/		
		//Array index out of bounds exception
		//System.out.println("Default values in arr5:"+arr5[5].no);
		//System.out.println("Default values in arr5:"+arr5[5].name);
		
		//Declaring Arrays using Array literal
		String[] arr6={"apple","banana","grape","orange"};

		//Multidimensional Objects
		int[][] arr7 = new int[3][3]; //a 2D array or matrix
		int[][][] arr8 = new int[3][3][3]; //a 3D array
		
		arr7[0][0]= 2;
		arr7[0][1]= 3;
		arr7[0][2]= 4;
		
		arr7[1][0]=5;
		arr7[1][1]=6;
		arr7[1][2]=7;
		
		arr7[2][0]=8;
		arr7[2][1]=9;
		arr7[2][2]=10;
		
		//Print this array
		for(int i=0;i<arr7.length;i++)
		{
			for(int j=0;j<arr7.length;j++)
			{
				System.out.println("Array7["+i+"]["+j+"]:"+arr7[i][j]);
			}
		}
		
		//Provide values for 3 array and print it
		for(int i=0;i<arr8.length;i++)
		{
			for(int j=0;j<arr8.length;j++)
			{
				for(int k=0;k<arr8.length;k++)
				{
					arr8[i][j][k]=k;
				}
			}
		}
		
		for(int i=0;i<arr8.length;i++)
		{
			for(int j=0;j<arr8.length;j++)
			{
				for(int k=0;k<arr8.length;k++)
				{
					System.out.println("Array8["+i+"]["+j+"]["+k+"]:"+arr8[i][j][k]);
				}
			}
		}
		
		System.out.println("Length of 2d array:"+arr7.length);
		System.out.println("Length of 3d array:"+arr8.length);

		//Passing arrays to methods
		getCount(arr6);
		
		int[] arr9=ArrayManipulation.getArrayLiterals();
		System.out.println("Array9 length:"+arr9.length);
		
				
	}
	
}
