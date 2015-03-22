package servlets;


//import java.io.PrintWriter;
//import java.util.Date;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ServiceProxy;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import user.User;
/**
 * Servlet implementation class Signup
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ServiceProxy proxy=new ServiceProxy();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				System.out.println("Welcomes");
				//PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				String qdone ;
				
				try {
					
						
					int membershipId = (int)(1000 * Math.random());
		            String firstName  = request.getParameter("firstname"); // First Name.
					String lastName = request.getParameter("lastname"); // Last Name
					String emailId = request.getParameter("emailId"); // Email.
		            String username = request.getParameter("username"); //Username.
					String password = request.getParameter("password"); // password.
					System.out.println(firstName);
					System.out.println(lastName);
					System.out.println(emailId);
					System.out.println(username);
					System.out.println(password);
					
					proxy.setEndpoint("http://localhost:8080/Assignment2/services/Service");
							
					
					qdone = proxy.signUp(membershipId,firstName,lastName,emailId,username,password);
				HttpSession session = request.getSession();
					System.out.println(qdone);
					RequestDispatcher reqDispatcher;
					if (qdone.equals("true")) {
						response.sendRedirect("Signin.jsp");
					}
						/*User person = proxy.signin(username,password);
						if (person == null) {
							if (session != null) {
								session.invalidate();
								
								response.sendRedirect("SignUp.jsp?isValid=No");
							}
						}

						else {
						session.setAttribute("personDetails", person);
						request.setAttribute("email",emailId);
						request.setAttribute("password",password);
						reqDispatcher = request.getRequestDispatcher("Signin.jsp?flag=1");
						reqDispatcher.forward(request, response);
						}
						
					} else {
						reqDispatcher = request.getRequestDispatcher("SignUp.jsp?flag=yes");
						reqDispatcher.forward(request, response);
					}*/
					else
					{
						System.out.println("unsuccessful Signup");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}


}
