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
		l1.addVal(70);
		l1.addVal(80);
		
		//l1.removeVal(80);
		
		//l1.removeFirst();
		
		//l1.removeLast();
		
		//l1.addFirst(90);        
		
		//l1.addLast(100);
		
		//System.out.println(l1.toString());
		
		//System.out.println(l1.contains(50));
		
		
		 LinkedList l2 = new LinkedList();
	        
		 	l2.addVal(10);
		 	l2.addVal(20);
	        l2.addVal(40);
	        l2.addVal(60);
	        
	       
	      //System.out.println(l1.addAll(l2));
	      
	      //System.out.println(l1.containsAll(l2));
	        
	      //l1.removeAll(l2);
	        
	      //System.out.println(l1.retainAll(l2));
	        
	      //l1.clear();
	      
	      //System.out.println(l1);
	      
	        Node ref = l1.reverseIterate();

	        StringBuilder sb = new StringBuilder();
	        sb.append("[");

	        while (ref != null) {
	            sb.append(ref.val);
	            ref = ref.previous();
	            if (ref != null) {
	                sb.append(", ");   
	            }
	        }

	        sb.append("]");
	        System.out.println(sb.toString());
	}
}
