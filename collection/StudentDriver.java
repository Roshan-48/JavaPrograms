package collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(new Student("Raju",13,56.56));
		a1.add(new Student("Kaju",32,88));
		a1.add(new Student("Sanju",42,59.32));
		a1.add(new Student("Ganu",32,77.55));
		a1.add(new Student("Monu",64,98.5));
		a1.add(new Student("Ramesh",36,54.9));
		a1.add(new Student("Zameer",23,74.5));
		
		Collections.sort(a1);
		System.out.println(a1);
	}
}
