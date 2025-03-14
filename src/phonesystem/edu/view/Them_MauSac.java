/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import phonesystem.edu.ultil.MsgBox;

/**
 *
 * @author NP
 */
public class Them_MauSac extends javax.swing.JDialog {

    public static String Mau;

    /**
     * Creates new form Add_Hang
     */
    public Them_MauSac(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        txt_ThemMau = new javax.swing.JTextField();
        btn_ThemMau = new javax.swing.JButton();
        btn_Huy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông báo");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Nhập Màu sắc");

        btn_ThemMau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ThemMau.setForeground(new java.awt.Color(0, 0, 204));
        btn_ThemMau.setText("Thêm");
        btn_ThemMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemMauActionPerformed(evt);
            }
        });

        btn_Huy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Huy.setForeground(new java.awt.Color(0, 0, 204));
        btn_Huy.setText("Hủy");
        btn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_ThemMau, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(btn_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_ThemMau, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_ThemMau, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ThemMau, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemMauActionPerformed
        if (kiemtraMauSac()) {
            Mau = txt_ThemMau.getText();
            int i = Main_Frame.cbo_MauSac_SanPham.getItemCount();
            Main_Frame.cbo_MauSac_SanPham.insertItemAt(Mau, i - 1);
            Main_Frame.cbo_MauSac_SanPham.setSelectedIndex(i - 1);
            this.dispose();
        }
    }//GEN-LAST:event_btn_ThemMauActionPerformed

    private void btn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_HuyActionPerformed

    public boolean kiemtraMauSac() {
        String strPattern = "[~!@#$%^&*()_+{}\\[\\]:;<>/?]";
        Pattern p = Pattern.compile(strPattern);
        Matcher matcherMauSac = p.matcher(txt_ThemMau.getText());

        if (txt_ThemMau.getText().equals("")) {
            MsgBox.alert(this, "Vui lòng nhập vào Màu sắc");
            txt_ThemMau.requestFocus();
            return false;
        } else if (matcherMauSac.find()) {
            MsgBox.alert(this, "Màu sắc không được chứa kí tự đặc biệt");
            txt_ThemMau.requestFocus();
            return false;
        }
        try {
            if (Integer.parseInt(txt_ThemMau.getText()) > 0 || Integer.parseInt(txt_ThemMau.getText()) < 0) {
                MsgBox.alert(this, "Màu sắc phải là chữ");
                txt_ThemMau.requestFocus();
                return false;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Màu sắc phải là chữ");
            txt_ThemMau.requestFocus();
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(Them_MauSac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Them_MauSac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Them_MauSac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Them_MauSac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Them_MauSac dialog = new Them_MauSac(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Huy;
    private javax.swing.JButton btn_ThemMau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_ThemMau;
    // End of variables declaration//GEN-END:variables
}
