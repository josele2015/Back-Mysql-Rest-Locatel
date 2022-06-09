package com.example.demo.dao;

public class UsuarioDao {
	private Integer id;
	private String tAliasUsuario;
	private String tPassword;
	private String tNombreUsuario;
	private Boolean bActivo = false;
	private String token;

	public UsuarioDao() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String gettAliasUsuario() {
		return tAliasUsuario;
	}
	public void settAliasUsuario(String tAliasUsuario) {
		this.tAliasUsuario = tAliasUsuario;
	}
	public String gettPassword() {
		return tPassword;
	}
	public void settPassword(String tPassword) {
		this.tPassword = tPassword;
	}
	public String gettNombreUsuario() {
		return tNombreUsuario;
	}
	public void settNombreUsuario(String tNombreUsuario) {
		this.tNombreUsuario = tNombreUsuario;
	}
	public Boolean getbActivo() {
		return bActivo;
	}
	public void setbActivo(Boolean bActivo) {
		this.bActivo = bActivo;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
