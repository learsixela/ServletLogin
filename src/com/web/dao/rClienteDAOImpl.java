package com.web.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.web.model.Empresa;

import com.web.util.Conexion;

public class rClienteDAOImpl implements rClienteDAO {

	Conexion cn=new Conexion();
	Connection con ;
	Statement stmt ;
	ResultSet resul ;

	Empresa empresa = new Empresa();
	
	//constructor vacio
	
	public rClienteDAOImpl() {
		
	}

	
	@Override
	public String add(Empresa userCliente) {
		String  mensaje ="";
        String query = "INSERT INTO usercliente (nombre,rut,giro,nombre_contacto,telefono,correo,region,ciudad,direccion) VALUES ( '"+ 
        		 userCliente.getsNombreEmpresa()+  "' , '" +
        		 userCliente.getsRutEmpresa() + "' , '" +
        		 userCliente.getsGiroEmpresa() + "' , '" + 
        		 userCliente.getsNombreContacto() + "' , '" +
        		 userCliente.getsTelefono() + "' , '" +
        		 userCliente.getsCorreo() + "' , '" + 
        		 userCliente.getsRegion() + "' , '" +
        		 userCliente.getsCiudad() + "' , '" +	 
        		 userCliente.getsDireccion() + "' )";
        
        
        //comprobar que la query esta hecha correctamente
        System.out.println("Query: " + query);
        try {
            con=cn.getConnection();
            stmt=con.prepareStatement(query);
            int resultado = stmt.executeUpdate(query);
            if(resultado == 1) {
            	mensaje = "Empresa agregada con exito";
            }else {
            	mensaje = "Error al registrar Empresa";
            }
            
        } catch (SQLException e) {
        	mensaje = "Error al ejecutar la consulta: "+ query;
			System.out.println("Error al ejecutar la consulta: "+ query);
		}
        
		return mensaje;
	}
	
	
	
	
	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa exist(Empresa user) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean edit(Empresa per) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}


}
