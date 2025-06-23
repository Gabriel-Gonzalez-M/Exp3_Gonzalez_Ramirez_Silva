package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioRestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Empleado;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices.EmpleadoServices;

@RestController
@RequestMapping("api/empleados")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoServices empleadoservices;

    @GetMapping
    public List<Empleado> verEmpleados(){
        return (List<Empleado>) empleadoservices.findByAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> verDetalle(@PathVariable Long id){
        Optional<Empleado> empleadOptional = empleadoservices.findById(id);
        if (empleadOptional.isPresent()) {
            return ResponseEntity.ok(empleadOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Empleado> crear(@RequestBody Empleado unEmpleado){
        return ResponseEntity.status(HttpStatus.CREATED).body(empleadoservices.save(unEmpleado));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable Long id, @RequestBody Empleado unEmpleado){
        Optional<Empleado> empleadOptional = empleadoservices.findById(id);
        if (empleadOptional.isPresent()) {
            Empleado empleadoExiste = empleadOptional.get();
            empleadoExiste.setApMaterno(unEmpleado.getApMaterno());
            empleadoExiste.setApPaterno(unEmpleado.getApPaterno());
            empleadoExiste.setCargo(unEmpleado.getCargo());
            empleadoExiste.setContrasena(unEmpleado.getContrasena());
            empleadoExiste.setCorreo(unEmpleado.getCorreo());
            empleadoExiste.setEstado(unEmpleado.getEstado());
            empleadoExiste.setFechaIngreso(unEmpleado.getFechaIngreso());
            empleadoExiste.setPermiso(unEmpleado.getPermiso());
            empleadoExiste.setPnombre(unEmpleado.getPnombre());
            empleadoExiste.setSnombre(unEmpleado.getSnombre());
            empleadoExiste.setTelefono(unEmpleado.getTelefono());
            empleadoExiste.setTurno(unEmpleado.getTurno());
            empleadoExiste.setIdSucursal(unEmpleado.getIdSucursal());
            Empleado empleadoModificado = empleadoservices.save(empleadoExiste);
            return ResponseEntity.ok(empleadoModificado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        Empleado unEmpleado = new Empleado();
        unEmpleado.setId(id);
        Optional<Empleado> empleadOptional = empleadoservices.delete(unEmpleado);
        if (empleadOptional.isPresent()) {
            return ResponseEntity.ok(empleadOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }




}
