package java_io;
import java.io.*;

public class OutputStream_Pg2 {

	public static void main(String[] args) {
		OutputStream output=null;
		try
		{
			output = new FileOutputStream("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//sample_file1.txt");
			output.write("Hello World".getBytes());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFound Exception Has Occurred...");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("I/O Exception Has Occurred...");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				output.close();
			}
			catch(IOException e)
			{
				System.out.println("I/O Exception Has Occurred...");
				e.printStackTrace();
			}
			catch(NullPointerException e)
			{
				System.out.println("Null Pointer Exception Has Occurred...");
				e.printStackTrace();
			}
			
		}
		

	}

}
