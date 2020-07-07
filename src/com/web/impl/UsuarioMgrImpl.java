package com.web.impl;

import com.web.dao.UsuarioDAOImpl;
import com.web.model.Usuario;

//logica de negocio
public class UsuarioMgrImpl implements UsuarioMgr{
	String sMensaje ="";
	//metodos 
	public String validarUser(Usuario user) {
		
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		String sMensaje ="";
		//validaciones 
		if(!user.getsNombre().trim().equals("")) {
			if(!user.getsPassword().trim().equals("")) {
				//llamar al metodo del DAO
				sMensaje= dao.add(user);
			}else {
				sMensaje="Debe ingresar password.";
			}
		}else {
			sMensaje="Debe ingresar nombre de usuario";
		}
		return sMensaje;
	}

	@Override
	public Usuario exist(Usuario user) {
		//instancia clase DAO
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		
		Usuario usuario = null;
		//validaciones 
		if(!user.getsNombre().trim().equals("")) {
			if(!user.getsPassword().trim().equals("")) {
				//llamando al metodo del DAO
				usuario= dao.exist(user);
			}
		}
		
		return usuario;
	}

	
	

	
}
