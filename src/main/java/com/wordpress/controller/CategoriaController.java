/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.controller;

import com.wordpress.ejb.CategoriaFacadeLocal;
import com.wordpress.model.Categoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.FacesComponent;
import javax.faces.context.FacesContext;
/**
 *
 * @author CarlEdwin
 */
@Named
@ViewScoped
public class CategoriaController implements Serializable{
    
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    
    private Categoria categoria;
    
    
    @PostConstruct
    public void init(){
        categoria = new Categoria();
    }
    
    public void registrar(){
        try {
            categoriaEJB.create(getCategoria());
            categoria = new Categoria();
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(null, null, "Categoria cadastrada com sucesso!"));
        } catch (Exception e) {
            //mensaje prime growl
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(null, null, "Erro ao tentar cadastrar Categoria.   >>>" + e.getMessage() + e.getCause()));
        }
    }


    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
