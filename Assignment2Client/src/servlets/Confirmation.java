package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.Quantity;
import connection.ServiceProxy;

/**
 * Servlet implementation class Confirmation
 */
@WebServlet("/Confirmation")
public class Confirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ServiceProxy proxy = new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out = response.getWriter();
				//connection.ServiceProxy proxy = new connection.ServiceProxy();
				response.setContentType("text/html");
				
				//System.out.println("Insidepost");
				try {
                    int confno = (int)(10 * Math.random());
					HttpSession session = request.getSession(true);
					proxy.setEndpoint("http://localhost:8080/Assignment2/services/Service");
					
					int rdata = proxy.confirm(confno);
					if( rdata == 1)
					{
						System.out.println("Transaction Successfull");
			
					user.Confirmation del = proxy.delivery(confno);
							System.out.println(del);
					if(del == null){
						response.sendRedirect("SignUp.jsp?isValid=No");
						//response.sendRedirect("CardDetails.jsp");
					}
					
					else {
						   
						session.setAttribute("personDetails", del);
						System.out.println("delivery" + " " + del.getDdate());
						RequestDispatcher reqDispatcher = request.getRequestDispatcher("CardDetails.jsp");
						response.sendRedirect("CardDetails.jsp");
						reqDispatcher.forward(request, response);
							  
					}
							
					}
					else
					{
						System.out.println("Transaction failed");
					}
					
					
					
                                         
			//System.out.println(qdone)                  

					//System.out.println(fdata);
					//System.out.println(cdata);
					if (rdata == 0) {
						if (session != null) {
							session.invalidate();
							
							response.sendRedirect(".jsp?isValid=No");
						}
					}

					else {
						//System.out.println(rdata);
						session.setAttribute("done", rdata);
						RequestDispatcher reqDispatcher = request.getRequestDispatcher("Confirmation.jsp");
						reqDispatcher.forward(request, response);
					}
				
				}catch (Exception e) {
					e.printStackTrace();
				}
			}

}
