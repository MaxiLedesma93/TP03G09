/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03g09;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author maxim
 */
public class Tp03g09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //manejar la excepcion nullpointerexception del metodo buscarCliente(Long nrTelefono)
     DirectorioTelefonico dt = new DirectorioTelefonico();
        ArrayList<Cliente> clientes;
        Cliente cl= new Cliente();
        Cliente maxi = new Cliente("maxi", "ledesma", "dni maxi", "san luis", "dir maxi");
        Cliente joha = new Cliente("joha", "goicochea", "dni joha", "3 arroyos", "dir joha");
        Cliente eric = new Cliente("eric", "algo", "dni eric", "bs as", "dir eric");
        Cliente lolito = new Cliente("lolito", "trelles", "dni lolito", "bs as", "dir lolito");
        dt.agregarCliente(new Long(1), maxi);
        dt.agregarCliente(new Long(22), joha);
        dt.agregarCliente(new Long(333), eric);
        dt.agregarCliente(new Long(4444), lolito);
        System.out.println("tamanio de la lista; " + dt.agendaClientes.size());
        System.out.println("-------------BUSCAR CLIENTE CON NUMERO TELEFONICO-----------");
        System.out.println("Cliente 1: " + dt.buscarCliente(new Long(1)));
        System.out.println("Cliente 2:" + dt.buscarCliente(new Long(22)));
        System.out.println("Cliente 3: " + dt.buscarCliente(new Long(333)));
        System.out.println("Cliente 4: " + dt.buscarCliente(new Long(4444)));
        System.out.println("-------------------------------------------------------------");
        System.out.println("");
        System.out.println("-----------BUSCAR TELEFONO CON APELLIDO----------------------");
        System.out.println("Numero de telefono : " + dt.buscarTelefono("algo"));
        System.out.println("--------------------------------------------------------------");
        System.out.println("-----------BUSCAR Clientes CON CIUDAD----------------------");
        clientes = dt.buscarClientes("bs as");
        System.out.println(" " + clientes.toString());
        System.out.println("-----------Borrar Cliente con TELEFONO----------------------");
        // se borra a eric.
        dt.borrarCliente(new Long(333));
        System.out.println("--------------lISTA FINAL------------");
         for (Map.Entry entry : dt.agendaClientes.entrySet()) {
             System.out.println("telefono : "+ entry.getKey()+" -- "+ entry.getValue() );
              
            }
         System.out.println("-----------------------");
         //Para avisar que no existe un cliente con el numero buscado.
         cl=dt.buscarCliente(new Long(23123));
         if (cl.nombre!=null){
             System.out.println(" Cliente "+cl);
         }else{
             System.out.println("No existe un cliente con ese numero");
         }
        
        
             
        
         
  
        }
}
