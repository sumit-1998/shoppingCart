package userController;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cartDao.ProductDao;
import cartDao.UserDao;
import userModel.Product;


public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request, response);
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping cart","root","Sumit@123");
		
		ProductDao productdao=new ProductDao();
		List<Product> productList=productdao.getProductList();
		PreparedStatement pst=con.prepareStatement("Select * from product");
		ResultSet rs1=pst.executeQuery();
		while(rs1.next())
		{
			Product product=new Product();
			product.setProductId(rs1.getInt(1));
			product.setName(rs1.getString(2));
			product.setPrice(rs1.getString(3));
			product.setBrand(rs1.getString(4));
			product.setDescription(rs1.getString(5));
			product.setSpecification(rs1.getString(6));
			product.setRatingAndReview(rs1.getString(7));
			product.setQuantity(rs1.getString(8));
			product.setImages(rs1.getString(9));
			product.setSeller(rs1.getString(10));
	     }
		System.out.println(productList);
		request.setAttribute("productList", productList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("productList.jsp");
		requestDispatcher.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}		
}


		
		
		
		
		
		
		
		
		/*String name = request.getParameter("name");
		String price = request.getParameter("price");
	    String brand=request.getParameter("brand");
	    String description=request.getParameter("description");
	    String specification=request.getParameter("specification");
	    String ratingAndReview=request.getParameter("ratingAndReview");
	    String quantity=request.getParameter("quantity");
	    String images=request.getParameter("images");
	    String seller=request.getParameter("seller");
		Product product = new Product();
		
		product.setName(name);
		product.setPrice(price);
		product.setBrand(brand);
		product.setDescription(description);
		product.setSpecification(specification);
		product.setRatingAndReview(ratingAndReview);
		product.setQuantity(quantity);
		product.setQuantity(images);
		product.setSeller(seller);
		

		RequestDispatcher dispatcher = null;

		ProductDao productdao=new ProductDao();
		RequestDispatcher rd=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping cart","root","Sumit@123");
			PreparedStatement pst=con.prepareStatement("insert into user(name,price,brand,description,specification,ratingAndReview,quantity,images,seller)values(?,?,?,?,?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, price);
			pst.setString(3, brand);
			pst.setString(4, description);
			pst.setString(5, specification);
			pst.setString(6, ratingAndReview);
			pst.setString(7, quantity);
			pst.setString(8, images);
			pst.setString(9, seller);
            
	        int rowCount=pst.executeUpdate();
	        rd=request.getRequestDispatcher("login.jsp");
	        if(rowCount>0)
	        {
	        	request.setAttribute("status","success");
	        }
	        else
	        {
	        	request.setAttribute("status","failed");
	        }
	        rd.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
