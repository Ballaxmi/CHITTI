import java.util.Scanner;
public class Admin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username,password;
		System.out.println("enter the user name");
		username=sc.next();
		System.out.println("enter the password");
		password=sc.next();
			if((username.equals("Admin"))&&(password.equals("Admin")));
				{
			System.out.println("login successful");
				}
	
		{
			System.out.println("login denied");
		}
	}

}
