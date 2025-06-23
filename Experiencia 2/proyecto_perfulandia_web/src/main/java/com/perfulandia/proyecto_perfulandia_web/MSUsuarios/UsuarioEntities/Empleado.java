package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;


@Entity
public class Empleado extends Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fechaIngreso;
    private String estado;
    private String cargo;
    private String turno;
    private int idSucursal;


    
    public Empleado(){
        
    }



    public Empleado(int rut, char dv, String pnombre, String snombre, String apPaterno, String apMaterno, int telefono,
            LocalDate nacimiento, String permiso, Long id, LocalDate fechaIngreso, String estado, String cargo,
            String turno, int idSucursal) {
        super(rut, dv, pnombre, snombre, apPaterno, apMaterno, telefono, nacimiento, permiso);
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
        this.cargo = cargo;
        this.turno = turno;
        this.idSucursal = idSucursal;
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







    public String getTurno() {
        return turno;
    }







    public void setTurno(String turno) {
        this.turno = turno;
    }






    public int getIdSucursal() {
        return idSucursal;
    }



    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }



    @Override
    public String toString() {
        return "Empleado [id=" + id + ", fechaIngreso=" + fechaIngreso + ", estado=" + estado + ", cargo=" + cargo
                + ", turno=" + turno + ", idSucursal=" + idSucursal + "]";
    }


    

    

}
