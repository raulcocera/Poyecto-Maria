/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.gym;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SONY
 */
public class Consultar_Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultar_Usuario
     */
     DefaultTableModel tabla;
    public Consultar_Usuario() {       
        initComponents();
        tabla =new DefaultTableModel();
        tabla.addColumn("Id");
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Edad"); 
        tabla.addColumn("Sexo"); 
        tabla.addColumn("Peso");
        tabla.addColumn("Fecha Inicio");
        this.jTable1.setModel(tabla);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtBusNom = new javax.swing.JTextField();
        btnConsul = new javax.swing.JButton();
        btnConsuLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        txtBusNom.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtBusNom.setForeground(new java.awt.Color(204, 204, 204));
        txtBusNom.setText("Ingrese Nombre");
        txtBusNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBusNomMouseClicked(evt);
            }
        });
        txtBusNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusNomKeyPressed(evt);
            }
        });

        btnConsul.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnConsul.setText("Consultar");
        btnConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulActionPerformed(evt);
            }
        });

        btnConsuLimpiar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnConsuLimpiar.setText("Limpiar");
        btnConsuLimpiar.setEnabled(false);
        btnConsuLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsuLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(txtBusNom, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsuLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsul)
                    .addComponent(txtBusNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsuLimpiar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        Conexion obj=new Conexion();
        //Declarar objetos de conexion
        Connection Conexion;
        //Realizar el lenguaje sql
        PreparedStatement consulta;
        //Almacena los datos de nuestra consulta
        ResultSet datos;
        int i;
        public void LimpiarTablaCons()
    {
        
        int b=0;        
        while(b<=(i-1))
        {
            if(tabla.getRowCount()!=0)
            tabla.removeRow(0);//borrar lo que contiene la tabla del panel de consulta
            b+=1;
        }        
        btnConsul.setEnabled(true);
    }
    private void txtBusNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBusNomMouseClicked
        txtBusNom.setText("");
        txtBusNom.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusNomMouseClicked

    private void btnConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulActionPerformed
        LimpiarTablaCons();
        String[] res=new String[7];
        String nom=txtBusNom.getText();
        i=0;
        try {
            Conexion =(Connection) obj.getConnection("gimnasio","root","");
            consulta=Conexion.prepareStatement("SELECT * FROM usuarios WHERE Nombre LIKE \""+nom+"%\"");
            datos=consulta.executeQuery();
            while(datos.next())
            {
                res[0]=datos.getString("Id");
                res[1]=datos.getString("Nombre");
                res[2]=datos.getString("Apellido");
                res[3]=datos.getString("Edad");
                res[4]=datos.getString("Sexo");
                res[5]=datos.getString("Peso");
                res[6]=datos.getString("Fech");
                tabla.addRow(res);  
                i+=1;
                btnConsuLimpiar.setEnabled(true);
            }
            Conexion.close();
        } catch (SQLException e) {
           
            JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE);
        }
        if(i==0)
        {
            JOptionPane.showMessageDialog(null,"Nombre No Encontrado",null,JOptionPane.INFORMATION_MESSAGE);
        }
        txtBusNom.setText("Ingrese Nombre");
        txtBusNom.setForeground(Color.GRAY);        
    }//GEN-LAST:event_btnConsulActionPerformed

    private void btnConsuLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsuLimpiarActionPerformed
       LimpiarTablaCons();
        btnConsuLimpiar.setEnabled(false);
        btnConsul.setEnabled(true);
    }//GEN-LAST:event_btnConsuLimpiarActionPerformed

    private void txtBusNomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusNomKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            btnConsulActionPerformed(null);
        }
    }//GEN-LAST:event_txtBusNomKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsuLimpiar;
    private javax.swing.JButton btnConsul;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBusNom;
    // End of variables declaration//GEN-END:variables
}
