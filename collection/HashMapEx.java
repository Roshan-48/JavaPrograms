package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		
		h1.put(45, "Rohit");
		h1.put(4, "Dhoni");
		h1.put(10, "Sachin");
		h1.put(18, "Virat");
		h1.put(33, "Hardik");
		h1.put(17, "ABD");
		h1.put(93, "Bumrah");
		h1.put(17, "Pant");
		
		System.out.println(h1);
		
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		System.out.println(h1.entrySet());
		
		Set<Integer> s = h1.keySet();
		
		for(Integer i : s) {
			System.out.println(h1.get(i));
		}
		
		Set<Map.Entry<Integer, String>> s2 = h1.entrySet();
		
		for(Map.Entry<Integer, String> var:s2) {
			System.out.println(var);
		}
	}
}
