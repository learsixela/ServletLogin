package com.web.dao;

import java.util.List;

import com.web.model.Mensaje;
import com.web.model.Usuario;

public interface UsuarioDAO {

    public List listar();
    public Usuario read(int id);
    public Usuario exist(Usuario user);
    public Mensaje add(Usuario per);
    public boolean edit(Usuario per);
    public boolean eliminar(int id);
}
