package com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoRestController;

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

import com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoEntities.Permiso;
import com.perfulandia.proyecto_perfulandia_web.MSPermisos.PermisoServices.PermisoServices;

@RestController
@RequestMapping("api/permiso")
public class PermisoRestController {

    @Autowired
    private PermisoServices permisoservices;

    @GetMapping
    public List<Permiso> verPermisos(){
        return (List<Permiso>) permisoservices.findByAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> verDetaller(@PathVariable Long id){
        Optional<Permiso> permisoOptional = permisoservices.findById(id);
        if (permisoOptional.isPresent()) {
            return ResponseEntity.ok(permisoOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }


    @PostMapping
    public ResponseEntity<Permiso> crear(@RequestBody Permiso unPermiso){
        return ResponseEntity.status(HttpStatus.CREATED).body(permisoservices.save(unPermiso));
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable Long id, @RequestBody Permiso unPermiso){
        Optional<Permiso> permisoOptional = permisoservices.findById(id);
        if (permisoOptional.isPresent()) {
            Permiso permisoExiste = permisoOptional.get();
            permisoExiste.setNombre(unPermiso.getNombre());
            permisoExiste.setDescripcion(unPermiso.getDescripcion());
            Permiso permisoModificado = permisoservices.save(permisoExiste);
            return ResponseEntity.ok(permisoModificado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        Permiso unPermiso = new Permiso();
        unPermiso.setId(id);
        Optional<Permiso> permisoOptional = permisoservices.delete(unPermiso);
        if (permisoOptional.isPresent()) {
            return ResponseEntity.ok(permisoOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }




}
