/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.actividad2.servicios;

import com.progra.actividad2.entidades.Loguin2;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author relop
 */
@Local
public interface Loguin2FacadeLocal {

    void create(Loguin2 loguin2);

    void edit(Loguin2 loguin2);

    void remove(Loguin2 loguin2);

    Loguin2 find(Object id);

    List<Loguin2> findAll();

    List<Loguin2> findRange(int[] range);

    int count();
    
}
