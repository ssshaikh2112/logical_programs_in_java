import java.util.*;
class CabDriver
{
	static int diverId=123;
	private int id;
	private String name;//get set
	private long contact;// get set
	private String type;//get
	private String car;//get
	private long account;//get set
	private String status="Available";
//Parametrised Constructor
	CabDriver(String name,long contact,String type,String car,long account)
	{
		super();
		this.name=name;
		this.contact=contact;
		this.type=type;
		this.car=car;
		this.account=account;
		this.id=diverId++;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String newName){

       this.name=newName;
	}
	//String name,long contact,String type,String car,long account
	public long getContact(){
		return this.contact;
	}
	public void setContact(long newContact){

       this.contact=newContact;
	}
	public String getType(){
		return this.type;
	}
	public String getCar(){
		return this.car;
	}
	public long getAccount(){
		return this.account;
	}
	public void setAccount(long newAccount){

       this.account=newAccount;
	}
	public String getStatus(){
		return this.status;
	}
	public void setStatus(String newStatus){

       this.status=newStatus;
	}
	public int getId(){
		return this.id;
	}
	public void displayCabDriver(){
		System.out.println();
		System.out.println("**** CAB DETAILS ******");
		System.out.println("Booking Id: "+this.id);
		System.out.println("Driver Name: "+this.getName());
		System.out.println("Type of Car: "+this.getType());
		System.out.println("status:"+this.getStatus());
	}
	public void displayCabDriverAfterBooking(){
		System.out.println();
		System.out.println("**** CAB DETAILS *******");
		System.out.println("Booking Id: "+this.id);
		System.out.println("Driver Name: "+this.getName());
		System.out.println("Contact:"+this.getContact());
		System.out.println("Type of a car:"+this.getType());
		System.out.println("Car Number:"+this.getCar());
		System.out.println("Account Number: "+this.getAccount());
		System.out.println("Status: "+this.getStatus());
	}

}
class Passenger{
   String name;// get set
   String start;//get set
   String end;//get set
   long contact;//get set
   int noPass;//get set

   Passenger(String name,String start,String end,long contact,int noPass){
   	super();
   	this.name=name;
   	this.start=start;
   	this.end=end;
   	this.contact=contact;
   	this.noPass=noPass;

   }

   public String getName(){
		return this.name;
	}
	public void setName(String newName){

       this.name=newName;
	}
	public String getStart(){
		return this.start;
	}
	//String name,string start,String end,long contact,int noPass
	public void setStart(String newStart){

       this.start=newStart;
	}
	public String getEnd(){
		return this.end;
	}
	public void setEnd(String newEnd){

       this.end=newEnd;
	}
	public long getContact(){
		return this.contact;
	}
	public void setContact(long newContact){

       this.contact=newContact;
	}
	public int getNoPass(){
		return this.noPass;
	}
	public void setNoPass(int newNoPass){

       this.noPass=newNoPass;
	}

}
class SavariDriver{
	static ArrayList<CabDriver>listCab=new ArrayList<>();
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		CabDriver obj1=new CabDriver("Jonas",1111111111l,"Sedan","MH12AA1111",123245123654l);
		CabDriver obj2=new CabDriver("Martha",2222222222l,"Hatchback","MH12BB1111",256342365423l);
		CabDriver obj3=new CabDriver("Urik",3333333333l,"SUV","MH12CC1111",123247896254l);
        CabDriver obj4=new CabDriver("Miller",4444444444l,"XUV","MH12DD1111",654224512365l);

       listCab.add(obj1);
       listCab.add(obj2);
       listCab.add(obj3);
       listCab.add(obj4);

        String start=null;
        String end=null;
        String name=null;
        long contact=0;
        int noPass=0;

        for(; ;)
        {
        	System.out.println();
        	System.out.println("Welcome to SAVARI");
        	System.out.println();
        	System.out.println("Book a Ride");
        	System.out.println("Enter a name");
        	name=sc.nextLine();
        	System.out.println("Start Destination:");
        	start=sc.nextLine();
        	System.out.println("End Destination:");
        	end=sc.nextLine();
        	System.out.println("Contact:");
        	contact=sc.nextLong();
        	System.out.println("Number of Passenger");
        	noPass=sc.nextInt();

        	Passenger pass=new Passenger(name,start,end,contact,noPass);
        	System.out.println();
        	for(CabDriver i:listCab){
        		if(i.getStatus().equals("Available"))
        		{
        			i.displayCabDriver();
        		}
        	}
        	System.out.println();
        	System.out.println("Enter the Booking ID:");
        	int bookid=sc.nextInt();

        	for(CabDriver i:listCab)
        	{
        		if(bookid==i.getId())
        		{
        			i.setStatus("Occupied");
        			i.displayCabDriverAfterBooking();
        			System.out.println();
        			System.out.println("Your Ride has been Booked");
        		}
        	}
    }
	
}
}