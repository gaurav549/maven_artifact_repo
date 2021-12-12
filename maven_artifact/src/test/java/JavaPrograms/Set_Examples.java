package JavaPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Examples {
	
	public static void main(String args[]) {
		
		Set_Examples se = new Set_Examples();
		se.Hashset();
		se.LinkedHasshet();
		se.TreeHasshet();
		
	}

	public void Hashset() {
		HashSet<String> hs = new HashSet<>();
		hs.add("Gaurav");
		hs.add("Pranav");
		hs.add("Pradeepta");
		hs.add("Jyoti");
		hs.add("Gaurav");
		hs.add(null);
		Iterator it = hs.iterator();
		System.out.println("\n Hash Set Output : \n");
		while (it.hasNext()) {
			System.out.println(it.next());


		}
	}

	public void LinkedHasshet() {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Gaurav");
		lhs.add("Pranav");
		lhs.add("Pradeepta");
		lhs.add("Jyoti");
		lhs.add("Gaurav");
		lhs.add(null);
		Iterator it = lhs.iterator();
		System.out.println("\n Linked Hash Set Output : \n");
		while (it.hasNext()) {
			System.out.println(it.next());


		}
	}
	
	public void TreeHasshet() {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Gaurav");
		ts.add("Pranav");
		ts.add("Pradeepta");
		ts.add("Jyoti");
		ts.add("Gaurav");
	
		Iterator it = ts.iterator();
		System.out.println("\n Tree Set Output  :\n");
		while (it.hasNext()) {
			System.out.println(it.next());


		}
	}

}
