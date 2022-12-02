package collections;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new CustomComparator());
		pq.add(10);
		pq.add(12);
		pq.add(8);
		System.out.println("PQ:"+pq); //Stored and retrieved in sorted orders
		
		pq.offer(11);
		pq.offer(9);
		System.out.println("PQ:"+pq); //Stored and retrieved in sorted orders
		
		System.out.println("Access PQ elements:"+pq.peek());
		
		System.out.println("Remove element 2:"+pq.remove(2));
		
		System.out.println("Remove element:"+pq.poll());
		
		System.out.println("PQ:"+pq);
		
		Iterator<Integer> iterator = pq.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Printed through iterator:"+iterator.next());
		}

		System.out.println("Check if pq contains 9:"+pq.contains(9));
		
		System.out.println("Size of pq:"+pq.size());
		
	     Object[] a = pq.toArray();
	     
	     for (int i=0;i<a.length;i++)
	     {
	    	 System.out.println("To Array:"+a[i]);
	     }
		
		
	}

}
