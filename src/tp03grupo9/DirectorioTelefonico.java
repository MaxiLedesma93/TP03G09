/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03grupo9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
    
    public ArrayList buscarTelefono(String apellido){
        Iterator it = TP03Grupo9.getDt().directorio.entrySet().iterator();
        ArrayList<String> lista = new ArrayList();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Cliente cli = ((Cliente)e.getValue());
            if( cli.getApellido().equals((String)apellido)){
                lista.add(e.getKey().toString());
            }
        }
        return lista;
    }
    
    public ArrayList buscarClientes(String ciudad){
        Iterator it = TP03Grupo9.getDt().directorio.entrySet().iterator();
        ArrayList<Cliente> lista = new ArrayList();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Cliente cli = ((Cliente)e.getValue());
            if( cli.getCiudad().equals((String)ciudad)){
                lista.add(cli);
            }
        }
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
