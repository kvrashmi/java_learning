package java_io;
import java.io.*;

public class InputStream_Pg1 {

	public static void main(String[] args){
		
		//InputStream input = null;
		FileInputStream input=null;
		
		try
		{
			input = new FileInputStream("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//sample_file1.txt");
			
			// Illustrating getChannel() method
	        System.out.println(input.getChannel());
	 
	        // Illustrating getFD() method
	        System.out.println(input.getFD());
	        
			byte[] bArray=new byte[100];
			//Skip 5 bytes
			input.skip(5);
			System.out.println("After skipping 5 bytes:");
			int readByte=input.read();
			int i=0;
			while(readByte!=-1)
			{
				System.out.println("Bytes Available:"+input.available());
				//System.out.println(readByte+" "); //Prints the ascii value
				System.out.println((char)readByte); //Prints the actual value
				readByte=input.read();
				bArray[i]=(byte)readByte;
				System.out.println("From bArray:"+bArray[i]);
				i++;
			}
			
		}
		catch(FileNotFoundException e1)
		{
			System.out.println("File Not Found Exception Has Occurred...");
			e1.printStackTrace();
		}
		catch(IOException e2)
		{
			System.out.println("IO Exception Has Occurred...");
			e2.printStackTrace();
		}
		finally
		{
			try 
			{
				input.close();
			} 
			catch (IOException e) 
			{
				System.out.println("I/O Exception Has Occurred...");
				e.printStackTrace();
			}
			catch (NullPointerException e) 
			{
				System.out.println("Null Pointer Exception Has Occurred...");
				e.printStackTrace();
			}
		}
		
	}

}
