package file_manipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindLongestWord {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"//src//file_manipulation//LongestWord";
		Scanner sc;
		try 
		{
			sc = new Scanner(new File(path));
			int longWordLen=0;
			String word=""; String[] wordList=new String[100];
			int i=0;
			while(sc.hasNext())
			{
				String eachWord = sc.next();
				int wordLen = eachWord.length();
				if(wordLen>=longWordLen)
				{
					longWordLen=wordLen;
					word=eachWord;
				}
				else if(wordLen==longWordLen)
				{
					longWordLen=wordLen;
					wordList[i]=word;
					i++;
				}
			}
			if(wordList.length>0)
			{
				System.out.println("Longest words in the file...");
				for(int j=0;j<wordList.length && wordList[j]!=null;j++)
				{
					System.out.print(wordList[j]+" ");
				}
			}
			else
			{
				System.out.println("The longest word is: "+word);
			}
		} 
		catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		}
		
				
	}

}
