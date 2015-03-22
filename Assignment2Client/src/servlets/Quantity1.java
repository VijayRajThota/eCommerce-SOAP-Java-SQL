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
 * Servlet implementation class Quantity1
 */
@WebServlet("/Quantity1")
public class Quantity1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ServiceProxy proxy = new ServiceProxy();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Quantity1() {
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
		connection.ServiceProxy proxy = new connection.ServiceProxy();
		response.setContentType("text/html");

		try {
			HttpSession session = request.getSession(true);

			String brand = request.getParameter("brand"); 
			String count = request.getParameter("count");
			proxy.setEndpoint("http://localhost:8080/Assignment2/services/Service");
			
			
			Quantity quantity = proxy.amount(brand);
			  
			
			if (quantity == null) {
				//if (session != null) {
					//session.invalidate();
					
					response.sendRedirect("NoItem.jsp");
				//}
			}

			else { 
				String newcount = quantity.getCount();
				//response.sendRedirect("Signin.jsp?isValid=No");
				session.setAttribute("quantity", newcount);
				System.out.println("count is " + quantity.getCount());
				int aInt1 = Integer.parseInt(newcount);
				int aInt2 = Integer.parseInt(count);
				if (aInt2 <= aInt1)
				{
						
					Quantity ncount = proxy.increment(brand, count);
					if (ncount !=null)
					{
						System.out.println("Successful updated");
					}
					else
					{
						System.out.println("updation failed");
					}
					response.sendRedirect("Signin.jsp?isValid=No");
							
				}
				else 
				{
					response.sendRedirect("NoItem.jsp?isValid=No");
				}
				//RequestDispatcher reqDispatcher = request.getRequestDispatcher("Signin.jsp");
				//reqDispatcher.forward(request, response);
			}
				
					}
		catch (Exception e) {
			e.printStackTrace();
		}

}
}
