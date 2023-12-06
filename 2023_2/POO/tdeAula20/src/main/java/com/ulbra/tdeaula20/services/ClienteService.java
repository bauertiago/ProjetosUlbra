package com.ulbra.tdeaula20.services;

import com.ulbra.tdeaula20.dtos.ClienteResponseDTO;
import com.ulbra.tdeaula20.entities.Cliente;
import com.ulbra.tdeaula20.exceptions.NotFoundClientExceptions;
import com.ulbra.tdeaula20.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteResponseDTO> getAllClientes(){
        List<ClienteResponseDTO> clienteDTO = new ArrayList<>();

        List<Cliente> clientes = this.clienteRepository.findAll();

        if(clientes.isEmpty()){
            throw new NotFoundClientExceptions();
        }

        for (int i = 0; i < clientes.size(); i++){
            clienteDTO.add(new ClienteResponseDTO(clientes.get(i).getNome(),clientes.get(i).getIdade(),clientes.get(i).getProfissao()));
        }

        return clienteDTO;
    }

    /*public List<ClienteResponseDTO> getClienteIdade(Integer idade){
        List<ClienteResponseDTO> clienteDTO = new ArrayList<>();

        List<Cliente> clientes = this.clienteRepository.findAll();
        List<Cliente> filtroIdade = new ArrayList<>();

        if(clientes.isEmpty()){
            throw new NotFoundClientExceptions();
        }

        if(null != idade){
            for(int i = 0; i < clienteRepository.findAll().size(); i++){
                if(clienteRepository.findAll().get(i).getIdade() == idade){
                    filtroIdade.add(clienteRepository.findAll().get(i));
                }
            }
            return filtroIdade;
        }

        return clienteDTO;
    }*/

    public List<ClienteResponseDTO> getClienteIdade(Integer idade){
        List<ClienteResponseDTO> clienteDTO = new ArrayList<>();

        List<Cliente> clientes = this.clienteRepository.findAll();
        List<Cliente> filtroIdade = new ArrayList<>();

        if (clientes.isEmpty()){
            throw new NotFoundClientExceptions();
        }
        if (idade != null){
            for (int i = 0; i <clientes.size(); i++){
                Cliente cliente = clientes.get(i);
                if(cliente.getIdade() == idade){
                    filtroIdade.add(cliente);
                }
            }

            //Convertento os clientes filtardos para ClienteResponseDTO
            for (int i = 0; i < filtroIdade.size(); i++){
                Cliente cliente = filtroIdade.get(i);
                clienteDTO.add(new ClienteResponseDTO(cliente.getNome(), cliente.getIdade(), cliente.getProfissao()));
            }
            return clienteDTO;
        }
        return clienteDTO;
    }
    public ClienteResponseDTO createCliente(ClienteResponseDTO clienteDTO) {

        Cliente clienteRetorno = this.clienteRepository.save(clienteDTO.convertDTOToCliente());

        //Convertendo Resultado Entity para DTO
        return clienteDTO.convertClienteToDTO(clienteRetorno);
    }

    public Cliente updateCliente(long id, Cliente clienteAtualizado) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Cliente novoCliente = clienteOptional.get();
            novoCliente.setNome(clienteAtualizado.getNome());
            novoCliente.setIdade(clienteAtualizado.getIdade());
            novoCliente.setProfissao(clienteAtualizado.getProfissao());

            return clienteRepository.save(novoCliente);

        }

        throw new NotFoundClientExceptions();
    }

    public ResponseEntity<String> deleteCliente(long id){
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if (clienteOptional.isPresent()){
            Cliente clienteDeletado = clienteOptional.get();
            clienteRepository.delete(clienteDeletado);
            return ResponseEntity.ok("Cliente deletado com sucesso");

            }
        return ResponseEntity.notFound().build();
    }

    public void deleteAll(){
        clienteRepository.deleteAll();
    }

}
