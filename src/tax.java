
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek Jha
 */
public class tax extends javax.swing.JFrame {

    /**
     * Creates new form tax
     */
    public tax() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVid = new javax.swing.JTextField();
        txtDueDate = new javax.swing.JTextField();
        txtTaxAmt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1980, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("TAX DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(775, 182, 317, 58);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("ENTER REGISTRATION ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 314, 460, 44);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("DUE DATE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 400, 166, 44);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("TAX AMOUNT (in Rupees)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 490, 413, 44);

        txtVid.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(txtVid);
        txtVid.setBounds(1156, 296, 490, 50);

        txtDueDate.setEditable(false);
        txtDueDate.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtDueDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDueDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDueDate);
        txtDueDate.setBounds(1160, 380, 490, 50);

        txtTaxAmt.setEditable(false);
        txtTaxAmt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(txtTaxAmt);
        txtTaxAmt.setBounds(1160, 480, 490, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1020, 610, 194, 83);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(670, 610, 202, 83);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ankit Akash\\Desktop\\dbms project\\02.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 110, 1360, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDueDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDueDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueDateActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        txtVid.setText("");
        txtDueDate.setText("");
        txtTaxAmt.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Connection con=null;
         String rid=txtVid.getText();
         String vid="";
         String price="";
         String date="";
         int flag=0;
         PreparedStatement stm=null;
        try {             
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","14011996");
            stm=con.prepareStatement("select * from registration where reg_id=?");
            stm.setString(1,rid);
            ResultSet rs=stm.executeQuery();
            while(rs.next())
            {   date=rs.getString("reg_date");
                vid=rs.getString("veh_no");
            }
            System.out.println(date);
            
            int dat=Integer.parseInt(date.substring(6));
            dat=dat+1;
            System.out.println(dat);
            String newdat=date.substring(0, 6) + Integer.toString(dat);
            System.out.println(newdat);
            txtDueDate.setText(newdat);
            PreparedStatement stm1=con.prepareStatement("select * from VEHICLE where V_id=?");
            stm1.setString(1,vid);
            
            ResultSet rs1=stm1.executeQuery();
             while(rs1.next())
            {   flag=1;
                price=rs1.getString("price");
            }
            // System.out.println(flag);
             int i=Integer.parseInt(price);
            // System.out.println(i);
             i=(int) (0.01*i);
             System.out.println(i);
             txtTaxAmt.setText(Integer.toString(i));
            
        } catch (SQLException ex) {
            Logger.getLogger(tax.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tax().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtTaxAmt;
    private javax.swing.JTextField txtVid;
    // End of variables declaration//GEN-END:variables
}
