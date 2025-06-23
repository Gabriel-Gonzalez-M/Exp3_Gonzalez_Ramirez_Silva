package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices;

import java.util.List;
import java.util.Optional;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Empleado;

public interface EmpleadoServices {

    List<Empleado> findByAll();

    Optional<Empleado> findById(Long id);

    Empleado save(Empleado unEmpleado);

    Optional<Empleado> delete(Empleado unEmpleado);
    
} 
