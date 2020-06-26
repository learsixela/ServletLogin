package com.web.dao;
import java.util.ArrayList;
import java.util.List;

import com.web.model.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.web.idao.IUsuarioDao;

public class UsuarioDao implements IUsuarioDao {
	Connection conector;
	Statement stmt = conector.createStatement(); 
	List<Usuario> usuarios  = new ArrayList<>();


	@Override
	public List<Usuario> obtenerUsuarios() {
		// TODO Auto-generated method stub
		return usuarios;
	}

	@Override
	public Usuario obtenerUsuario(int id) {
		// TODO Auto-generated method stub
		return usuarios.get((int) id);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
	
}
