/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03grupo9;

import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author PUESTO-A1
 */
public class friCrearCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoCliente
     */
    public friCrearCliente() {
        initComponents();
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
        lblDni = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        tfCiudad = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(410, 320));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de clientes");

        lblDni.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDni.setText("DNI");

        tfDni.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfDni.setMaximumSize(new java.awt.Dimension(200, 6));
        tfDni.setMinimumSize(new java.awt.Dimension(200, 6));

        lblApellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblApellido.setText("APELLIDO");

        tfApellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfApellido.setMaximumSize(new java.awt.Dimension(200, 6));
        tfApellido.setMinimumSize(new java.awt.Dimension(200, 6));

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNombre.setText("NOMBRE");

        tfNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfNombre.setMaximumSize(new java.awt.Dimension(200, 6));
        tfNombre.setMinimumSize(new java.awt.Dimension(200, 6));

        lblCiudad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblCiudad.setText("CIUDAD");

        tfCiudad.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfCiudad.setMaximumSize(new java.awt.Dimension(200, 6));
        tfCiudad.setMinimumSize(new java.awt.Dimension(200, 6));

        lblDireccion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDireccion.setText("DIRECCIÓN");

        tfDireccion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfDireccion.setMaximumSize(new java.awt.Dimension(200, 6));
        tfDireccion.setMinimumSize(new java.awt.Dimension(200, 6));

        btnSalir.setLabel("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCrear.setLabel("Nuevo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnGuardar.setLabel("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblTelefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblTelefono.setText("TELEFONO");

        tfTelefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(tfDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad)
                    .addComponent(tfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCrear)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        TP03Grupo9.dt.agregarCliente(tfTelefono.getText(), new Cliente(tfDni.getText(), tfApellido.getText(), tfNombre.getText(), tfCiudad.getText(), tfDireccion.getText() ));
        JOptionPane.showMessageDialog(this, "Cliente Guardado");
        tfTelefono.setText("");
        tfDni.setText("");
        tfApellido.setText("");
        tfNombre.setText("");
        tfCiudad.setText("");
        tfDireccion.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        tfTelefono.setText("");
        tfDni.setText("");
        tfApellido.setText("");
        tfNombre.setText("");
        tfCiudad.setText("");
        tfDireccion.setText("");
    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCiudad;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}