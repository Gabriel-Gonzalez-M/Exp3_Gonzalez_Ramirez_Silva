package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Administrador;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioRepositories.AdministradorRepository;

@Service
public class AdministradorServiceImpl implements AdministradorServices{

    @Autowired
    private AdministradorRepository administradorepository;

    @Override
    @Transactional
    public Optional<Administrador> delete(Administrador unAdministrador) {
        Optional<Administrador> administraOptional = administradorepository.findById(unAdministrador.getId());
        administraOptional.ifPresent(administradorDb ->{ 
            administradorepository.delete(unAdministrador);
        });
        return administraOptional;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Administrador> findByAll() {
        
        return (List<Administrador>) administradorepository.findAll(); 
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Administrador> findById(Long id) {
        
        return administradorepository.findById(id); 
    }

    @Override
    @Transactional
    public Administrador save(Administrador unAdministrador) { 
        
        return administradorepository.save(unAdministrador); 
    }

    

}
