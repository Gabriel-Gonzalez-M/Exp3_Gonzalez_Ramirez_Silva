package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Empleado;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioRepositories.EmpleadoRepository;

@Controller
public class EmpleadoController {

    @Autowired
    EmpleadoRepository empleadorepository;

    @GetMapping("/empleado")
    public String empleado (Model model){
        List<Empleado> empleados = (List<Empleado>)empleadorepository.findAll();
        model.addAttribute("empleados", empleados);


        return "empleado";
        
    }

}
