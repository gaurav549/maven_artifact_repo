package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List_Examples {
	
	public static void main (String args[]) {
		
		List_Examples le= new List_Examples();
		
		le.Array_List();
		le.Linked_List();
		
	}
	
	public void Array_List ( ) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Gaurav");
		al.add("Pranav");
		al.add("Pradeepta");
		al.add("Jyoti");
		al.add("Gaurav");
		Iterator it = al.iterator();
		System.out.println("Array List Output :");
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
	
	
	public void Linked_List ( ) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Gaurav");
		ll.add("Pranav");
		ll.add("Pradeepta");
		ll.add("Jyoti");
		ll.add("Gaurav");
		Iterator it =  ll.iterator ();
		System.out.println("Linked List Output :");
		while (it.hasNext()) {
	
			System.out.println(it.next());
			
		}
		
		
	}

}
