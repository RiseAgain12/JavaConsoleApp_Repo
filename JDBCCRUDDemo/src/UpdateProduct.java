import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateProduct {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter product id u want to update: ");
		int pid=s.nextInt();
		System.out.println("Enter new price :");
		float price = s.nextFloat();
		System.out.println("Enter new category: ");
		String cat = s.next();
		
		
		try {
			
			//Step-1 connection est....
			Connection con= DBConnection.dbCon();
			//Step-3 statement creation....
			PreparedStatement pstmt = 
					con.prepareStatement("update product set p_price=?, p_category=? where pid=?");
			pstmt.setFloat(1, price);
			pstmt.setString(2, cat);
			pstmt.setInt(3, pid);
			
			//Step-4 statement exec & handling the resultset...
			int rs = pstmt.executeUpdate();
			if(rs>0)
				System.out.println("Product updated successfully...!");
			else
				System.out.println("Failed to update the prosuct...!");
			
			//step-5
			con.close();
			
		} catch (Exception e) {
			System.out.println("Error :"+e);
		}

	}

}
