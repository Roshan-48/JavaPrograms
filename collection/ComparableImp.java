package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableImp {
	public static void main(String[] args) {
		 
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		a.add(10);
		a.add(210);
		a.add(130);
		a.add(130);
		a.add(0);
		a.add(0);
		
		Collections.sort(a);
		System.out.println(a);
		
		System.err.println(Collections.binarySearch(a, 210));
		
		ArrayList<Integer> temp = new ArrayList<Integer>(a);
		
		System.out.println(temp);
		System.out.println(Collections.disjoint(a, temp));
		
		//Collections.fill(a, 100);
		
		System.out.println(Collections.frequency(a, 210));
		System.out.println(Collections.max(a));
		System.out.println(Collections.min(a));
		System.out.println(a);
		
		//List<Integer> temp2 = Collections.nCopies(10, -1);
		//System.out.println(temp2);
		
		Collections.replaceAll(a, 0, -1);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		
		Collections.rotate(a, 3);
		System.out.println(a);
		
		Collections.shuffle(a);
		System.out.println(a);
		
		Collections.swap(a, 3, 5);
		System.out.println(a);
		
	}
}
