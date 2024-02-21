package proyectoprogramacion;

import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class FormularioElecciones extends javax.swing.JFrame implements ActionListener {

    private ArrayList<JCheckBox> botones = new ArrayList<>();
    private int count;

    /**
     * Creates new form FormularioElecciones
     */
    public FormularioElecciones() {
        initComponents();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton5);
        
        buttonGroup2.add(jRadioButton6);
        buttonGroup2.add(jRadioButton7);
        buttonGroup2.add(jRadioButton8);
        
        buttonGroup3.add(jRadioButton9);
        buttonGroup3.add(jRadioButton10);
        buttonGroup3.add(jRadioButton11);
        buttonGroup3.add(jRadioButton12);

        botones.add(jCheckBox1);
        botones.add(jCheckBox2);
        botones.add(jCheckBox3);
        botones.add(jCheckBox4);
        botones.add(jCheckBox5);
        botones.add(jCheckBox6);
        botones.add(jCheckBox7);
        botones.add(jCheckBox8);

        for (JCheckBox s : botones) {
            s.addActionListener(FormularioElecciones.this);
        }
        
        jButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               
                for(JCheckBox button : botones){
                    if(button.isSelected()){
                        ResultadoVoto.opVocal.add(button.getText());
                    }
                }
                ResultadoVoto.opPresi = getSelectedButtonText(buttonGroup);
                ResultadoVoto.opVicePresi = getSelectedButtonText(buttonGroup1);
                ResultadoVoto.opSecre = getSelectedButtonText(buttonGroup2);
                ResultadoVoto.opTeso = getSelectedButtonText(buttonGroup3);
                
                dispose();
                ResultadoVoto rv = new ResultadoVoto();
                rv.setVisible(true);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String opcion = e.getActionCommand();

        switch (opcion) {
            case "Fulanito1":
                if (checkVoteState(jCheckBox1.isSelected())) {
                    jLabel2.setText("Ha seleccionado a " + count + " vocales");
                } else {
                    jCheckBox1.setSelected(false);
                    jLabel2.setText("No puede seleccionar más vocales");
                }
                break;
            case "Fulanito2":
                if (checkVoteState(jCheckBox2.isSelected())) {
                    jLabel2.setText("Ha seleccionado a " + count + " vocales");
                } else {
                    jCheckBox2.setSelected(false);
                    jLabel2.setText("No puede seleccionar más vocales");
                }
                break;
            case "Fulanito3":
                if (checkVoteState(jCheckBox3.isSelected())) {
                    jLabel2.setText("Ha seleccionado a " + count + " vocales");
                } else {
                    jCheckBox3.setSelected(false);
                    jLabel2.setText("No puede seleccionar más vocales");
                }
                break;
            case "Fulanito4":
                if (checkVoteState(jCheckBox4.isSelected())) {
                    jLabel2.setText("Ha seleccionado a " + count + " vocales");
                } else {
                    jCheckBox4.setSelected(false);
                    jLabel2.setText("No puede seleccionar más vocales");
                }
                break;
            case "Fulanito5":
                if (checkVoteState(jCheckBox5.isSelected())) {
                    jLabel2.setText("Ha seleccionado a " + count + " vocales");
                } else {
                    jCheckBox5.setSelected(false);
                    jLabel2.setText("No puede seleccionar más vocales");
                }
                break;
            case "Fulanito6":
                if (checkVoteState(jCheckBox6.isSelected())) {
                    jLabel2.setText("Ha seleccionado a " + count + " vocales");
                } else {
                    jCheckBox6.setSelected(false);
                    jLabel2.setText("No puede seleccionar más vocales");
                }
                break;
            case "Fulanito7":
                if (checkVoteState(jCheckBox7.isSelected())) {
                    jLabel2.setText("Ha seleccionado a " + count + " vocales");
                } else {
                    jCheckBox7.setSelected(false);
                    jLabel2.setText("No puede seleccionar más vocales");
                }
                break;
            case "Fulanito8":
                if (checkVoteState(jCheckBox8.isSelected())) {
                    jLabel2.setText("Ha seleccionado a " + count + " vocales");
                } else {
                    jCheckBox8.setSelected(false);
                    jLabel2.setText("No puede seleccionar más vocales");
                }
                break;
            default:
        }
    }

    private boolean checkVoteState(boolean isButtonActivated) {
        boolean flag = true;
        if (isButtonActivated) {
            count++;
        } else {
            count--;
        }
        if (count > 3) {
            flag = false;
            count--;
        }
        return flag;
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        MensajeVocal = new javax.swing.JLabel();
        Elecciones = new javax.swing.JLabel();
        Presidente = new javax.swing.JLabel();
        Vicepresidente = new javax.swing.JLabel();
        Secretario = new javax.swing.JLabel();
        Tesorero = new javax.swing.JLabel();
        Vocales = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        MensajeVocal.setLabelFor(MensajeVocal);
        MensajeVocal.setText("JLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Elecciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Elecciones.setText("ELECCIONES DE PRESIDENTE");
        getContentPane().add(Elecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 240, 50));

        Presidente.setText("Presidente");
        getContentPane().add(Presidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        Vicepresidente.setText("Vicepresidente");
        getContentPane().add(Vicepresidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        Secretario.setText("Secretario");
        getContentPane().add(Secretario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        Tesorero.setText("Tesorero");
        getContentPane().add(Tesorero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        Vocales.setText("Vocales");
        getContentPane().add(Vocales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jRadioButton1.setText("Fulanito1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jRadioButton2.setText("Blanco");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jRadioButton3.setText("Fulanito1");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jRadioButton4.setText("Fulanito2");
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jRadioButton5.setText("Blanco");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jRadioButton6.setText("Fulanito1");
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jRadioButton7.setText("Fulanito2");
        getContentPane().add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jRadioButton8.setText("Blanco");
        getContentPane().add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jRadioButton9.setText("Fulanito1");
        getContentPane().add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jRadioButton10.setText("Fulanito2");
        getContentPane().add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jRadioButton11.setText("Fulanito3");
        getContentPane().add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jRadioButton12.setText("Blanco");
        getContentPane().add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jCheckBox1.setText("Fulanito1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jCheckBox2.setText("Fulanito2");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jCheckBox3.setText("Fulanito3");
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        jCheckBox4.setText("Fulanito4");
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jCheckBox5.setText("Fulanito5");
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jCheckBox6.setText("Fulanito6");
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jCheckBox7.setText("Fulanito7");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jCheckBox8.setText("Fulanito8");
        getContentPane().add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jLabel2.setLabelFor(jLabel2);
        jLabel2.setText("Número de vocales seleccionados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Votante1", "Votante2", "Votante3", "Votante4", "Votante5", "Votante6", "Votante7" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TOdd your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioElecciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Elecciones;
    private javax.swing.JLabel MensajeVocal;
    private javax.swing.JLabel Presidente;
    private javax.swing.JLabel Secretario;
    private javax.swing.JLabel Tesorero;
    private javax.swing.JLabel Vicepresidente;
    private javax.swing.JLabel Vocales;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
