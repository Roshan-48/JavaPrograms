package collection;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		
		p.add(29);
		p.add(129);
		p.add(239);
		p.add(296);
		p.add(294);
		p.add(239);
		p.add(2);
		
		System.out.println(p);
		
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		
		//System.out.println(p.remove());
		
	}
}
