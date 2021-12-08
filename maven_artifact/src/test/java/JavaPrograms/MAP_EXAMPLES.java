package JavaPrograms;
import java.util.*;  

public class MAP_EXAMPLES {
	
	public static void main (String args[]) {
		
		MAP_EXAMPLES me = new MAP_EXAMPLES();
		me.HashMap();
		me.LinkedHashMap();
		me.TreeHashMap();
	}
	
	public void HashMap() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("\n");
		hm.put( 1, "Apple \n");
		hm.put(2, "Orange \n");
		hm.put(3, "Banana \n");
		hm.put(1, "Grapes \n");
		hm.put(null, null);
		for (int i=1; i<=hm.size(); i++)
		{
		System.out.println(hm.get(hm) + hm.get(i));

			
			
		}
	}
		
	
	public void LinkedHashMap() {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		System.out.println("\n");
		lhm.put( 1, "Apple \n");
		lhm.put(2, "Orange \n");
		lhm.put(3, "Banana \n");
		lhm.put(1, "Grapes \n");
		lhm.put(null, null);
		System.out.println("LinkedHashMap:" + lhm);
		
	}
	
	public void TreeHashMap() {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		System.out.println("\n");
		tm.put( 1, "Apple \n");
		tm.put(2, "Orange \n");
		tm.put(3, "Banana \n");
		tm.put(1, "Grapes \n");
		System.out.println("TreeHashMap:" +tm);
		
	}


}
