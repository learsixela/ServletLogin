package com.web.impl;



import com.web.dao.RAccidentesDAOImpl;
import com.web.model.RAccidentes;

public class rAccidenteMgrImpl implements rAccidenteMgr {
	String sMensaje ="";
	
	@Override
	public String validarUsuarioAccidente(RAccidentes newAccidente) {
		RAccidentesDAOImpl dao = new RAccidentesDAOImpl();
		String sMensaje ="";
		//validaciones 
		
		if(!newAccidente.getsNombreEmpresa().trim().equals("")) {
			if(!newAccidente.getsRutEmpresa().trim().equals("")) {
				//llamar al metodo del DAO
				sMensaje= dao.add(newAccidente);
			}else {
				sMensaje="Debe ingresar rut.";
			}
		}else {
			sMensaje="Debe ingresar nombre de empresa";
		}
		return sMensaje;
		

	}
	

}

	

