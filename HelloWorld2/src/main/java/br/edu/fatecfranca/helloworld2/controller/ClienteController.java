package br.edu.fatecfranca.helloworld2.controller;

import br.edu.fatecfranca.helloworld2.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ClienteControler {

    // Simular um banco de dados contendo os produtos
    private static final Map<Long, Cliente> clientes = new HashMap<>();

    static {
        clientes.put(1L, new Cliente(1L,"Victor", "victorxdking@gmail.com", "1699999999"));
    }
}

