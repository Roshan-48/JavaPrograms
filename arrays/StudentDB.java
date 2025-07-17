package arrays;

public class StudentDB {
	
	public static void main(String[] args) {
		Student[] db = new Student[5];
		
		db[0] = new Student("Raju","DY Patil",21,23423);
		db[1] = new Student("Rani","Modern College",20,24233);
		db[2] = new Student("Bhagyshri","Sapkal Knowledge Hub",22,4564565);
		db[3] = new Student("Aryan","JSPM",22,4333);
		db[4] = new Student("Shivraj","TKIET",22,45344);
		
		for(int i=0; i<db.length; i++) {
			System.out.println(db[i].name);
		}
	}
}
