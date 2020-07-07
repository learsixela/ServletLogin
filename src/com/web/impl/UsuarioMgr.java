package com.web.impl;

import com.web.model.Mensaje;
import com.web.model.Usuario;

public interface UsuarioMgr {

	Mensaje validarUser(Usuario user);
	Usuario exist(Usuario user);


	
}
