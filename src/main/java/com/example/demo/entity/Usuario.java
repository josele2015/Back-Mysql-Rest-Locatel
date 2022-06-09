package com.example.demo.entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity(name = "usuario")
//@Table(name = "usuario",
//        schema = "pruebaLocatel",
//        indexes = {@Index(name = "name_index", columnList = "name",unique = true)}
//)
@Table(name = "usuario",
        schema = "pruebalocatel")
public class Usuario implements Serializable{
	private static final long serialVersionUID=1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UsuarioTable")
    @Column(name = "iidusuario", nullable = false)
    private Integer id;

//    @Column(name = "tAliasUsuario", nullable = false, unique = true, length = 100, columnDefinition = "tAliasUsuario")
    @Column(name = "TALIASUSUARIO", nullable = false, length = 100, unique = true)
//    @Enumerated(EnumType.STRING)
    @Basic
    private String tAliasUsuario;

    @Column(name = "tpassword", nullable = false, length = 200)
    private String tPassword;

    @Column(name = "tnombreusuario", nullable = false, length = 400)
    private String tNombreUsuario;

    @Column(name = "bactivo", nullable = false)
    private Boolean bActivo = false;

    public Usuario(){
        super();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", tAliasUsuario='" + tAliasUsuario + '\'' +
                ", tPassword='" + tPassword + '\'' +
                ", tNombreUsuario='" + tNombreUsuario + '\'' +
                ", bActivo=" + bActivo +
                '}';
    }

    public Usuario(Integer id, String tAliasUsuario, String tPassword, String tNombreUsuario, Boolean bActivo) {
        this.id = id;
        this.tAliasUsuario = tAliasUsuario;
        this.tPassword = tPassword;
        this.tNombreUsuario = tNombreUsuario;
        this.bActivo = bActivo;
    }
//    @OneToMany(mappedBy = "usuario")
//    private Set<Cuenta> cuentas = new LinkedHashSet<>();
//
//    public Set<Cuenta> getCuentas() {
//        return cuentas;
//    }

//    public void setCuentas(Set<Cuenta> cuentas) {
//        this.cuentas = cuentas;
//    }

    public Boolean getBActivo() {
        return bActivo;
    }

    public void setBActivo(Boolean bActivo) {
        this.bActivo = bActivo;
    }

    public String getTNombreUsuario() {
        return tNombreUsuario;
    }

    public void setTNombreUsuario(String tNombreUsuario) {
        this.tNombreUsuario = tNombreUsuario;
    }

    public String getTPassword() {
        return tPassword;
    }

    public void setTPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public String getTAliasUsuario() {
        return tAliasUsuario;
    }

    public void setTAliasUsuario(String tAliasUsuario) {
        this.tAliasUsuario = tAliasUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}