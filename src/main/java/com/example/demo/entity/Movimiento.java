package com.example.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "movimiento")
@Table(name = "movimiento", indexes = {
        @Index(name = "fk_movimiento_cuenta1_idx", columnList = "cuenta_iidcuenta")
})
//@Table(name = "movimiento")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "movimientotable")
    @Column(name = "iidmovimiento", nullable = false)
    private Integer iIDMovimiento;

    @MapsId("cuentaiidcuenta")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cuenta_iidcuenta", nullable = false, referencedColumnName = "iidcuenta")
    private Cuenta cuentaIidcuenta;

    @Column(name = "dvalormovimiento", nullable = false, precision = 40, scale = 2)
    private BigDecimal dValorMovimiento;

    @Column(name = "ttipomovimiento", nullable = false, length = 50)
    private String tTipoMovimiento;

    @Column(name = "bactivo", nullable = false)
    private Boolean bActivo = false;

    public Boolean getBActivo() {
        return bActivo;
    }

    public void setBActivo(Boolean bActivo) {
        this.bActivo = bActivo;
    }

    public String getTTipoMovimiento() {
        return tTipoMovimiento;
    }

    public void setTTipoMovimiento(String tTipoMovimiento) {
        this.tTipoMovimiento = tTipoMovimiento;
    }

    public BigDecimal getDValorMovimiento() {
        return dValorMovimiento;
    }

    public void setDValorMovimiento(BigDecimal dValorMovimiento) {
        this.dValorMovimiento = dValorMovimiento;
    }

    public void setCuentaIidcuenta(Cuenta cuentaIidcuenta) {
        this.cuentaIidcuenta = cuentaIidcuenta;
    }

    public Integer getIIDMovimiento() {
        return iIDMovimiento;
    }

    public void setIIDMovimiento(Integer iIDMovimiento) {
        this.iIDMovimiento = iIDMovimiento;
    }

}