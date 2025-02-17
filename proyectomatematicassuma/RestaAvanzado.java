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
import javax.swing.JLabel;

/**
 *
 * @author lizar
 */
public class RestaAvanzado extends javax.swing.JFrame {

    /**
     * Creates new form RestaAvanzado
     */
    public RestaAvanzado() {
        initComponents();
        this.setTitle("Resta avanzada");
        imagen();
        LabelsVisiblesYCorrectos();
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(Color.white);
        btnRevisar.setBackground(Color.white);
        btnVolver.setBackground(Color.white);

    }

    public void imagen() {
//Foto de resta
        ImageIcon pensando = new ImageIcon(getClass().getResource("/Imagenes/pensanding.gif"));
        ImageIcon marco = new ImageIcon(getClass().getResource("/Imagenes/marco3.gif"));
        Icon pensandoo = new ImageIcon(pensando.getImage().getScaledInstance(LbPensanding.getWidth(), LbPensanding.getHeight(), Image.SCALE_DEFAULT));
        Icon marcoo = new ImageIcon(marco.getImage().getScaledInstance(LbMarquito.getWidth(), LbMarquito.getHeight(), Image.SCALE_DEFAULT));
        LbPensanding.setIcon(pensandoo);
        LbMarquito.setIcon(marcoo);
    }

    public void LabelsVisiblesYCorrectos() {

        ImageIcon imagenCorrecto = new ImageIcon(getClass().getResource("/Imagenes/Palomita.png"));
        Icon fondo = new ImageIcon(imagenCorrecto.getImage().getScaledInstance(LbCorrect.getWidth(), LbCorrect.getHeight(), Image.SCALE_DEFAULT));
        //Pongo todos los labels a los que se va aplicar la propiedad

        //Visibilidad para labels correctos
        JLabel[] LbCorrectSetIcon = new JLabel[]{LbCorrect, LbCorrect1, LbCorrect2, LbCorrect3, LbCorrect4, LbCorrect5, LbCorrect6, LbCorrect7, LbCorrect8, LbCorrect9, LbCorrect10, LbCorrect11};
        for (JLabel labels : LbCorrectSetIcon) {
            labels.setIcon(fondo);
            labels.setVisible(false);
        }

        //Poniendo icono al label de incorrecto
        ImageIcon imagenIncorrecto = new ImageIcon(getClass().getResource("/Imagenes/tache.png")); //Se importa la dirección de la imagen
        Icon Fondo2 = new ImageIcon(imagenIncorrecto.getImage().getScaledInstance(LbIncorrect.getWidth(), LbIncorrect.getHeight(), Image.SCALE_DEFAULT));

        //Visibilidad para labels incorrectos
        JLabel[] LbIncorrectSet = new JLabel[]{LbIncorrect, LbIncorrect1, LbIncorrect2, LbIncorrect3, LbIncorrect4, LbIncorrect5, LbIncorrect6, LbIncorrect7, LbIncorrect8, LbIncorrect9, LbIncorrect10, LbIncorrect11};
        for (JLabel labels : LbIncorrectSet) {
            labels.setIcon(Fondo2);
            labels.setVisible(false);
        }

    }

    public void Resultados() {

        String resultado1 = "268";
        String resultado2 = "467";
        String resultado3 = "358";
        String resultado4 = "356";
        String resultado5 = "375";
        String resultado6 = "437";

        String resultado7 = "357";
        String resultado8 = "585";
        String resultado9 = "365";
        String resultado10 = "154";
        String resultado11 = "85";
        String resultado12 = "269";

        if (TxtOp1.getText().equals(resultado1)) {
            LbCorrect.setVisible(true);
            LbIncorrect.setVisible(false);

        } else {
            LbIncorrect.setVisible(true);
            LbCorrect.setVisible(false);

        }
        //Segunda operacion
        if (TxtOp2.getText().equals(resultado2)) {
            LbCorrect1.setVisible(true);
            LbIncorrect1.setVisible(false);

        } else {
            LbIncorrect1.setVisible(true);
            LbCorrect1.setVisible(false);

        }

        //Tercera operacion
        if (TxtOp3.getText().equals(resultado3)) {
            LbCorrect2.setVisible(true);
            LbIncorrect2.setVisible(false);

        } else {
            LbIncorrect2.setVisible(true);
            LbCorrect2.setVisible(false);

        }
        //4 operacion
        if (TxtOp4.getText().equals(resultado4)) {
            LbCorrect3.setVisible(true);
            LbIncorrect3.setVisible(false);

        } else {
            LbIncorrect3.setVisible(true);
            LbCorrect3.setVisible(false);

        }
        //5 operacion
        if (TxtOp5.getText().equals(resultado5)) {
            LbCorrect4.setVisible(true);
            LbIncorrect4.setVisible(false);

        } else {
            LbIncorrect4.setVisible(true);
            LbCorrect4.setVisible(false);

        }
        //6 operacion
        if (TxtOp6.getText().equals(resultado6)) {
            LbCorrect5.setVisible(true);
            LbIncorrect5.setVisible(false);

        } else {
            LbIncorrect5.setVisible(true);
            LbCorrect5.setVisible(false);

        }
        //7 operacion
        if (TxtOp7.getText().equals(resultado7)) {
            LbCorrect6.setVisible(true);
            LbIncorrect6.setVisible(false);

        } else {
            LbIncorrect6.setVisible(true);
            LbCorrect6.setVisible(false);

        }
        //8 operacion
        if (TxtOp8.getText().equals(resultado8)) {
            LbCorrect7.setVisible(true);
            LbIncorrect7.setVisible(false);

        } else {
            LbIncorrect7.setVisible(true);
            LbCorrect7.setVisible(false);

        }

        //9 operacion
        if (TxtOp9.getText().equals(resultado9)) {
            LbCorrect8.setVisible(true);
            LbIncorrect8.setVisible(false);

        } else {
            LbIncorrect8.setVisible(true);
            LbCorrect8.setVisible(false);

        }

        //10 operacion
        if (TxtOp10.getText().equals(resultado10)) {
            LbCorrect9.setVisible(true);
            LbIncorrect9.setVisible(false);

        } else {
            LbIncorrect9.setVisible(true);
            LbCorrect9.setVisible(false);

        }

        //11 operacion
        if (TxtOp11.getText().equals(resultado11)) {
            LbCorrect10.setVisible(true);
            LbIncorrect10.setVisible(false);

        } else {
            LbIncorrect10.setVisible(true);
            LbCorrect10.setVisible(false);

        }
        //12 operacion
        if (TxtOp12.getText().equals(resultado12)) {
            LbCorrect11.setVisible(true);
            LbIncorrect11.setVisible(false);

        } else {
            LbIncorrect11.setVisible(true);
            LbCorrect11.setVisible(false);

        }

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
        btnVolver = new javax.swing.JButton();
        btnRevisar = new javax.swing.JButton();
        LbIncorrect10 = new javax.swing.JLabel();
        LbCorrect10 = new javax.swing.JLabel();
        TxtOp11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        LbIncorrect11 = new javax.swing.JLabel();
        LbCorrect11 = new javax.swing.JLabel();
        TxtOp12 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        LbIncorrect1 = new javax.swing.JLabel();
        LbCorrect1 = new javax.swing.JLabel();
        LbPensanding = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtOp1 = new javax.swing.JTextField();
        LbCorrect = new javax.swing.JLabel();
        LbIncorrect = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtOp2 = new javax.swing.JTextField();
        TxtOp3 = new javax.swing.JTextField();
        TxtOp4 = new javax.swing.JTextField();
        TxtOp5 = new javax.swing.JTextField();
        TxtOp6 = new javax.swing.JTextField();
        TxtOp7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LbCorrect2 = new javax.swing.JLabel();
        LbIncorrect2 = new javax.swing.JLabel();
        LbIncorrect3 = new javax.swing.JLabel();
        LbCorrect3 = new javax.swing.JLabel();
        LbIncorrect4 = new javax.swing.JLabel();
        LbCorrect4 = new javax.swing.JLabel();
        LbIncorrect5 = new javax.swing.JLabel();
        LbCorrect5 = new javax.swing.JLabel();
        LbIncorrect6 = new javax.swing.JLabel();
        LbCorrect6 = new javax.swing.JLabel();
        LbIncorrect7 = new javax.swing.JLabel();
        LbCorrect7 = new javax.swing.JLabel();
        TxtOp8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LbIncorrect8 = new javax.swing.JLabel();
        LbCorrect8 = new javax.swing.JLabel();
        TxtOp9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        LbIncorrect9 = new javax.swing.JLabel();
        LbCorrect9 = new javax.swing.JLabel();
        TxtOp10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        LbMarquito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 150, 60));

        btnRevisar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRevisar.setText("Revisar");
        btnRevisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRevisarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRevisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRevisarMouseExited(evt);
            }
        });
        btnRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRevisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 150, 60));

        LbIncorrect10.setText("jLabel2");
        jPanel1.add(LbIncorrect10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 30, 32));

        LbCorrect10.setText("jLabel2");
        jPanel1.add(LbCorrect10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 30, 32));

        TxtOp11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp11ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 81, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("678 - 593");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        LbIncorrect11.setText("jLabel2");
        jPanel1.add(LbIncorrect11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 30, 32));

        LbCorrect11.setText("jLabel2");
        jPanel1.add(LbCorrect11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 30, 32));

        TxtOp12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp12ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 81, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("836 - 567");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        LbIncorrect1.setText("jLabel2");
        jPanel1.add(LbIncorrect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 30, 32));

        LbCorrect1.setText("jLabel2");
        jPanel1.add(LbCorrect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 30, 32));

        LbPensanding.setText("jLabel3");
        jPanel1.add(LbPensanding, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 210, 180));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("926 - 658");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, -1));

        TxtOp1.setCaretColor(new java.awt.Color(51, 51, 255));
        TxtOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp1ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 78, -1));

        LbCorrect.setText("jLabel2");
        jPanel1.add(LbCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 30, 32));

        LbIncorrect.setText("jLabel2");
        jPanel1.add(LbIncorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 30, 32));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("835 - 368");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, -1));
        jPanel1.add(TxtOp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 81, -1));
        jPanel1.add(TxtOp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 81, -1));

        TxtOp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp4ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 81, -1));

        TxtOp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp5ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 81, -1));

        TxtOp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp6ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 81, -1));

        TxtOp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp7ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 81, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("923 - 567");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("956 - 598");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("753 - 378");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("925 - 568");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("823 - 386");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 80, -1));

        LbCorrect2.setText("jLabel2");
        jPanel1.add(LbCorrect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 30, 32));

        LbIncorrect2.setText("jLabel2");
        jPanel1.add(LbIncorrect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 30, 32));

        LbIncorrect3.setText("jLabel2");
        jPanel1.add(LbIncorrect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 30, 32));

        LbCorrect3.setText("jLabel2");
        jPanel1.add(LbCorrect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 30, 32));

        LbIncorrect4.setText("jLabel2");
        jPanel1.add(LbIncorrect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 30, 32));

        LbCorrect4.setText("jLabel2");
        jPanel1.add(LbCorrect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 30, 32));

        LbIncorrect5.setText("jLabel2");
        jPanel1.add(LbIncorrect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 30, 32));

        LbCorrect5.setText("jLabel2");
        jPanel1.add(LbCorrect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 30, 32));

        LbIncorrect6.setText("jLabel2");
        jPanel1.add(LbIncorrect6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 30, 32));

        LbCorrect6.setText("jLabel2");
        jPanel1.add(LbCorrect6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 30, 32));

        LbIncorrect7.setText("jLabel2");
        jPanel1.add(LbIncorrect7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 30, 32));

        LbCorrect7.setText("jLabel2");
        jPanel1.add(LbCorrect7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 30, 32));

        TxtOp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp8ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 81, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("953 - 368");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        LbIncorrect8.setText("jLabel2");
        jPanel1.add(LbIncorrect8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 30, 32));

        LbCorrect8.setText("jLabel2");
        jPanel1.add(LbCorrect8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 30, 32));

        TxtOp9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp9ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 81, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("763 - 398");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, -1));

        LbIncorrect9.setText("jLabel2");
        jPanel1.add(LbIncorrect9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 30, 32));

        LbCorrect9.setText("jLabel2");
        jPanel1.add(LbCorrect9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 30, 32));

        TxtOp10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp10ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 81, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setText("932 - 778");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setText("Resuelve las restas y realiza el procedimiento en tu libreta");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 530, 30));

        LbMarquito.setText("jLabel3");
        jPanel1.add(LbMarquito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRevisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarMouseClicked
        //Ponemos un contador de clicks
    }//GEN-LAST:event_btnRevisarMouseClicked

    private void btnRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActionPerformed
        // TODO add your handling code here:
        Resultados();

    }//GEN-LAST:event_btnRevisarActionPerformed

    private void TxtOp11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp11ActionPerformed

    private void TxtOp12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp12ActionPerformed

    private void TxtOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp1ActionPerformed

    private void TxtOp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp4ActionPerformed

    private void TxtOp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp5ActionPerformed

    private void TxtOp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp6ActionPerformed

    private void TxtOp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp7ActionPerformed

    private void TxtOp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp8ActionPerformed

    private void TxtOp9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp9ActionPerformed

    private void TxtOp10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp10ActionPerformed

    private void btnRevisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarMouseEntered

        btnRevisar.setBackground(Color.green);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRevisarMouseEntered

    private void btnRevisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarMouseExited

        btnRevisar.setBackground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRevisarMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(Color.red);        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited

        btnVolver.setBackground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMouseExited

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
            java.util.logging.Logger.getLogger(RestaAvanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaAvanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaAvanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaAvanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaAvanzado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbCorrect;
    private javax.swing.JLabel LbCorrect1;
    private javax.swing.JLabel LbCorrect10;
    private javax.swing.JLabel LbCorrect11;
    private javax.swing.JLabel LbCorrect2;
    private javax.swing.JLabel LbCorrect3;
    private javax.swing.JLabel LbCorrect4;
    private javax.swing.JLabel LbCorrect5;
    private javax.swing.JLabel LbCorrect6;
    private javax.swing.JLabel LbCorrect7;
    private javax.swing.JLabel LbCorrect8;
    private javax.swing.JLabel LbCorrect9;
    private javax.swing.JLabel LbIncorrect;
    private javax.swing.JLabel LbIncorrect1;
    private javax.swing.JLabel LbIncorrect10;
    private javax.swing.JLabel LbIncorrect11;
    private javax.swing.JLabel LbIncorrect2;
    private javax.swing.JLabel LbIncorrect3;
    private javax.swing.JLabel LbIncorrect4;
    private javax.swing.JLabel LbIncorrect5;
    private javax.swing.JLabel LbIncorrect6;
    private javax.swing.JLabel LbIncorrect7;
    private javax.swing.JLabel LbIncorrect8;
    private javax.swing.JLabel LbIncorrect9;
    private javax.swing.JLabel LbMarquito;
    private javax.swing.JLabel LbPensanding;
    public static javax.swing.JTextField TxtOp1;
    public static javax.swing.JTextField TxtOp10;
    public static javax.swing.JTextField TxtOp11;
    public static javax.swing.JTextField TxtOp12;
    public static javax.swing.JTextField TxtOp2;
    public static javax.swing.JTextField TxtOp3;
    public static javax.swing.JTextField TxtOp4;
    public static javax.swing.JTextField TxtOp5;
    public static javax.swing.JTextField TxtOp6;
    public static javax.swing.JTextField TxtOp7;
    public static javax.swing.JTextField TxtOp8;
    public static javax.swing.JTextField TxtOp9;
    private javax.swing.JButton btnRevisar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
