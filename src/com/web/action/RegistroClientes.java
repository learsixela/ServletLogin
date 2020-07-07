package com.web.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.impl.UsuarioMgrImpl;
import com.web.impl.rClienteMgrImpl;
import com.web.model.Empresa;
import com.web.model.Usuario;
import com.web.util.Mensajes;

/**
 * Servlet implementation class Clientes
 */
@WebServlet("/RegistroClientes")
public class RegistroClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Mensajes mensajeSalida = new Mensajes();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		 //capturando el valor que pasan por url
		  	String sNombreEmpresa = request.getParameter("nombreEmpresa");
	        String sRutEmpresa = request.getParameter("rutEmpresa");
	        String sGiroEmpresa = request.getParameter("giroEmpresa");
	        String sNombreContacto = request.getParameter("nombreContacto");
	        String sTelefono = request.getParameter("telefono");
	        String sCorreo = request.getParameter("correo");
	        String sRegion = request.getParameter("region");
	        String sCiudad = request.getParameter("ciudad");
	        String sDireccion = request.getParameter("direccion");
	        
        

        
        //instacia al objeto usuario
        Empresa userCliente = new Empresa();
        //asigno al objeto las variables
        userCliente.setsNombreEmpresa(sNombreEmpresa);
        userCliente.setsRutEmpresa(sRutEmpresa);
        userCliente.setsGiroEmpresa(sGiroEmpresa);
        userCliente.setsNombreContacto(sNombreContacto);
        userCliente.setsTelefono(sTelefono);
        userCliente.setsCorreo(sCorreo);
        userCliente.setsRegion(sRegion);
        userCliente.setsCiudad(sCiudad);
        userCliente.setsDireccion(sDireccion);
        
        
        
        
        //instancia a las clases
        
        rClienteMgrImpl mgr= new rClienteMgrImpl();
        
  
        
        
        String sResultado=  mgr.validarUserCliente(userCliente);
        
        PrintWriter salida = response.getWriter();
  
      
        mensajeSalida.mensajeSalidaHome(response, salida, sResultado);
        salida.close();
		
		
		
		
	}

}
