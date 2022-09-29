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
    }
}
