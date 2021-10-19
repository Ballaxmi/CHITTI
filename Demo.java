
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

 

public class Demo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter empid: ");
            String empid = sc.nextLine();
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true", "user",
                    "user");
            Statement st = conn.createStatement();
            System.out.println("Query-> "+"select * from app.employee where empid = '"+empid+"'");
            ResultSet rs = st.executeQuery("select * from app.employee where empid = '"+empid+"'");

 

            while (rs.next()) {
                System.out.println(rs.getString(1) + "---" + rs.getString(2));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Exception in database" + e.getMessage());
        }
    }
}