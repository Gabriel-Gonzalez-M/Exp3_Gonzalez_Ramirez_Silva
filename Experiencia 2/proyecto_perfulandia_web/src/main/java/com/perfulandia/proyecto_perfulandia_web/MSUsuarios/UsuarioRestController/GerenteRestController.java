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

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Gerente;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices.GerenteServices;

@RestController
@RequestMapping("api/gerentes")
public class GerenteRestController {

    @Autowired
    private GerenteServices gerenteservices;

    @GetMapping
    public List<Gerente> verGerentes(){
        return (List<Gerente>) gerenteservices.findByAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> verDetalle(@PathVariable Long id){
        Optional<Gerente> gerenteOptional = gerenteservices.findById(id);
        if (gerenteOptional.isPresent()) {
            return ResponseEntity.ok(gerenteOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Gerente> crear(@RequestBody Gerente unGerente){
        return ResponseEntity.status(HttpStatus.CREATED).body(gerenteservices.save(unGerente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable Long id, @RequestBody Gerente unGerente){
        Optional<Gerente> gerenteOptional = gerenteservices.findById(id);
        if (gerenteOptional.isPresent()) {
            Gerente gerenteExiste = gerenteOptional.get();
            gerenteExiste.setApMaterno(unGerente.getApMaterno());
            gerenteExiste.setApPaterno(unGerente.getApPaterno());
            gerenteExiste.setContrasena(unGerente.getContrasena());
            gerenteExiste.setCorreo(unGerente.getCorreo());
            gerenteExiste.setEstado(unGerente.getEstado());
            gerenteExiste.setFechaIngreso(unGerente.getFechaIngreso());
            gerenteExiste.setIdSucursal(unGerente.getIdSucursal());
            gerenteExiste.setPermiso(unGerente.getPermiso());
            gerenteExiste.setPnombre(unGerente.getPnombre());
            gerenteExiste.setSnombre(unGerente.getSnombre());
            gerenteExiste.setTelefono(unGerente.getTelefono());
            gerenteExiste.setTurno(unGerente.getTurno());
            Gerente gerenteModificado = gerenteservices.save(gerenteExiste);
            return ResponseEntity.ok(gerenteModificado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        Gerente unGerente = new Gerente();
        unGerente.setId(id);
        Optional<Gerente> gerenteOptional = gerenteservices.delete(unGerente);
        if (gerenteOptional.isPresent()) {
            return ResponseEntity.ok(gerenteOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }



}
