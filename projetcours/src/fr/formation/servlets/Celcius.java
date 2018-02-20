package fr.formation.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Celcius
 */
@WebServlet("/Celcius")
public class Celcius extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Celcius() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("converter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String celcius = request.getParameter("celcius");
		
		try{
			float floatCelcius = Float.parseFloat(celcius);
			float result = (floatCelcius * 9/5) + 32;
			System.out.println("result :" + result);
			request.setAttribute("result", result);
		}catch(NumberFormatException e){
			String message="Mauvais format";
			request.setAttribute("message", message);	
		}
		
		
		request.getRequestDispatcher("/converter.jsp").forward(request, response);	

	}

}
