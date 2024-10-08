package br.edu.fatecfranca.helloworld2.controller;

import br.edu.fatecfranca.helloworld2.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ClienteController {

    // Simular um banco de dados contendo os clientes
    private static final Map<Long, Cliente> clientes = new HashMap<>();

    static {
        // Adicionar alguns clientes iniciais para teste
        clientes.put(1L, new Cliente(1L, "João Silva", "joao@gmail.com", "11999999999"));
        clientes.put(2L, new Cliente(2L, "Maria Souza", "maria@gmail.com", "11988888888"));
        clientes.put(3L, new Cliente(3L, "José Santos", "jose@gmail.com", "11977777777"));
    }

    // GET /clientes - Retorna todos os clientes
    @GetMapping("/clientes")
    public Map<Long, Cliente> findAll() {
        return clientes;
    }

    // GET /clientes/{id} - Retorna um cliente específico pelo ID
    @GetMapping("/clientes/{id}")
    public Cliente findById(@PathVariable Long id) {
        Cliente cliente = clientes.get(id);
        if (cliente != null) {
            return cliente;
        } else {
            return new Cliente(0L, "Cliente não encontrado", "", "");
        }
    }

    // POST /clientes - Adiciona um novo cliente
    @PostMapping("/clientes")
    public Cliente add(@RequestBody Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    // PUT /clientes/{id} - Atualiza os dados de um cliente existente
    @PutMapping("/clientes/{id}")
    public String update(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteExistente = clientes.get(id);
        if (clienteExistente != null) {
            clienteExistente.setNome(cliente.getNome());
            clienteExistente.setEmail(cliente.getEmail());
            clienteExistente.setTelefone(cliente.getTelefone());
            clientes.put(id, clienteExistente);
            return "Cliente atualizado com sucesso";
        } else {
            return "Cliente não encontrado";
        }
    }

    // DELETE /clientes/{id} - Remove um cliente pelo ID
    @DeleteMapping("/clientes/{id}")
    public String delete(@PathVariable Long id) {
        Cliente cliente = clientes.remove(id);
        if (cliente != null) {
            return "Cliente removido com sucesso";
        } else {
            return "Cliente não encontrado";
        }
    }
}
