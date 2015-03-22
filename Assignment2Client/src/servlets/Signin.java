package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.ServiceProxy;
import user.User;


/**
 * Servlet implementation class onSignUp
 */
@WebServlet("/Signin")
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy=new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//PrintWriter out = response.getWriter();
		connection.ServiceProxy proxy = new connection.ServiceProxy();
		response.setContentType("text/html");

		try {
			HttpSession session = request.getSession(true);

			String username = request.getParameter("username"); 
			String password = request.getParameter("password");
			System.out.println(password);
			System.out.println(username);
			proxy.setEndpoint("http://localhost:8080/Assignment2/services/Service");
		
			User person = proxy.signin(username, password);
			System.out.println(person);
			if(person ==null){
				response.sendRedirect("SignUp.jsp?isValid=No");
				//response.sendRedirect("CardDetails.jsp");
			}
			
			else {
				   
				//session.setAttribute("personDetails", person);
				RequestDispatcher reqDispatcher = request.getRequestDispatcher("CardDetails.jsp");
				response.sendRedirect("CardDetails.jsp");
				reqDispatcher.forward(request, response);
			}
		
		}
			catch (Exception e) {
			e.printStackTrace();
		}
	}
	}