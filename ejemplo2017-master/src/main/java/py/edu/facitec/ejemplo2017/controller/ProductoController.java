/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.ejemplo2017.controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import py.edu.facitec.ejemplo2017.dao.ProductoDAO;
import py.edu.facitec.ejemplo2017.model.Producto;

/**
 *
 * @author 
 */
@Transactional
@Controller
public class ProductoController {

    @Autowired
    private ProductoDAO productoDAO;

    @RequestMapping("producto")
    public String save(Producto producto) {
        System.out.println("Registrando el producto: " + producto);
        productoDAO.save(producto);
        return "view/producto/ok";
    }
}
