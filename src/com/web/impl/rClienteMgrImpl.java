package com.web.impl;


import com.web.dao.rClienteDAOImpl;
import com.web.model.Empresa;

public class rClienteMgrImpl implements rClienteMgr {
	String sMensaje ="";
	
	@Override
	public String validarUserCliente(Empresa userCliente) {
		
		rClienteDAOImpl dao = new rClienteDAOImpl();
		String sMensaje ="";
		//validaciones 
		
		if(!userCliente.getsNombreEmpresa().trim().equals("")) {
			if(!userCliente.getsRutEmpresa().trim().equals("")) {
				//llamar al metodo del DAO
				sMensaje= dao.add(userCliente);
			}else {
				sMensaje="Debe ingresar rut.";
			}
		}else {
			sMensaje="Debe ingresar nombre de empresa";
		}
		return sMensaje;
	}
	}


