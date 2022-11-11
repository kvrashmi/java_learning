package arrays;

public class Array2D {

	public static void main(String[] args) {
		int[][] a=new int[3][3];
		//Fill Array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=i+j;
			}
		}
		//Print array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
