package com.web.model;

public class Trabajador {
	//atributos del objeto
	int id;
	String sNombre;
	String sEmail;
	String sRut;
	int iEmpresaID;
	
	public Trabajador() {
		
	}
	
	public Trabajador(int id, String sNombre, String sEmail, String sRut, int iEmpresaID) {
		super();
		this.id = id;
		this.sNombre = sNombre;
		this.sEmail = sEmail;
		this.sRut = sRut;
		this.iEmpresaID = iEmpresaID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsRut() {
		return sRut;
	}

	public void setsRut(String sRut) {
		this.sRut = sRut;
	}

	public int getiEmpresaID() {
		return iEmpresaID;
	}

	public void setiEmpresaID(int iEmpresaID) {
		this.iEmpresaID = iEmpresaID;
	}
	
	
}
