package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices;

import java.util.List;
import java.util.Optional;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Cliente;

public interface ClienteServices {

    List<Cliente> findByAll();

    Optional<Cliente> findById(Long id);

    Cliente save(Cliente unCliente);

    Optional<Cliente> delete(Cliente unCliente);
    
}
