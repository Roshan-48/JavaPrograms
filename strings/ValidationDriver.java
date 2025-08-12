package strings;
public class ValidationDriver {
	public static void main(String []args)
	{
		Account a1 = new Account("somethig", "9344565445", "some@gmail.com", "Pass@123");
		if(a1.getName()!=null)
			System.out.println(a1);
	}
}
