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

/**
 * Servlet implementation class CardDetails
 */
@WebServlet("/CardDetails")
public class CardDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServiceProxy proxy = new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CardDetails() {
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
				System.out.println("Welcomes");
				//PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				String qdone ;
				
				try {
					int cid = (int)(1000 * Math.random());
					 String cname  = request.getParameter("cname"); // card Name.	
				    String cnumber = request.getParameter("cnumber");//card number
		           
					String caddress = request.getParameter("caddress"); // Last Name
					String cvv = request.getParameter("cvv"); // CVV.
		          
					System.out.println(cnumber);
					System.out.println(cname);
					System.out.println(caddress);
					System.out.println(cvv);
					
					
					proxy.setEndpoint("http://localhost:8080/Assignment2/services/Service");
							
					
					qdone = proxy.entry(cid,cname,cnumber, caddress, cvv);
				HttpSession session = request.getSession();
					System.out.println(qdone);
					RequestDispatcher reqDispatcher;
					if (qdone.equals("true")) {
						response.sendRedirect("Confirmation.jsp");
					}
					else
					{
						System.out.println("Unsuccessful entry");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}


}
