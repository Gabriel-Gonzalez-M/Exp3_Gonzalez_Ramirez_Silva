package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Gerente;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioRepositories.GerenteRepository;

@Controller
public class GerenteController {


    @Autowired
    GerenteRepository gerenterepository;

    @GetMapping("/gerente")
    public String gerente(Model model){
        List<Gerente> gerentes =(List<Gerente>)gerenterepository.findAll();
        model.addAttribute("gerentes", gerentes);


        return "gerente";

       


        
    }

}
