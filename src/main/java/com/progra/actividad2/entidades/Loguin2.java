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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author relop
 */
@Entity
@Table(name = "LOGUIN2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loguin2.findAll", query = "SELECT l FROM Loguin2 l"),
    @NamedQuery(name = "Loguin2.findByIdLoguin", query = "SELECT l FROM Loguin2 l WHERE l.idLoguin = :idLoguin"),
    @NamedQuery(name = "Loguin2.findByUsuario", query = "SELECT l FROM Loguin2 l WHERE l.usuario = :usuario"),
    @NamedQuery(name = "Loguin2.findByContrase\u00f1a", query = "SELECT l FROM Loguin2 l WHERE l.contrase\u00f1a = :contrase\u00f1a"),
    @NamedQuery(name = "Loguin2.findByNombreUsuario", query = "SELECT l FROM Loguin2 l WHERE l.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Loguin2.findByApellidoUsuario", query = "SELECT l FROM Loguin2 l WHERE l.apellidoUsuario = :apellidoUsuario")})
public class Loguin2 implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_LOGUIN")
    private BigDecimal idLoguin;
    @Size(max = 100)
    @Column(name = "USUARIO")
    private String usuario;
    @Size(max = 100)
    @Column(name = "CONTRASE\u00d1A")
    private String contraseña;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
