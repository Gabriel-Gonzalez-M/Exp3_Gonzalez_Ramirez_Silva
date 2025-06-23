package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Cliente;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioRepositories.ClienteRepository;

@Controller
public class ClienteController {

    
    @Autowired
    ClienteRepository clienterepository;

    @GetMapping("/cliente")
    public String cliente(Model model){
        List <Cliente> clientes =(List<Cliente>)clienterepository.findAll();
        model.addAttribute("clientes", clientes);

        return "cliente";
    }

}
