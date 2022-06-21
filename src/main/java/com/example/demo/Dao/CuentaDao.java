package com.example.demo.dao;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.example.demo.entity.Usuario;

public class CuentaDao {
    private Integer iIDCuenta;
    private Usuario usuarioIidusuario;
	private Integer iValorInicial;
    private BigDecimal dSaldo;
    private Boolean bActivo = false;
    private Usuario usuario;
    private BigDecimal dNumeroCuenta;

    private Integer getiIDCuenta() {
		return iIDCuenta;
	}
	private void setiIDCuenta(Integer iIDCuenta) {
		this.iIDCuenta = iIDCuenta;
	}
	private Usuario getUsuarioIidusuario() {
		return usuarioIidusuario;
	}
	private void setUsuarioIidusuario(Usuario usuarioIidusuario) {
		this.usuarioIidusuario = usuarioIidusuario;
	}
	private Integer getiValorInicial() {
		return iValorInicial;
	}
	private void setiValorInicial(Integer iValorInicial) {
		this.iValorInicial = iValorInicial;
	}
	private BigDecimal getdSaldo() {
		return dSaldo;
	}
	private void setdSaldo(BigDecimal dSaldo) {
		this.dSaldo = dSaldo;
	}
	private Boolean getbActivo() {
		return bActivo;
	}
	private void setbActivo(Boolean bActivo) {
		this.bActivo = bActivo;
	}
	private Usuario getUsuario() {
		return usuario;
	}
	private void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	private BigDecimal getdNumeroCuenta() {
		return dNumeroCuenta;
	}
	private void setdNumeroCuenta(BigDecimal dNumeroCuenta) {
		this.dNumeroCuenta = dNumeroCuenta;
	}

}
