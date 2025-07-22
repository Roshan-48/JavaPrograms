package arrays;

public class EmployeeDB {
	private String user;
	private String pass;
	private boolean connect;
	
	private Employee[] db = new Employee[10];
	
	private int count = 0;
	private int index = 0;
	public EmployeeDB() {
		
	}
	public EmployeeDB(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
		System.out.println("DB Created");
	}
	
	public void login(String user, String pass) {
		if(this.user.equals(user) && this.pass.equals(pass)) {
			connect = true;
			System.out.println("Database Connected");
		}
		else {
			System.out.println("could not resolve the connect identifier specified");
		}
	}
	
	public boolean addEmployee(String name, int empid, int deptNo, int managerNo, String job, String hireDate, double sal, double comm) {
		if(connect && count<0.75*db.length) {
			db[index] = new Employee(name, empid, deptNo, managerNo, job, hireDate, sal, comm);
			count++;
			index++;
			System.out.println(name+" Employee Added!");
			return true;
		}
		else if(connect) {
			Employee[] temp = new Employee[db.length*2];
			for(int i=0; i<db.length; i++) {
				temp[i] = db[i];
			}
			db = temp;
			db[index] = new Employee(name,empid,deptNo,managerNo,job,hireDate,sal,comm);
			count++;
			index++;
			System.out.println(name+" Employee Added!");
			return true;
		}
		else {
			System.out.println("could not resolve the connect identifier specified");
			return false;
		}
	}
	
	public void showDB() {
		if(connect) {
			for(int i=0; i<count; i++) {
				System.out.println(db[i]);
			}
		}
		else {
			System.out.println("could not resolve the connect identifier specified");
		}
	}
	
	public void searchByJob(String job) {
		if(connect) {
			for(int i=0; i<count; i++) {
				if(db[i].job.equalsIgnoreCase(job)) {
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void searchByDeptNo(int deptno) {
		if(connect) {
			for(int i=0; i<count; i++) {
				if(db[i].deptNo == deptno) {
					System.out.println(db[i]);
				}
			}
		}
	}
	
	public void searchBySal(String operator, double sal) {
		if (connect) {
			switch (operator) {
				case "==":
					for (int i = 0; i < count; i++) {
						if (db[i].sal == sal) {
							System.out.println(db[i]);
						}
					}
					break;
				case ">":
					for (int i = 0; i < count; i++) {
						if (db[i].sal > sal) {
							System.out.println(db[i]);
						}
					}
					break;
				case "<":
					for (int i = 0; i < count; i++) {
						if (db[i].sal < sal) {
							System.out.println(db[i]);
						}
					}
					break;
				default:
					System.out.println("Invalid operator. Use ==, >, or <");
			}
		} 
		else {
			System.out.println("could not resolve the connect identifier specified");
		}
	}
	
	public void searchByManagerNo(int managerNo) {
		if (connect) {
			for (int i = 0; i < count; i++) {
				if (db[i].managerNo == managerNo) {
					System.out.println(db[i]);
				}
			}
		} else {
			System.out.println("could not resolve the connect identifier specified");
		}
	}
	
	public void searchWithoutManager() {
		if (connect) {
			for (int i = 0; i < count; i++) {
				if (db[i].managerNo == -1) {
					System.out.println(db[i]);
				}
			}
		} else {
			System.out.println("could not resolve the connect identifier specified");
		}
	}
	
	public void firstMaxSalary() {
		if (connect) {
			double max = db[0].sal;
			int index = 0;
			for (int i = 1; i < count; i++) {
				if (db[i].sal > max) {
					max = db[i].sal;
					index = i;
				}
			}
			System.out.println("First Max Salary Employee: " + db[index]);
		} else {
			System.out.println("Database empty or not connected");
		}
	}
	
	public void searchByCommission(String operator, double comm) {
		if (connect) {
			switch (operator) {
				case "==":
					for (int i = 0; i < count; i++) {
						if (db[i].comm == comm) {
							System.out.println(db[i]);
						}
					}
					break;
				case ">":
					for (int i = 0; i < count; i++) {
						if (db[i].comm > comm) {
							System.out.println(db[i]);
						}
					}
					break;
				case "<":
					for (int i = 0; i < count; i++) {
						if (db[i].comm < comm) {
							System.out.println(db[i]);
						}
					}
					break;
				default:
					System.out.println("Invalid operator. Use ==, >, or <");
			}
		} else {
			System.out.println("could not resolve the connect identifier specified");
		}
	}

}
