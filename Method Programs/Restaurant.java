import java.util.*;
class Restaurant 
{
	static String name;
	static long contact;
	static String address;
	static ArrayList<String> basket = new ArrayList<>();

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		{
			System.out.println();
			System.out.println("	JAVA KA DHABA");
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2. Existing User");
			System.out.println();
			System.out.print("Enter an option: ");
			int opt = sc.nextInt();
			System.out.println();
			switch(opt)
			{
				case 1 : createAccount(sc);break;
				case 2 : login(sc); break;
				default : System.out.println("INVALID INPUT");
					break;
			}
		}
	}
	public static void createAccount(Scanner sc){
		System.out.println("	REGISTRATION");
		System.out.println();
		System.out.print("Name : ");
		name = sc.next();
		System.out.print("Phone : ");
		contact = sc.nextLong();
		System.out.print("Address : ");
		sc.nextLine();
		address = sc.nextLine();
		System.out.println();
		System.out.println("Account Created Successfully");
	}
	public static void login(Scanner sc){
		if (name == null)
		{
			System.out.println("Create Your Account First");
			return;
		}
		System.out.println("	LOGIN");
		System.out.println();

		for (int attempt = 3;attempt>=1; attempt--)
		{
			System.out.print("Username : ");
			String username = sc.next();
			System.out.print("Password: ");
			Long phone = sc.nextLong();
			System.out.println();
			if(name.equals(username) && contact == phone)
				homePage(sc);
			else{
				System.out.println("Invalid Cred");
				System.out.println("Attempt Left : "+(attempt-1));
				System.out.println();
			}
		}
		System.out.println("Thank uhh & Never Visit Again");
		System.exit(0);
	}
	public static void homePage(Scanner sc){
		for(; ; )
		{
			System.out.println();
			System.out.println("	HOME PAGE");
			System.out.println();
			System.out.println("1. Menu ");
			System.out.println("2. Order ");
			System.out.println("3. Table Booking ");
			System.out.println("4. Logout ");
			System.out.println();
			System.out.print("Enter an option: ");
			int opt = sc.nextInt();

			switch(opt){
				case 1: menu(sc); break;
				case 2: order(sc); break;
				case 3: tableBooking(); break;
				case 4: System.out.println("Thank Uhh & Visit Again");
						System.exit(0);break;
				default : System.out.println("Invalid Input");break;
			}
		}
	}
	public static void menu(Scanner sc){
		for (; ; )
		{
			System.out.println("	Menu");
			System.out.println("101 : Butter_Chiken = 450/-");
			System.out.println("102 : Chicken_Biryani = 400/-");
			System.out.println("103 : Shahi_Paneer = 350/-");
			System.out.println("104 : Mix_veg = 450/-");
			System.out.println("105 : Roti = 35/-");
			System.out.println("106 : Exit Menu");
			System.out.println();
			System.out.print("Enter an food Id : ");
			int id = sc.nextInt();
			switch(id){
				case 101:{
					basket.add("101 : Butter_Chicken = 450");
					System.out.println("Butter Chicken added inside basket ");
					break;
				}
				case 102:{
					basket.add("102 : Biryani_Chiken = 400");
					System.out.println("Chicken Biryani added inside basket ");
					break;
				}
				case 103:{
					basket.add("103 : Shahi_Paneer = 350");
					System.out.println("Shahi Paneer added inside basket ");
					break;
				}
				case 104:{
					basket.add("104 : Mix_veg = 450");
					System.out.println("Mix Veg added inside basket ");
					break;
				}
				case 105:{
					basket.add("105 : Roti = 35");
					System.out.println("Roti added inside basket ");
					break;
				}
				case 106:{
					return;
				}
				default:{
					System.out.println("Invalid Food Id");
					break;
				}
			}
		}
	}
	public static void order(Scanner sc){
		System.out.println();
		System.out.println("	ORDERS ");
		System.out.println();
		if(basket.size()==0)
			System.out.println("Basket is empty add food Items");
		for(String foodItem : basket){
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("1. Cancel Order");
		System.out.println("2. Remove Food Item");
		System.out.println("3. Proceed to payment");
		System.out.println();
		System.out.print("Enter the option: ");
		int opt = sc.nextInt();
		switch(opt){
			case 1:{
				System.out.println("Order Cancelled");
				basket.clear();
				break;
			}
			case 2:{
				System.out.println("Enter foodId");
				int foodId = sc.nextInt();
				removeFoodId(foodId);
				break;
			}
			case 3:{
				billGenerate();
				break;
			}
		}
	}
	public static void removeFoodId(int foodId) {
    Iterator<String> iterator = basket.iterator();
    boolean flag = false;

    while (iterator.hasNext()) {
        String foodItem = iterator.next();
        String[] arr = foodItem.split(" ");
        if (arr[0].equals(String.valueOf(foodId))) {
            iterator.remove(); 
            flag = true;
            System.out.println("Food Item Removed");
            break;  
        }
    }
    if (!flag) {
        System.out.println("Food Item Doesn't Exist in Basket");
    }
}

	public static void tableBooking(){
		System.out.println();
		System.out.println("	Table Booking");
		System.out.println();
	}
	public static void billGenerate(){
		double totalBill = 0;
		for(String foodItem : basket){
			String [] arr = foodItem.split(" ");
			totalBill += Double.parseDouble(arr[4]);
		}
		System.out.println("Total Bill : "+totalBill+"rs.");
	}
}
