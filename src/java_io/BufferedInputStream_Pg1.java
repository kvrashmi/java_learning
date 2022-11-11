package java_io;

import java.io.*;

public class BufferedInputStream_Pg1 {

	public static void main(String[] args) {
		InputStream is = null;
		try
		{
			is = new FileInputStream("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//TechFios_AuthorizationLetter.png");
			BufferedInputStream bis = new BufferedInputStream(is);
			System.out.println("Number of remaining bytes:"+bis.available());
			boolean b = bis.markSupported();
			if(b)
			{
				bis.mark(bis.available());
			}
		    bis.skip(4);
		    System.out.println("File Contents:");
		    
		    int ch;
		    while((ch=bis.read())!=-1)
		    {
		    	System.out.println((char)ch);
		    }
		    
		    System.out.println("File Contents After Resetting:");

		    bis.reset();
		    while((ch=bis.read())!=-1)
		    {
		    	System.out.println((char)ch);
		    }
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		 
		
		
		
		
		
		
	}

}
