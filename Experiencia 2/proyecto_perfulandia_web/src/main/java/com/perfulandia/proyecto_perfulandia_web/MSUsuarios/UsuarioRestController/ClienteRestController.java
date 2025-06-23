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

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Cliente;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices.ClienteServices;

@RestController
@RequestMapping("api/clientes")
public class ClienteRestController {

    @Autowired
    private ClienteServices clienteservices;

    @GetMapping
    public List<Cliente> verClientes(){
        return (List<Cliente>) clienteservices.findByAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> verDetalle(@PathVariable Long id){
        Optional<Cliente> clienteOptional = clienteservices.findById(id);
        if (clienteOptional.isPresent()) {
            return ResponseEntity.ok(clienteOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Cliente> crear(@RequestBody Cliente unCliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteservices.save(unCliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> modificar(@PathVariable Long id,@RequestBody Cliente unCliente){
        Optional<Cliente> clienteOptional = clienteservices.findById(id);
        if(clienteOptional.isPresent()){
            Cliente clienteExiste = clienteOptional.get();
            clienteExiste.setPnombre(unCliente.getPnombre());
            clienteExiste.setSnombre(unCliente.getSnombre());
            clienteExiste.setApPaterno(unCliente.getApPaterno());
            clienteExiste.setApMaterno(unCliente.getApMaterno());
            clienteExiste.setCorreo(unCliente.getCorreo());
            clienteExiste.setContrasena(unCliente.getContrasena());
            clienteExiste.setNick(unCliente.getNick());
            clienteExiste.setPerfil(unCliente.getPerfil());
            clienteExiste.setPermiso(unCliente.getPermiso());
            clienteExiste.setTelefono(unCliente.getTelefono());
            clienteExiste.setCalle(unCliente.getCalle());
            clienteExiste.setComuna(unCliente.getComuna());
            clienteExiste.setNumeroCasa(unCliente.getNumeroCasa());
            Cliente clienteModificado = clienteservices.save(clienteExiste);
            return ResponseEntity.ok(clienteModificado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        Cliente unCliente = new Cliente();
        unCliente.setId(id);
        Optional<Cliente> clienteOptional = clienteservices.delete(unCliente);
        if (clienteOptional.isPresent()) {
            return ResponseEntity.ok(clienteOptional.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

}