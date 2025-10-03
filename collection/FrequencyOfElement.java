package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FrequencyOfElement {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(23);
		al.add(233);
		al.add(243);
		al.add(23);
		al.add(3);
		al.add(2);
		
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		
		for(Integer integer : al) {
			if(!freq.containsKey(integer)) {
				Integer fr = Collections.frequency(al, integer);
				freq.put(integer, fr);
			}
		}
		System.out.println(freq);
	}
}
