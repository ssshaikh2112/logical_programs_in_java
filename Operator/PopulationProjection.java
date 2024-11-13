class PopulationProjection
{
	/*
		The Indian 	Census Bureau projects population based on the folowing assumption

		1. one birth every 7 sec
		2. one death evry 13 sec
		3. one new immigrants every 45 sec

		Q. Write program to display the population for each of the next five years. Assume the current popolation
		is 312032486 and one year has 365 days.
	*/

	public static void main(String[] args) 
	{


		// Current population
    	long currentPopulation = 312032486;

   		// Assumptions
   		int birthsPerSecond = 1 ;
    	int deathsPerSecond = 1 / 13;
    	int immigrantsPerSecond = 1 / 45;

    	// Calculate total seconds in a year
    	int secondsPerYear = 365 * 24 * 60 * 60;

    	// Calculate total births, deaths, and immigrants in a year
    	long totalBirths = birthsPerSecond * secondsPerYear;
    	long totalDeaths = deathsPerSecond * secondsPerYear;
    	long totalImmigrants = immigrantsPerSecond * secondsPerYear;

    	// Calculate net change in population per year
    	long netChangePerYear = totalBirths - totalDeaths + totalImmigrants;

    	// Calculate population for each of the next five years
    	long populationYear1 = currentPopulation + netChangePerYear;
    	long populationYear2 = populationYear1 + netChangePerYear;
    	long populationYear3 = populationYear2 + netChangePerYear;
    	long populationYear4 = populationYear3 + netChangePerYear;
    	long populationYear5 = populationYear4 + netChangePerYear;

    	// Display population for each year
    	System.out.println("Year 1: Population = "+ populationYear1);
    	System.out.println("Year 2: Population = "+ populationYear2);
    	System.out.println("Year 3: Population = "+ populationYear3);
    	System.out.println("Year 4: Population = "+ populationYear4);
    	System.out.println("Year 5: Population = "+ populationYear5);
 
	}
}