package maps;
import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer,Book> hmBook = new HashMap<Integer,Book>();
		HashMap<Integer,Book> anotherHmBook = new HashMap<Integer,Book>();
		
		//Add Elements to HashMap
		//put(),putAll(),putIfAbsent()
		hmBook.put(1000, new Book(1,"Let Us C"));
		hmBook.put(1001, new Book(2,"Let Us C++"));
		hmBook.put(1002, new Book(3,"Let Us Java"));
		hmBook.put(1003, new Book(4,"Let Us Python"));
		hmBook.put(1004, new Book(5,"Let Us PHP"));
		
		//Print elements of a HashMap
		System.out.println("Contents of a hmBook:"+hmBook);
		
		//Add Elements of one hashmap into another hashmap
		anotherHmBook.put(1005, new Book(6,"Let Us Javascript"));
		anotherHmBook.put(1006, new Book(7,"Let Us JQuery"));
		anotherHmBook.put(1007, new Book(8,"Let Us Angular Js"));
		anotherHmBook.put(1008, new Book(9,"Let Us React "));
		anotherHmBook.put(1009, new Book(10,"Let Us MySQL"));
		
		//Print elements of a HashMap
		System.out.println("Contents of a anotherHmBook:"+anotherHmBook);
		
		hmBook.putAll(anotherHmBook);
	
		//Print elements of a HashMap
		System.out.println("Contents of a HashMap:"+hmBook);
		
		//Add elements of one hashmap into another hashmap only if absent
		hmBook.putIfAbsent(1009,new Book(10,"Let Us MySQL"));
		
		//Print elements of a HashMap
		System.out.println("Contents of a HashMap:"+hmBook);
		
		//2.Access Elements from a HashMap
		//get(),getOrDefault(),keySet(),values(),entrySet()
		System.out.println("Get first entry:"+hmBook.get(1000));
		System.out.println("Get an entry or give default:"+hmBook.getOrDefault(1010, new Book(1,"Let us C")));
	    System.out.println("Get all the keySet:"+hmBook.keySet());
	    System.out.println("Get all the values:"+hmBook.values());
	    System.out.println("Get all the entrySet:"+hmBook.entrySet());
	    
	    //3.Change HashMap value
	    //replace(),replaceAll()
	    hmBook.replace(1000, new Book(1,"Let Us Basic"));
	    //Print elements of a HashMap
	  	System.out.println("Contents of a HashMap:"+hmBook);
	  	hmBook.replace(1001,hmBook.get(1001),new Book(2,"Let Us Fortran"));
	    //Print elements of a HashMap
	  	System.out.println("Contents of a HashMap:"+hmBook);   
	  	//hmBook.replaceAll((key,obj)->obj.bookId==10?obj.bookName="SQL":obj.bookName="MySQL");
	  	hmBook.replaceAll((key,obj)->{
	  		if(obj.bookId==10)
	  		obj.bookName = "SQL";
	  		else
	  		obj.bookName="MySQL";
	  		return obj;
	  	});
	    //Print elements of a HashMap
	  	System.out.println("Contents of a HashMap:"+hmBook); 
	  	
	  	//4.Remove
	  	//remove()
	  	hmBook.remove(1009);
	  	//Print elements of a HashMap
	  	System.out.println("Contents of a HashMap after remove(key):"+hmBook); 
	  	hmBook.remove(1008,hmBook.get(1008));
	    //Print elements of a HashMap
	  	System.out.println("Contents of a HashMap after remove(Object key, Object Val):"+hmBook); 
	  	
	  	//
	}
	
	

	
}
