package com.web.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.impl.UsuarioMgrImpl;
import com.web.model.Mensaje;
import com.web.model.Usuario;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Mensaje mensaje = new Mensaje();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //capturando el valor que pasan por url
        String sNombre = request.getParameter("nombre");
        String sRut = request.getParameter("rut");
        String sPass = request.getParameter("pass");
        String sEmail = request.getParameter("email");
        
        //instacia al objeto usuario
        Usuario user = new Usuario();
        //asigno al objeto las variables
        user.setsNombre(sNombre);
        user.setsRut(sRut);
        user.setsPassword(sPass);
        user.setsEmail(sEmail);
        
        //instancia a las clases
        UsuarioMgrImpl mgr = new UsuarioMgrImpl();
        
        mensaje =  mgr.validarUser(user);
        
        request.setAttribute("mensaje", mensaje);
        
        RequestDispatcher view;
        
        if(mensaje.getiEstado()==1) {
        	//redireccionando
        	view = request.getRequestDispatcher("/Login.jsp");
        }else {
        	//redireccionando
    		view = request.getRequestDispatcher("/Registro.jsp");
        }
		
		// pasar request, y el response
		view.forward(request, response);
	}

}
