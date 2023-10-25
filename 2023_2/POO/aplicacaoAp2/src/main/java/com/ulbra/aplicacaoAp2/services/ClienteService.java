package com.ulbra.aplicacaoAp2.services;

import com.ulbra.aplicacaoAp2.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ClienteService {
    private static int id = 1;
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes(Integer idade){
        ArrayList <Cliente> filtroIdade = new ArrayList();
        if(null != idade){
            for(int i = 0; i < clientes.size(); i++){
                if(clientes.get(i).idade() == idade){
                    filtroIdade.add(clientes.get(i));
                }

            }
            return filtroIdade;
        }
        return clientes;
    }

    public Cliente creatCliente(Cliente cliente){
        cliente = new Cliente(id, cliente.nome(),cliente.idade(),cliente.profissao());
        id++;
        this.clientes.add(cliente);
        return cliente;
    }

    public Cliente getClienteById(int id){
        for (Cliente cliente : clientes) {
            if (cliente.id() == id) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente update(int id, Cliente clienteAtualizado){
        for (int i = 0; i < clientes.size(); i++) {
            Cliente client = clientes.get(i);
            if (client.id() == id) {
                clientes.set(i, clienteAtualizado);
                return clienteAtualizado;
            }
        }
        return null;
    }

    public Cliente deletarCliente(int id){
        for(int i = 0; i < clientes.size(); i++){
            Cliente client = clientes.get(i);
            if (client.id() == id){
                clientes.remove(i);
                return client;
            }
        }
        return null;
    }

    public void deletarTodos(){
        clientes.clear();
    }
}
