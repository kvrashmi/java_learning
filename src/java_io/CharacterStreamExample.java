package java_io;
import java.io.*;
public class CharacterStreamExample {

	public static void main(String[] args) throws IOException {
		FileReader in = null;
	      FileWriter out = null;

	       // Reading source file using read method 
	        // and write to file using write method
	      try {
	         in = new FileReader("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//source.txt");
	         out = new FileWriter("//Users//rashmikanduluvavikraman//eclipse-workspace//JavaLearning//src//java_io//dest.txt");
	         int c;
	         while ((c = in.read()) != -1) {
	            //out.write((int)c);
	        	 System.out.println((int)c + "=> "+(char)c+ " ");
	                out.write((char)c);  
	         }
	      }
	       finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	}

}
