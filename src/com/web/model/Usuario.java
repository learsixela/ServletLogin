package com.web.model;

public class Usuario {
	//atributos del objeto
	int id;
	String sNombre;
	String sEmail;
	String sRut;
	String sPassword;
	
	//constructor vacio
	public Usuario() {
		
	}
	
	//constructor con parametros
	public Usuario(int iId, String sNombre, String sEmail, String sRut, String sPassword) {
		super();
		this.id = iId;
		this.sNombre = sNombre;
		this.sEmail = sEmail;
		this.sRut = sRut;
		this.sPassword = sPassword;
	}
	
	//get y set
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

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

}
