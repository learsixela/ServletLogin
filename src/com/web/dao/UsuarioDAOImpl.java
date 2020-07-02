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
	
	//constructor vacio
	public UsuarioDAOImpl() {
		
	}

	@Override
	public String add(Usuario user) {
		String  mensaje ="";
        String query = "INSERT INTO usuario (nombre,rut,email,pass) VALUES ( '"+ 
        		user.getsNombre()+  "' , '" +
        		user.getsRut() + "' , '" +
        		user.getsEmail() + "' , '" + 
        		user.getsPassword() + "' )";
        //comprobar que la query esta hecha correctamente
        System.out.println("Query: " + query);
        try {
            con=cn.getConnection();
            stmt=con.prepareStatement(query);
            int resultado = stmt.executeUpdate(query);
            if(resultado == 1) {
            	mensaje = "Usuario agregado con exito";
            }else {
            	mensaje = "Error al registrar usuario";
            }
            
        } catch (SQLException e) {
        	mensaje = "Error al ejecutar la consulta: "+ query;
			System.out.println("Error al ejecutar la consulta: "+ query);
		}
        
		return mensaje;
	}
	
	@Override
	public Usuario exist(Usuario user) {
		Usuario usuario = null;
		 String query = "SELECT id,nombre,rut,email,pass FROM usuario WHERE nombre ='"
		 		+ user.getsNombre() +"' AND pass = '"+user.getsPassword()+"' ";
		 //System.out.println("Query: " + query);
	        try {
	            con=cn.getConnection();
	            stmt=con.prepareStatement(query);
	            resul=stmt.executeQuery(query);
	            //recorriendo el objeto
	            while(resul.next()){
	            	usuario = new Usuario();
	            	usuario.setId(resul.getInt("id"));
	            	usuario.setsNombre(resul.getString("nombre"));
	            	usuario.setsRut(resul.getString("rut"));
	            	usuario.setsPassword(resul.getString("pass"));
	            	usuario.setsEmail(resul.getString("email"));
	     
	            }
	        } catch (Exception e) {
	        }
		return usuario;
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

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
