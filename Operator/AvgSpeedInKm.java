class AvgSpeedInKm
{

	/*
		Assume runner runs 24 miles 1 hour 40 minites and 35 seconds 
		Write a program that displays the average speed in kilometers per hours.

		note : 1 mile is 1.6 kilometer

	*/
	public static void main(String[] args) 
	{

	
    	// Distance and time
    	double distanceMiles = 24;
    	int hours = 1;
    	int minutes = 40;
    	int seconds = 35;

    	// Convert distance to kilometers
    	double distanceKilometers = distanceMiles * 1.6;

    	// Convert time to hours
    	double timeHours = hours + (minutes / 60.0) + (seconds / 3600.0);

    	// Calculate average speed
    	double averageSpeedKph = distanceKilometers / timeHours;

    	// Display average speed
    	System.out.println("Average speed: "+ averageSpeedKph+"km/h");
  }
}
	
