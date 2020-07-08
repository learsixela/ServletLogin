package com.web.dao;

import java.util.List;

import com.web.model.RAccidentes;

public interface RAccidentesDAO {

	
    public List listar();
    public RAccidentes read(int id);
    public RAccidentes exist(RAccidentes  newAccidente);
    public String add(RAccidentes per);
    public boolean edit(RAccidentes per);
    public boolean eliminar(int id);
}
