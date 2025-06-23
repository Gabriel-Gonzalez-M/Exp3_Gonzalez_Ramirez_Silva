package com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoEntities.Permiso;
import com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoRepositories.PermisoRepository;

@Service
public class PermisoServicesImpl implements PermisoServices {

    @Autowired
    private PermisoRepository permisorepository;

    
    @Override
    @Transactional
    public Optional<Permiso> delete(Permiso unPermiso) {
        Optional<Permiso> permisOptional = permisorepository.findById(unPermiso.getId());
        permisOptional.ifPresent(permisoDb ->{permisorepository.delete(unPermiso);});
        return permisOptional;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Permiso> findByAll() {
        return (List<Permiso>) permisorepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Permiso> findById(Long id) {
        return permisorepository.findById(id);
    }

    @Override
    @Transactional
    public Permiso save(Permiso unPermiso) {
        return permisorepository.save(unPermiso);
    }


    
}
