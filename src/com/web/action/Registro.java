package com.web.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
        //capturando el valor que pasan por url
        String nombre = request.getParameter("nombre");
        String rut = request.getParameter("rut");
        String pass = request.getParameter("pass");
        // almacenando al informacion o paramtro en sesion
        session.setAttribute("nombre", nombre);
        session.setAttribute("rut", rut);
        session.setAttribute("pass", pass);
        
        PrintWriter salida = response.getWriter();
        String title = "Registro";
        response.setContentType("text/html");
        salida.println("<HTML><HEAD><TITLE>");
	    salida.println(title);
	    salida.println("</TITLE></HEAD><BODY>");
        salida.println("<h1>Registro Exitoso</h1>");
        salida.println("<br>");
        salida.println("<a href='Index.jsp'>Login</h1>");
        salida.println("</BODY></HTML>");
        salida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
