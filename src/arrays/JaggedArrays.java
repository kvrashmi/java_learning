package arrays;

public class JaggedArrays {

	public static void main(String[] args) {
		int[][] a= new int[2][];
		 // First row has 3 columns
        a[0] = new int[3];
 
        // Second row has 2 columns
        a[1] = new int[2];
 
        // Initializing array
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = count++;
            }
        }
        
        //Print array
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        int[][] b = new int[3][];
        b[0]= new int[]{1,2,3,4,5};
        b[1]= new int[]{1,2,3};
        b[2]= new int[]{1,2,3,4,5,6,7};
        
      //Print array
        for (int i = 0; i < b.length; i++)
        {
            for (int j = 0; j < b[i].length; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        int[][][] c = {
        		new int[][] {
        			new int[] {1,2,3},
        			new int[] {3,4,5,6}
        		},
        		new int[][] {
        		new int[] {1,2,3,4,5},
        		new int[] {9,8,7,6,5,4,3},
        		new int[] {0,8,7,6}
        		}
        };
        
        //Print array
        for (int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++)
            {
            	for (int k = 0; k < c[i][j].length; k++)
            	{
            		System.out.print(c[i][j][k]+" ");
            	}
                System.out.println();
            }
            System.out.println();
        }
        
        //Another way
        int[][][] d = new int[3][][]; // 3 rows is going to be there for d array
        d[0]= new int[][] { new int[] {1,2,3,4},new int[] {4,5,6,7}};
        d[1]= new int[][] { new int[] {1,2,3,4},new int[] {4,5,6,7},new int[] {9,10,11,12}};
        d[2]= new int[][] { new int[] {1,2,3,4},new int[] {4,5,6,7}};
        
        for(int a1=0;a1<d.length;a1++)
        {
        	for(int a2=0;a2<d[a1].length;a2++)
        	{
        		for(int a3=0;a3<d[a1][a2].length;a3++)
        		{
            		System.out.print(d[a1][a2][a3]+" ");
        		}
        		System.out.println();
        	}
    		System.out.println();

        }
        

        
        
 
	}

}
