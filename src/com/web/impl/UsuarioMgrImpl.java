package com.web.impl;

import com.web.dao.UsuarioDAOImpl;
import com.web.model.Usuario;

public class UsuarioMgrImpl implements UsuarioMgr{

	@SuppressWarnings("null")
	@Override
	public String validarUser(Usuario user) {
		UsuarioDAOImpl dao = new UsuarioDAOImpl();
		String sMensaje ="";
		
		if(!user.getsNombre().equals("")) {
			if(!user.getsPassword().equals("")) {
				user.setsEmail("a@a.cl");
				sMensaje= dao.add(user);
			}
		}else {
			sMensaje="Error al actualizar";
		}
		return sMensaje;
	}

	
}
