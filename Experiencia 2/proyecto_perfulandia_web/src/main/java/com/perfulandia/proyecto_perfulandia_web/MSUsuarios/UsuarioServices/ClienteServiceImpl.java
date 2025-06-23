package com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioEntities.Cliente;
import com.perfulandia.proyecto_perfulandia_web.MSUsuarios.UsuarioRepositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteServices {

    @Autowired
    private ClienteRepository clienterepository;


    @Override
    @Transactional
    public Optional<Cliente> delete(Cliente unCliente) {
        Optional<Cliente> clienteOptional = clienterepository.findById(unCliente.getId());
        clienteOptional.ifPresent(clienteDb->{clienterepository.delete(unCliente);});
        return clienteOptional;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findByAll() {
        return (List<Cliente>) clienterepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> findById(Long id) {
        return clienterepository.findById(id);
    }

    @Override
    @Transactional
    public Cliente save(Cliente unCliente) {
        return clienterepository.save(unCliente);
    }



}
