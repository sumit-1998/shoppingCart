package cartDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import userModel.User;

public class UserDao {

	public int saveUser(User userModel) {
    int rowCount=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping cart", "root",
					"sumit@123");
			PreparedStatement pst = con.prepareStatement(
					"insert into users(firstname,lastname,emailid,dob,phoneNo,password,forgetPassQues,forgetPassQuesAns)"
							+ "values(?,?,?,?,?,?,?,?)");

			pst.setString(1, userModel.getFirstName());
			pst.setString(2, userModel.getLastName());
			pst.setString(3, userModel.getEmailId());
			pst.setString(4, userModel.getDob());
			pst.setString(5, userModel.getPhoneNo());
			pst.setString(6, userModel.getPassword());
			pst.setString(7, userModel.getForgetPasswordQuestion());
			pst.setString(8, userModel.getForgetPasswordAnswer());

			 rowCount = pst.executeUpdate();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public boolean validate(String emailId,String password)
	{
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultset=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping cart","root","Sumit@123");
			statement=connection.prepareStatement("select * from user where emailId=? and password=?");
			statement.setString(1, emailId);
			statement.setString(2, password);
			
			resultset=statement.executeQuery();
			return resultset.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
