package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;


@Entity
public class Gerente extends Usuario{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fechaIngreso;
    private int idSucursal;
    private String estado;
    private String turno;



    public Gerente(){
        
    }

    public Gerente(int rut, char dv, String pnombre, String snombre, String apPaterno, String apMaterno, int telefono,
            LocalDate nacimiento, String permiso, Long id, LocalDate fechaIngreso, int idSucursal, String estado,
            String turno) {
        super(rut, dv, pnombre, snombre, apPaterno, apMaterno, telefono, nacimiento, permiso);
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.idSucursal = idSucursal;
        this.estado = estado;
        this.turno = turno;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }


    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    public int getIdSucursal() {
        return idSucursal;
    }


    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getTurno() {
        return turno;
    }


    public void setTurno(String turno) {
        this.turno = turno;
    }


    @Override
    public String toString() {
        return "Gerente [id=" + id + ", fechaIngreso=" + fechaIngreso + ", idSucursal=" + idSucursal + ", estado="
                + estado + ", turno=" + turno + "]";
    }



    
    
    
   

    

}
