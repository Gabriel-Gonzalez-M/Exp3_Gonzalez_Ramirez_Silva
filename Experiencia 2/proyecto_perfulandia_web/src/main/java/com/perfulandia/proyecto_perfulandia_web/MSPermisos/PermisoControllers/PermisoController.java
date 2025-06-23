package com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoEntities.Permiso;
import com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoRepositories.PermisoRepository;

@Controller
public class PermisoController {

    @Autowired
    PermisoRepository permisorepository;

    @GetMapping("/permiso")
    public String permiso(Model model){
        List<Permiso> permisos = (List<Permiso>) permisorepository.findAll();
        model.addAttribute("permisos", permisos);
        return "permiso";
    }

}
