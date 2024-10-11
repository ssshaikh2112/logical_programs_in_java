class Movie
{
	String movieName;
	String directorName;
	int duration;
	String cast;
	double chargeActor;
	float length;
	double budget;

	Movie(String movieName , String directorName , 
		int duration , String cast , double chargeActor , float length , double budget)
	{
		super();							// call super class constructor (default)
		this.movieName=movieName;			
		this.directorName=directorName;
		this.duration=duration;
		this.cast=cast;
		this.chargeActor=chargeActor;
		this.length=length;
		this.budget=budget;

	}

	void show()
	{
		System.out.println("Name of Movie : "+movieName);
		System.out.println("Director of Movie : "+directorName);
		System.out.println("Duration to Shoot : "+duration+" days");
		System.out.println("Cast of Movie : "+cast);
		System.out.println("Charges by Actors : "+chargeActor + "CR");
		System.out.println("Length of movie : "+length);
		System.out.println("Budget of Movie : "+budget+"CR");
	}
}

class MovieMaker
{
	public static void main(String[] args) 
	{
		Movie movie1 =new Movie("Jawan" , "Atlee", 35 , "SRK" , 80 , 2.45f , 400);	// Constructor call
		movie1.show();					// method call
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		Movie movie2 =new Movie("Inception" , "Christopher Nolan", 45 , "Leonardo DiCaPrio" , 100 , 2.28f , 1300);
		movie2.show();
	}
}