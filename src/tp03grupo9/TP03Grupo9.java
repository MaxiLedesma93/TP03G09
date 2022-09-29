/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03grupo9;

/**
 *
 * @author maxim
 */
public class TP03Grupo9 {

    static DirectorioTelefonico dt = new DirectorioTelefonico();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Cliente c = new Cliente();
        frmPrincipal framePrincipal = new frmPrincipal();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
        
        /*
        do {
            System.out.println("1. Crear cliente");
            System.out.println("2. Buscar cliente");
            System.out.println("3. Buscar clientes");
            System.out.println("4. Eliminar cliente");
            System.out.println("9. Listar directorio");
            System.out.println("0. Salir");
            System.out.println("Elija opción:");
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
        */
    }
}
