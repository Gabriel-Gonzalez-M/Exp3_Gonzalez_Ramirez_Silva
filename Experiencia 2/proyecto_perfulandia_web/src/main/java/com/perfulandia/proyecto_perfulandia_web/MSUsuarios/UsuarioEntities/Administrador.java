package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;


@Entity
public class Administrador extends Usuario{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;
    private String cargo;

    


     public Administrador() {
    }



    public Administrador(int rut, char dv, String pnombre, String snombre, String apPaterno, String apMaterno,
            int telefono, LocalDate nacimiento, String permiso, Long id, String estado, String cargo) {
        super(rut, dv, pnombre, snombre, apPaterno, apMaterno, telefono, nacimiento, permiso);
        this.id = id;
        this.estado = estado;
        this.cargo = cargo;
    }











    public Long getId() {
        return id;
    }











    public void setId(Long id) {
        this.id = id;
    }











    public String getEstado() {
        return estado;
    }











    public void setEstado(String estado) {
        this.estado = estado;
    }











    public String getCargo() {
        return cargo;
    }











    public void setCargo(String cargo) {
        this.cargo = cargo;
    }











    @Override
    public String toString() {
        return "Administrador [id=" + id + ", estado=" + estado + ", cargo=" + cargo + "]";
    }


    
    
    
    

   

}
