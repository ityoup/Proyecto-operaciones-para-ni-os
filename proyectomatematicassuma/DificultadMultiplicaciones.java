/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatematicassuma;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lizar
 */
public class DificultadMultiplicaciones extends javax.swing.JFrame {

    /**
     * Creates new form DificultadMultiplicaciones
     */
    public DificultadMultiplicaciones() {
        initComponents();
        fondo();
        jPanel1.setBackground(Color.white);
        btnPrincipiante.setBackground(Color.white);
        btnInter.setBackground(Color.white);
        btnAva.setBackground(Color.white);
        setTitle("Selecciona la dificultad");
        this.setLocationRelativeTo(null);
    }

    public void fondo() {

        //Foto del marco
        ImageIcon marco = new ImageIcon(getClass().getResource("/Imagenes/Pergamino.jpg"));
        Icon marc = new ImageIcon(marco.getImage().getScaledInstance(perga.getWidth(), perga.getHeight(), Image.SCALE_DEFAULT));
        perga.setIcon(marc);
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
        btnPrincipiante = new javax.swing.JButton();
        btnAva = new javax.swing.JButton();
        btnInter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        perga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrincipiante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPrincipiante.setText("Principiante");
        btnPrincipiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrincipianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrincipianteMouseExited(evt);
            }
        });
        btnPrincipiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipianteActionPerformed(evt);
            }
        });

        btnAva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAva.setText("Avanzado");
        btnAva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAvaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAvaMouseExited(evt);
            }
        });
        btnAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaActionPerformed(evt);
            }
        });

        btnInter.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInter.setText("Intermedio");
        btnInter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInterMouseExited(evt);
            }
        });
        btnInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("¡Ahora!");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Continuemos con la multiplicación");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Selecciona la dificultad...");

        perga.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnPrincipiante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnInter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnAva, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(perga, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(btnPrincipiante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnInter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnAva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(perga, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipianteMouseEntered
        // TODO add your handling code here:
        btnPrincipiante.setBackground(Color.magenta);
    }//GEN-LAST:event_btnPrincipianteMouseEntered

    private void btnPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipianteActionPerformed

        MultiplicacionPrincipiante c = new MultiplicacionPrincipiante();
        c.setVisible(true);
    }//GEN-LAST:event_btnPrincipianteActionPerformed

    private void btnInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterActionPerformed
        // TODO add your handling code here:
        MultiplicacionIntermedio MI = new MultiplicacionIntermedio();
        MI.setVisible(true);
    }//GEN-LAST:event_btnInterActionPerformed

    private void btnAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaActionPerformed
        // TODO add your handling code here:
        MultiplicacionAvanzada MA = new MultiplicacionAvanzada();
        MA.setVisible(true);

    }//GEN-LAST:event_btnAvaActionPerformed

    private void btnPrincipianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipianteMouseExited
        // TODO add your handling code here:
        btnPrincipiante.setBackground(Color.white);
    }//GEN-LAST:event_btnPrincipianteMouseExited

    private void btnInterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInterMouseEntered
        // TODO add your handling code here:
        btnInter.setBackground(Color.magenta);
    }//GEN-LAST:event_btnInterMouseEntered

    private void btnInterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInterMouseExited

        btnInter.setBackground(Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_btnInterMouseExited

    private void btnAvaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvaMouseEntered

        btnAva.setBackground(Color.magenta);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvaMouseEntered

    private void btnAvaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvaMouseExited

        btnAva.setBackground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvaMouseExited

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
            java.util.logging.Logger.getLogger(DificultadMultiplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DificultadMultiplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DificultadMultiplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DificultadMultiplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DificultadMultiplicaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAva;
    private javax.swing.JButton btnInter;
    private javax.swing.JButton btnPrincipiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel perga;
    // End of variables declaration//GEN-END:variables
}
