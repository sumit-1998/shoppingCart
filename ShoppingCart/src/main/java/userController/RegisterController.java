package userController;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cartDao.UserDao;
import userModel.User;

/**
 * Servlet 	implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
	    String emailId=request.getParameter("emailId");
	    String dob=request.getParameter("dob");
	    String phoneNo=request.getParameter("phoneNo");
	    String password=request.getParameter("password");
	    String forgotPasswordQuestion=request.getParameter("forgotPasswordQuestion");
	    String forgotPasswordAnswer=request.getParameter("forgotPasswordAnswer");
		User usermodel = new User();
		
		usermodel.setFirstName(firstName);
		usermodel.setLastName(lastName);
		usermodel.setEmailId(emailId);
		usermodel.setDob(dob);
		usermodel.setPhoneNo(phoneNo);
		usermodel.setPassword(password);
		usermodel.setForgetPasswordQuestion(forgotPasswordQuestion);
		usermodel.setForgetPasswordAnswer(forgotPasswordAnswer);
		

		RequestDispatcher dispatcher = null;

		UserDao userdao=new UserDao();
		RequestDispatcher rd=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online shopping cart","root","Sumit@123");
			PreparedStatement pst=con.prepareStatement("insert into user(firstName,lastName,emailId,dob,password,forgotPasswordQuestion,forgotPasswordAnswer)values(?,?,?,?,?,?,?)");
			pst.setString(1, firstName);
			pst.setString(2, lastName);
			pst.setString(3, emailId);
			pst.setString(4, dob);
			pst.setString(5, phoneNo);
			pst.setString(6, password);
			pst.setString(7, forgotPasswordQuestion);
			pst.setString(8, forgotPasswordAnswer);
            
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
		}
	}
}
