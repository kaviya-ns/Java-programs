class DuplicateMoblieNumberException extends Exception
{
	public DuplicateMoblieNumberException(String str)
	{
		super(str);
	}
}
public class ContactDetails extends Exception 
{
	String mobile;
	String alternateMobile;
	String LandLine;
	String email;
	String address;
	public ContactDetails(String mobile, String alternateMobile, String landLine, String email, String address) 
	{
		super();
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		LandLine = landLine;
		this.email = email;
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	public String getLandLine() {
		return LandLine;
	}

	public void setLandLine(String landLine) {
		LandLine = landLine;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	static void validate(String mobile,String AlternateMobile) throws DuplicateMoblieNumberException
	{
		if(mobile.equals(AlternateMobile))
		{
			throw new DuplicateMoblieNumberException("Mobile number and alternate mobile number are the same");
		}
		else
		{
			System.out.println("correct details");
		}
	}
}
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter mobile number");
			String mobile=sc.nextLine();
			System.out.println("enter alternate mobile number");
			String altMobile=sc.nextLine();
			System.out.println("enter landline");
			String landline=sc.nextLine();
			System.out.println("enter email id");
			String email=sc.nextLine();
			System.out.println("enter address");
			String address=sc.nextLine();
			ContactDetails c=new ContactDetails(mobile,altMobile,landline,email,address);
			c.validate(mobile,altMobile);
			
		}
		catch(DuplicateMoblieNumberException e)
		{
			System.out.println("error"+e);
		}
		
		
			
	}
}
