 import java.util.Scanner;
class Aircraft
{
	String aircraftName;
	String source;
	String destination;




	public Aircraft(String aircraftName,String source,String destination)
	{
    	this.aircraftName = aircraftName;
    	this.source = source;
    	this.destination = destination;
	}
	void displayDetails()
	{
    	System.out.println("aircraft name.: "+aircraftName);
    	System.out.println("source.: "+source);
    	System.out.println("destination.: "+destination);
	}
}
class PublicAircraft extends Aircraft
{
	private boolean checkinbeforetwohours;
	private int noOfKgsallowed;
	private float additionalFeedperkg;


	public boolean isCheckinbeforetwohours() {
    	return checkinbeforetwohours;
	}


	public int getNoOfKgsallowed() {
    	return noOfKgsallowed;
	}


	public float getAdditionalFeedperkg() {
    	return additionalFeedperkg;
	}


	public void setCheckinbeforetwohours(boolean checkinbeforetwohours) {
    	this.checkinbeforetwohours = checkinbeforetwohours;
	}


	public void setNoOfKgsallowed(int noOfKgsallowed) {
    	this.noOfKgsallowed = noOfKgsallowed;
	}


	public void setAdditionalFeedperkg(float additionalFeedperkg) {
    	this.additionalFeedperkg = additionalFeedperkg;
	}
	public PublicAircraft(String aircraftName, String source, String destination, boolean checkinbeforetwohours, int noOfKgsallowed, float additionalFeedperkg)
	{
    	super(aircraftName, source, destination);
    	this.checkinbeforetwohours = checkinbeforetwohours;
    	this.noOfKgsallowed = noOfKgsallowed;
    	this.additionalFeedperkg = additionalFeedperkg;
	}
	void display()
	{
    	super.displayDetails();
    	System.out.println("checking before two hours.: "+checkinbeforetwohours);
    	System.out.println("number of Kgs allowed.: "+noOfKgsallowed);
    	System.out.println("additional feed per Kg.: "+additionalFeedperkg);
	}
}
class PrivateAircraft extends Aircraft
{
	private boolean checkinbeforetwohours;
	private String pilotName;
	private String purpose;


	public boolean isCheckinbeforetwohours() {
    	return checkinbeforetwohours;
	}


	public String getPilotName() {
    	return pilotName;
	}


	public String getPurpose() {
    	return purpose;
	}


	public void setCheckinbeforetwohours(boolean checkinbeforetwohours)
	{
    	this.checkinbeforetwohours = checkinbeforetwohours;
	}


	public void setPilotPreference(String pilotName) {
    	this.pilotName = pilotName;
	}


	public void setPurpose(String purpose) {
    	this.purpose = purpose;
	}


	public PrivateAircraft(String aircraftName, String source, String destination, boolean checkinbeforetwohours, String pilotName, String purpose)
	{
    	super(aircraftName, source, destination);
    	this.checkinbeforetwohours = checkinbeforetwohours;
    	this.pilotName = pilotName;
    	this.purpose = purpose;
	}
	void display()
	{
    	super.displayDetails();
    	System.out.println("checking before two hours.: "+checkinbeforetwohours);
    	System.out.println("pilot preference.: "+pilotName);
    	System.out.println("purpose.: "+purpose);
	}
}
class AircraftMain
{
	public static void main(String[] args)
	{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("aircraft name:");
    	String name=sc.nextLine();
    	System.out.println("source:");
    	String source=sc.nextLine();
    	System.out.println("destination:");
    	String dest=sc.nextLine();
    	Aircraft p1=new Aircraft(name,source,dest);
    	System.out.println("aircraft type:(enter 1 for public and 2 for private)");
    	int type=sc.nextInt();
    	switch(type)
    	{
        	case 1:
            	System.out.println("enter the no Of Kgs allowed:");
            	int kgsallowed=sc.nextInt();
            	System.out.println("enter the additional Feed per kg");
            	float feedperkg=sc.nextFloat();
            	PublicAircraft p2=new PublicAircraft(name,source,dest,true,kgsallowed,feedperkg);
            	System.out.println("Aircraft Type : Public Aircraft\n");
            	System.out.println("Aircraft Name : \n"+p1.aircraftName);
            	System.out.println("Source : \n"+p1.source);
            	System.out.println("Destination : \n"+p1.destination);
            	System.out.println("Check in before two hours : Yes\n");
            	break;
        	case 2:
            	System.out.println("pilot name:\n");
            	sc.nextLine();
            	String pilotname=sc.nextLine();
            	System.out.println("purpose of flight:\n");
            	String purpose=sc.nextLine();
            	PrivateAircraft p3=new PrivateAircraft(name,source,dest,true,pilotname,purpose);
            	System.out.println("Aircraft Type : Private Aircraft\n");
            	System.out.println("Aircraft Name : \n"+p1.aircraftName);
            	System.out.println("Source : \n"+p1.source);
            	System.out.println("Destination : \n"+p1.destination);
            	System.out.println("Pilot Name : \n"+p3.getPilotName());
            	System.out.println("Purpose: \n"+p3.getPurpose());
            	break;
        	default:
            	System.out.println("INVALID");
    	}
	}
}
