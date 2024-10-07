class CompositionDriver
{
	public static void main(String[] args) 
	{
		Car car=new Car("KIA" , "CAREN" , "SUV" , 4 , "Black" , 1400000 , (new Engine("SI", 150 , 2000 , 4 ,20)));
		car.diplayCar();
		car.engine.displayEngine();
/*
		Engine engine = new Engine("SI", 150 , 2000 , 4 ,20);
		engine.displayEngine();
*/		
	}
}

class Car
{
	String brand;
	String model;
	String type;
	int passCap;
	String color;
	double price;
	// 1st way to create a obj : 
	// Engine engine = new Engine("SI", 150 , 2000 , 4 ,20);
	// Engine engine;	2nd way
	Engine engine;	// 3rd way
	Car(String brand ,String model,String type,int passCap , String color , double price , Engine engine)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.passCap=passCap;
		this.type=type;
		this.color=color;
		this.engine=engine;									// 3rd way to create a obj : 
	//	this.engine=new Engine("SI", 150 , 2000 , 4 ,20);	// 2nd way to create a obj : 
	}

	public void diplayCar()
	{
		System.out.println();
		System.out.println("*******       Car Details      *******");
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+ this.model);
		System.out.println("Type : "+this.type);
		System.out.println("Passenger Capasity : "+this.passCap);
		System.out.print("Color : "+this.color);
		System.out.println("Price : "+this.price);
		System.out.println();
	}

}

class Engine
{
	String typeEngine;
	double bhp;
	double cc;
	int noPiston;
	double milage;

	Engine(String typeEngine , double bhp , double cc , int noPiston , double milage)
	{
		super();
		this.typeEngine=typeEngine;
		this.bhp=bhp;
		this.cc=cc;
		this.noPiston=noPiston;
		this.milage=milage;
	}

	public void displayEngine()
	{
		System.out.println();
		System.out.println("*******     Engine Details     *******");
		System.out.println("Type : "+this.typeEngine);
		System.out.println("Break HorsePower : "+this.bhp);
		System.out.println("Cubik Centemeter (CC) : "+this.cc);
		System.out.println("No. of Pistons : "+this.noPiston);
		System.out.println("Milage : "+this.milage);
	}


}