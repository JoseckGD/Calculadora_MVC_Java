/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author 52771
 */
public class calculadora extends javax.swing.JFrame {

    /**
     * Creates new form calculadora
     */
    public calculadora() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtRes = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora MVC");
        setResizable(false);
        setSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(this);
        jLabel1.setText("Calculadora MVC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(376, 60));
        jPanel2.setMinimumSize(new java.awt.Dimension(376, 60));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        btnSumar.setBackground(new java.awt.Color(0, 51, 255));
        btnSumar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(0, 0, 0));
        btnSumar.setText("SUMAR");
        btnSumar.setBorder(null);
        btnSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumarMouseClicked(evt);
            }
        });
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSumar);
        btnSumar.getAccessibleContext().setAccessibleParent(this);

        btnRestar.setBackground(new java.awt.Color(204, 51, 255));
        btnRestar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(0, 0, 0));
        btnRestar.setText("RESTAR");
        btnRestar.setBorder(null);
        btnRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestarMouseClicked(evt);
            }
        });
        jPanel2.add(btnRestar);
        btnRestar.getAccessibleContext().setAccessibleParent(this);

        btnMultiplicar.setBackground(new java.awt.Color(255, 0, 51));
        btnMultiplicar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(0, 0, 0));
        btnMultiplicar.setText("MULTIPLICAR");
        btnMultiplicar.setBorder(null);
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicarMouseClicked(evt);
            }
        });
        jPanel2.add(btnMultiplicar);
        btnMultiplicar.getAccessibleContext().setAccessibleParent(this);

        btnDividir.setBackground(new java.awt.Color(0, 255, 102));
        btnDividir.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(0, 0, 0));
        btnDividir.setText("DIVIDIR");
        btnDividir.setBorder(null);
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDividirMouseClicked(evt);
            }
        });
        jPanel2.add(btnDividir);
        btnDividir.getAccessibleContext().setAccessibleParent(this);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 500, 50));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Numero 1:");
        jPanel3.add(jLabel2);

        txtNum1.setBackground(new java.awt.Color(51, 51, 51));
        txtNum1.setForeground(new java.awt.Color(255, 255, 255));
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNum1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtNum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNum1MouseClicked(evt);
            }
        });
        jPanel3.add(txtNum1);
        txtNum1.getAccessibleContext().setAccessibleParent(this);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 30));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Numero 2:");
        jPanel4.add(jLabel3);

        txtNum2.setBackground(new java.awt.Color(51, 51, 51));
        txtNum2.setForeground(new java.awt.Color(255, 255, 255));
        txtNum2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtNum2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNum2MouseClicked(evt);
            }
        });
        jPanel4.add(txtNum2);
        txtNum2.getAccessibleContext().setAccessibleParent(this);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 210, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Resultado:");
        jPanel5.add(jLabel4);

        txtRes.setBackground(new java.awt.Color(102, 102, 102));
        txtRes.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtRes.setForeground(new java.awt.Color(255, 255, 255));
        txtRes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRes.setEnabled(false);
        jPanel5.add(txtRes);
        txtRes.getAccessibleContext().setAccessibleParent(this);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 300, 40));

        btnBorrar.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("X");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));
        btnBorrar.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSumarActionPerformed

    private void txtNum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNum1MouseClicked
        // TODO add your handling code here:
       this.txtNum1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0, 255), 1, true));
       this.txtNum2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
    }//GEN-LAST:event_txtNum1MouseClicked

    private void txtNum2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNum2MouseClicked
        // TODO add your handling code here:
        this.txtNum2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0, 255), 1, true));
       this.txtNum1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
    
    }//GEN-LAST:event_txtNum2MouseClicked

    private void btnSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarMouseClicked
        // TODO add your handling code here:
       this.txtNum1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
       this.txtNum2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
    }//GEN-LAST:event_btnSumarMouseClicked

    private void btnRestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseClicked
        // TODO add your handling code here:
        this.txtNum1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
       this.txtNum2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
    }//GEN-LAST:event_btnRestarMouseClicked

    private void btnMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarMouseClicked
        // TODO add your handling code here:
        this.txtNum1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
       this.txtNum2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
    }//GEN-LAST:event_btnMultiplicarMouseClicked

    private void btnDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirMouseClicked
        // TODO add your handling code here:
        this.txtNum1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
       this.txtNum2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255, 255), 1, true));
    }//GEN-LAST:event_btnDividirMouseClicked

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnDividir;
    public javax.swing.JButton btnMultiplicar;
    public javax.swing.JButton btnRestar;
    public javax.swing.JButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField txtNum1;
    public javax.swing.JTextField txtNum2;
    public javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}