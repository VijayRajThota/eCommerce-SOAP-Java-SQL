package connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import user.User;
import user.Confirmation;
import user.Quantity;
import user.CardDetails;
import connection.DatabaseConnection;

import javax.jws.WebService;

@WebService
public class Service 
{

	DatabaseConnection db = new DatabaseConnection();
	Statement stmt = null;

	public String signUp(int membershipId,String firstname,String lastname,String emailId,String username, String password) throws SQLException {
		String result;
		result = db.signUp(membershipId,firstname,lastname,emailId,username,password);
		System.out.println(result);
		return result;
	}
	public User signin(String username, String password) throws SQLException {
		User user;
		user = db.signin(username, password);
		return user;
	}
	public String entry(int cid, String cname, String cnumber,  String caddress, String cvv) throws SQLException
	{
	  String result1;
	  result1 = db.entry(cid,cname,cnumber,caddress,cvv);
	  System.out.println(result1);
	  return result1;
    }
	
	public Quantity amount(String brand) throws SQLException
	{
		Quantity result;
		result = db.amount(brand);
		System.out.println(result);
		return result;
	}
	public int confirm(int confno)
	{
		int result3;
		result3 =db.confirm(confno);
		System.out.println(result3);
		return result3;
	}
	public Confirmation delivery(int confno) throws SQLException
	{
		Confirmation result4;
		result4 = db.delivery(confno);
		System.out.println(result4);
		return result4;
	}
	public Quantity increment(String brand, String count)
	{
		Quantity result;
		result = db.incremeant(brand,count);
		return result;
	}
}
