/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03grupo9;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author PUESTO-A1
 */
public class friListarClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form friListarClientes
     */
    public friListarClientes() {
        initComponents();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(400, 350));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de clientes");

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Apellido", "Nombre", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(tblAgenda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAgenda;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla(){
        int i = 0;
        Iterator it = TP03Grupo9.getDt().directorio.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            Cliente cli = ((Cliente)e.getValue());
            tblAgenda.setValueAt(cli.getApellido(), i,0);
            tblAgenda.setValueAt(cli.getNombre(), i,1);
            tblAgenda.setValueAt(e.getKey(), i,2);
            i++;
        }
    }
            
}
