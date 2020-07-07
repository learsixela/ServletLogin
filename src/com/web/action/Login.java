package com.web.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.impl.UsuarioMgrImpl;
import com.web.model.Usuario;
import com.web.util.Mensajes;

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
		 response.sendRedirect("/MiServlet/Home");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter salida = response.getWriter();
        //capturando lal variables que vienen desde el form login.jsp
		String sEmail = request.getParameter("email");
		String sPass = request.getParameter("password");
		
		//instancia del objeto
		Usuario user = new Usuario();
		user.setsEmail(sEmail);
		user.setsPassword(sPass);
		
		//instancia a la clase mgrImpl
		UsuarioMgrImpl mgrImpl = new UsuarioMgrImpl();
		
		//llamado al metodo
		 user = mgrImpl.exist(user);
		
		if(user!= null) {
			String idUsuario= user.getId()+"";
			Cookie usuarioCookie = new Cookie("idUsuario",idUsuario);

		    // cookie durante un día
			usuarioCookie.setMaxAge(60*60*24);
		    response.addCookie(usuarioCookie);
		    
	        // almacenando al informacion o parametro en sesion
	        HttpSession session = request.getSession();
	        session.setAttribute("nombre", user.getsNombre());

	        doGet(request, response);
		}else {
			Mensajes msg = new Mensajes();
			msg.mensajeSalida(salida,"<h1>Usuario no existente</h1>");
		}
		
	}

}
