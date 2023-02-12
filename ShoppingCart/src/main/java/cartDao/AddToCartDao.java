package cartDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.taglibs.standard.lang.jstl.EqualsOperator;

import userModel.Cart;
import userModel.Product;

public class AddToCartDao 
{
	
	public int createCart(String cartTotal,String shippingCost,String emailId) 
	{   
		int userId=getUserIdByEmailId(emailId);
		   int cart=0;
          
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping cart", "root",
					"Sumit@123");
			PreparedStatement pst = con.prepareStatement("insert into cart(cartTotal,shippingCost,fkUserId)values(?,?,?)");
			pst.setString(1,cartTotal);
			pst.setString(2,shippingCost);
			pst.setString(3,emailId);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
			cart=rs.getInt(1);
			}
		   }
		catch (Exception e) 
		{		
			e.printStackTrace();
		}
		return cart;
	}
	
	private int getUserIdByEmailId(String emailId) 
	{
		
		return 0;
	}

	public int createCartEntry(int cartEntryId,String emailId) 
	{
		int userId=getUserIdByEmailId(emailId);
	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping cart", "root",
					"Sumit@123");
			PreparedStatement pst = con.prepareStatement("insert into cartentry(cartEntryId,fkUserId)values(?,?)");
			pst.setInt(1,cartEntryId);
			pst.setString(2,emailId);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
		      userId=rs.getInt(1);
			}
	   }
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return userId;
			
		}
}
