package fr.formation.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		Cookie gateau = new Cookie("nom", "test");
		gateau.setMaxAge(999);
		response.addCookie(gateau);

		
		Cookie gateau1 = new Cookie("nom2", "test");
		gateau1.setMaxAge(999);
		response.addCookie(gateau1);
		
		Cookie gateau2= new Cookie("nom3", "test");
		gateau2.setMaxAge(999);
		response.addCookie(gateau2);
		
		Cookie gateau3 = new Cookie("nom4", "test");
		gateau3.setMaxAge(999);
		response.addCookie(gateau3);
		
		Cookie gateau4 = new Cookie("nom5", "test");
		gateau4.setMaxAge(999);
		response.addCookie(gateau4);
		
		Cookie gateau5 = new Cookie("nom6", "test");
		gateau5.setMaxAge(999);
		response.addCookie(gateau5);
		
		
		getServletContext().getRequestDispatcher(
				"/default.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
