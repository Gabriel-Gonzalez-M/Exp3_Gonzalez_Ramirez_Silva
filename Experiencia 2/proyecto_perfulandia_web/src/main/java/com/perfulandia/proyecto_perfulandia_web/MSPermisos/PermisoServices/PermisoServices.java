package com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoServices;

import java.util.List;
import java.util.Optional;

import com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoEntities.Permiso;

public interface PermisoServices {

    List<Permiso> findByAll();

    Optional<Permiso> findById(Long id);

    Permiso save(Permiso unPermiso);

    Optional<Permiso> delete(Permiso unPermiso);
    
}
