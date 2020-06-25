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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   	PrintWriter out;
		    String title = "Bienvenido";

		    // primero selecciona el tipo de contenidos y otros campos de cabecera de la respuesta
		    response.setContentType("text/html");
		    // Luego escribe los datos de la respuesta
		    out = response.getWriter();
		    out.println("<HTML><HEAD><TITLE>");
		    out.println(title);
		    out.println("</TITLE></HEAD><BODY>");
		    out.println("<H1>" + title + "</H1>");
		    out.println("<P>This is output from SimpleServlet.");
		    out.println("</BODY></HTML>");
		    out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter salida = response.getWriter();
        
		String nombre = request.getParameter("nombre");
		String sPass = request.getParameter("password");
		
		if(nombre!= null && sPass != null) {
	        HttpSession session = request.getSession();
	        String nombre_session = (String) session.getAttribute("nombre");
	        String rut_session = (String) session.getAttribute("rut");
	        String pass_session = (String) session.getAttribute("pass");
			
	        if(nombre.equals(nombre_session) && sPass.equals(pass_session)) {
	        	doGet(request, response);
	        }else {
	        	mensajeSalida(salida,"<h1>Error en el Login</h1>");
	        }
		}else {
			mensajeSalida(salida,"<h1>Error debe ingresar ambos parametros</h1>");
		}
		
	}
	
	public PrintWriter mensajeSalida(PrintWriter salida, String mensaje) {
        salida.println("<HTML><HEAD><TITLE>");
	    salida.println("title");
	    salida.println("</TITLE></HEAD><BODY>");
        salida.println(mensaje);
        salida.println("</BODY></HTML>");
        salida.close();
		
		return salida;
	}

}
