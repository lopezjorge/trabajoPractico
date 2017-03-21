/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.ejemplo2017.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author 
 */
@Entity
//@Table(name="Nombre tabla")
//Investigar Hibernate validator
public class Usuario {
    @Id
    @Column(unique = true) //columna con resticcion unica
    private String login;
    private String nombre;
    private String password;
    
    @OneToMany(mappedBy = "usuario")
    private List<Pedido> pedidos;
    
    @ManyToOne
    private Departamento departamento;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", nombre=" + nombre + ", password=" + password + ", departamento=" + departamento + '}';
    }
    
    
}
