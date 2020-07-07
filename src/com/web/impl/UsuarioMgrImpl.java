package com.web.impl;

import com.web.dao.UsuarioDAOImpl;
import com.web.model.Mensaje;
import com.web.model.Usuario;

//logica de negocio
public class UsuarioMgrImpl implements UsuarioMgr{
	Mensaje mensaje = new Mensaje();
	//metodos 
	public Mensaje validarUser(Usuario user) {
		
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		//validaciones
		if(!user.getsEmail().trim().equals("")) {
			if(!user.getsNombre().trim().equals("")) {
				if(!user.getsPassword().trim().equals("")) {
					//llamar al metodo del DAO
					mensaje = dao.add(user);
				}else {
	            	mensaje.setsMensaje("Debe ingresar password.");
	            	mensaje.setiEstado(0);
				}
			}else {
            	mensaje.setsMensaje("Debe ingresar nombre de usuario.");
            	mensaje.setiEstado(0);
			}
		}else {
			mensaje.setsMensaje("Debe ingresar email de usuario.");
        	mensaje.setiEstado(0);
		}	
		return mensaje;
	}

	@Override
	public Usuario exist(Usuario user) {
		//instancia clase DAO
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		
		Usuario usuario = null;
		//validaciones 
		if(!user.getsEmail().trim().equals("")) {
			if(!user.getsPassword().trim().equals("")) {
				//llamando al metodo del DAO
				usuario= dao.exist(user);
			}
		}
		
		return usuario;
	}

	
	

	
}
