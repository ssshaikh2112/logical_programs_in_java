interface Vehicle
{
	void seatingCapacity();
	void price();
	void milage();
	void brand();


}
interface Car extends Vehicle
{
	void airBags();
	void autoPilote();

}
interface Bike extends Vehicle
{
	void version();
	void engineCapacity();



}

class CarDriver
{
	public void seatingCapacity()
	{
		System.out.println("Seating Capacity : "+4+" People");

	}
	public void price()
	{
		System.out.println("Price : "+1500000.23);

	}
	public void milage()
	{
		System.out.println("Milage : " +15.2+"Km/l");

	}
	public void brand()
	{
		System.out.println("Brand : "+"Rolls Royal");

	}
	public void airBags()
	{
		System.out.println("Airbags : "+"Yes");
	}
	public void autoPilote()
	{
		System.out.println("autoPilote : "+"Yes");

	}

}


class BikeDriver
{
	public void seatingCapacity()
	{
		System.out.println("Seating Capacity : "+2+" People");

	}
	public void price()
	{
		System.out.println("Price : "+150000.23+"Rs");

	}
	public void milage()
	{
		System.out.println("Milage : " +60+"Km/l");

	}
	public void brand()
	{
		System.out.println("Brand : "+"Honda");

	}
	public void version()
	{
		System.out.println("BS-VI");
			
	}
	public void engineCapacity()
	{
		System.out.println("125CC");
	}

}

class Driver
{
	public static void main(String[] args) 
	{
		BikeDriver bike = new BikeDriver();
		bike.seatingCapacity();
		bike.price();
		bike.milage();
		bike.brand();
		bike.version();
		bike.engineCapacity();

		System.out.println("--------------------");

		CarDriver car =new CarDriver();
		car.seatingCapacity();
		car.price();
		car.milage();
		car.brand();
		car.autoPilote();
		car.airBags();

	}
}