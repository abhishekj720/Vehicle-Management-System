/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek Jha
 */
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class vehicle_registration extends javax.swing.JFrame {
String id;

public vehicle_registration(String v_id) 
{
    id=v_id;
     initComponents();
     txtVid.setEditable(false);
     insert();
}

private void insert()
{
    txtVid.setText(id);
     Connection con=null;
        PreparedStatement stm=null;
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","14011996");
            //Class.forName("com.mysql.jdbc.Driver"); 
            stm=con.prepareStatement("insert into vehicle values(?,?,?,?,?,?,?,?)");
           //stm.setString(1,txtOid.getText());
            stm.setString(1,id);
            stm.setString(2,txtModel.getText());
            stm.setString(3,txtColour.getText());
            stm.setString(4,txtManYear.getText());
            stm.setString(5,txtFuelType.getText());
            stm.setString(6,txtCompany.getText());
            stm.setString(7,txtPrice.getText());
            stm.setString(8,txtType.getText());
           int i= stm.executeUpdate();
        if(i>0)
        {
            JOptionPane.showMessageDialog(null,"Registration Successfull");
        }
        else
            JOptionPane.showMessageDialog(null,"Invalid Input");
        
        
        } catch (SQLException ex) {
            Logger.getLogger(vehicle_registration.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    /**
     * Creates new form vehicle_registration
     */
    public vehicle_registration() {
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

        jLabel3 = new javax.swing.JLabel();
        txtFuelType = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtManYear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        txtVid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtColour = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MODEL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 290, 115, 44);

        txtFuelType.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtFuelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuelTypeActionPerformed(evt);
            }
        });
        getContentPane().add(txtFuelType);
        txtFuelType.setBounds(1010, 630, 430, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COLOUR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 380, 136, 44);

        txtManYear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtManYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManYearActionPerformed(evt);
            }
        });
        getContentPane().add(txtManYear);
        txtManYear.setBounds(1010, 550, 430, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TYPE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 470, 82, 44);

        txtCompany.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyActionPerformed(evt);
            }
        });
        getContentPane().add(txtCompany);
        txtCompany.setBounds(1010, 710, 430, 60);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MANUFACTURE YEAR");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 550, 344, 44);

        txtModel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });
        getContentPane().add(txtModel);
        txtModel.setBounds(1010, 280, 430, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FUEL TYPE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 630, 174, 44);

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice);
        txtPrice.setBounds(1010, 790, 430, 60);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COMPANY");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 710, 162, 44);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setText("VEHICLE REGISTRATION");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(630, 70, 602, 58);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRICE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 790, 97, 44);

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(610, 890, 210, 70);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSubmit.setText("NEXT>");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(990, 890, 220, 70);

        txtVid.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtVid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVidActionPerformed(evt);
            }
        });
        getContentPane().add(txtVid);
        txtVid.setBounds(1010, 190, 430, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VEHICLE ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 200, 186, 44);

        txtColour.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColourActionPerformed(evt);
            }
        });
        getContentPane().add(txtColour);
        txtColour.setBounds(1010, 370, 430, 60);

        txtType.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        getContentPane().add(txtType);
        txtType.setBounds(1010, 460, 420, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/check-company-registration-india2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, -20, 1780, 1050);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   // import javax.swing.JOptionPane;
    
    private void txtFuelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuelTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuelTypeActionPerformed

    private void txtManYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManYearActionPerformed

    private void txtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtVidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVidActionPerformed

    private void txtColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColourActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Connection con=null;
        PreparedStatement stm=null,stm2=null;
        String s;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","14011996");
            //Class.forName("com.mysql.jdbc.Driver"); 
            stm=con.prepareStatement("insert into vehicle values(?,?,?,?,?,?,?,?)");
           // stm.setString(1,txtOid.getText());
            stm.setString(1,txtVid.getText());
            s=txtVid.getText();
            stm.setString(2,txtModel.getText());
            stm.setString(3,txtColour.getText());
            stm.setString(4,txtManYear.getText());
            stm.setString(5,txtFuelType.getText());
            stm.setString(6,txtCompany.getText());
            stm.setString(7,txtPrice.getText());
            stm.setString(8,txtType.getText());
            int i=stm.executeUpdate();
            
          /*  
            float p=Integer.parseInt(txtPrice.getText());
            stm2=con.prepareStatement("insert into tax values(?,?,?)");
            stm2.setString(3,txtVid.getText());
            stm2.setString(2,txt);
            stm2.setString(2,p*0.001+"");
            stm2.setString(1,"46746");
          
          
          stm2.executeUpdate();
          new veh_reg(s).setVisible(true);
         */  
      
        if(i>0)
        {
            
            JOptionPane.showMessageDialog(null,"Registration Successfull");
            new veh_reg(s).setVisible(true);
            this.dispose();
               //stm2.executeUpdate();
        }
        else
            JOptionPane.showMessageDialog(null,"Invalid Input");
        
        
        } catch (SQLException ex) {
            Logger.getLogger(vehicle_registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
        
        //JOptionPane.showMessageDialog(null, "User details is succesfully added", "SUCCESS", JOptionPane.DEFAULT_OPTION);         
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtVid.setText("");
        //txtOid.setText("");
        txtModel.setText("");
        txtColour.setText("");
        txtManYear.setText("");
        txtFuelType.setText("");
        txtCompany.setText("");
        txtPrice.setText("");
        txtType.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

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
            java.util.logging.Logger.getLogger(vehicle_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicle_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicle_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicle_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicle_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtColour;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtFuelType;
    private javax.swing.JTextField txtManYear;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtVid;
    // End of variables declaration//GEN-END:variables
}
