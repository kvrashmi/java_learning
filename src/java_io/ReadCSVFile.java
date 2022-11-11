package java_io;

import java.io.*;
import java.util.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReadCSVFile {
	
	public int empId;
	public String firstName;
	public String lastName;
	public String dob;
	public String address;
	public int phNo;
	
	

	public static String path="//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//emp_details.csv";
	
	public static void readCSVFileUsingScanner(String path)
	{
		ArrayList<String> headers = new ArrayList<String>();
		
		File f = new File(path);
		Scanner sc = null;
		try {
			sc = new Scanner(f);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		int i=0;
		while(sc.hasNext())
		{
			
			String line = sc.next(); //EmpId,FirstName,LastName,DOB,Address,PhoneNumber
			//System.out.println(line);
			String arr[] = line.split(",",0);
			if(i==0)
			{
				for(int j=0;j<arr.length;j++)
				{
					headers.add(j, arr[j]);
				}
				i++;
			}
			else
			{
				int j=0;
				while(j<arr.length)
				{
					System.out.println(headers.get(j)+"=>"+arr[j]);
					j++;
				}
			}
		}
		sc.close();
	}
	
	public static void readCSVFileUsingOpenCSV(String path)
	{
		CSVReader reader = null;  
		try  
		{  
			ArrayList<Map> al =new ArrayList<Map>(); 
			Map<Integer,ReadCSVFile> mpOb = new HashMap<>();
			//parsing a CSV file into CSVReader class constructor
			reader = new CSVReaderBuilder(new FileReader(path)).build();
			String[] nextLine;  
			//reads one line at a time 
			boolean flag=true;
			while ((nextLine = reader.readNext()) != null)  
			{  
				if(!flag)
				{
					int lenOfAllTokens = nextLine.length;
					int i=0;
					while(i<lenOfAllTokens)
					{
						ReadCSVFile rv= new ReadCSVFile();
						rv.empId=Integer.parseInt(nextLine[i++]);
						rv.firstName=nextLine[i++];
						rv.lastName=nextLine[i++];
						rv.dob=nextLine[i++];
						rv.address=nextLine[i++];
						rv.phNo=Integer.parseInt(nextLine[i++]);
						mpOb.put(rv.empId, rv);
						flag=false;
					}
				}
				flag=false;
			} 
			
		}  
		catch (Exception e)   
		{  
			e.printStackTrace();  
		}  
	}
	
	public static void readCSVUsingReader(String path)
	{
		try
		{
			ArrayList<String> al1 = new ArrayList<String>();
			ArrayList<String> al2 = new ArrayList<String>();
			File fObj = new File(path);
			FileReader fr = new FileReader(fObj);
			BufferedReader br = new BufferedReader(fr);
			String line=br.readLine();
			boolean flag=true;
			while(line!=null)
			{
				String[] arr= line.split(",",0);
				if(flag==true)
				{
					int j=0;
					while(j<arr.length)
					{
						al1.add(j,arr[j]);
						j++;
					}
					flag=false;
				}
				else if(flag==false)
				{
					int j=0;
					while(j<arr.length)
					{
						al2.add(j,arr[j]);
						j++;
					}
				}
				line=br.readLine();
			}
			
			//System.out.println(al1);
			//System.out.println(al2);

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		//ReadCSVFile.readCSVFileUsingScanner(ReadCSVFile.path);
		//ReadCSVFile.readCSVUsingReader(ReadCSVFile.path);
		ReadCSVFile.readCSVFileUsingOpenCSV(ReadCSVFile.path);
	}

}
