/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.ejemplo2017.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemplo2017.model.Producto;

/**
 *
 * @author 
 */
@Repository
public class ProductoDAO {

    @PersistenceContext
    private EntityManager manager;

    public void save(Producto producto) {
        manager.persist(producto);
    }
}
