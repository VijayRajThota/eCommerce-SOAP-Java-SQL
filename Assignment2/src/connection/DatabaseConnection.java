package connection;
import java.sql.*;
import java.util.*;
import java.util.Date;

import com.mongodb.DB;

import user.Confirmation;
import user.User;
import user.CardDetails;
import user.Quantity;

public class DatabaseConnection {
	
	Connection con = null;
	static ResultSet rs;
    Statement stmt = null;
    PreparedStatement ps;
	
	DatabaseConnection(){		
		try {			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","1MANarmy");
				stmt = con.createStatement();
				if(!con.isClosed())
					System.out.println("Successfully Connected!!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public String signUp(int membershipId, String firstname, String lastname, String emailId, String username, String password)
	{
		String result = "";
		int rowcount;
		try {
			
			String query = "Insert into userlist (membershipId, firstname, lastname, emailId, username, password) values ('" + membershipId + "', '"+firstname+"', '"+lastname+"', '"+emailId+"', '"+username+"', sha1('"+password+"'))";
			System.out.println(query);
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				System.out.println("Insert Successful");
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public User signin(String username, String password) throws SQLException
	{
		User user = null;
		String outquery;
		
		
		try {
			outquery = "select * from userlist where username='"+username+"' and password=sha1('"+password+"')";
			System.out.println(outquery);
			ps= con.prepareStatement(outquery);
			rs= ps.executeQuery();	


			if (rs.next()) {
				System.out.println("Successful fetch");

				user = new User();
				user.setMembershipId(rs.getInt(1));
				

				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setEmailId(rs.getString(4));
				user.setUsername(rs.getString(5));
				user.setPassword(rs.getString(6));		
								
				System.out.println(user.getFirstName());
				System.out.println(user.getLastName());
				
				
				
			}
			else
			{
				System.out.println("Invalid Login");
				return null;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return user;
	}

	public String entry(int cid, String cname, String cnumber, String caddress, String cvv) 
	{
		String result = "";
		int rowcount;
		try {
			
			String query = "Insert into cardlist (cid, cname, cnumber, caddress, cvv) values ("+cid+", '"+cname+"', '"+cnumber+"', '"+caddress+"', '"+cvv+"')"; 
			System.out.println(query);
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result="true";
				System.out.println("Insert Successful");
			
			}
			else{
				result="false: The data could not be inserted in the database.";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public Quantity amount(String brand) throws SQLException
	{
		Quantity result = null;
		String outquery;
		
		
		try {
			outquery = "select * from telivision where brand='"+brand+"'";
			System.out.println(outquery);
			ps= con.prepareStatement(outquery);
			rs= ps.executeQuery();	


			if (rs.next()) {
				System.out.println("Successful fetch");

				result = new Quantity();
				result.setCount(rs.getString(1));
				result.setBrand(rs.getString(2));
				result.setCount(rs.getString(3));
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
	
				
			}
			else
			{
				System.out.println("unsuccessful operation");
				return null;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return result;
	}
	
	public int confirm(int confno)
	{
	   	int result = 0;
	   	int rowcount = 0;
		try {
			
			String query = "Insert into confirmation (confno, confdate, ddate) values (" + confno + ", CURDATE() , DATE_ADD(CURDATE(), INTERVAL 3 DAY))";
			System.out.println(query);
			rowcount=stmt.executeUpdate(query);
			if(rowcount > 0){
				result = 1;
				System.out.println("Insert Successful");
			}
			else{
				System.out.println("Insertion Failed");
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public Confirmation delivery(int confno) throws SQLException
	{
		Confirmation result = null;
		String outquery;
		
		
		try {
			outquery = "select * from confirmation where confno='"+confno+"'";
			System.out.println(outquery);
			ps= con.prepareStatement(outquery);
			rs= ps.executeQuery();	


			if (rs.next()) {
				System.out.println("Successful fetch");

				result = new Confirmation();
				result.setConfno(rs.getInt(1));
				result.setConfdate(rs.getDate(2));
				result.setDdate(rs.getDate(3));
								
			}
			else
			{
				System.out.println("unsuccessful operation");
				return null;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return result;
	}
	public Quantity incremeant(String brand, String count)
	{
		Quantity result = null;
		String aquery;
		try
		{
			aquery="update telivision SET count = count-1 where brand='"+brand+"' and count>0";
			ps= con.prepareStatement(aquery);
			rs= ps.executeQuery();
			if(rs.next()){
				System.out.println("Successful updation");

				result = new Quantity();
				result.setCount(rs.getString(1));
								
			}
			else
			{
				System.out.println("unsuccessful operation");
				return null;
			}
		}
			catch (SQLException e) {
				e.printStackTrace();
			}	
			return result;
		}
	}
	
