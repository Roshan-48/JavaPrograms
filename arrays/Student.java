package arrays;

public class Student {
	String name;
	String coll;
	int age;
	int id;
	
	public Student() {
		
	}

	public Student(String name, String coll, int age, int id) {
		super();
		this.name = name;
		this.coll = coll;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", coll=" + coll + ", age=" + age + ", id=" + id + "]";
	}
	
}
