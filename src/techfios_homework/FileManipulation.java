package techfios_homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.*;

public class FileManipulation {

	public static boolean doesFileExist(String path) throws FileNotFoundException
	{
		File f=null;
		f = new File(path);
			if(f.exists())
			{
				System.out.println("File exists in the given location..");
				return true;
			}
			else
			{
				throw new FileNotFoundException();
			}
	}
	public static Map<String,List<String>> getFileContents(File f)
	{
		Map<String,List<String>> dict = new HashMap<String,List<String>>();
		BufferedReader br = null;
		try {
			 br =new BufferedReader(new FileReader(f));
			 String line = br.readLine();
			 while(line!=null)
			 {
				 System.out.println(line);
				 String key=line.split("-")[0];
				 String meaning[] = (line.split("-")[1]).split(",");
				 List<String> val = new ArrayList<String>();

				 for(int i=0;i<meaning.length;i++)
				 {
					 val.add(meaning[i]);
				 }
				 dict.put(key, val);
				 System.out.println(dict);
				 
				 line=br.readLine();
			 }
			 br.close();
			 return dict;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dict;
	}
	public static void main(String[] args) {
		String localDir = System.getProperty("user.dir");
		//System.out.println(localDir);
		String path =localDir+ "/src/techfios_homework/Dictionary.txt";
		try
		{
			boolean fileExists = doesFileExist(path);
			if(fileExists)
			{
				Map<String,List<String>> dictionary = getFileContents(new File(path));
				for(Map.Entry<String,List<String>> entry:dictionary.entrySet())
				{
					System.out.println("Word:"+entry.getKey());
					for(int i=0;i<entry.getValue().size();i++)
					{
						System.out.format("Meaning #%d: %s",i,entry.getValue().get(i));
						System.out.println();
					}
				}
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	

}
