/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03grupo9;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author maxim
 */
public class DirectorioTelefonico {
    HashMap<Long,Cliente> agendaClientes= new HashMap();
    
    public void agregarCliente(Long nroTelefono,Cliente cliente){
        agendaClientes.put(nroTelefono, cliente);
    
    }
    public Cliente buscarCliente(Long nroTelefono){
        return agendaClientes.get(nroTelefono);
    }
    public ArrayList buscarClientes(String apellido){
        ArrayList lista= new ArrayList();
        
        return lista;
    }
}
