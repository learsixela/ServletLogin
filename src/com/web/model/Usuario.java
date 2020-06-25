package com.web.model;

public class Usuario {

	String sNombre;
	String sEmail;
	String sRut;
	String sPassword;
	
	public Usuario() {
		
	}
	
	public Usuario(String sNombre, String sEmail, String sRut, String sPassword) {
		super();
		this.sNombre = sNombre;
		this.sEmail = sEmail;
		this.sRut = sRut;
		this.sPassword = sPassword;
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
