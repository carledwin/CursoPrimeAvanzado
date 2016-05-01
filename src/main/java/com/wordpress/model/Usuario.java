/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author CarlEdwin
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    @Id
    @OneToOne
    @JoinColumn(name="codigo", nullable = false)
    private Persona codgio;
    private String usuario;
    private String clave;
    private String tipo;
    private short estado = 1;

    
    
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the estado
     */
    public short getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(short estado) {
        this.estado = estado;
    }

    /**
     * @return the codgio
     */
    public Persona getCodgio() {
        return codgio;
    }

    /**
     * @param codgio the codgio to set
     */
    public void setCodgio(Persona codgio) {
        this.codgio = codgio;
    }
    
    
}
