class WeakPasswordNumberException extends Exception
{
	public WeakPasswordNumberException(String str)
	{
		super(str);
	}
}
public class User
{
	String name;
	String mobile;
	String username;
	String password;
	public User(String name, String mobile, String username, String password) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.username = username;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	static boolean weak_pass(String password)
	{
		boolean hasDigit=false;
		boolean hasSpecialChar=false;
		int n=password.length();
		char SpecialChar[]={'~','!','@','#','$','%','^','&','*'};
		if(n>=8 && n<=20)
		{
		 for(char ch : password.toCharArray())
{
			if(Character.isDigit(ch))
			{
				hasDigit=true;
			}
			else
		{
			 for(char ch1 : SpecialChar)
{
if(ch1==ch)
{
hasSpecialChar=true;
}
			 }
		}
			if(hasDigit==true && hasSpecialChar==true)
			{
			 return true;
			}
		
		}
		}
		return false;
	}
	@override
	void toString(String name,String mobile,String username,String password)
	{
		System.out.println("name: \n"+name+"\nmobile"+mobile+"\nusername"+username+"\npassword"+password);
	}
	static void validate(String password) throws WeakPasswordNumberException
	{
		boolean val=weak_pass(password);
		if(val==false)
		{
			throw new WeakPasswordNumberException("weak password");
		}
		else
		{
			System.out.println("password accepted");
		}
	}
	
}
import java.util.Scanner;
public class Main1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter mobile");
			String Mobile=sc.nextLine();
			System.out.println("enter username");
			String username=sc.nextLine();
			System.out.println("enter password");
			String password=sc.nextLine();
			User u=new User(name,Mobile,username,password);
			u.validate(password);
			u.toString(name,Mobile,username,password);
		}
		catch(WeakPasswordNumberException e)
		{
			System.out.println("error"+e);
		}
	}
}
