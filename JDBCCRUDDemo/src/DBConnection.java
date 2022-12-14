import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
static Connection con;

	public static Connection dbCon() {
		try {
			//Step-1 driver loading...
			Class.forName("com.mysql.jdbc.Driver");
			
	//Step-1 connection est....
	        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eshoppydb","root","root");
		} catch (Exception e) {
			System.out.println("Error :"+e);
		}
		return con;
		
	}
}
