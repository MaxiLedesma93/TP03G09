/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03grupo9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author maxim
 */
public class TP03Grupo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        DirectorioTelefonico dt = new DirectorioTelefonico();
        Cliente c = new Cliente();
        int opcion;
        boolean exit = false;
        
        do {
            System.out.println("1. Crear cliente");
            System.out.println("2. Buscar cliente");
            System.out.println("3. Buscar clientes");
            System.out.println("4. Eliminar cliente");
            System.out.println("9. Listar directorio");
            System.out.println("0. Salir");
            System.out.println("Elija opción:");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    //System.out.println("Ingrese el dni, nombre, apellido, ciudad y telefono");
                    //c = new Ccliente(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
                    dt.agregarCliente("2664123456", new Cliente("40123456", "Messi", "Lionel", "San Luis", "Calle 123"));
                    dt.agregarCliente("2664234567", new Cliente("40234567", "De Paul", "Rodrigo", "San Luis", "Calle 567"));
                    dt.agregarCliente("2664234568", new Cliente("40234568", "Armani", "Franco", "San Luis", "Calle 567"));
                    dt.agregarCliente("2664234569", new Cliente("40234569", "Martinez", "Lautaro", "San Luis", "Calle 567"));
                    dt.agregarCliente("2664234560", new Cliente("40234560", "Martinez", "Emiliano", "San Luis", "Calle 567"));
                    break;
                case 2:
                    System.out.println("Ingrese un telefono a buscar");
                    Cliente cliente = dt.buscarCliente(sc.next());
                    JOptionPane.showMessageDialog(null, cliente.getDni()+ " " + cliente.getApellido()+ " " + cliente.getNombre());
                    break;
                case 3:
                    System.out.println("Ingrese un apellido a buscar");
                    ArrayList clientes = dt.buscarClientes(sc.next());
                    System.out.println(clientes.toString());
                    break;
                case 4:
                    System.out.println("Ingrese un telefono para eliminar un cliente");
                    if( dt.borrarCliente(sc.next()) ){
                        JOptionPane.showMessageDialog(null, "Eliminado con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "El numero no existe en el directorio");
                    }
                    break;
                case 9:
                    System.out.println("<============================>");
                    System.out.println("Agenda de clientes");
                    Iterator it = dt.directorio.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry e = (Map.Entry)it.next();
                        Cliente cli = ((Cliente)e.getValue());
                        System.out.println(e.getKey() + " " + cli.getApellido()+ " " + cli.getNombre());
                    }
                    System.out.println("<============================>");
                    break;
                case 0:
                    exit = true;
                    break;
            }

        } while (!exit);
        

    }
}
