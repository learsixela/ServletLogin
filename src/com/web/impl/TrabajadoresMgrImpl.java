package com.web.impl;

import com.web.dao.TrabajadorDAOImpl;
import com.web.model.Mensaje;
import com.web.model.Trabajador;

//logica de negocio
public class TrabajadoresMgrImpl implements TrabajadoresMgr{
	Mensaje mensaje = new Mensaje();

	@Override
	public Mensaje agregarTrabajador(Trabajador trabajador) {
		TrabajadorDAOImpl dao = new TrabajadorDAOImpl();
			
		dao.agregarTrabajador(trabajador);
		return mensaje;
	}
	

}
