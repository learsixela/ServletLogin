package com.web.idao;

import java.util.List;

import com.web.model.Usuario;
 
public interface IUsuarioDao {
	//declaración de métodos para acceder a la base de datos
	public List<Usuario> obtenerUsuarios();
	public Usuario obtenerUsuario(int id);
	public void actualizarUsuario(Usuario usuario);
	public void eliminarUsuario(Usuario usuario);
}