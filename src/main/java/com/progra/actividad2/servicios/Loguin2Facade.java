/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.actividad2.servicios;

import com.progra.actividad2.entidades.Loguin2;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author relop
 */
@Stateless
public class Loguin2Facade extends AbstractFacade<Loguin2> implements Loguin2FacadeLocal {

    @PersistenceContext(unitName = "Actividad2")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Loguin2Facade() {
        super(Loguin2.class);
    }
    
}
