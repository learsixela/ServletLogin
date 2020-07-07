package com.web.dao;

import java.util.List;

import com.web.model.Empresa;

public interface rClienteDAO {

    public List listar();
    public Empresa read(int id);
    public Empresa exist(Empresa  userCliente);
    public String add(Empresa per);
    public boolean edit(Empresa per);
    public boolean eliminar(int id);
}
