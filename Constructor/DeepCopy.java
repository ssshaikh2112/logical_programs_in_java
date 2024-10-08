class Address
{
	String street;
	String landmark;
	int pincode;
	Address(String street , String landmark, int pincode)
	{
		this.street =street;
		this.landmark=landmark;
		this.pincode=pincode;
	}
	void displayAddress()
	{
		System.out.println("Address Details : ");
		System.out.println("Strret : "+street);
		System.out.println("landmark : "+landmark);
		System.out.println("pincode : "+pincode);
	}
	Address(Address exixting)
	{
		this.street=exixting.street;
		this.landmark=exixting.landmark;
		this.pincode=exixting.pincode;
	}
}


class User
{
	String userName;
	String password;
	Address address;
	User(String userName , String password , String street , String landmark , int pincode)
	{
		this.userName=userName;
		this.password=password;
		this.address=exixting.address;	//shallow
		this.address=new Address(street , landmark , pincode); //deep  

	}

	User(User exixting)
	{
		this.userName=exixting.userName;	// data is copied
		this.password=exixting.password;	// data is copied
		this.address=exixting.address;
	}

	void displayUser()
	{
		System.out.println("USer Details : ");
		System.out.println("User : "+userName);
		System.out.println("password : "+password);
	}
}

class DeepCopy
{
	public static void main(String[] args) 
	{
		User exixting=new User("Jonas", "jonas123" , "Madock","in front of Caves" , 232123);
		exixting.displayUser();
		exixting.address.displayAddress();

		System.out.println();

		User copy=new User(exixting);
		copy.displayUser();
		copy.address.displayAddress();

		copy.address.landmark="Something";
		copy.address.displayAddress();
		System.out.println();

		System.out.println("exixting obj");
		exixting.address.displayAddress();

		copy.userName="Martha";
		copy.displayUser();
		exixting.displayUser();

	}
}