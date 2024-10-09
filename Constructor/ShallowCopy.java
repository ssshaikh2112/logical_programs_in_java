class Address
{
	String street;
	String landmark;		// something
	int pincode;
	Address(String street , String landmark, int pincode)
	{
		this.street =street;
		this.landmark=landmark;
		this.pincode=pincode;
	}
	void displayAddress()
	{
		System.out.println("");
		System.out.println("Strret : "+street);
		System.out.println("landmark : "+landmark);
		System.out.println("pincode : "+pincode);
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
		this.address=new Address(street , landmark , pincode);

	}

	User(User exixting)		//User(exixting)
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

class ShallowCopy
{
	public static void main(String[] args) 
	{



		User exixting=new User("Jonas", "jonas123" , "Madock","in front of Caves" , 232123);
		exixting.displayUser();
		exixting.address.displayAddress();
		System.out.println("============");
		User copy=new User(exixting);
		copy.displayUser();
		copy.address.displayAddress();
		System.out.println("============");
		copy.address.landmark="Something";
		copy.displayUser();
		copy.address.displayAddress();
		System.out.println();
		System.out.println("============");
		System.out.println("exixting obj");
		exixting.address.displayAddress();
		System.out.println("============");
		copy.address.pincode=656555;
		copy.address.displayAddress();
		copy.displayUser();
		System.out.println("============");
		exixting.address.displayAddress();
		exixting.displayUser();



	}
}



