/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraaplicacion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalav
 */
public class ingresar extends javax.swing.JPanel {

    String usr, clave, bd;
    cliente a;
    distribuidor c;
    producto b;
   

    public ingresar() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ingcliente = new javax.swing.JButton();
        ingproduc = new javax.swing.JButton();
        ingdistri = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione el objeto a ingresar");

        ingcliente.setText("Cliente");
        ingcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingclienteActionPerformed(evt);
            }
        });

        ingproduc.setText("Producto");
        ingproduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingproducActionPerformed(evt);
            }
        });

        ingdistri.setText("Distribuidor");
        ingdistri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingdistriActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(ingcliente)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ingproduc)
                        .addGap(52, 52, 52)
                        .addComponent(ingdistri)
                        .addGap(48, 48, 48)
                        .addComponent(cancelar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingcliente)
                    .addComponent(ingproduc)
                    .addComponent(ingdistri)
                    .addComponent(cancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ingclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingclienteActionPerformed
        a = new cliente();
        a.setBounds(0, 147, 562, 354);
        add(a);
        a.setUsr(usr);
        a.setClave(clave);
        a.setBd(bd);
        a.setVisible(true);
        revalidate();
        repaint();
        if(c!=null){
        c.setVisible(false);
        }
        if(b!=null){
            b.setVisible(false);
        }
        
    }//GEN-LAST:event_ingclienteActionPerformed

    private void ingdistriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingdistriActionPerformed
        c = new distribuidor();
        c.setBounds(0, 147, 562, 354);
        add(c);
        c.setUsr(usr);
        c.setClave(clave);
        c.setBd(bd);
        c.setVisible(true);
        revalidate();
        repaint();
        if(a!=null){
        a.setVisible(false);
        }
        if(b!=null){
            b.setVisible(false);
        }
        
    }//GEN-LAST:event_ingdistriActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_cancelarActionPerformed

    private void ingproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingproducActionPerformed

           
        try {
            b = new producto();
        } catch (SQLException ex) {
            Logger.getLogger(ingresar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        b.setBounds(0, 147, 562, 354);
        add(b);
        b.setUsr(usr);
        b.setClave(clave);
        b.setBd(bd);
        b.setVisible(true);
        revalidate();
        repaint();
        if(a!=null){
            a.setVisible(false);
        }
        if(c!=null){
            c.setVisible(false);
        }
        
    }//GEN-LAST:event_ingproducActionPerformed
    public void setUsr(String usr) {
        this.usr = usr;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton ingcliente;
    private javax.swing.JButton ingdistri;
    private javax.swing.JButton ingproduc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
