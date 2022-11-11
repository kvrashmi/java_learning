package arrays;

public class Array3D {

	public static void main(String[] args) {
		int[][][] a=new int[3][3][3];
		//Fill Array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					a[i][j][k]=i+j+k;
				}
			}
		}
		//Print array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					System.out.print(a[i][j][k]+" ");

				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
