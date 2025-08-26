package collection;

public class LinkedListDriver {
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		l1.addVal(40);
		l1.addVal(50);
		l1.addVal(60);
		l1.addVal(30);
		l1.addVal(70);
		l1.addVal(80);
		
		l1.removeVal(80);
		
		l1.removeFirst();
		
		l1.removeLast();
		
		l1.addFirst(90);
		
		l1.addLast(100);
		
		Node head = l1.iterate();
		
		do {
			System.out.println(head.val);
			head = head.next();
		}while(head != null);
		
		System.out.println(l1.toString());
		
		System.out.println(l1.contains(70));
		
		
		 LinkedList l2 = new LinkedList();
	        l2.addVal(20);
	        l2.addVal(40);
	        
	        //l2.removeAll(l2);
	        
	       System.out.println( l2.retainAll(l2));
	        
	       //System.out.println( l2.addAll(l2));
	        
	       System.out.println(l2.containsAll(l2));
	        
	       //l1.clear();
	}
}
