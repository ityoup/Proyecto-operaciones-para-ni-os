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
public class MultiplicacionIntermedio extends javax.swing.JFrame {

    /**
     * Creates new form MultiplicacionIntermedio
     */
    public MultiplicacionIntermedio() {
        initComponents();
        setTitle("Multiplicación intermedia");
        imagen();
        Resultados();
        LabelsVisiblesYCorrectos();
        this.setLocationRelativeTo(null);
        jPanel1.setBackground(Color.white);
        btnRevisar.setBackground(Color.white);
        btnVolver.setBackground(Color.white);
    }

    public void LabelsVisiblesYCorrectos() {

        ImageIcon imagenCorrecto = new ImageIcon(getClass().getResource("/Imagenes/Palomita.png"));
        Icon fondo = new ImageIcon(imagenCorrecto.getImage().getScaledInstance(LbCorrect.getWidth(), LbCorrect.getHeight(), Image.SCALE_DEFAULT));
        //Pongo todos los labels a los que se va aplicar la propiedad

        //Visibilidad para labels correctos
        JLabel[] LbCorrectSetIcon = new JLabel[]{LbCorrect, LbCorrect1, LbCorrect2, LbCorrect3, LbCorrect4, LbCorrect5, LbCorrect6, LbCorrect7, LbCorrect8, LbCorrect9, LbCorrect10, LbCorrect11, LbCorrect12, LbCorrect13, LbCorrect14, LbCorrect15};
        for (JLabel labels : LbCorrectSetIcon) {
            labels.setIcon(fondo);
            labels.setVisible(false);
        }

        //Poniendo icono al label de incorrecto
        ImageIcon imagenIncorrecto = new ImageIcon(getClass().getResource("/Imagenes/tache.png")); //Se importa la dirección de la imagen
        Icon Fondo2 = new ImageIcon(imagenIncorrecto.getImage().getScaledInstance(LbIncorrect.getWidth(), LbIncorrect.getHeight(), Image.SCALE_DEFAULT));

        //Visibilidad para labels incorrectos
        JLabel[] LbIncorrectSet = new JLabel[]{LbIncorrect, LbIncorrect1, LbIncorrect2, LbIncorrect3, LbIncorrect4, LbIncorrect5, LbIncorrect6, LbIncorrect7, LbIncorrect8, LbIncorrect9, LbIncorrect10, LbIncorrect11, LbIncorrect12, LbIncorrect13, LbIncorrect14, LbIncorrect15};
        for (JLabel labels : LbIncorrectSet) {
            labels.setIcon(Fondo2);
            labels.setVisible(false);
        }

    }

    public void imagen() {
        ImageIcon marc0 = new ImageIcon(getClass().getResource("/Imagenes/marco3.gif"));
        Icon marco00 = new ImageIcon(marc0.getImage().getScaledInstance(LbMarco.getWidth(), LbMarco.getHeight(), Image.SCALE_DEFAULT));
        LbMarco.setIcon(marco00);

    }

    public void Resultados() {

        String resultado1 = "25728";
        String resultado2 = "21672";
        String resultado3 = "8268";
        String resultado4 = "10947";
        String resultado5 = "13230";
        String resultado6 = "5564";

        String resultado7 = "30780";
        String resultado8 = "16225";
        String resultado9 = "19512";
        String resultado10 = "26048";
        String resultado11 = "47226";
        String resultado12 = "11316";
        String resultado13 = "20952";
        String resultado14 = "18675";
        String resultado15 = "10166";
        String resultado16 = "19341";

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

        //13 operacion
        if (TxtOp13.getText().equals(resultado13)) {
            LbCorrect12.setVisible(true);
            LbIncorrect12.setVisible(false);

        } else {
            LbIncorrect12.setVisible(true);
            LbCorrect12.setVisible(false);

        }

        if (TxtOp14.getText().equals(resultado14)) {
            LbCorrect13.setVisible(true);
            LbIncorrect13.setVisible(false);

        } else {
            LbIncorrect13.setVisible(true);
            LbCorrect13.setVisible(false);

        }

        if (TxtOp15.getText().equals(resultado15)) {
            LbCorrect14.setVisible(true);
            LbIncorrect14.setVisible(false);

        } else {
            LbIncorrect14.setVisible(true);
            LbCorrect14.setVisible(false);

        }

        if (TxtOp16.getText().equals(resultado16)) {
            LbCorrect15.setVisible(true);
            LbIncorrect15.setVisible(false);

        } else {
            LbIncorrect15.setVisible(true);
            LbCorrect15.setVisible(false);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtOp3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtOp4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtOp5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtOp6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtOp7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtOp8 = new javax.swing.JTextField();
        LbIncorrect10 = new javax.swing.JLabel();
        LbCorrect10 = new javax.swing.JLabel();
        TxtOp11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        LbIncorrect11 = new javax.swing.JLabel();
        LbCorrect11 = new javax.swing.JLabel();
        TxtOp12 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        LbIncorrect12 = new javax.swing.JLabel();
        LbCorrect12 = new javax.swing.JLabel();
        TxtOp13 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        LbIncorrect13 = new javax.swing.JLabel();
        LbCorrect13 = new javax.swing.JLabel();
        TxtOp14 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        LbIncorrect14 = new javax.swing.JLabel();
        LbCorrect14 = new javax.swing.JLabel();
        TxtOp15 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LbIncorrect15 = new javax.swing.JLabel();
        LbCorrect15 = new javax.swing.JLabel();
        TxtOp16 = new javax.swing.JTextField();
        LbIncorrect1 = new javax.swing.JLabel();
        LbCorrect1 = new javax.swing.JLabel();
        TxtOp1 = new javax.swing.JTextField();
        LbCorrect = new javax.swing.JLabel();
        LbIncorrect = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtOp2 = new javax.swing.JTextField();
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
        LbIncorrect8 = new javax.swing.JLabel();
        LbCorrect8 = new javax.swing.JLabel();
        TxtOp9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        LbIncorrect9 = new javax.swing.JLabel();
        LbCorrect9 = new javax.swing.JLabel();
        TxtOp10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnRevisar = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        LbMarco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("804 x 32");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("156 x 53");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));
        jPanel1.add(TxtOp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 81, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("267 x 41");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        TxtOp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp4ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 81, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("315 x 42");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        TxtOp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp5ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 81, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("428 x 13");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        TxtOp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp6ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 81, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("570 x 54");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        TxtOp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp7ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 81, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("649 x 25");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        TxtOp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp8ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 81, -1));

        LbIncorrect10.setText("jLabel2");
        jPanel1.add(LbIncorrect10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 30, 32));

        LbCorrect10.setText("jLabel2");
        jPanel1.add(LbCorrect10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 30, 32));

        TxtOp11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp11ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 81, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("926 x 51");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        LbIncorrect11.setText("jLabel2");
        jPanel1.add(LbIncorrect11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 30, 32));

        LbCorrect11.setText("jLabel2");
        jPanel1.add(LbCorrect11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 30, 32));

        TxtOp12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp12ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 81, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("138 x 82");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        LbIncorrect12.setText("jLabel2");
        jPanel1.add(LbIncorrect12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 30, 32));

        LbCorrect12.setText("jLabel2");
        jPanel1.add(LbCorrect12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 30, 32));

        TxtOp13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp13ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 81, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("582 x 36");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));
        jPanel1.add(LbIncorrect13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 30, 32));
        jPanel1.add(LbCorrect13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 30, 32));

        TxtOp14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp14ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 81, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("415 x 45");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));
        jPanel1.add(LbIncorrect14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 30, 32));
        jPanel1.add(LbCorrect14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 30, 32));

        TxtOp15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp15ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 81, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("299 x 34");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("307 x 63");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));
        jPanel1.add(LbIncorrect15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 30, 32));
        jPanel1.add(LbCorrect15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 30, 32));

        TxtOp16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp16ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 81, -1));

        LbIncorrect1.setText("jLabel2");
        jPanel1.add(LbIncorrect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 30, 32));

        LbCorrect1.setText("jLabel2");
        jPanel1.add(LbCorrect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 30, 32));

        TxtOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp1ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 80, -1));

        LbCorrect.setText("jLabel2");
        jPanel1.add(LbCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 30, 32));

        LbIncorrect.setText("jLabel2");
        jPanel1.add(LbIncorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 30, 32));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("903 x 24");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 80, -1));
        jPanel1.add(TxtOp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 81, -1));

        LbCorrect2.setText("jLabel2");
        jPanel1.add(LbCorrect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 30, 32));

        LbIncorrect2.setText("jLabel2");
        jPanel1.add(LbIncorrect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 30, 32));

        LbIncorrect3.setText("jLabel2");
        jPanel1.add(LbIncorrect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 30, 32));

        LbCorrect3.setText("jLabel2");
        jPanel1.add(LbCorrect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 30, 32));

        LbIncorrect4.setText("jLabel2");
        jPanel1.add(LbIncorrect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 30, 32));

        LbCorrect4.setText("jLabel2");
        jPanel1.add(LbCorrect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 30, 32));

        LbIncorrect5.setText("jLabel2");
        jPanel1.add(LbIncorrect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 30, 32));

        LbCorrect5.setText("jLabel2");
        jPanel1.add(LbCorrect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 30, 32));

        LbIncorrect6.setText("jLabel2");
        jPanel1.add(LbIncorrect6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 30, 32));

        LbCorrect6.setText("jLabel2");
        jPanel1.add(LbCorrect6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 30, 32));

        LbIncorrect7.setText("jLabel2");
        jPanel1.add(LbIncorrect7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 30, 32));

        LbCorrect7.setText("jLabel2");
        jPanel1.add(LbCorrect7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 30, 32));

        LbIncorrect8.setText("jLabel2");
        jPanel1.add(LbIncorrect8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 30, 32));

        LbCorrect8.setText("jLabel2");
        jPanel1.add(LbCorrect8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 30, 32));

        TxtOp9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp9ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 81, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("813 x 24");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        LbIncorrect9.setText("jLabel2");
        jPanel1.add(LbIncorrect9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 30, 32));

        LbCorrect9.setText("jLabel2");
        jPanel1.add(LbCorrect9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 30, 32));

        TxtOp10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtOp10ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtOp10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 81, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("704 x 37");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 150, 60));

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
        jPanel1.add(btnRevisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 150, 60));

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setText("Resuelve las multiplicaciones y realiza el procedimiento en tu libreta");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 610, 30));

        LbMarco.setText("jLabel17");
        jPanel1.add(LbMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtOp11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp11ActionPerformed

    private void TxtOp12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp12ActionPerformed

    private void TxtOp13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp13ActionPerformed

    private void TxtOp14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp14ActionPerformed

    private void TxtOp15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp15ActionPerformed

    private void TxtOp16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtOp16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtOp16ActionPerformed

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

    private void btnRevisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarMouseClicked
        //Ponemos un contador de clicks
    }//GEN-LAST:event_btnRevisarMouseClicked

    private void btnRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActionPerformed
        // TODO add your handling code here:
        Resultados();
    }//GEN-LAST:event_btnRevisarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRevisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarMouseEntered
        btnRevisar.setBackground(Color.green);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRevisarMouseEntered

    private void btnRevisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarMouseExited
        // TODO add your handling code here:
        btnRevisar.setBackground(Color.white);
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
            java.util.logging.Logger.getLogger(MultiplicacionIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiplicacionIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiplicacionIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiplicacionIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiplicacionIntermedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbCorrect;
    private javax.swing.JLabel LbCorrect1;
    private javax.swing.JLabel LbCorrect10;
    private javax.swing.JLabel LbCorrect11;
    private javax.swing.JLabel LbCorrect12;
    private javax.swing.JLabel LbCorrect13;
    private javax.swing.JLabel LbCorrect14;
    private javax.swing.JLabel LbCorrect15;
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
    private javax.swing.JLabel LbIncorrect12;
    private javax.swing.JLabel LbIncorrect13;
    private javax.swing.JLabel LbIncorrect14;
    private javax.swing.JLabel LbIncorrect15;
    private javax.swing.JLabel LbIncorrect2;
    private javax.swing.JLabel LbIncorrect3;
    private javax.swing.JLabel LbIncorrect4;
    private javax.swing.JLabel LbIncorrect5;
    private javax.swing.JLabel LbIncorrect6;
    private javax.swing.JLabel LbIncorrect7;
    private javax.swing.JLabel LbIncorrect8;
    private javax.swing.JLabel LbIncorrect9;
    private javax.swing.JLabel LbMarco;
    public static javax.swing.JTextField TxtOp1;
    public static javax.swing.JTextField TxtOp10;
    public static javax.swing.JTextField TxtOp11;
    public static javax.swing.JTextField TxtOp12;
    public static javax.swing.JTextField TxtOp13;
    public static javax.swing.JTextField TxtOp14;
    public static javax.swing.JTextField TxtOp15;
    public static javax.swing.JTextField TxtOp16;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
