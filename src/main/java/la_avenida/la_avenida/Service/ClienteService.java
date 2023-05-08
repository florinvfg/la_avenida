package la_avenida.la_avenida.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import la_avenida.la_avenida.Modelo.Cliente;
import la_avenida.la_avenida.Repositorios.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service

public class ClienteService {

    @Autowired
    private  ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> obtenerClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
