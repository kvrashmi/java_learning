package java_io;
import java.io.*;
public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
  
        try 
        {
            sourceStream = new FileInputStream("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//source.txt");
            targetStream = new FileOutputStream ("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//midi.txt");
  
            // Reading source file using read method 
            // and write to file byte by byte using write method
            int temp;
            while ((temp = sourceStream.read()) != -1)
            	System.out.println((int)temp + "=> "+(char)temp+ " ");
                targetStream.write((byte)temp);            
        }
        finally 
        {
            if (sourceStream != null){
                sourceStream.close();   
            }
            if (targetStream != null){           
                targetStream.close(); 
            }
        }
	}

}
