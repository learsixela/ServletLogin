package com.web.dao;

import java.util.List;

import com.web.model.Usuario;

public interface UsuarioDAO {

    public List listar();
    public Usuario list(int id);
    public String add(Usuario per);
    public boolean edit(Usuario per);
    public boolean eliminar(int id);
}
