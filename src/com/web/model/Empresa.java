package com.web.model;

public class Empresa {

	

	int id;
	String sNombreEmpresa;
    String sRutEmpresa;
    String sGiroEmpresa;
    String sNombreContacto; 
    String sTelefono; 
    String sCorreo; 
    String sRegion; 
    String sCiudad; 
    String sDireccion; 

public Empresa() { 
}


	public Empresa(int id, String sNombreEmpresa, String sRutEmpresa, String sGiroEmpresa, String sNombreContacto,
			String sTelefono, String sCorreo, String sRegion, String sCiudad, String sDireccion) {
		super();
		this.id = id;
		this.sNombreEmpresa = sNombreEmpresa;
		this.sRutEmpresa = sRutEmpresa;
		this.sGiroEmpresa = sGiroEmpresa;
		this.sNombreContacto = sNombreContacto;
		this.sTelefono = sTelefono;
		this.sCorreo = sCorreo;
		this.sRegion = sRegion;
		this.sCiudad = sCiudad;
		this.sDireccion = sDireccion;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getsNombreEmpresa() {
		return sNombreEmpresa;
	}


	public void setsNombreEmpresa(String sNombreEmpresa) {
		this.sNombreEmpresa = sNombreEmpresa;
	}


	public String getsRutEmpresa() {
		return sRutEmpresa;
	}


	public void setsRutEmpresa(String sRutEmpresa) {
		this.sRutEmpresa = sRutEmpresa;
	}


	public String getsGiroEmpresa() {
		return sGiroEmpresa;
	}


	public void setsGiroEmpresa(String sGiroEmpresa) {
		this.sGiroEmpresa = sGiroEmpresa;
	}


	public String getsNombreContacto() {
		return sNombreContacto;
	}


	public void setsNombreContacto(String sNombreContacto) {
		this.sNombreContacto = sNombreContacto;
	}


	public String getsTelefono() {
		return sTelefono;
	}


	public void setsTelefono(String sTelefono) {
		this.sTelefono = sTelefono;
	}


	public String getsCorreo() {
		return sCorreo;
	}


	public void setsCorreo(String sCorreo) {
		this.sCorreo = sCorreo;
	}


	public String getsRegion() {
		return sRegion;
	}


	public void setsRegion(String sRegion) {
		this.sRegion = sRegion;
	}


	public String getsCiudad() {
		return sCiudad;
	}


	public void setsCiudad(String sCiudad) {
		this.sCiudad = sCiudad;
	}


	public String getsDireccion() {
		return sDireccion;
	}


	public void setsDireccion(String sDireccion) {
		this.sDireccion = sDireccion;
	}



}


