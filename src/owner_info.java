
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek Jha
 */
public class owner_info extends javax.swing.JFrame {
 
   
    /**
     * Creates new form owner_info
     */
    public owner_info() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtownid4 = new javax.swing.JTextField();
        txtownid5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtOid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setText("OWNER ID");

        jLabel7.setText("OWNER ID");

        txtownid4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtownid4ActionPerformed(evt);
            }
        });

        txtownid5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtownid5ActionPerformed(evt);
            }
        });

        setMinimumSize(new java.awt.Dimension(1980, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("OWNER INFORMATION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(640, 90, 627, 82);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OWNER ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 210, 171, 44);

        txtOid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtOid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOidActionPerformed(evt);
            }
        });
        getContentPane().add(txtOid);
        txtOid.setBounds(810, 200, 754, 53);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 290, 94, 44);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(810, 280, 754, 58);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATE OF BIRTH");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 370, 254, 44);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FATHER'S NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 460, 261, 44);

        txtFatherName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFatherName);
        txtFatherName.setBounds(810, 460, 754, 53);

        txtDOB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        getContentPane().add(txtDOB);
        txtDOB.setBounds(810, 370, 754, 56);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADDRESS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 650, 152, 44);

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhone);
        txtPhone.setBounds(810, 550, 754, 54);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PHONE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 550, 113, 44);

        taAddress.setColumns(20);
        taAddress.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        taAddress.setRows(5);
        jScrollPane1.setViewportView(taAddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(810, 640, 754, 142);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 810, 266, 61);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ankit Akash\\Desktop\\dbms project\\nissan-gtr-front-and-owner-1.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 40, 1600, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOidActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFatherNameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtownid4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtownid4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtownid4ActionPerformed

    private void txtownid5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtownid5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtownid5ActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con=null;
         PreparedStatement stm=null;
         
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","14011996");
            stm=con.prepareStatement("insert into owner values(?,?,?,?,?,?)");
            stm.setString(1,txtName.getText());
            stm.setString(2,txtDOB.getText());
            stm.setString(3,txtOid.getText());
            stm.setString(4,txtFatherName.getText());
            stm.setString(5,taAddress.getText());
            stm.setString(6,txtPhone.getText());
           
          //  stm.setString(7,txtVid.getText());
            int i=stm.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(null,"Registration Successfull");
               
            }
            else
                JOptionPane.showMessageDialog(null,"Invalid Input");
                
           
            

            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,"Vehicle ID doesn't exist");
            Logger.getLogger(new_owner_info.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       // new owner_info().setSize(1650,1080);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new owner_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOid;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtownid4;
    private javax.swing.JTextField txtownid5;
    // End of variables declaration//GEN-END:variables
}
