package collection;

import java.util.TreeSet;

public class Marker implements Comparable<Marker> {
	static int markerId = 234;
	static String brand = "DOMS";
	String color;
	double price;
	int id;
	
	{
		this.id = markerId++;
	}

	public Marker(String color, double price) {
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return id +": "+color +" , Price : "+price;
	}
	
//	public int comareTo(Marker obj) {
//		if(this.price<obj.price) {
//			return -1;
//		}
//		else if(this.price > obj.price) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
//	}
	
	public int compareTo(Marker obj) {
		return (int)(obj.price - this.price);
	}
	
//	public int compareTo(Marker obj) {
//		return obj.color.compareTo(this.color);
//	}
}


class MarkerDriver{
	public static void main(String[] args) {
		TreeSet<Marker> set = new TreeSet<>();
		
		set.add(new Marker("Red", 20));
		set.add(new Marker("Black", 19));
		set.add(new Marker("Blue", 30));
		set.add(new Marker("Yellow", 15));
		
		for(Marker ele : set) {
			System.out.println(ele);
		}
		
	}
}
