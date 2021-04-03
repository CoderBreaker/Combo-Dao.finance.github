package createAccount;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createAccount")
public class createAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("exampleInputEmai");
		String password=request.getParameter("exampleInputPassword");
		String confirmpassword=request.getParameter("confirmexampleInputPassword");
		
		
          try{
        	  Class.forName("com.mysql.jdbc.Driver");
        	  Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/combo","root","root");
              PreparedStatement stmt=Con.prepareStatement("insert into Dao");
              stmt.setString(1,email);
              stmt.setString(2,password);
              stmt.setString(3,confirmpassword);
              out.println("your data has been successfully entred");
              stmt.executeUpdate();
          } catch(Exception e){
        	  e.printStackTrace();
        	  
          }
	 }



}
