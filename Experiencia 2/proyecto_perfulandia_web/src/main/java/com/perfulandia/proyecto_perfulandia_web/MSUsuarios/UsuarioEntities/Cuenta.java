package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass //con esto decimos a JPA que esta clase no tiene su propia tabla, pero si hereda a las subclases (para hacerlo de forma automatica)
public abstract class Cuenta {

    private String correo;
    private String contrasena;

    
    
    public Cuenta() {
    }

    public Cuenta(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Cuenta [correo=" + correo + ", contrasena=" + contrasena + "]";
    }


    
    


}
