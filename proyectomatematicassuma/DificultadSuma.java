/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatematicassuma;

import proyectomatematicassuma.SumaPrincipiantes;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author lizar
 */
public class DificultadSuma extends javax.swing.JFrame {

    /**
     * Creates new form SumaPrincipiantes
     */
    public DificultadSuma() {
        initComponents();
        imagen();
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(Color.white);
        btnPrincipiante.setBackground(Color.white);
        btnInter.setBackground(Color.white);
        btnAva.setBackground(Color.white);
    }
    
    public void imagen() {

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnPrincipiante = new javax.swing.JButton();
        btnInter = new javax.swing.JButton();
        btnAva = new javax.swing.JButton();
        perga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("¡Ya veo! ¡Ya veo!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Probemos tu destraza aquí y ahora.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Selecciona la dificultad...");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnPrincipiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 180, 70));

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
        jPanel1.add(btnInter, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 180, 70));

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
        jPanel1.add(btnAva, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 180, 70));

        perga.setText("jLabel3");
        jPanel1.add(perga, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -30, 640, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipianteActionPerformed

        SumaPrincipiantes b = new SumaPrincipiantes();
        b.setVisible(true);

    }//GEN-LAST:event_btnPrincipianteActionPerformed

    private void btnPrincipianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipianteMouseEntered
        // TODO add your handling code here:
        btnPrincipiante.setBackground(Color.green);


    }//GEN-LAST:event_btnPrincipianteMouseEntered

    private void btnInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterActionPerformed
        // TODO add your handling code here:
        SumaIntermedio inter = new SumaIntermedio();
        inter.setVisible(true);

    }//GEN-LAST:event_btnInterActionPerformed

    private void btnAvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaActionPerformed
        // TODO add your handling code here:
        SumaAvanzado SA = new SumaAvanzado();
        SA.setVisible(true);
    }//GEN-LAST:event_btnAvaActionPerformed

    private void btnPrincipianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipianteMouseExited
        // TODO add your handling code here:
        btnPrincipiante.setBackground(Color.white);
    }//GEN-LAST:event_btnPrincipianteMouseExited

    private void btnInterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInterMouseEntered
        // TODO add your handling code here:
        btnInter.setBackground(Color.green);
    }//GEN-LAST:event_btnInterMouseEntered

    private void btnInterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInterMouseExited
        // TODO add your handling code here:
        btnInter.setBackground(Color.white);
    }//GEN-LAST:event_btnInterMouseExited

    private void btnAvaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvaMouseEntered
        // TODO add your handling code here:
        btnAva.setBackground(Color.green);
    }//GEN-LAST:event_btnAvaMouseEntered

    private void btnAvaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvaMouseExited
        // TODO add your handling code here:
        btnAva.setBackground(Color.white);
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
            java.util.logging.Logger.getLogger(DificultadSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DificultadSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DificultadSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DificultadSuma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DificultadSuma().setVisible(true);
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
