import java.util.Scanner;

class VotingSystem
{
	// at initial all parties has 0 votes
	static int bpl , cpl , amd , ssp , nopp;

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Your Village Population: ");
		System.out.println();
		int pop = scan.nextInt();

		for (int i=1;i<=pop ;i++ )
		{
			System.out.println("------------------------------");
			System.out.println("***** Welcome *****");
			System.out.println();
			System.out.println("1.bpl 2.cpl 3.amd 4.ssp 5.nopp");
			System.out.println();
			System.out.println("Enter Your option");
			int option =scan.nextInt();
			switch(option)
			{
				case 1:System.out.println("vote for bpl");bpl++;break;
				case 2:System.out.println("vote for cpl");cpl++;break;
				case 3:System.out.println("vote for amd");amd++;break;
				case 4:System.out.println("vote for ssp");ssp++;break;
				case 5:System.out.println("vote for nopp");nopp++;break;
				default:System.out.println("Vote for NONE");i--;break;		// if user enter out of case loop must descrease by 1 
																			// so loop will execute according to population

			}
			//bpl , cpl , amd , ssp , nopp
			System.out.println("------------------------------");

			System.out.println();
		}

		if(bpl>cpl && bpl>amd && bpl>ssp && bpl>nopp)
		{
			System.out.println("BPL WON BY "+bpl+" VOTES...");
		}
		else if(cpl>bpl && cpl>amd && cpl>ssp && cpl>nopp)
		{
			System.out.println("CPL WON BY "+cpl+" VOTES...");
		}
		else if(amd>cpl && amd>bpl && amd>ssp && amd>nopp)
		{
			System.out.println("AMD WON BY "+amd+" VOTES...");
		}
		else if(ssp>cpl && ssp>amd && ssp>bpl && ssp>nopp)
		{
			System.out.println("SSP WON BY "+ssp+" VOTES...");
		}
		else if(nopp>cpl && nopp>amd && nopp>ssp && nopp>bpl)
		{
			System.out.println("NOPP WON BY "+nopp+" VOTES...");
		}
		
		System.out.println("Congratualations...!!!!!!!!");		


	}
}