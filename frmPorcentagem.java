/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projaula4;

/**
 *
 * @author ETESP
 */
public class frmPorcentagem extends javax.swing.JFrame {

    /**
     * Creates new form frmPorcentagem
     */
    public frmPorcentagem() {
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

        lblPorcentagem = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        lblNumero2 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JTextField();
        lblSoma = new javax.swing.JLabel();
        lblDiferenca = new javax.swing.JLabel();
        lbl10 = new javax.swing.JButton();
        lbl20 = new javax.swing.JButton();
        lbl30 = new javax.swing.JButton();
        lbl40 = new javax.swing.JButton();
        lbl50 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPorcentagem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPorcentagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcentagem.setText("Porcentagem");
        lblPorcentagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblPorcentagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, -1));

        lblNumero1.setText("Digite um número:");
        getContentPane().add(lblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(txtNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 50, -1));

        lblNumero2.setText("Digite um número:");
        getContentPane().add(lblNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));
        getContentPane().add(txtNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 50, -1));

        lblSoma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoma.setText("Resultado Somatória");
        getContentPane().add(lblSoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 400, -1));

        lblDiferenca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDiferenca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiferenca.setText("Diferença");
        getContentPane().add(lblDiferenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 400, -1));

        lbl10.setText("10%");
        lbl10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl10ActionPerformed(evt);
            }
        });
        getContentPane().add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lbl20.setText("20%");
        lbl20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl20ActionPerformed(evt);
            }
        });
        getContentPane().add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        lbl30.setText("30%");
        lbl30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl30ActionPerformed(evt);
            }
        });
        getContentPane().add(lbl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        lbl40.setText("40%");
        lbl40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl40ActionPerformed(evt);
            }
        });
        getContentPane().add(lbl40, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        lbl50.setText("50%");
        lbl50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl50ActionPerformed(evt);
            }
        });
        getContentPane().add(lbl50, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-311)/2, 416, 311);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl10ActionPerformed
        // TODO add your handling code here:
        String numero1 = txtNumero1.getText();
        double n1 = Double.parseDouble(numero1);
        String numero2 = txtNumero2.getText();
        double n2 = Double.parseDouble(numero2);
        
        lblSoma.setText("Resultado Somatória: " + Double.toString(n1 + n2));
        lblDiferenca.setText("Diferença: " + Double.toString((n1 + n2) * 0.1));      
    }//GEN-LAST:event_lbl10ActionPerformed

    private void lbl20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl20ActionPerformed
        // TODO add your handling code here:
        String numero1 = txtNumero1.getText();
        double n1 = Double.parseDouble(numero1);
        String numero2 = txtNumero2.getText();
        double n2 = Double.parseDouble(numero2);
        
        lblSoma.setText("Resultado Somatória: " + Double.toString(n1 + n2));
        lblDiferenca.setText("Diferença: " + Double.toString((n1 + n2) * 0.2));
    }//GEN-LAST:event_lbl20ActionPerformed

    private void lbl30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl30ActionPerformed
        // TODO add your handling code here:
        String numero1 = txtNumero1.getText();
        double n1 = Double.parseDouble(numero1);
        String numero2 = txtNumero2.getText();
        double n2 = Double.parseDouble(numero2);
        
        lblSoma.setText("Resultado Somatória: " + Double.toString(n1 + n2));
        lblDiferenca.setText("Diferença: " + Double.toString((n1 + n2) * 0.3));
    }//GEN-LAST:event_lbl30ActionPerformed

    private void lbl40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl40ActionPerformed
        // TODO add your handling code here:
        String numero1 = txtNumero1.getText();
        double n1 = Double.parseDouble(numero1);
        String numero2 = txtNumero2.getText();
        double n2 = Double.parseDouble(numero2);
        
        lblSoma.setText("Resultado Somatória: " + Double.toString(n1 + n2));
        lblDiferenca.setText("Diferença: " + Double.toString((n1 + n2) * 0.4));
    }//GEN-LAST:event_lbl40ActionPerformed

    private void lbl50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl50ActionPerformed
        // TODO add your handling code here:
        String numero1 = txtNumero1.getText();
        double n1 = Double.parseDouble(numero1);
        String numero2 = txtNumero2.getText();
        double n2 = Double.parseDouble(numero2);
        
        lblSoma.setText("Resultado Somatória: " + Double.toString(n1 + n2));
        lblDiferenca.setText("Diferença: " + Double.toString((n1 + n2) * 0.5));
    }//GEN-LAST:event_lbl50ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPorcentagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPorcentagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPorcentagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPorcentagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPorcentagem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton lbl10;
    private javax.swing.JButton lbl20;
    private javax.swing.JButton lbl30;
    private javax.swing.JButton lbl40;
    private javax.swing.JButton lbl50;
    private javax.swing.JLabel lblDiferenca;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblPorcentagem;
    private javax.swing.JLabel lblSoma;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}
