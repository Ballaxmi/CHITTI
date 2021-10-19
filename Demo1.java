


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.Scanner;

	 

	public class Demo1 {
	    public static void main(String[] args) {
	        try {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter empid: ");
	            String empid = sc.nextLine();

	 

	            Class.forName("org.apache.derby.jdbc.ClientDriver");
	            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true", "user",
	                    "user");

	 

	            PreparedStatement ps = conn.prepareStatement("select * from app.employee where empid = ?");
	            ps.setString(1, empid);
	            ResultSet rs = ps.executeQuery();

	 

	            while (rs.next()) {
	                System.out.println(rs.getString(1) + "---" + rs.getString(2));
	            }
	            conn.close();
	        } catch (Exception e) {
	            System.out.println("Exception in database" + e.getMessage());
	        }
	    }
	}