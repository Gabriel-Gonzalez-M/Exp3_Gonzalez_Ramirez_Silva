package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Administrador;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioRepositories.AdministradorRepository;

@Controller
public class AdministradorController {


    @Autowired 
    AdministradorRepository administradorrepository; 

    @GetMapping("/administrador") 
    public String administrador(Model model){ 
        List <Administrador> administradores = (List<Administrador>) administradorrepository.findAll(); 
        model.addAttribute("administradores", administradores); 

        return "administrador"; 

    }

}
