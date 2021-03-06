/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.gym;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.KeyEvent; 
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class Acceso extends javax.swing.JFrame {

    /**
     * Creates new form Acceso
     */
    public Acceso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Conexion obj=new Conexion();
    //Declarar objetos de conexion
    public Connection Conexion;
    //Realizar el lenguaje sql
    public PreparedStatement Consulta; 
    //Almacena los datos de nuestra consulta
    public ResultSet Datos;
    String nom,cont,ape;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));

        txtUsuario.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Usuario");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña");

        txtContra.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        txtContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraKeyPressed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        btnEntrar.setText("Aceptar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        btnLimpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimpiarKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Ingrese Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEntrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnLimpiar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        nom=txtUsuario.getText().toUpperCase();
        cont=txtContra.getText();
        boolean r=false;
        try {
            Conexion =(Connection) obj.getConnection("gimnasio","root","");
            Consulta=Conexion.prepareStatement("SELECT Nombre,Apellido,Contraseña FROM acceso WHERE Nombre=\""+nom+"\""
                    + " AND Contraseña=\""+cont+"\";");
            Datos=Consulta.executeQuery();
            while(Datos.next())
            {                   
                ape=Datos.getString("Apellido");
                r=true;
                pantalla pant=new pantalla();
                pant.UsuarioAcceso(nom,ape);
                pant.show();
                this.hide();            
            }
            if(r==false)
                JOptionPane.showMessageDialog(null,"Nombre o Contraseña No Coinciden","Error de Acceso",JOptionPane.INFORMATION_MESSAGE);
            Conexion.close();
            Consulta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtUsuario.setForeground(Color.GRAY);
        txtUsuario.setText("Usuario");
        txtContra.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setForeground(Color.BLACK);
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked
    private void txtContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            btnEntrarActionPerformed(null);
        }
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtContraKeyPressed
    private void btnLimpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimpiarKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            btnLimpiarActionPerformed(null);
        }
    }//GEN-LAST:event_btnLimpiarKeyPressed
    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            btnEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_btnEntrarKeyPressed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
