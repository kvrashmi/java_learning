package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;

public class ArrayList1 extends ArrayList<Integer> {
	
	public ArrayList<Integer> returnList()
	{
		List<Integer> n1=new ArrayList<Integer>();
		n1.add(10);
		n1.add(100);
		n1.add(1000);
		n1.add(10000);
		return (ArrayList<Integer>) n1;
	}
	
	public List<Integer> getList()
	{
		List<Integer> n1=new ArrayList<Integer>();
		n1.add(10);
		n1.add(100);
		n1.add(1000);
		n1.add(10000);
		return n1;
	}

	public static void main(String[] args) {
		
		// Creating list using the ArrayList class
		ArrayList<Integer> l1 = new ArrayList<Integer>(); 
		
		//Ensure Capacity - every time when a new element is added the size of the arraylist increases to 1.5 times 
		//larger than what it was before adding. By mentioning capacity, the arraylist would be capacity would be initialized
		//to the number given. After 
		l1.ensureCapacity(5);
		System.out.println("Size of l1  after ensure capacity:"+l1.size());
		System.out.println("Empty List L1: " + l1);
		l1.add(89);
		System.out.println("Size of l1 after adding just one element :"+l1.size());
		
		//// Add elements to the list
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		//Print 
		System.out.println("After adding elements: List L1: " + l1);
		
		//Get the size of l1 
		System.out.println("Size of L1 is: "+ l1.size()); 
		
		//Add an element at the end by using size:
		//l1.add(index,element)
		l1.add(l1.size(),6); //6,6
		
		//Print 
	    System.out.println("After adding element: List L1: " + l1);
	    
	    //Try to add an element beyond the size 
	    System.out.println("Adding element at size()+1 position :");
	    
	    try
	    {                           //l1.size() => 7 
	    						   // 0  1 2 3 4 5 6 7 8
		    l1.add(l1.size()+1,7); //[89,1,2,3,4,5,6   
	    }
	    catch(IndexOutOfBoundsException ex)
	    {
	    	//Print 
		    System.out.println("After adding element at size()+1 position: List L1: " + l1);
	    	System.out.println("Cannot add in a position that is beyond the size of the array..."+ex.getMessage());
	    }
	    finally
	    {
	    	l1.add(l1.size(),7);
			//Print 
		    System.out.println("After adding element at correct position: List L1: " + l1);
	    }
	    
		//Add all elements of another list to this list
        List<Integer> l2 = new ArrayList<>();
        l2.add(8);
		l2.add(9);
		l2.add(10);
		l2.add(11);
		l2.add(12);
		
		//Print 
		System.out.println("Another List L2: " + l2);
		
		//Add l2 to l1
		System.out.println("Adding L2 to L1:");
		l1.addAll(l2);
        
        //Print 
        System.out.println("After adding L2 to L1: " + l1);
        
        //size of L1:
        System.out.println("Size of L1:"+l1.size());
		
        //Adding element in an already existing index
        System.out.println("Adding element in an already exisiting index 2:");
        l1.add(2,100);
        System.out.println("After adding an element at index 2:"+l1);
        System.out.println("Size of the array now:"+l1.size());
        
        //Create another arraylist
        List<Integer> l3 = new ArrayList<>();
        l3.add(13);
		l3.add(14);
		l3.add(15);
		l3.add(16);
		l3.add(17);
		
		System.out.println("Adding all the elements of another array in a given position:");
		try
		{
			l1.addAll(4,l3);
			System.out.println("After adding l3 at position 4 of l1:"+l1);
		}
		catch(NullPointerException ex)
		{
			System.out.println("The specified collection is empty...:"+ex.getMessage());
			System.out.println("List cannot be added...");
			System.out.println("List l1:"+l1);
		}
		catch(IndexOutOfBoundsException ex)
		{
			//Print 
	    	System.out.println("Cannot add in a position that is beyond the size of the array..."+ex.getMessage());
	    	l1.addAll(l1.size(),l3);
			System.out.println("After adding l3 at last position of l1:"+l1);
		}
		finally
		{
			System.out.println("Size of l1:"+l1.size());
		}
		
		//Clear elements in an arraylist
		System.out.println("Clear all the elements from l3:");
		l3.clear();
		System.out.println("List l3 after clear():"+l3);
		
		//Clone - makes shallow copy of the arraylist - make a copy of arraylist object
		System.out.println("Creating a clone of l1:");
		ArrayList<Integer> cloneL1 = (ArrayList<Integer>)l1.clone();
		System.out.println("List CloneL1:"+cloneL1);
		
		//Make a change in the clone:
		System.out.println("Making change in the clone doesn't change the original...");
		cloneL1.set(2, 18);
		System.out.println("Printing updated clone:"+cloneL1);
		System.out.println("Printing original:"+l1);
		
		//Contains
		System.out.println("Checking if cloneL1 and l1 contains element 100:");
		if(cloneL1.contains(100))
		{	
			System.out.println("CloneL1 contains 100...");
		}
		else if(l1.contains(100))
		{
			System.out.println("l1 contains 100...");
		}
		else
		{
			System.out.println("100 is not available in both L1 and CloneL1");
		}
		
		//Access element from the list
        int number1 = l1.get(2);
        System.out.println("Accessed Element at index 2: " + number1);
        
        //Get the position or first occurance of an element using indexOf
        int number2=l1.indexOf(100);
        System.out.println("The position of element 10:"+number2);
        
        //Get the position or first occurance of an element using indexOf
        int number3=l1.lastIndexOf(12);
        System.out.println("The position of element 12:"+number3);
        
        //Remove an element 
        System.out.println("Remove element 11 from cloneL1:"+cloneL1.remove(11));
        System.out.println("After removing element 11 from cloneL1:"+cloneL1);
        System.out.println("Remove element from a given index:"+cloneL1.remove(1));
        System.out.println("After removing element at a given index 1 from cloneL1:"+cloneL1);

        
        //Remove all 
        System.out.println("Remove another collection:"+l1.removeAll(l2));
        System.out.println("After removing l2:"+l2);
        //Create a string arrayList
        ArrayList<String> st1=new ArrayList<>();
        st1.add("Java");
        st1.add("C++");
        st1.add("C");
        st1.add("Python");
        try
        {
        	 System.out.println("String collection:"+st1);
        	 System.out.println("Remove another collection:"+l1.removeAll(st1));
        }
        catch(Exception e)
        {
        	System.out.println("Could not remove collection of one type from another type..."+e.getMessage());
        }
        finally
        {
       	 System.out.println("Remove from same collection:");
       	 st1.removeAll(st1);
         System.out.println("Checking if st1 is removed: "+st1.isEmpty());	
        }
        
        System.out.println("SubList from 0-3: " + cloneL1.subList(0, 3));
        System.out.println("SubList from 3-end: " + cloneL1.subList(3, cloneL1.size()));
        
        System.out.println("Sorting cloneL1 in Ascending Order:");
        cloneL1.sort(Comparator.naturalOrder());
        System.out.println("Sorted cloneL1 in Ascending Order:"+cloneL1);
        
        System.out.println("Sorting cloneL1 in Descending Order:");
        cloneL1.sort(Comparator.reverseOrder());
        System.out.println("Sorted cloneL1 in Descending Order:"+cloneL1);
        
        //toArray
        Integer[] l4=new Integer[cloneL1.size()];
        cloneL1.toArray(l4);
        System.out.println("Converted cloneL1-ArrayList to l4-Array:");
        for(Integer item:l4)
        {
        	System.out.print(item+",");
        }
        
        System.out.println("Converted cloneL1-ArrayList to ArrayOfObjects:");
        Object[] ob1=cloneL1.toArray();
        for(Object ob:ob1)
        {
        	System.out.print(ob+",");
        }
        
        //toString
        System.out.println("Converting l1 to String:");
        String s1=l1.toString();
        System.out.println(s1);
        
        //RetainAll
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        l2.retainAll(primeNumbers);
        System.out.println("PM:"+primeNumbers);
        System.out.println("After retain all l2:"+l2);
        
        //containsAll
        System.out.println("L1:"+l1);
        System.out.println("L2:"+l2);
        System.out.println("Check l1 containsAll l2:"+l1.containsAll(l2));
        System.out.println("Check l2 containsAll primeNumbers:"+l2.containsAll(primeNumbers));
        
        //trimToSize
        l1.trimToSize();
        System.out.println("AfterTrimToSize:"+l1.size());
        l1.add(18);
        System.out.println("AfterTrimToSize:"+l1.size());
        
        //removeRange
        ArrayList1 arraylist = new ArrayList1();
        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(50);
        System.out.println("ArrayList: " + arraylist);

        // remove elements between 1 to 3
        arraylist.removeRange(1, 3);
        System.out.println("Updated ArrayList RemoveRange: " + arraylist);
        
        //ArrayList - sublist,clear
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        System.out.println("ArrayList: " + numbers);

        // remove element between 1 to 3
        numbers.subList(1, 3).clear();
        System.out.println("Updated ArrayList - Sublist-Clear: " + numbers);
        
        //replaceAll
        numbers.replaceAll(e -> e * 10);
        System.out.println("Updated ArrayList - ReplaceAll: " + numbers);
        
        //removeIf
        numbers.removeIf(e->(e%4)==0);
        System.out.println("Updated ArrayList - RemoveIf:"+numbers);
        
        //foreach
        System.out.println("Updated ArrayList - foreach:");
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.forEach((e)->{
        	e=e*10;
            System.out.println(e +" ");
        	});
        
        //iterator
        Iterator<Integer> it1 = numbers.iterator();
        while(it1.hasNext())
        {
        	int element=it1.next();
        	System.out.print(element+"=>"+numbers.indexOf(element));
        	if(it1.hasNext())
        	{
        		System.out.print(", ");
        	}

        }
        
        System.out.println();
        //Return ArrayList
        ArrayList1 al2=new ArrayList1();
        List<Integer> ll1=al2.returnList();
        System.out.println("LL1:"+ll1);
        
	}

}
