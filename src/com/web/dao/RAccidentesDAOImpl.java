package com.web.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import com.web.model.RAccidentes;
import com.web.util.Conexion;

public class RAccidentesDAOImpl implements RAccidentesDAO {

	
	Conexion cn=new Conexion();
	Connection con ;
	Statement stmt ;
	ResultSet resul ;

	RAccidentes raccidentes= new RAccidentes();

	
	//constructor vacio
	
public RAccidentesDAOImpl() {
	
}
	
	
@Override
public String add(RAccidentes newAccidente) {
	
	String  mensaje ="";
    String query = "INSERT INTO registro_accidentes (nEmpresa,razonEmpresa,rutEmpresa,fechaAccidente,nivelAccidente,nombreAccidentado,apellidoPAC,apellidoMAC,obs) VALUES ( '"+ 
    		 newAccidente.getsNombreEmpresa()+  "' , '" +
    		 newAccidente.getsRazonSocial() + "' , '" +
    		 newAccidente.getsRutEmpresa() + "' , '" + 
    		 newAccidente.getsFechaAccidente() + "' , '" +
    		 newAccidente.getsNivelAccidente() + "' , '" +
    		 newAccidente.getsNombreAccidentado() + "' , '" + 
    		 newAccidente.getsApellidoPac() + "' , '" +
    		 newAccidente.getsApellidoMac() + "' , '" +	 
    		 newAccidente.getsObsAc() + "' )";
    
    
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
	public RAccidentes read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RAccidentes exist(RAccidentes newAccidente) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean edit(RAccidentes per) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
