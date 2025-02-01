import java.util.Scanner;

class TempratureConverter
{
	public static void main(String[] args) 
	{
		System.out.println();	
		System.out.println("********  Temprature Converter  ********");
		System.out.println();
		System.out.println("1.Kelvin 2.Fahrenhite 3.Rankine 4.Reaumur");
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the temp im Celcius : ");
		float cel=scan.nextFloat();
		System.out.println();
		System.out.print("Enter option : ");
		int option = scan.nextInt();
		System.out.println();
		switch(option)
		{
			case 1:
			{
				float kel=cel+273.15f;
				System.out.print("           output : -"+cel+"celcius = "+kel+"K");
				break;
			}
			case 2:
			{
				float fah=cel*(9/5.0f)+32;
				System.out.print("           output : -"+cel+"celcius = "+fah+"F");
				break;
			}
			case 3:
			{
				float rankine=(cel+273.15f)*(9/5.0f);
				System.out.print("           output : -"+cel+"celcius = "+rankine+"R");
				break;
			}
			case 4:
			{
				float rea=(cel*4)/5.0f;
				System.out.print("           output : -"+cel+"celcius = "+rea+"Re");
				break;
			}
			default:
			{
				System.out.print("            Wrong Option ");
				break;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("********  Temprature Converted  ********");
		System.out.println();
	}
}