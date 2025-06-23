package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Empleado;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioRepositories.EmpleadoRepository;

@Service
public class EmpleadoServicesImpl implements EmpleadoServices {

    @Autowired
    private EmpleadoRepository empleadorepository;


    @Override
    @Transactional
    public Optional<Empleado> delete(Empleado unEmpleado) {
        Optional<Empleado> empleadoOptional = empleadorepository.findById(unEmpleado.getId());
        empleadoOptional.ifPresent(empleadoDb -> {empleadorepository.delete(unEmpleado);});
        return empleadoOptional;
    }

    @Override
    @Transactional(readOnly = true)    
    public List<Empleado> findByAll() {
        return (List<Empleado>) empleadorepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Empleado> findById(Long id) {
        return empleadorepository.findById(id);
    }

    @Override
    @Transactional
    public Empleado save(Empleado unEmpleado) {
        return empleadorepository.save(unEmpleado);
    }

    

}
