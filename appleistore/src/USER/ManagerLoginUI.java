/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package USER;
import Business.Login;
import DATA.DBManagerlogin;
import javax.swing.JOptionPane;
public class ManagerLoginUI extends javax.swing.JFrame {

    DBManagerlogin u1=new DBManagerlogin();
    public ManagerLoginUI() {
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

        jLabelManager = new javax.swing.JLabel();
        jLabel2managerUserName = new javax.swing.JLabel();
        ManagerUsername = new javax.swing.JTextField();
        jLabel3ManagerPassword = new javax.swing.JLabel();
        ManagerPassword = new javax.swing.JTextField();
        BTNManagerLOG = new javax.swing.JButton();
        BTNBACKMANAGER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelManager.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelManager.setText("MANAGER LOGIN");

        jLabel2managerUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2managerUserName.setText("User Name");

        jLabel3ManagerPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3ManagerPassword.setText("Password");

        BTNManagerLOG.setText("LOGIN");
        BTNManagerLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNManagerLOGActionPerformed(evt);
            }
        });

        BTNBACKMANAGER.setText("BACK");
        BTNBACKMANAGER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBACKMANAGERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2managerUserName)
                            .addComponent(jLabel3ManagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(BTNBACKMANAGER)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ManagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ManagerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNManagerLOG, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelManager)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelManager, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2managerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManagerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3ManagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNManagerLOG)
                    .addComponent(BTNBACKMANAGER))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNManagerLOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNManagerLOGActionPerformed

    String Username = ManagerUsername.getText();
    String Password = ManagerPassword.getText();

        if(Username.equals("Manager")&& Password.equals("1234")){
            ManagerMainMenuUI MMM1 = new ManagerMainMenuUI();
            MMM1.show();
            dispose();

        } else{
          JOptionPane.showMessageDialog(this, "Error Username or Password");}
    }//GEN-LAST:event_BTNManagerLOGActionPerformed

    private void BTNBACKMANAGERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBACKMANAGERActionPerformed
        CashierandManagerlog CNM2= new CashierandManagerlog();
        CNM2.show(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_BTNBACKMANAGERActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerLoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerLoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerLoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerLoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerLoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBACKMANAGER;
    private javax.swing.JButton BTNManagerLOG;
    private javax.swing.JTextField ManagerPassword;
    private javax.swing.JTextField ManagerUsername;
    private javax.swing.JLabel jLabel2managerUserName;
    private javax.swing.JLabel jLabel3ManagerPassword;
    private javax.swing.JLabel jLabelManager;
    // End of variables declaration//GEN-END:variables
}