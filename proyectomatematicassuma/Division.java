/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatematicassuma;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author lizar
 */
public class Division extends javax.swing.JFrame {

    /**
     * Creates new form Division
     */
    public Division() {
        initComponents();
        btnRevisar.setBackground(Color.white);
        btnVolver.setBackground(Color.white);
        this.setTitle("División");
        this.setLocationRelativeTo(null);
        LabelsVisiblesYCorrectos();
        grupodeBotones();
        Imagenes();
        jPanel1.setBackground(Color.white);
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

    public void Imagenes() {
        ImageIcon bmo = new ImageIcon(getClass().getResource("/Imagenes/jake.gif"));
        Icon bmoo = new ImageIcon(bmo.getImage().getScaledInstance(LbJake.getWidth(), LbJake.getHeight(), Image.SCALE_DEFAULT));
        LbJake.setIcon(bmoo);

    }

    public void grupodeBotones() {

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(jRadioButton1);
        grupo1.add(jRadioButton2);
        grupo1.add(jRadioButton3);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(jRadioButton4);
        grupo2.add(jRadioButton5);
        grupo2.add(jRadioButton6);

        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(jRadioButton7);
        grupo3.add(jRadioButton8);
        grupo3.add(jRadioButton9);

        ButtonGroup grupo4 = new ButtonGroup();
        grupo4.add(jRadioButton10);
        grupo4.add(jRadioButton11);
        grupo4.add(jRadioButton12);

        ButtonGroup grupo5 = new ButtonGroup();
        grupo5.add(jRadioButton13);
        grupo5.add(jRadioButton14);
        grupo5.add(jRadioButton15);

        ButtonGroup grupo6 = new ButtonGroup();
        grupo6.add(jRadioButton16);
        grupo6.add(jRadioButton17);
        grupo6.add(jRadioButton18);

        ButtonGroup grupo7 = new ButtonGroup();
        grupo7.add(jRadioButton19);
        grupo7.add(jRadioButton20);
        grupo7.add(jRadioButton21);

        ButtonGroup grupo8 = new ButtonGroup();
        grupo8.add(jRadioButton22);
        grupo8.add(jRadioButton23);
        grupo8.add(jRadioButton24);

        ButtonGroup grupo9 = new ButtonGroup();
        grupo9.add(jRadioButton25);
        grupo9.add(jRadioButton26);
        grupo9.add(jRadioButton27);

        ButtonGroup grupo10 = new ButtonGroup();
        grupo10.add(jRadioButton28);
        grupo10.add(jRadioButton29);
        grupo10.add(jRadioButton30);

        ButtonGroup grupo11 = new ButtonGroup();
        grupo11.add(jRadioButton31);
        grupo11.add(jRadioButton32);
        grupo11.add(jRadioButton33);

        ButtonGroup grupo12 = new ButtonGroup();
        grupo12.add(jRadioButton34);
        grupo12.add(jRadioButton35);
        grupo12.add(jRadioButton36);
    }

    public void Resultados() {

//grupo 1
        if (jRadioButton2.isSelected()) {
            LbCorrect.setVisible(true);
            LbIncorrect.setVisible(false);
        } else {
            LbCorrect.setVisible(false);
            LbIncorrect.setVisible(true);
        }

        //grupo 2
        if (jRadioButton6.isSelected()) {
            LbCorrect1.setVisible(true);
            LbIncorrect1.setVisible(false);
        } else {
            LbCorrect1.setVisible(false);
            LbIncorrect1.setVisible(true);
        }

        //grupo 3
        if (jRadioButton7.isSelected()) {
            LbCorrect2.setVisible(true);
            LbIncorrect2.setVisible(false);
        } else {
            LbCorrect2.setVisible(false);
            LbIncorrect2.setVisible(true);
        }

        //grupo 4
        if (jRadioButton12.isSelected()) {
            LbCorrect3.setVisible(true);
            LbIncorrect3.setVisible(false);
        } else {
            LbCorrect3.setVisible(false);
            LbIncorrect3.setVisible(true);
        }
        //grupo 5
        if (jRadioButton13.isSelected()) {
            LbCorrect4.setVisible(true);
            LbIncorrect4.setVisible(false);
        } else {
            LbCorrect4.setVisible(false);
            LbIncorrect4.setVisible(true);
        }

        //grupo 6
        if (jRadioButton18.isSelected()) {
            LbCorrect5.setVisible(true);
            LbIncorrect5.setVisible(false);
        } else {
            LbCorrect5.setVisible(false);
            LbIncorrect5.setVisible(true);
        }

        //grupo 7
        if (jRadioButton19.isSelected()) {
            LbCorrect6.setVisible(true);
            LbIncorrect6.setVisible(false);
        } else {
            LbCorrect6.setVisible(false);
            LbIncorrect6.setVisible(true);
        }

        //grupo 8
        if (jRadioButton23.isSelected()) {
            LbCorrect7.setVisible(true);
            LbIncorrect7.setVisible(false);
        } else {
            LbCorrect7.setVisible(false);
            LbIncorrect7.setVisible(true);
        }

        //grupo 9
        if (jRadioButton27.isSelected()) {
            LbCorrect8.setVisible(true);
            LbIncorrect8.setVisible(false);
        } else {
            LbCorrect8.setVisible(false);
            LbIncorrect8.setVisible(true);
        }

        //grupo 10
        if (jRadioButton28.isSelected()) {
            LbCorrect9.setVisible(true);
            LbIncorrect9.setVisible(false);
        } else {
            LbCorrect9.setVisible(false);
            LbIncorrect9.setVisible(true);
        }

        //grupo 11
        if (jRadioButton31.isSelected()) {
            LbCorrect10.setVisible(true);
            LbIncorrect10.setVisible(false);
        } else {
            LbCorrect10.setVisible(false);
            LbIncorrect10.setVisible(true);
        }

        //grupo 12
        if (jRadioButton36.isSelected()) {
            LbCorrect11.setVisible(true);
            LbIncorrect11.setVisible(false);
        } else {
            LbCorrect11.setVisible(false);
            LbIncorrect11.setVisible(true);
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
        LbIncorrect10 = new javax.swing.JLabel();
        LbCorrect10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LbIncorrect11 = new javax.swing.JLabel();
        LbCorrect11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LbIncorrect1 = new javax.swing.JLabel();
        LbCorrect1 = new javax.swing.JLabel();
        LbCorrect = new javax.swing.JLabel();
        LbIncorrect = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        LbIncorrect8 = new javax.swing.JLabel();
        LbCorrect8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LbIncorrect9 = new javax.swing.JLabel();
        LbCorrect9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        btnRevisar = new javax.swing.JButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jRadioButton37 = new javax.swing.JRadioButton();
        LbIncorrect12 = new javax.swing.JLabel();
        LbIncorrect13 = new javax.swing.JLabel();
        LbIncorrect14 = new javax.swing.JLabel();
        jRadioButton38 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton39 = new javax.swing.JRadioButton();
        LbCorrect12 = new javax.swing.JLabel();
        LbIncorrect15 = new javax.swing.JLabel();
        jRadioButton40 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jRadioButton41 = new javax.swing.JRadioButton();
        LbIncorrect16 = new javax.swing.JLabel();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        LbIncorrect17 = new javax.swing.JLabel();
        jRadioButton47 = new javax.swing.JRadioButton();
        LbIncorrect18 = new javax.swing.JLabel();
        jRadioButton48 = new javax.swing.JRadioButton();
        LbCorrect13 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton49 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        LbCorrect14 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        LbCorrect15 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        LbIncorrect19 = new javax.swing.JLabel();
        jRadioButton52 = new javax.swing.JRadioButton();
        LbCorrect16 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LbIncorrect20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton53 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jRadioButton54 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        LbCorrect17 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        LbCorrect18 = new javax.swing.JLabel();
        jRadioButton57 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        LbIncorrect21 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton58 = new javax.swing.JRadioButton();
        LbIncorrect22 = new javax.swing.JLabel();
        LbCorrect19 = new javax.swing.JLabel();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jRadioButton61 = new javax.swing.JRadioButton();
        LbCorrect20 = new javax.swing.JLabel();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        LbCorrect21 = new javax.swing.JLabel();
        LbCorrect22 = new javax.swing.JLabel();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        jRadioButton73 = new javax.swing.JRadioButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton74 = new javax.swing.JRadioButton();
        LbCorrect23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        LbCorrect24 = new javax.swing.JLabel();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jRadioButton77 = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        LbCorrect25 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jRadioButton78 = new javax.swing.JRadioButton();
        jRadioButton79 = new javax.swing.JRadioButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        LbCorrect26 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jRadioButton80 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jRadioButton81 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton82 = new javax.swing.JRadioButton();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        LbIncorrect23 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        LbCorrect27 = new javax.swing.JLabel();
        LbJake = new javax.swing.JLabel();
        perga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbIncorrect10.setText("jLabel2");
        jPanel1.add(LbIncorrect10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 30, 32));

        LbCorrect10.setText("jLabel2");
        jPanel1.add(LbCorrect10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 30, 32));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setText("25 ÷ 5");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        LbIncorrect11.setText("jLabel2");
        jPanel1.add(LbIncorrect11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, 30, 32));

        LbCorrect11.setText("jLabel2");
        jPanel1.add(LbCorrect11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, 30, 32));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel12.setText("42 ÷ 7");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, -1, -1));

        LbIncorrect1.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect1.setText("jLabel2");
        jPanel1.add(LbIncorrect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 30, 32));

        LbCorrect1.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect1.setText("jLabel2");
        jPanel1.add(LbCorrect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 30, 32));

        LbCorrect.setText("jLabel2");
        jPanel1.add(LbCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 32));

        LbIncorrect.setText("jLabel2");
        jPanel1.add(LbIncorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 32));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("9 ÷ 3");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setText("20 ÷ 4");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("10 ÷ 5");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setText("56 ÷ 8");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("63 ÷ 7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 100, -1));

        LbCorrect2.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect2.setText("jLabel2");
        jPanel1.add(LbCorrect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 30, 32));

        LbIncorrect2.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect2.setText("jLabel2");
        jPanel1.add(LbIncorrect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 30, 32));

        LbIncorrect3.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect3.setText("jLabel2");
        jPanel1.add(LbIncorrect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 30, 32));

        LbCorrect3.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect3.setText("jLabel2");
        jPanel1.add(LbCorrect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 30, 32));

        LbIncorrect4.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect4.setText("jLabel2");
        jPanel1.add(LbIncorrect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 30, 32));

        LbCorrect4.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect4.setText("jLabel2");
        jPanel1.add(LbCorrect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 30, 32));

        LbIncorrect5.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect5.setText("jLabel2");
        jPanel1.add(LbIncorrect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 30, 32));

        LbCorrect5.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect5.setText("jLabel2");
        jPanel1.add(LbCorrect5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 30, 32));

        LbIncorrect6.setText("jLabel2");
        jPanel1.add(LbIncorrect6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 30, 32));

        LbCorrect6.setText("jLabel2");
        jPanel1.add(LbCorrect6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 30, 32));

        LbIncorrect7.setText("jLabel2");
        jPanel1.add(LbIncorrect7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 30, 32));

        LbCorrect7.setText("jLabel2");
        jPanel1.add(LbCorrect7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 30, 32));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setText("36 ÷ 9");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        LbIncorrect8.setText("jLabel2");
        jPanel1.add(LbIncorrect8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 30, 32));

        LbCorrect8.setText("jLabel2");
        jPanel1.add(LbCorrect8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 30, 32));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setText("10 ÷ 2");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        LbIncorrect9.setText("jLabel2");
        jPanel1.add(LbIncorrect9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 30, 32));

        LbCorrect9.setText("jLabel2");
        jPanel1.add(LbCorrect9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 30, 32));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel22.setText("12 ÷ 3");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton1.setText("6");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton2.setText("4");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton3.setText("2");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("8 ÷ 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, 50));

        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton4.setText("2");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jRadioButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton5.setText("6");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jRadioButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton6.setText("3");
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jRadioButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton7.setText("2");
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jRadioButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton8.setText("4");
        jPanel1.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jRadioButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton9.setText("3");
        jPanel1.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        jRadioButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton10.setText("4");
        jPanel1.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jRadioButton11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton11.setText("6");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jRadioButton12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton12.setText("5");
        jPanel1.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        jRadioButton14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton14.setText("8");
        jPanel1.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        jRadioButton15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton15.setText("7");
        jPanel1.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        jRadioButton16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton16.setText("8");
        jPanel1.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, -1, -1));

        jRadioButton17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton17.setText("7");
        jPanel1.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 680, -1, -1));

        jRadioButton18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton18.setText("9");
        jPanel1.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, -1, -1));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 790, 150, 60));

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
        jPanel1.add(btnRevisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 790, 150, 60));

        jRadioButton19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton19.setText("7");
        jPanel1.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        jRadioButton20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton20.setText("6");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jRadioButton21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton21.setText("9");
        jPanel1.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jRadioButton22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton22.setText("3");
        jPanel1.add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        jRadioButton23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton23.setText("4");
        jPanel1.add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        jRadioButton24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton24.setText("5");
        jPanel1.add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jRadioButton25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton25.setText("3");
        jPanel1.add(jRadioButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jRadioButton26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton26.setText("2");
        jPanel1.add(jRadioButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        jRadioButton27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton27.setText("5");
        jPanel1.add(jRadioButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jRadioButton28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton28.setText("4");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        jRadioButton29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton29.setText("2");
        jPanel1.add(jRadioButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        jRadioButton30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton30.setText("4");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jRadioButton31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton31.setText("5");
        jPanel1.add(jRadioButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, -1, -1));

        jRadioButton32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton32.setText("6");
        jRadioButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        jRadioButton33.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton33.setText("3");
        jPanel1.add(jRadioButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, -1, -1));

        jRadioButton34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton34.setText("8");
        jPanel1.add(jRadioButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, -1, -1));

        jRadioButton35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton35.setText("4");
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, -1, -1));

        jRadioButton36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton36.setText("6");
        jRadioButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton36ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 710, -1, -1));

        jRadioButton13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton13.setText("6");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona la respuesta correcta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elige la respuesta correcta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 280, 130));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 110));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 110));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 280, 110));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("36 ÷ 6");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 110));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 110));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 280, 110));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 280, 110));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 280, 110));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 280, 110));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 280, 110));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 280, 110));

        jRadioButton37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton37.setText("2");
        jPanel1.add(jRadioButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        LbIncorrect12.setText("jLabel2");
        jPanel1.add(LbIncorrect12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 30, 32));

        LbIncorrect13.setText("jLabel2");
        jPanel1.add(LbIncorrect13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 32));

        LbIncorrect14.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect14.setText("jLabel2");
        jPanel1.add(LbIncorrect14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 30, 32));

        jRadioButton38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton38.setText("8");
        jPanel1.add(jRadioButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel13.setText("10 ÷ 2");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jRadioButton39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton39.setText("4");
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        LbCorrect12.setText("jLabel2");
        jPanel1.add(LbCorrect12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 30, 32));

        LbIncorrect15.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect15.setText("jLabel2");
        jPanel1.add(LbIncorrect15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 30, 32));

        jRadioButton40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton40.setText("7");
        jPanel1.add(jRadioButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 280, 110));

        jRadioButton41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton41.setText("2");
        jPanel1.add(jRadioButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        LbIncorrect16.setText("jLabel2");
        jPanel1.add(LbIncorrect16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 30, 32));

        jRadioButton42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton42.setText("5");
        jPanel1.add(jRadioButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jRadioButton43.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton43.setText("2");
        jPanel1.add(jRadioButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        jRadioButton44.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton44.setText("8");
        jPanel1.add(jRadioButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        jRadioButton45.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton45.setText("5");
        jPanel1.add(jRadioButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, -1, -1));

        jRadioButton46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton46.setText("7");
        jPanel1.add(jRadioButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 680, -1, -1));

        LbIncorrect17.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect17.setText("jLabel2");
        jPanel1.add(LbIncorrect17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 30, 32));

        jRadioButton47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton47.setText("4");
        jPanel1.add(jRadioButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        LbIncorrect18.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect18.setText("jLabel2");
        jPanel1.add(LbIncorrect18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 30, 32));

        jRadioButton48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton48.setText("3");
        jPanel1.add(jRadioButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        LbCorrect13.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect13.setText("jLabel2");
        jPanel1.add(LbCorrect13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 30, 32));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elige la respuesta correcta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel16.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 280, 130));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel23.setText("12 ÷ 3");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        jRadioButton49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton49.setText("6");
        jRadioButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton49ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 280, 110));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona la respuesta correcta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel18.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 130));

        LbCorrect14.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect14.setText("jLabel2");
        jPanel1.add(LbCorrect14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 30, 32));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 280, 110));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel14.setText("36 ÷ 6");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel14)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 110));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 280, 110));

        jRadioButton50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton50.setText("6");
        jRadioButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton50ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        jRadioButton51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton51.setText("2");
        jPanel1.add(jRadioButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel15.setText("10 ÷ 5");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        LbCorrect15.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect15.setText("jLabel2");
        jPanel1.add(LbCorrect15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 30, 32));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 110));

        LbIncorrect19.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect19.setText("jLabel2");
        jPanel1.add(LbIncorrect19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 30, 32));

        jRadioButton52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton52.setText("2");
        jPanel1.add(jRadioButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        LbCorrect16.setText("jLabel2");
        jPanel1.add(LbCorrect16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 32));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel16.setText("8 ÷ 2");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, 50));

        LbIncorrect20.setText("jLabel2");
        jPanel1.add(LbIncorrect20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 30, 32));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel17.setText("56 ÷ 8");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jRadioButton53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton53.setText("4");
        jRadioButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton53ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 110));

        jRadioButton54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton54.setText("4");
        jPanel1.add(jRadioButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel18.setText("36 ÷ 9");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jRadioButton55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton55.setText("9");
        jPanel1.add(jRadioButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, -1, -1));

        jRadioButton56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton56.setText("9");
        jPanel1.add(jRadioButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel19.setText("42 ÷ 7");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, -1, -1));

        LbCorrect17.setText("jLabel2");
        jPanel1.add(LbCorrect17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 30, 32));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 110));

        LbCorrect18.setText("jLabel2");
        jPanel1.add(LbCorrect18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 30, 32));

        jRadioButton57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton57.setText("6");
        jRadioButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton57ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel20.setText("20 ÷ 4");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        LbIncorrect21.setText("jLabel2");
        jPanel1.add(LbIncorrect21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, 30, 32));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel21.setText("25 ÷ 5");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        jRadioButton58.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton58.setText("5");
        jPanel1.add(jRadioButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        LbIncorrect22.setText("jLabel2");
        jPanel1.add(LbIncorrect22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 30, 32));

        LbCorrect19.setText("jLabel2");
        jPanel1.add(LbCorrect19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 30, 32));

        jRadioButton59.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton59.setText("5");
        jPanel1.add(jRadioButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jRadioButton60.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton60.setText("6");
        jRadioButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton60ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jRadioButton61.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton61.setText("8");
        jPanel1.add(jRadioButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, -1, -1));

        LbCorrect20.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect20.setText("jLabel2");
        jPanel1.add(LbCorrect20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 30, 32));

        jRadioButton62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton62.setText("6");
        jRadioButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton62ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        jRadioButton63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton63.setText("3");
        jPanel1.add(jRadioButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        jRadioButton64.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton64.setText("4");
        jPanel1.add(jRadioButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 280, 110));

        jRadioButton65.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton65.setText("4");
        jPanel1.add(jRadioButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jRadioButton66.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton66.setText("3");
        jPanel1.add(jRadioButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel24.setText("9 ÷ 3");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        LbCorrect21.setText("jLabel2");
        jPanel1.add(LbCorrect21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 680, 30, 32));

        LbCorrect22.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect22.setText("jLabel2");
        jPanel1.add(LbCorrect22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 30, 32));

        jRadioButton67.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton67.setText("4");
        jRadioButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton67ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, -1, -1));

        jRadioButton68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton68.setText("3");
        jPanel1.add(jRadioButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, -1, -1));

        jRadioButton69.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton69.setText("6");
        jRadioButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton69ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel25.setText("63 ÷ 7");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 100, -1));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 280, 110));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 280, 110));

        jRadioButton70.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton70.setText("6");
        jRadioButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton70ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 710, -1, -1));

        jRadioButton71.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton71.setText("7");
        jPanel1.add(jRadioButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        jRadioButton72.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton72.setText("3");
        jPanel1.add(jRadioButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jRadioButton73.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton73.setText("6");
        jRadioButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton73ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel26.setText("36 ÷ 6");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel26)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel26)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 110));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel27.setText("63 ÷ 7");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 670, 100, -1));

        jRadioButton74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton74.setText("5");
        jPanel1.add(jRadioButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        LbCorrect23.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect23.setText("jLabel2");
        jPanel1.add(LbCorrect23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 30, 32));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel28.setText("20 ÷ 4");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        LbCorrect24.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect24.setText("jLabel2");
        jPanel1.add(LbCorrect24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 30, 32));

        jRadioButton75.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton75.setText("3");
        jPanel1.add(jRadioButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        jRadioButton76.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton76.setText("4");
        jPanel1.add(jRadioButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jRadioButton77.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton77.setText("6");
        jRadioButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton77ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 280, 110));

        LbCorrect25.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect25.setText("jLabel2");
        jPanel1.add(LbCorrect25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 30, 32));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 110));

        jRadioButton78.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton78.setText("6");
        jRadioButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton78ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jRadioButton79.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton79.setText("8");
        jPanel1.add(jRadioButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, -1, -1));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel29.setText("36 ÷ 6");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel29)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel29)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 110));

        LbCorrect26.setBackground(new java.awt.Color(255, 255, 255));
        LbCorrect26.setText("jLabel2");
        jPanel1.add(LbCorrect26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 30, 32));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 110));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 110));

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona la respuesta correcta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel34.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 130));

        jRadioButton80.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton80.setText("9");
        jPanel1.add(jRadioButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, -1, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel30.setText("8 ÷ 2");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, 50));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 280, 110));

        jRadioButton81.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton81.setText("4");
        jPanel1.add(jRadioButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel31.setText("10 ÷ 5");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jRadioButton82.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton82.setText("2");
        jPanel1.add(jRadioButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 280, 110));

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 280, 110));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 110));

        LbIncorrect23.setBackground(new java.awt.Color(255, 255, 255));
        LbIncorrect23.setText("jLabel2");
        jPanel1.add(LbIncorrect23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 30, 32));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 280, 110));

        jPanel40.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciona la respuesta correcta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel40.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 130));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 110));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel32.setText("9 ÷ 3");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jRadioButton83.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton83.setText("4");
        jPanel1.add(jRadioButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jRadioButton84.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton84.setText("6");
        jRadioButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton84ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        LbCorrect27.setText("jLabel2");
        jPanel1.add(LbCorrect27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 32));

        LbJake.setText("jLabel1");
        jPanel1.add(LbJake, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 220, 240));

        perga.setText("jLabel4");
        jPanel1.add(perga, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -50, 870, 1050));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

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

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jRadioButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton32ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jRadioButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton36ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton49ActionPerformed

    private void jRadioButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton50ActionPerformed

    private void jRadioButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton53ActionPerformed

    private void jRadioButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton57ActionPerformed

    private void jRadioButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton60ActionPerformed

    private void jRadioButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton62ActionPerformed

    private void jRadioButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton67ActionPerformed

    private void jRadioButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton69ActionPerformed

    private void jRadioButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton70ActionPerformed

    private void jRadioButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton73ActionPerformed

    private void jRadioButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton77ActionPerformed

    private void jRadioButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton78ActionPerformed

    private void jRadioButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton84ActionPerformed

    private void btnRevisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarMouseEntered
        // TODO add your handling code here:
        btnRevisar.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnRevisarMouseEntered

    private void btnRevisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevisarMouseExited
        // TODO add your handling code here:
        btnRevisar.setBackground(Color.white);
    }//GEN-LAST:event_btnRevisarMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        // TODO add your handling code here:
        btnVolver.setBackground(Color.red);
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
            java.util.logging.Logger.getLogger(Division.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Division.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Division.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Division.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Division().setVisible(true);
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
    private javax.swing.JLabel LbCorrect16;
    private javax.swing.JLabel LbCorrect17;
    private javax.swing.JLabel LbCorrect18;
    private javax.swing.JLabel LbCorrect19;
    private javax.swing.JLabel LbCorrect2;
    private javax.swing.JLabel LbCorrect20;
    private javax.swing.JLabel LbCorrect21;
    private javax.swing.JLabel LbCorrect22;
    private javax.swing.JLabel LbCorrect23;
    private javax.swing.JLabel LbCorrect24;
    private javax.swing.JLabel LbCorrect25;
    private javax.swing.JLabel LbCorrect26;
    private javax.swing.JLabel LbCorrect27;
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
    private javax.swing.JLabel LbIncorrect16;
    private javax.swing.JLabel LbIncorrect17;
    private javax.swing.JLabel LbIncorrect18;
    private javax.swing.JLabel LbIncorrect19;
    private javax.swing.JLabel LbIncorrect2;
    private javax.swing.JLabel LbIncorrect20;
    private javax.swing.JLabel LbIncorrect21;
    private javax.swing.JLabel LbIncorrect22;
    private javax.swing.JLabel LbIncorrect23;
    private javax.swing.JLabel LbIncorrect3;
    private javax.swing.JLabel LbIncorrect4;
    private javax.swing.JLabel LbIncorrect5;
    private javax.swing.JLabel LbIncorrect6;
    private javax.swing.JLabel LbIncorrect7;
    private javax.swing.JLabel LbIncorrect8;
    private javax.swing.JLabel LbIncorrect9;
    private javax.swing.JLabel LbJake;
    private javax.swing.JButton btnRevisar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel perga;
    // End of variables declaration//GEN-END:variables
}
