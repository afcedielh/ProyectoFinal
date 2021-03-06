package com.ubosque.fifa.jhs.persistence;
// Generated 8/05/2018 07:48:31 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private BigDecimal id;
     private Persona persona;
     private Usuario usuario;
     private String clave;
     private Set usuarios = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(BigDecimal id, Persona persona, Usuario usuario, String clave) {
        this.id = id;
        this.persona = persona;
        this.usuario = usuario;
        this.clave = clave;
    }
    public Usuario(BigDecimal id, Persona persona, Usuario usuario, String clave, Set usuarios) {
       this.id = id;
       this.persona = persona;
       this.usuario = usuario;
       this.clave = clave;
       this.usuarios = usuarios;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


