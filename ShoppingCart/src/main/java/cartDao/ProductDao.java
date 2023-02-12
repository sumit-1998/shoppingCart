package cartDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import userModel.Product;


public class ProductDao 
{
	
	public List<Product> getProductList() 
	{
	  List<Product> productList=new ArrayList<Product>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping cart", "root",
						"Sumit@123");
				PreparedStatement pst = con.prepareStatement("select * from Product");

				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setPrice(rs.getString(3));
					product.setBrand(rs.getString(4));
					product.setDescription(rs.getString(5));
					product.setSpecification(rs.getString(6));
					product.setRatingAndReview(rs.getString(7));
					product.setQuantity(rs.getString(8));
					product.setImages(rs.getString(9));
					product.setSeller(rs.getString(10));
				    
					productList.add(product);
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return productList;
		}
}
