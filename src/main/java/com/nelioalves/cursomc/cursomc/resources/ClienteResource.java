package com.nelioalves.cursomc.cursomc.resources;

import com.nelioalves.cursomc.cursomc.domain.Cliente;
import com.nelioalves.cursomc.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Cliente obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}