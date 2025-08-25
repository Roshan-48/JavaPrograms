package collection;

public class Node {
	Object val;
	Node preRef;
	Node nextRef;
	Node currRef;
	
	private Node() {
		
	}
	
	public Node(Object o) {
		val = o;
		currRef = this;
	}
	
	public Node next() {
		return nextRef;
	}
	
	public Node previous() {
		return preRef;
	}
	
	public boolean hasNext() {
		return nextRef != null;
	}
	
	public boolean hasPrevious() {
		return preRef != null;
	}
}
