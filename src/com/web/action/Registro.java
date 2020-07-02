package com.web.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.impl.UsuarioMgr;
import com.web.impl.UsuarioMgrImpl;
import com.web.model.Usuario;
import com.web.util.Mensajes;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Mensajes mensajeSalida = new Mensajes();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
        //capturando el valor que pasan por url
        String sNombre = request.getParameter("nombre");
        String sRut = request.getParameter("rut");
        String sPass = request.getParameter("pass");
        

        
        //instacia al objeto usuario
        Usuario user = new Usuario();
        //asigno al objeto las variables
        user.setsNombre(sNombre);
        user.setsRut(sRut);
        user.setsPassword(sPass);
        user.setsEmail("a@a.cl");
        
        //instancia a las clases
        UsuarioMgrImpl mgr = new UsuarioMgrImpl();
        
        String sResultado=  mgr.validarUser(user);
        
        PrintWriter salida = response.getWriter();
  
      
        mensajeSalida.mensajeSalidaHome(response, salida, sResultado);
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
