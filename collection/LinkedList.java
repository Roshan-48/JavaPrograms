package collection;

public class LinkedList {
	Node head;
	Node prior;
	Node lastNodeRef;
	
	int size;
	
	public LinkedList() {
		
	}
	
	public boolean addVal(Object val) {
		if(head == null) {
			head = new Node(val);
			prior = head;
			
			size++;
		}
		else {
			Node temp = new Node(val);
			prior.nextRef = temp;
			temp.preRef = prior;
			prior = temp;
		}
		return true;
	}
	
	public Node iterate() {
		return head;
	}
	
	public int size() {
		return size;
	}
	
	public boolean contains(Object val) {
		return containsVal(val) != null;
	}
	
	private Node containsVal(Object val) {
		Node head = iterate();
		
		while(head != null) {
			if(((Integer)val).equals(((Integer)head.val))) {
				return head;
			}
			head = head.next();
		}
		return null;
	}
	
	@SuppressWarnings("unused")
	public boolean removeVal(Object val) {
		Node ref = containsVal(val);
		
		if(ref.nextRef==null) {
			prior = ref.preRef;
			prior.nextRef = null;
			
			size--;
			return true;
		}
		else if(ref.preRef==null) {
			head = ref.nextRef;
			head.preRef = null;
			
			size--;
			return true;
		}
		else if(ref != null) {
			ref.nextRef.preRef = ref.preRef;
			ref.preRef.nextRef = ref.nextRef;
			size--;
			return true;
		}
		return false;
	}
	
	public boolean removeFirst() {
		if(head != null) {
			head = head.nextRef;
			head.preRef = null;
			
			size--;
			return true;
		}
		return false;
	}
	
	public boolean removeLast() {
		if(prior != null) {
			prior = prior.preRef;
			prior.nextRef = null;
			size--;
			return true;
		}
		return false;
	}
	
	public boolean addFirst(Object val) {
		Node temp = new Node(val);
    	if (head == null) {
        	head = temp;
        	prior = temp;
    	} 
    	else {
        	temp.nextRef = head;
        	head.preRef = temp;
        	head = temp;
    	}
    	size++;
    	return true;
	}
	
	public boolean addLast(Object val) {
		return addVal(val);
	}
	
	public boolean removeAll(LinkedList ref) {
		 boolean modified = false;
		 Node current = ref.head;
		 while (current != null) {
		      if (removeVal(current.val)) modified = true;
		      current = current.next();
		 }
		 return modified;
	}
	
	public boolean retainAll(LinkedList ref) {
		boolean modified = false;
	    Node current = head;
	    while (current != null) {
	        Node next = current.next(); 
	        if (!ref.contains(current.val)) {
	            removeVal(current.val);
	            modified = true;
	        }
	        current = next;
	    }
	    return modified;
	}
	
	public boolean addAll(LinkedList ref) {
		 Node current = ref.head;
		    while (current != null) {
		        addVal(current.val);
		        current = current.next();
		    }
		    return true;
	}
	
	public void clear() {
		 head = null;
		 prior = null;
		 size = 0;
	}
	
	public boolean containsAll(LinkedList ref) {
		 Node current = ref.head;
		    while (current != null) {
		        if (!contains(current.val)) return false;
		        current = current.next();
		    }
		    return true;
	}
	
	public String toString() {
		if(head != null) {
			Node head = iterate();
			StringBuilder sb = new StringBuilder();
			
			sb = sb.append("[");
			
			do {
				sb = sb.append(" "+head.val).append(",");
				head = head.next();
			}while(head != null);
			
			sb = sb.deleteCharAt(sb.length()-1);
			sb = sb.append("]");
			
			return new String(sb);
		}
		return "[]";
	}
}
