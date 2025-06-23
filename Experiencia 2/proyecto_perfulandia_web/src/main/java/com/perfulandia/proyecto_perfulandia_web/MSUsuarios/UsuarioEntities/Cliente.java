package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Cliente extends Usuario{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String perfil;
    private String nick;
    private String calle;
    private int numeroCasa;
    private String comuna;
    

    public Cliente (){
        
    }
    


    public Cliente(int rut, char dv, String pnombre, String snombre, String apPaterno, String apMaterno, int telefono,
            LocalDate nacimiento, String permiso, Long id, String perfil, String nick, String calle, int numeroCasa,
            String comuna) {
        super(rut, dv, pnombre, snombre, apPaterno, apMaterno, telefono, nacimiento, permiso);
        this.id = id;
        this.perfil = perfil;
        this.nick = nick;
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.comuna = comuna;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getPerfil() {
        return perfil;
    }


    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }


    public String getNick() {
        return nick;
    }


    public void setNick(String nick) {
        this.nick = nick;
    }


    public String getCalle() {
        return calle;
    }


    public void setCalle(String calle) {
        this.calle = calle;
    }


    public int getNumeroCasa() {
        return numeroCasa;
    }


    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }


    public String getComuna() {
        return comuna;
    }


    public void setComuna(String comuna) {
        this.comuna = comuna;
    }


    @Override
    public String toString() {
        return "Cliente [id=" + id + ", perfil=" + perfil + ", nick=" + nick + ", calle=" + calle + ", numeroCasa="
                + numeroCasa + ", comuna=" + comuna + "]";
    }




    
    


    


}
