/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bai4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import javax.swing.JOptionPane;

/**
 *
 * @author Hieu Pham
 */
public class formChat extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form formChat
     */
    private InetAddress group;
    private int port;
    private String nick;
    private Thread myThread;
    private MulticastSocket socket;
    private DatagramPacket truyen, nhan;

    public formChat() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldGroup = new javax.swing.JTextField();
        jTextFieldPort = new javax.swing.JTextField();
        jTextFieldNick = new javax.swing.JTextField();
        jButtonConnect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaContent = new javax.swing.JTextArea();
        jButtonSend = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nhập địa chỉ Multicast");

        jLabel2.setText("Port");

        jLabel3.setText("Nick");

        jTextFieldGroup.setText("224.0.0.1");

        jTextFieldPort.setText("1234");

        jTextFieldNick.setText("Hieu");

        jButtonConnect.setText("Kết nối");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jTextAreaContent.setColumns(20);
        jTextAreaContent.setRows(5);
        jScrollPane1.setViewportView(jTextAreaContent);

        jButtonSend.setText("Send");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });

        jButtonExit.setText("Đóng");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jTextAreaChat.setColumns(20);
        jTextAreaChat.setRows(5);
        jScrollPane2.setViewportView(jTextAreaChat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNick)
                            .addComponent(jTextFieldPort)
                            .addComponent(jTextFieldGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jButtonConnect, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSend)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jButtonConnect))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonSend, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        // TODO add your handling code here:
        if (jButtonConnect.getText().equals("Kết nối")) {
            //Khi nhấn nút kết nối
            jButtonConnect.setText("Ngắt kết nối");
            //Chuyển nút kết nối thành nút ngắt kết nối
            jTextAreaChat.setEnabled(true);
            jTextAreaContent.setEnabled(true);
            jButtonSend.setEnabled(true);
            jTextFieldGroup.setEnabled(false);
            jTextFieldPort.setEnabled(false);
            jTextFieldNick.setEnabled(false);
            try {
                group = InetAddress.getByName(jTextFieldGroup.getText());
                if (group.isMulticastAddress()) { //kiểm tra địa chỉ có là Multicast hay không
                    nick = jTextFieldNick.getText();
                    port = Integer.parseInt(jTextFieldPort.getText());
                    if (myThread == null) { //Tạo ra và thiết lập ban đầu cho các đối tượng mạng
                        socket = new MulticastSocket(port);
                        socket.setTimeToLive(1);
                        //Thiết lập đường dẫn cho các gói tin
                        socket.joinGroup(group);
                        //Đăng ký router là chương trình máy tính đăng ký vào nhóm group
                        truyen = new DatagramPacket(new byte[1], 1, group, port);
                        nhan = new DatagramPacket(new byte[65507], 65507);
                        //Tạo ra thread xử lý dữ liệu truyền đến
                        myThread = new Thread(this);
                        myThread.start();
                        //Bắt đầu nhận dữ liệu - Lúc này hàm run sẽ được gọi để thực thi
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nhập địa chỉ sai rồi!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            //Sự kiện cho nút ngắt kết nối
            jTextAreaChat.setEnabled(false);
            jTextAreaContent.setEnabled(false);
            jButtonSend.setEnabled(false);
            jTextFieldGroup.setEnabled(true);
            jTextFieldPort.setEnabled(true);
            jTextFieldNick.setEnabled(true);
            jButtonConnect.setText("Kết nối");
            //Chuyển nút ngắt kết nối thành nút kết nối
            if (myThread != null) {
                myThread.interrupt(); //dừng nhận dữ liệu
                myThread = null;
                try {
                    socket.leaveGroup(group); //ra khỏi group
                } catch (IOException e) {
                }
                socket.close();
            }
        }
    }//GEN-LAST:event_jButtonConnectActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        // TODO add your handling code here:
        try {
            byte utf[] = (nick + ": " + jTextAreaContent.getText()).getBytes("UTF8"); //Chuyển dữ liệu thành chuỗi byte
            truyen.setData(utf); //Gán dữ liệu cho DatagramPacket
            truyen.setLength(utf.length); //Truyền số lượng byte cho buffer
            socket.send(truyen); //Bắt đầu truyền dữ liệu
            jTextAreaContent.setText("");
        } catch (IOException e) {//các xử lý dọn dẹp bộ nhớ khi có lỗi
            if (myThread != null) {
                jTextAreaChat.append(e + "\n");
                jTextAreaContent.setVisible(false);
                this.validate();
                if (myThread != Thread.currentThread()) {
                    myThread.interrupt();
                }
                myThread = null;
                try {
                    socket.leaveGroup(group);
                } catch (IOException ignored) {
                    socket.close();
                }
            }
        }
    }//GEN-LAST:event_jButtonSendActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if (myThread != null) {
            myThread.interrupt();
            myThread = null;
            try {
                socket.leaveGroup(group);
            } catch (IOException e) {
            }
            socket.close();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(formChat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formChat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formChat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formChat.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextArea jTextAreaContent;
    private javax.swing.JTextField jTextFieldGroup;
    private javax.swing.JTextField jTextFieldNick;
    private javax.swing.JTextField jTextFieldPort;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) { //Kiểm tra xem thread có bị ngắt kết nối chưa                
                nhan.setLength(nhan.getData().length); //thiết lập số byte cho các buffer
                socket.receive(nhan); //nhận dữ liệu
                String message = new String(nhan.getData(), 0, nhan.getLength(), "UTF8");
                jTextAreaChat.append(message + "\n"); //Hiển thị dữ liệu nhận được lên màn hình
            }
        } catch (IOException e) { //các thao tác thu gọn bộ nhớ khi có lỗi xảy ra
            if (myThread != null) {
                jTextAreaChat.append(e + "\n");
                jTextAreaContent.setVisible(false);
                this.validate();
                if (myThread != Thread.currentThread()) {
                    myThread.interrupt();
                }
                myThread = null;
                try {
                    socket.leaveGroup(group);
                } catch (IOException ignored) {
                    socket.close();
                }
            }
        }
    }
}
