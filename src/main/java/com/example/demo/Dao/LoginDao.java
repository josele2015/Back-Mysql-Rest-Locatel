package com.example.demo.dao;

public class LoginDao {
//	private static final long serialVersionUID=-1;
   
	private String Usuario;
	private String Password;
	
	public LoginDao() {}
	
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}
