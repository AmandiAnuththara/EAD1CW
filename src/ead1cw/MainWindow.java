package ead1cw;
import model.DBConnection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import view.VAddTrain;
import view.VSelectTrain;

public class MainWindow extends javax.swing.JFrame 
{    public MainWindow() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_viewreport = new javax.swing.JButton();
        btn_addTrain = new javax.swing.JButton();
        btn_SelectBooking = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_viewreport.setBackground(new java.awt.Color(102, 102, 255));
        btn_viewreport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_viewreport.setForeground(new java.awt.Color(255, 255, 255));
        btn_viewreport.setText("View Report");
        btn_viewreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewreportActionPerformed(evt);
            }
        });
        getContentPane().add(btn_viewreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 137, 166, -1));

        btn_addTrain.setBackground(new java.awt.Color(102, 102, 255));
        btn_addTrain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_addTrain.setForeground(new java.awt.Color(255, 255, 255));
        btn_addTrain.setText("Add Train");
        btn_addTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTrainActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 55, 166, -1));

        btn_SelectBooking.setBackground(new java.awt.Color(102, 102, 255));
        btn_SelectBooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_SelectBooking.setForeground(new java.awt.Color(255, 255, 255));
        btn_SelectBooking.setText("Select & Booking Trains");
        btn_SelectBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SelectBookingActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SelectBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 96, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\Untitled design (1).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 370, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewreportActionPerformed
      try 
      {
        String RP = "C:\\Users\\hp\\Desktop\\EAD1CW\\src\\view\\Report.jrxml";
        JasperReport jr = JasperCompileManager.compileReport(RP);
        JasperPrint jp = JasperFillManager.fillReport(jr, null, DBConnection.createDBConnection());
        JasperViewer.viewReport(jp);

      } 
      catch (Exception e) 
      {
        e.printStackTrace();
      }
    }//GEN-LAST:event_btn_viewreportActionPerformed

    private void btn_addTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTrainActionPerformed
      // Create an instance of the VAddTrain interface
        VAddTrain addTrainInterface = new VAddTrain();

    // Set the VAddTrain window visible
    addTrainInterface.setVisible(true);

    // Optionally, hide or dispose of the current VViewReport interface if needed
    this.dispose(); // Use this only if you want to close the current window
    }//GEN-LAST:event_btn_addTrainActionPerformed

    private void btn_SelectBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SelectBookingActionPerformed
        // Create an instance of the VSelectTrain interface
    VSelectTrain selectTrainInterface = new VSelectTrain();

    // Set the VSelectTrain window visible
    selectTrainInterface.setVisible(true);

    // Optionally, hide or dispose of the current VViewReport interface if needed
    this.dispose(); // Use this only if you want to close the current window
    }//GEN-LAST:event_btn_SelectBookingActionPerformed
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SelectBooking;
    private javax.swing.JButton btn_addTrain;
    private javax.swing.JButton btn_viewreport;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
