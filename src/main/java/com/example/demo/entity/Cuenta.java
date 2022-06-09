package com.example.demo.entity;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name = "cuenta")
@Table(name = "cuenta", indexes = {
        @Index(name = "fk_cuenta_usuario1_idx", columnList = "usuario_iidusuario")
})
//@Table(name = "cuenta")
public class Cuenta implements Serializable{
	private static final long serialVersionUID=2;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "cuentatable")
    @Column(name = "IIDCUENTA", nullable = false)
    private Integer iIDCuenta;
    @MapsId("usuarioiidusuario")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_iidusuario", nullable = false)
    private Usuario usuarioIidusuario;

    @Column(name = "ivalorinicial", nullable = false)
    private Integer iValorInicial;

    @Column(name = "dsaldo", nullable = false, precision = 50, scale = 2)
    private BigDecimal dSaldo;

    @Column(name = "bactivo", nullable = false)
    private Boolean bActivo = false;

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "usuario_i_id_usuario")
//    private Usuario usuario;
    @Column(name = "dnumerocuenta", nullable = false, precision = 30)
    private BigDecimal dNumeroCuenta;


//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }

    public Boolean getBActivo() {
        return bActivo;
    }

    public void setBActivo(Boolean bActivo) {
        this.bActivo = bActivo;
    }

    public BigDecimal getDSaldo() {
        return dSaldo;
    }

    public void setDSaldo(BigDecimal dSaldo) {
        this.dSaldo = dSaldo;
    }

    public Integer getIValorInicial() {
        return iValorInicial;
    }

    public void setIValorInicial(Integer iValorInicial) {
        this.iValorInicial = iValorInicial;
    }

    public Usuario getUsuarioIidusuario() {
        return usuarioIidusuario;
    }

    public void setUsuarioIidusuario(Usuario usuarioIidusuario) {
        this.usuarioIidusuario = usuarioIidusuario;
    }

    public BigDecimal getDNumeroCuenta() {
        return dNumeroCuenta;
    }

    public void setDNumeroCuenta(BigDecimal dNumeroCuenta) {
        this.dNumeroCuenta = dNumeroCuenta;
    }

    public Integer getIIDCuenta() {
        return iIDCuenta;
    }

    public void setIIDCuenta(Integer iIDCuenta) {
        this.iIDCuenta = iIDCuenta;
    }

////    @Override
////    public int hashCode() {
////        return Objects.hash(dNumeroCuenta, iIDCuenta, usuarioIidusuario);
////    }
//
    public Integer getiIDCuenta() {
        return iIDCuenta;
    }

    public void setiIDCuenta(Integer iIDCuenta) {
        this.iIDCuenta = iIDCuenta;
    }

    public Integer getiValorInicial() {
        return iValorInicial;
    }

    public void setiValorInicial(Integer iValorInicial) {
        this.iValorInicial = iValorInicial;
    }

    public BigDecimal getdSaldo() {
        return dSaldo;
    }

    public void setdSaldo(BigDecimal dSaldo) {
        this.dSaldo = dSaldo;
    }

    public Boolean getbActivo() {
        return bActivo;
    }

    public void setbActivo(Boolean bActivo) {
        this.bActivo = bActivo;
    }

    public BigDecimal getdNumeroCuenta() {
        return dNumeroCuenta;
    }

    public void setdNumeroCuenta(BigDecimal dNumeroCuenta) {
        this.dNumeroCuenta = dNumeroCuenta;
    }

//    @OneToMany(mappedBy = "cuenta")
//    private Set<Movimiento> movimientos = new LinkedHashSet<>();
//
//    public Set<Movimiento> getMovimiento() {
//        return movimientos;
//    }
//
//    public void setMovimientos(Set<Movimiento> Movimiento) {
//        this.movimientos = movimientos;
//    }

}