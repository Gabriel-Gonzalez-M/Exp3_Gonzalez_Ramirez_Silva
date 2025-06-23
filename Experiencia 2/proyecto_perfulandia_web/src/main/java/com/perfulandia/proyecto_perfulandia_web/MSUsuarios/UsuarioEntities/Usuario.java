package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities;

import jakarta.persistence.MappedSuperclass;
import java.time.LocalDate;



@MappedSuperclass
public class Usuario extends Cuenta{

    

    private int rut;
    private char dv;
    private String pnombre;
    private String snombre;
    private String apPaterno;
    private String apMaterno;
    private int telefono;  
    private LocalDate nacimiento;
    private String permiso;


    public Usuario() {
        super(); 
    }




    public Usuario(int rut, char dv, String pnombre, String snombre, String apPaterno, String apMaterno, int telefono,
            LocalDate nacimiento, String permiso) {
        this.rut = rut;
        this.dv = dv;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.permiso = permiso;
    }





    public int getRut() {
        return rut;
    }





    public void setRut(int rut) {
        this.rut = rut;
    }





    public char getDv() {
        return dv;
    }





    public void setDv(char dv) {
        this.dv = dv;
    }





    public String getPnombre() {
        return pnombre;
    }





    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }





    public String getSnombre() {
        return snombre;
    }





    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }





    public String getApPaterno() {
        return apPaterno;
    }





    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }





    public String getApMaterno() {
        return apMaterno;
    }





    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }





    public int getTelefono() {
        return telefono;
    }





    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }





    public LocalDate getNacimiento() {
        return nacimiento;
    }





    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }





    public String getPermiso() {
        return permiso;
    }





    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }





    @Override
    public String toString() {
        return "Usuario [rut=" + rut + ", dv=" + dv + ", pnombre=" + pnombre + ", snombre=" + snombre + ", apPaterno="
                + apPaterno + ", apMaterno=" + apMaterno + ", telefono=" + telefono + ", nacimiento=" + nacimiento
                + ", permiso=" + permiso + "]";
    }



    //////////////////////////////////////////Metodos///////////////////////////////////////////

   

    

}
