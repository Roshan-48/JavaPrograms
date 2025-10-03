package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(3);
		al.add(3);
		al.add(13);
		al.add(32);
		al.add(32);
		al.add(132);
		al.add(132);
		
		System.out.println(al);
		
		HashSet<Integer> hs = new HashSet<Integer>(al);
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
		System.out.println(lhs);
		
		TreeSet<Integer> ts = new TreeSet<Integer>(al);
		System.out.println(ts);
	}
}
