import java.util.Arrays;

class Google 
{
	String userName;
	String password;
	String dob;
	String emailId;
	long contact;
	String gender;
	
	public Google(String userName, String password, String dob, String emailId, long contact, String gender) 
	{
		super();
		this.userName = userName;
		this.password = password;
		this.dob = dob;
		this.emailId = emailId;
		this.contact = contact;
		this.gender = gender;
	}
	
	public void displayGoogle()
	{
		System.out.println();
		System.out.println("*************       Google Data        *************");
		System.out.println("USer Name : "+this.userName);
		System.out.println("PAssword : "+this.password);
		System.out.println("DOB : "+this.dob);
		System.out.println("Email ID : "+this.emailId);
		System.out.println("Contact : "+this.contact);
		System.out.println("Gender : "+this.gender);
		System.out.println();
	}
	

}
class GoogleMap extends Google
{
	String currentLoc;
	String[] bookmark;
	String modeTravel;
	public GoogleMap(String userName, String password, String dob, String emailId, long contact, String gender,
			String currentLoc, String[] bookmark, String modeTravel) 
	{
		super(userName, password, dob, emailId, contact, gender);
		this.currentLoc = currentLoc;
		this.bookmark = bookmark;
		this.modeTravel = modeTravel;
	}
	public void displayGoogleMap() 
	{
		System.out.println();
		System.out.println("*************    GoogleMap Details     *************");
		System.out.println("currentLoc : " + this.currentLoc);
		System.out.println("bookmark : " + Arrays.toString(bookmark) );
		System.out.println("modeTravel : "+ this.modeTravel);
		System.out.println();
	}
	
	
}
class GoogleMeet extends Google
{
	String hostName;
	String joiningLink;
	String schedule;
	String meetId;
	public GoogleMeet(String userName, String password, String dob, String emailId, long contact, String gender,
			String hostName, String joiningLink, String schedule, String meetId) {
		super(userName, password, dob, emailId, contact, gender);
		this.hostName = hostName;
		this.joiningLink = joiningLink;
		this.schedule = schedule;
		this.meetId = meetId;
	}
	public void displayGoogleMeet()
	{
		System.out.println();
		System.out.println("*************    googlemeet Details     *************");
		System.out.println("hostName : "+this.hostName);
		System.out.println("Joinign Link : "+this.joiningLink);
		System.out.println("schedule : "+this.schedule);
		System.out.println("meetId : "+this.meetId);
		System.out.println();
	}
	
}
class GoogleClassRoom extends Google
{
	String className;
	String subject;
	String teacherName;
	String classID;
	int countStudent;
	public GoogleClassRoom(String userName, String password, String dob, String emailId, long contact, String gender,
			String className, String subject, String teacherName, String classID, int countStudent) 
	{
		super(userName, password, dob, emailId, contact, gender);
		this.className = className;
		this.subject = subject;
		this.teacherName = teacherName;
		this.classID = classID;
		this.countStudent = countStudent;
	}
	public void displayGoogleClassRoom()
	{
		System.out.println();
		System.out.println("*************     classroom Details      *************");
		System.out.println("className : "+this.className);
		System.out.println("subject : "+this.subject);
		System.out.println("teacherName : "+this.teacherName);
		System.out.println("classID : "+this.classID);
		System.out.println("countStudent : "+this.countStudent);
		System.out.println();
	}
	
}

class GooglePay extends Google
{
	String name;
	long accNumber;
	String ifsc;
	int upipin;
	long debitcard;
	public GooglePay(String userName, String password, String dob, String emailId, long contact, String gender,
			String name, long accNumber, String ifsc, int upipin, long debitcard) 
	{
		super(userName, password, dob, emailId, contact, gender);
		this.name=name;
		this.accNumber=accNumber;
		this.ifsc=ifsc;
		this.upipin=upipin;
		this.debitcard=debitcard;
	}
	public void displayGooglePay()
	{
		System.out.println();
		System.out.println("*************     GooglePay Details      *************");
		System.out.println("name : "+this.name);
		System.out.println("accNumber : "+this.accNumber);
		System.out.println("ifsc : "+this.ifsc);
		System.out.println("upipin : "+this.upipin);
		System.out.println("debitcard : "+this.debitcard);
		System.out.println();
	}

}

class HeararcicalInheritance
{
	public static void main(String[] args) 
	{
	/*String userName, String password, String dob, String emailId, long contact, String gender,
			String currentLoc, String[] bookmark, String modeTravel*/

		GoogleMap googlemap=new GoogleMap("sahil@gmail.com" , "sahil123" , 
										"22/09/2001" , "sahil@gmail.com" ,
										1212121212 , "Male", "Pune" , new String[]{"Latur" , "Pune"} , "Bike");

		googlemap.displayGoogle();
		googlemap.displayGoogleMap();
		System.out.println("-----------------------------------------------------");

/*
(String userName, String password, String dob, String emailId, long contact, String gender,
			String hostName, String joiningLink, String schedule, String meetId)
*/
		GoogleMeet googlemeet =new GoogleMeet("sahil@gmail.com" , "sahil123" , 
										"22/09/2001" , "sahil@gmail.com" ,
										1212121212 , "Male",
										"Jonas" , "www.meet.com" ,"11:30am" , "1245236541256");

		googlemeet.displayGoogle();
		googlemeet.displayGoogleMeet();
		System.out.println("-----------------------------------------------------");


/*
(String userName, String password, String dob, String emailId, long contact, String gender,
			String className, String subject, String teacherName, String classID, int countStudent) 
*/		
			GoogleClassRoom classroom=new GoogleClassRoom("sahil@gmail.com" , "sahil123" , 
										"22/09/2001" , "sahil@gmail.com" ,
										1212121212 , "Male",
										"new building" , "java" , "Shrikant sir" , "M17" , 150);

			classroom.displayGoogle();			
			classroom.displayGoogleClassRoom();
		System.out.println("-----------------------------------------------------");


/*
String userName, String password, String dob, String emailId, long contact, String gender,
			String name, long accNumber, String ifsc, int upipin, long debitcard
*/
		GooglePay googlepay=new GooglePay("sahil@gmail.com" , "sahil123" , 
										"22/09/2001" , "sahil@gmail.com" ,
										1212121212 , "Male",
										"sahil" , 33666332,"laxmi1236",1234 , 9999888877778888l);
		googlepay.displayGoogle();
		googlepay.displayGooglePay();	

	}

}
