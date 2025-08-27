package collection;

public class LinkedSetDriver {
	public static void main(String[] args) {
		
		LinkedSet l1 = new LinkedSet();
		
		l1.addVal(10);
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		l1.addVal(40);
		l1.addVal(10);
		
		System.out.println(l1);
	}
}

