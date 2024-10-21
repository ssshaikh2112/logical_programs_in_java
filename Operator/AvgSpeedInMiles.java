class AvgSpeedInMiles
{

	/*
	Assume runner  runs 14km in 45 minutes and 30 seconds . 
	Write a java program that display the average speed in miles per hour
	
	Note : 1 mile is 1.6km
	*/

	public static void main(String[] args) 
	{
		
		double distanceInKm = 14; // in kilometers
   		int timeInMinutes = 45;
 	    int timeInSeconds = 30;

    	// Convert time to hours
    	double timeInHours = (timeInMinutes + (timeInSeconds / 60.0)) / 60.0;

    	// Convert distance from km to miles
    	double distanceInMiles = distanceInKm / 1.6;

    	// Calculate average speed in miles per hour
    	double averageSpeedInMph = distanceInMiles / timeInHours;

    	// Display the result
    	System.out.printf("Average speed: %.2f miles per hour%n", averageSpeedInMph);

	}
}