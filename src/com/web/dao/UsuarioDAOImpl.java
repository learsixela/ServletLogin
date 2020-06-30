package com.web.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.web.model.Usuario;

import com.web.util.Conexion;

public class UsuarioDAOImpl implements UsuarioDAO{
	
	Conexion cn=new Conexion();
	Connection con ;
	Statement stmt ;
	ResultSet resul ;

	Usuario usuario = new Usuario();
	
	public UsuarioDAOImpl() {
		
	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario list(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String add(Usuario user) {
		String  mensaje ="";
        String query = "INSERT INTO usuario (nombre,rut,email,pass) VALUES ( '"+ user.getsNombre()+  "' , '" +
        		user.getsRut() + "' , '" +
        		user.getsEmail() + "' , '" + 
        		user.getsPassword() + "' )";
        System.out.println("Query: " + query);
        try {
            con=cn.getConnection();
            stmt=con.prepareStatement(query);
            stmt.executeUpdate(query);
        } catch (SQLException e) {
			System.out.println("Error al ejecutar la consulta: "+ query);
		}

        mensaje = "Usuario agregado con exito";
		return mensaje;
	}

	@Override
	public boolean edit(Usuario per) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
