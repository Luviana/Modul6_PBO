/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author Luviana
 */
public class form_kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form form_kalkulator
     */
    public form_kalkulator() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBil1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBil2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnKali = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 290, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Bilangan 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 75, 30);

        txtBil1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        getContentPane().add(txtBil1);
        txtBil1.setBounds(130, 70, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Bilangan 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 120, 75, 30);

        txtBil2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        getContentPane().add(txtBil2);
        txtBil2.setBounds(130, 120, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Operator");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-5, 190, 300, 30);

        btnKali.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnKali.setText("x");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKali);
        btnKali.setBounds(40, 230, 40, 40);

        btnBagi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnBagi.setText(":");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnBagi);
        btnBagi.setBounds(100, 230, 40, 40);

        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah);
        btnTambah.setBounds(160, 230, 40, 40);

        btnKurang.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKurang);
        btnKurang.setBounds(220, 230, 40, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hasil");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-5, 290, 300, 30);

        txtHasil.setEditable(false);
        txtHasil.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        getContentPane().add(txtHasil);
        txtHasil.setBounds(100, 330, 100, 30);

        setBounds(0, 0, 303, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        
        int bil1 = Integer.parseInt(txtBil1.getText());
        int bil2 = Integer.parseInt(txtBil2.getText());
        int hasil = bil1+bil2;
        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        // TODO add your handling code here:
        
        int bil1 = Integer.parseInt(txtBil1.getText());
        int bil2 = Integer.parseInt(txtBil2.getText());
        int hasil = bil1*bil2;
        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        // TODO add your handling code here:
        
        int bil1 = Integer.parseInt(txtBil1.getText());
        int bil2 = Integer.parseInt(txtBil2.getText());
        int hasil = bil1/bil2;
        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        // TODO add your handling code here:
        
        int bil1 = Integer.parseInt(txtBil1.getText());
        int bil2 = Integer.parseInt(txtBil2.getText());
        int hasil = bil1-bil2;
        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnKurangActionPerformed

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
            java.util.logging.Logger.getLogger(form_kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBil1;
    private javax.swing.JTextField txtBil2;
    private javax.swing.JTextField txtHasil;
    // End of variables declaration//GEN-END:variables
}
