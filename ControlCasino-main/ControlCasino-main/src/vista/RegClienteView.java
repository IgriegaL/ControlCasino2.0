/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.RegistroUsuario;
import modelo.Usuario;

/**
 *
 * @author JP
 */
public class RegClienteView extends javax.swing.JFrame {

    /**
     * Creates new form Archivo
     */
    public RegClienteView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittleUserLabel = new java.awt.Label();
        userLabel = new javax.swing.JLabel();
        clientRutField = new javax.swing.JTextField();
        clientNameField = new javax.swing.JTextField();
        clientLastNamField = new javax.swing.JTextField();
        clientSecLastNamField = new javax.swing.JTextField();
        userRutLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userLastNamLabel = new javax.swing.JLabel();
        userSecLastNamLabel = new javax.swing.JLabel();
        userAreaLabel = new javax.swing.JLabel();
        clientAddButt = new javax.swing.JButton();
        areaComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tittleUserLabel.setAlignment(java.awt.Label.CENTER);
        tittleUserLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tittleUserLabel.setText("CLIENTES");

        userLabel.setText("1.Ingrese los datos del Cliente");

        clientRutField.setMaximumSize(new java.awt.Dimension(200, 25));
        clientRutField.setMinimumSize(new java.awt.Dimension(200, 25));
        clientRutField.setPreferredSize(new java.awt.Dimension(200, 25));

        clientNameField.setMaximumSize(new java.awt.Dimension(200, 25));
        clientNameField.setMinimumSize(new java.awt.Dimension(200, 25));
        clientNameField.setPreferredSize(new java.awt.Dimension(200, 25));

        clientLastNamField.setMaximumSize(new java.awt.Dimension(200, 25));
        clientLastNamField.setMinimumSize(new java.awt.Dimension(200, 25));
        clientLastNamField.setPreferredSize(new java.awt.Dimension(200, 25));

        clientSecLastNamField.setMaximumSize(new java.awt.Dimension(200, 25));
        clientSecLastNamField.setMinimumSize(new java.awt.Dimension(200, 25));
        clientSecLastNamField.setPreferredSize(new java.awt.Dimension(200, 25));

        userRutLabel.setText("Rut (12345678-4)");

        userNameLabel.setText("Nombre");

        userLastNamLabel.setText("Apellido Paterno");

        userSecLastNamLabel.setText("Apellido Materno");

        userAreaLabel.setText("Area");

        clientAddButt.setText("Crear");
        clientAddButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientAddButtActionPerformed(evt);
            }
        });

        areaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventas\t", "Logistica", "Administrativo", "Informatica", "Externo" }));
        areaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(userRutLabel)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tittleUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userNameLabel)
                                        .addComponent(userLastNamLabel)
                                        .addComponent(userSecLastNamLabel)))
                                .addComponent(userAreaLabel))
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clientRutField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(clientNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clientLastNamField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clientSecLastNamField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clientAddButt)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittleUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(userLabel)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userRutLabel)
                    .addComponent(clientRutField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(clientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientLastNamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLastNamLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userSecLastNamLabel)
                    .addComponent(clientSecLastNamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userAreaLabel)
                    .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(clientAddButt)
                .addGap(26, 26, 26))
        );

        tittleUserLabel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientAddButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientAddButtActionPerformed
       String rut, nombre, apellidoPaterno, apellidoMaterno, area;
        
        
        rut = clientRutField.getText();
        nombre = clientNameField.getText();
        apellidoPaterno = clientLastNamField.getText();
        apellidoMaterno = clientSecLastNamField.getText();
        area = (String) areaComboBox.getSelectedItem();
        
        cliente nuevocliente = cliente(0, rut, nombre, apellidoPaterno, apellidoMaterno, area);
        Cliente newClient1 = new Cliente(0, rut, nombre, apellidoPaterno, apellidoMaterno, area);
        RegistroCliente regCliente = new RegistroCliente();
        
               
        regUser.crearUsuario(newUser);
        System.out.println("Usuario Agregado");
    }//GEN-LAST:event_clientAddButtActionPerformed

    private void areaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaComboBoxActionPerformed

        areaComboBox.setSelectedItem("");
    }//GEN-LAST:event_areaComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> areaComboBox;
    private javax.swing.JButton clientAddButt;
    private javax.swing.JTextField clientLastNamField;
    private javax.swing.JTextField clientNameField;
    private javax.swing.JTextField clientRutField;
    private javax.swing.JTextField clientSecLastNamField;
    private java.awt.Label tittleUserLabel;
    private javax.swing.JLabel userAreaLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLastNamLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userRutLabel;
    private javax.swing.JLabel userSecLastNamLabel;
    // End of variables declaration//GEN-END:variables
}
