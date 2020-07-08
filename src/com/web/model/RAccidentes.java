package com.web.model;

public class RAccidentes {
	
	

	int id;
    String sNombreEmpresa;
    String sRazonSocial;
    String sRutEmpresa;
    String sFechaAccidente;
    String sNivelAccidente;
    String sNombreAccidentado;
    String sApellidoPac;
    String sApellidoMac;
    String sObsAc;
	



public RAccidentes() {}




public RAccidentes(int id, String sNombreEmpresa, String sRazonSocial, String sRutEmpresa,
		String sFechaAccidente, String sNivelAccidente, String sNombreAccidentado, String sApellidoPac,
		String sApellidoMac, String sObsAc) {
	super();
	this.id = id;
	this.sNombreEmpresa = sNombreEmpresa;
	this.sRazonSocial = sRazonSocial;
	this.sRutEmpresa = sRutEmpresa;
	this.sFechaAccidente = sFechaAccidente;
	this.sNivelAccidente = sNivelAccidente;
	this.sNombreAccidentado = sNombreAccidentado;
	this.sApellidoPac = sApellidoPac;
	this.sApellidoMac = sApellidoMac;
	this.sObsAc = sObsAc;
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




public String getsRazonSocial() {
	return sRazonSocial;
}




public void setsRazonSocial(String sRazonSocial) {
	this.sRazonSocial = sRazonSocial;
}




public String getsRutEmpresa() {
	return sRutEmpresa;
}




public void setsRutEmpresa(String sRutEmpresa) {
	this.sRutEmpresa = sRutEmpresa;
}




public String getsFechaAccidente() {
	return sFechaAccidente;
}




public void setsFechaAccidente(String sFechaAccidente) {
	this.sFechaAccidente = sFechaAccidente;
}




public String getsNivelAccidente() {
	return sNivelAccidente;
}




public void setsNivelAccidente(String sNivelAccidente) {
	this.sNivelAccidente = sNivelAccidente;
}




public String getsNombreAccidentado() {
	return sNombreAccidentado;
}




public void setsNombreAccidentado(String sNombreAccidentado) {
	this.sNombreAccidentado = sNombreAccidentado;
}




public String getsApellidoPac() {
	return sApellidoPac;
}




public void setsApellidoPac(String sApellidoPac) {
	this.sApellidoPac = sApellidoPac;
}




public String getsApellidoMac() {
	return sApellidoMac;
}




public void setsApellidoMac(String sApellidoMac) {
	this.sApellidoMac = sApellidoMac;
}




public String getsObsAc() {
	return sObsAc;
}




public void setsObsAc(String sObsAc) {
	this.sObsAc = sObsAc;
}







}