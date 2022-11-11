package java_io;

import java.io.*;
  

public class ReadWriteTextUsingFileReaderWriter {

	public static void main(String[] args) {
		 //3 steps - Reading a file
		File f = null;
		FileReader fr=null;
		BufferedReader br=null;
		
		String filecontents ="";
		
		//3 steps - Writing a file
		File fi = null;
		FileWriter fwr=null;
		BufferedWriter bwr=null;
		try
		{
			f = new File("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//source.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String var=br.readLine();
			 while(var!=null)
			 {
				 //System.out.println(var);
				 filecontents = filecontents + var;
				 var=br.readLine();
			 } 
			 //System.out.println(var);
			 //System.out.println(filecontents.length());
			 fi = new File("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//medi.txt");
			 fwr = new FileWriter(fi);
			 bwr = new BufferedWriter(fwr);
			 bwr.write(filecontents);	 
		}
		catch(IOException e)
		{
			System.out.println("IO exception occured.");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("Even the object...");
			e.printStackTrace();
		}
		
		finally
		{
			try {
				br.close();
				fr.close();
				bwr.flush();
				fwr.flush();
				bwr.close();
				fwr.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}		 
	}
}
