package com.perfulandia.proyecto_perfulandia_web.MSProductos.ProductoServices;

import java.util.List;
import java.util.Optional;


import com.perfulandia.proyecto_perfulandia_web.MSProductos.ProductoEntities.Producto;


public interface ProductoServices {

    List<Producto> findByAll();
    
    Optional<Producto> findById(Long id);

    Producto save(Producto unProducto);

    Optional<Producto> delete(Producto unProducto);
}
