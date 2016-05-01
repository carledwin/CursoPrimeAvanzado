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
        setCategoria(new Categoria());
    }
    
    public void registrar(){
        try {
            categoriaEJB.create(getCategoria());
        } catch (Exception e) {
            //mensaje prime growl
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
