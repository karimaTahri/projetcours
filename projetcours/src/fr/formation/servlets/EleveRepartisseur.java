package fr.formation.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EleveRepartisseur
 */
@WebServlet("/EleveRepartisseur")
public class EleveRepartisseur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EleveRepartisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			// Appeler le bean pour les enregistrer ds la base
			fr.formation.bean.Eleve eleve = new fr.formation.bean.Eleve();
			eleve.setNom(request.getParameter("tnom"));
			eleve.setPrenom(request.getParameter("tprenom"));
			eleve.setAdresse(request.getParameter("tadresse"));
			eleve.setNele(request.getParameter("tnele"));
			
			
			//
			request.setAttribute("Eleve",eleve);
			
		} catch (Exception e) {
			;
		}
		
		
		/*getServletContext().getRequestDispatcher(
				"/ResultatGestionEleve.jsp").forward(request, response);

*/
		
		getServletContext().getRequestDispatcher(
				"/ResultatGestionEleveBalise.jsp").forward(request, response);

		
		
		
		
		/*
		 * RequestDispatcher repartiteur =
		 * getServletContext().getRequestDispatcher("/Banniere"); if
		 * (repartiteur != null) repartiteur.include(request, response);
		 * 
		 * response.setContentType("text/html"); PrintWriter out =
		 * response.getWriter(); out.println("<HTML>"); out.println("<HEAD>");
		 * out.println("<TITLE>Réponse doPost</TITLE>"); out.println("</HEAD>");
		 * out.println("<BODY>"); out.println("<TABLE border=1>"); Enumeration
		 * lesParametres = request.getParameterNames(); String nomParametre;
		 * while (lesParametres.hasMoreElements()) { nomParametre = (String)
		 * lesParametres.nextElement(); out.println("<TR>"); out.println("<TD>"
		 * + nomParametre + "</TD>"); out.println("<TD>" +
		 * request.getParameter(nomParametre) + "</TD>"); out.println("</TR>");
		 * } out.println("</TABLE>"); out.println("</BODY>");
		 * out.println("</HTML>"); out.flush(); out.close();
		 * 
		 * 
		 * response.setContentType("text/html"); PrintWriter out =
		 * response.getWriter(); out.println("<HTML>"); out.println("<HEAD>");
		 * out.println("<TITLE>Réponse doPost</TITLE>"); out.println("</HEAD>");
		 * out.println("<BODY>"); // obtenir la valeur des différents paramètres
		 * out.println("<TABLE border=1>"); out.println("<TR>");
		 * out.println("<TD>Nom</TD>"); out.println("<TD>" +
		 * request.getParameter("tnom") + " </TD>"); out.println("</TR>");
		 * out.println("<TR>"); out.println("<TD>Prenom</TD>");
		 * out.println("<TD>" + request.getParameter("tprenom") + "</TD>");
		 * out.println("</TR>"); out.println("<TR>");
		 * out.println("<TD>Adresse</TD>"); out.println("<TD>" +
		 * request.getParameter("tadresse") + "</TD>"); out.println("</TR>");
		 * out.println("<TR>"); out.println("<TD>Né(e) le</TD>");
		 * out.println("<TD>" + request.getParameter("tnele") + "</TD>");
		 * out.println("</TR>"); out.println("</TABLE>");
		 * out.println("</BODY>"); out.println("</HTML>"); out.flush();
		 * out.close();
		 */
	}

}
