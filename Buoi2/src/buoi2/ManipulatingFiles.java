/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buoi2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Hieu Pham
 */
public class ManipulatingFiles extends javax.swing.JFrame {

    /**
     * Creates new form ManipulatingFiles
     */
    public ManipulatingFiles() {
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
        jTextFieldFileName = new javax.swing.JTextField();
        jTextFieldString = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelContent = new javax.swing.JLabel();
        jButtonReadFile = new javax.swing.JButton();
        jButtonWriteFile = new javax.swing.JButton();
        jButtonReadText = new javax.swing.JButton();
        jButtonWriteText = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nhập tên tập tin");

        jLabel2.setText("Nhập chuỗi");

        jLabel3.setText("Nội dung file");

        jButtonReadFile.setText("Đọc file nhị phân");
        jButtonReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadFileActionPerformed(evt);
            }
        });

        jButtonWriteFile.setText("Ghi file nhị phân");
        jButtonWriteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWriteFileActionPerformed(evt);
            }
        });

        jButtonReadText.setText("Đọc file văn bản");
        jButtonReadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadTextActionPerformed(evt);
            }
        });

        jButtonWriteText.setText("Ghi file văn bản");
        jButtonWriteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWriteTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContent)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldFileName, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jTextFieldString))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonWriteText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonWriteFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonReadText)
                            .addComponent(jButtonReadFile))))
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelContent))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReadFile)
                    .addComponent(jButtonWriteFile))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReadText)
                    .addComponent(jButtonWriteText))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonWriteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWriteFileActionPerformed
        // TODO add your handling code here:
        byte a[] = new byte[20];
        File file;
        char s[] = jTextFieldString.getText().toCharArray();
        for (int i = 0; i < s.length; i++) {
            a[i] = (byte) s[i];
        }

        try {
            file = new File(jTextFieldFileName.getText());
            FileOutputStream fo = new FileOutputStream(file);
            fo.write(a);
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonWriteFileActionPerformed

    private void jButtonReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadFileActionPerformed
        // TODO add your handling code here:
        byte a[];
        File file;

        try {
            file = new File(jTextFieldFileName.getText());
            FileInputStream fi = new FileInputStream(file);
            a = new byte[fi.available()];
            fi.read(a);
            fi.close();
            jLabelContent.setText(new String(a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonReadFileActionPerformed

    private void jButtonWriteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWriteTextActionPerformed
        // TODO add your handling code here:
        try {
            FileWriter fw = new FileWriter(new File(jTextFieldFileName.getText()));
            fw.write(jTextFieldString.getText());
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonWriteTextActionPerformed

    private void jButtonReadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadTextActionPerformed
        // TODO add your handling code here:
        try {
            FileReader fr = new FileReader(new File(jTextFieldFileName.getText()));
            StringBuffer sb = new StringBuffer();
            char ca[] = new char[5];
            while (fr.ready()) {
                int len = fr.read(ca);
                sb.append(ca, 0, len);
            }
            fr.close();
            jLabelContent.setText(sb + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonReadTextActionPerformed

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
            java.util.logging.Logger.getLogger(ManipulatingFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManipulatingFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManipulatingFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManipulatingFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManipulatingFiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReadFile;
    private javax.swing.JButton jButtonReadText;
    private javax.swing.JButton jButtonWriteFile;
    private javax.swing.JButton jButtonWriteText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelContent;
    private javax.swing.JTextField jTextFieldFileName;
    private javax.swing.JTextField jTextFieldString;
    // End of variables declaration//GEN-END:variables
}
