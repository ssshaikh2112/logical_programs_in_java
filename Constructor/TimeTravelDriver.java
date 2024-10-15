class TimeTravelDriver
{
	public static void main(String[] args) 
	{
		System.out.println();
		Founder scientist1 = new Founder("Stiphens Hawkins" , "Time Machine" , 1.5 , "Jonas" , 2053 , 2021);
		scientist1.travel();
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		Founder scientist2 = new Founder("Surya" , "Time Story" , 1.2 , "Jr. Surya" , 2050 , 2018);
		scientist2.travel();

	}
}

class Founder
{
	String founderName;
	String invensionName;
	double amount;
	String travellerName;
	int futureTime;
	int year;

	Founder(String founderName , String invensionName , double amount ,
		String travellerName , int futureTime  , int year)
	{
		this.founderName=founderName;
		this.invensionName=invensionName;
		this.amount=amount;
		this.travellerName=travellerName;
		this.futureTime=futureTime;
		this.year=year;
	}
	void travel()
	{
		System.out.println("Name of Founder : "+founderName);
		System.out.println("Name of Invension : "+invensionName);
		System.out.println("Amount need for it : "+amount+" billion");
		System.out.println("Name of Traveller : "+travellerName);
		System.out.println("Future Time to Travel : "+futureTime);
		System.out.println("Present Year : "+year);
	}
}