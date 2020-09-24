/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.actividad2.ejb;

import com.progra.actividad2.entidades.Loguin2;
import com.progra.actividad2.servicios.Loguin2FacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author relop
 */
@Named("loguinbean")
@RequestScoped
public class ejbloguin {

    @EJB
    private Loguin2FacadeLocal loguin2Facade;
    
    
       public ejbloguin(){
           
       }
           public List<Loguin2>getLoguin2(){
           
               return this.loguin2Facade.findAll();
               
  }
}
