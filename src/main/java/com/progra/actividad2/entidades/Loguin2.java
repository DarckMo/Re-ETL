/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.actividad2.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 *
 * @author relop
 */
@Entity
@Table(name = "LOGUIN2")
public class Loguin2 implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="loguin2_sec", sequenceName="sec_cod_loguin2", allocationSize = 1 )
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="loguin2_sec")
    @Column(name = "ID_LOGUIN")
    private BigDecimal idLoguin;
    @Size(max = 100)
    @Column(name = "USUARIO")
    private String usuario;
    @Size(max = 100)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Size(max = 50)
    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;
    @Size(max = 50)
    @Column(name = "APELLIDO_USUARIO")
    private String apellidoUsuario;

    public Loguin2() {
    }

    public Loguin2(BigDecimal idLoguin) {
        this.idLoguin = idLoguin;
    }

    public BigDecimal getIdLoguin() {
        return idLoguin;
    }

    public void setIdLoguin(BigDecimal idLoguin) {
        this.idLoguin = idLoguin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLoguin != null ? idLoguin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loguin2)) {
            return false;
        }
        Loguin2 other = (Loguin2) object;
        if ((this.idLoguin == null && other.idLoguin != null) || (this.idLoguin != null && !this.idLoguin.equals(other.idLoguin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.progra.actividad2.entidades.Loguin2[ idLoguin=" + idLoguin + " ]";
    }
    
}
