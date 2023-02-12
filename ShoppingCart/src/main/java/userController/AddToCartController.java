package userController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cartDao.AddToCartDao;
import userModel.Cart;
import userModel.CartEntry;
import userModel.LoginServlet;


public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
  
    public AddToCartController() {
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
		
		
	    String productId= request.getParameter("productId");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");
		
		HttpSession session = request.getSession();
		String emailId=(String) session.getAttribute("emailId");
		
	    AddToCartDao acd=new AddToCartDao();
		int cartId=acd.createCart(price, quantity,emailId );
		
		acd.createCartEntry(cartId,emailId);
		
	}
}
