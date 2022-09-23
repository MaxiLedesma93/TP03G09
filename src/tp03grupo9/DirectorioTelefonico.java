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
    HashMap<String,Cliente> directorio = new HashMap();
    
    public boolean agregarCliente(String telefono, Cliente cliente){
        if( !directorio.containsKey(cliente) ){
            directorio.put(telefono, cliente);
            return true;
        } else {
            return false;
        }
    }
    
    public Cliente buscarCliente(String telefono){
        return directorio.get(telefono);
    }
    
    public Cliente buscarTelefono(String apellido){
        return directorio.get(apellido);
    }
    
    public ArrayList buscarClientes(String apellido){
        ArrayList lista = new ArrayList();
        return lista;
    }
    
    public boolean borrarCliente(String telefono){
        if( directorio.containsKey(telefono) ){
            directorio.remove(telefono);
            return true;
        } else {
            return false;   
        }
    }
}
