package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices;

import java.util.List;
import java.util.Optional;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Gerente;

public interface GerenteServices {

    List<Gerente> findByAll();

    Optional<Gerente> findById(Long id);

    Gerente save(Gerente unGerente);

    Optional<Gerente> delete(Gerente unGerente);
    
}
