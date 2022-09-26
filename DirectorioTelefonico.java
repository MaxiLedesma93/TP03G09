/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03g09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author maxim
 */
public class DirectorioTelefonico {

    HashMap<Long, Cliente> agendaClientes = new HashMap<>();

    public DirectorioTelefonico() {
    }

    public Boolean agregarCliente(Long nroTelefono, Cliente cl) {
        if (agendaClientes.containsKey(nroTelefono) != true) {
            agendaClientes.put(nroTelefono, cl);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(Long nroTelefono)  {
        Cliente cl = new Cliente();
        Iterator<Long> it = agendaClientes.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().equals(nroTelefono)) {
                cl = agendaClientes.get(nroTelefono);
                return cl;
            }
        }
        return cl;
        
    }

    public ArrayList buscarTelefono(String apellido) {
        ArrayList<Long> lista = new ArrayList<>();
        for (Map.Entry entry : agendaClientes.entrySet()) {
            if (agendaClientes.get(entry.getKey()).apellido.equalsIgnoreCase(apellido)) {
                lista.add((Long) entry.getKey());
            }
        }
        return lista;
    }

 public ArrayList buscarClientes(String ciudad) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        for (Map.Entry entry : agendaClientes.entrySet()) {
            if (agendaClientes.get(entry.getKey()).getCiudad().equalsIgnoreCase(ciudad)) {
                clientes.add((Cliente) entry.getValue());
            }
        }
        return clientes;
    }

    public void borrarCliente(Long nroTelefono) {
        agendaClientes.remove(nroTelefono);

    }
}
