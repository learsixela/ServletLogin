package com.web.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.web.model.Mensaje;
import com.web.model.Trabajador;
import com.web.util.Conexion;

public class TrabajadorDAOImpl implements TrabajadorDAO{
	
	Conexion cn=new Conexion();
	Connection con ;
	Statement stmt ;
	ResultSet resul ;

	Trabajador trabajador = new Trabajador();
	Mensaje mensaje = new Mensaje();
	
	//constructor vacio
	public TrabajadorDAOImpl() {
		
	}

	@Override
	public Mensaje agregarTrabajador(Trabajador trabajador) {
		
        String query = "INSERT INTO trabajador (nombre,email,rut,empresa_id) VALUES ( '"+ 
        		trabajador.getsNombre()+  "' , '" +
        		trabajador.getsEmail() + "' , '" +
        		trabajador.getsRut() + "' , '" +
        		trabajador.getiEmpresaID() + "' )";
        
        try {
            con=cn.getConnection();
            stmt=con.prepareStatement(query);
            int resultado = stmt.executeUpdate(query);
            if(resultado == 1) {
            	mensaje.setsMensaje("Trabajador agregado con exito");
            }else {
            	mensaje.setsMensaje("Error al registrar Trabajador");
            	mensaje.setiEstado(0);
            }
            
        } catch (SQLException e) {
        	mensaje.setsMensaje("Error al ejecutar la consulta: "+ query);
        	mensaje.setiEstado(0);
		}
        
		return mensaje;
	}
	
}