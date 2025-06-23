package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices;

import java.util.List;
import java.util.Optional;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Administrador;

public interface AdministradorServices {

    List<Administrador> findByAll();

    Optional<Administrador> findById(Long id);

    Administrador save(Administrador unAdministrador);

    Optional <Administrador> delete(Administrador unAdministrador);

}
