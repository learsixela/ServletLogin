package com.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.impl.rAccidenteMgrImpl;
import com.web.model.RAccidentes;


/**
 * Servlet implementation class RegistroAccidentes
 */
@WebServlet("/RegistroAccidentes")
public class RegistroAccidentes extends HttpServlet {
	private static final long serialVersionUID = 1L; 
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
		  	String sRazonSocial = request.getParameter("razonSocial");
		  	String sRutEmpresa = request.getParameter("rutEmpresa");
		  	String sFechaAccidente = request.getParameter("fechaAccidente");
		  	String sNivelAccidente = request.getParameter("nivelAccidente");
		  	String sNombreAccidentado = request.getParameter("nombreAccidentado");
		  	String sApellidoPac = request.getParameter("apellidoPac");
			String sApellidoMac = request.getParameter("apellidoMac");
			String sObsAC = request.getParameter("obsAc");
			
			
        

        
        //instacia al objeto usuario
       RAccidentes newAccidente = new RAccidentes();
        
      newAccidente.setsNombreEmpresa(sNombreEmpresa);
      newAccidente.setsRazonSocial(sRazonSocial);
      newAccidente.setsRutEmpresa(sRutEmpresa);
      newAccidente.setsFechaAccidente(sFechaAccidente);
      newAccidente.setsNivelAccidente(sNivelAccidente);
      newAccidente.setsNombreAccidentado(sNombreAccidentado);
      newAccidente.setsApellidoPac(sApellidoPac);
      newAccidente.setsApellidoMac(sApellidoMac);
      newAccidente.setsObsAc(sObsAC);
        
        //asigno al objeto las variables

        
        //instancia a las clases
        rAccidenteMgrImpl mgr= new rAccidenteMgrImpl();
      	
        
        String sResultado=  mgr.validarUsuarioAccidente(newAccidente);
        
        request.setAttribute("mensaje", sResultado);
		
        response.sendRedirect("/MiServlet/Home");
		
		
	}

}