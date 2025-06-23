package com.perfulandia.proyecto_perfulandia_web.MSProductos.ProductoControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perfulandia.proyecto_perfulandia_web.MSProductos.ProductoEntities.Producto;
import com.perfulandia.proyecto_perfulandia_web.MSProductos.ProductoRepositories.ProductoRepository;

@Controller
public class ProductoController {

    @Autowired
    ProductoRepository productorepository;

    @GetMapping("/producto")
    public String verProductos(Model model){
           List<Producto> productos =(List<Producto>) productorepository.findAll();
            model.addAttribute("productos", productos);

        return("producto");
    }
}
