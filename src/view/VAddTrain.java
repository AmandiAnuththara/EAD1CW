package view;
import controller.*;
import ead1cw.MainWindow;
import java.text.SimpleDateFormat;
import java.util.*;
public class VAddTrain extends javax.swing.JFrame 
{
    public VAddTrain() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_seats = new javax.swing.JTextField();
        txt_train_no = new javax.swing.JTextField();
        txt_dtime = new javax.swing.JTextField();
        txt_atime = new javax.swing.JTextField();
        txt_dstation = new javax.swing.JTextField();
        txt_astation = new javax.swing.JTextField();
        txt_cost = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        date_ddate = new org.jdesktop.swingx.JXDatePicker();
        txt_ttime = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Train Schedule");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 16, 186, 29));

        jLabel2.setText("Train no");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 51, -1, -1));

        jLabel3.setText("No of seats in the train");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 51, -1, -1));

        jLabel4.setText("Departure date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 103, -1, -1));

        jLabel5.setText("Departure station");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 103, -1, -1));

        jLabel6.setText("Departure time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 103, -1, -1));

        jLabel7.setText("Arrival time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 158, -1, -1));

        jLabel8.setText("Arrival station");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 158, -1, -1));

        jLabel9.setText("Travel time");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 208, -1, -1));

        jLabel10.setText("Travel cost");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 208, -1, -1));

        txt_seats.setName("noofseatsinthetrain"); // NOI18N
        getContentPane().add(txt_seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 69, 143, -1));

        txt_train_no.setName("trainno"); // NOI18N
        txt_train_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_train_noActionPerformed(evt);
            }
        });
        getContentPane().add(txt_train_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 69, 143, -1));

        txt_dtime.setName("depaturetime"); // NOI18N
        getContentPane().add(txt_dtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 126, 143, -1));

        txt_atime.setName("arrivaltime"); // NOI18N
        getContentPane().add(txt_atime, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 180, 143, -1));

        txt_dstation.setName("departurestation"); // NOI18N
        getContentPane().add(txt_dstation, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 126, 143, -1));

        txt_astation.setName("arrivalstation"); // NOI18N
        getContentPane().add(txt_astation, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 180, 143, -1));

        txt_cost.setName("travelcost"); // NOI18N
        getContentPane().add(txt_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 230, 143, -1));

        btn_add.setBackground(new java.awt.Color(102, 102, 255));
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.setName("add"); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 266, 494, -1));
        getContentPane().add(date_ddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 125, 143, -1));
        getContentPane().add(txt_ttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 230, 143, -1));

        btn_back.setBackground(new java.awt.Color(102, 102, 255));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 266, -1, 24));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\Untitled design.png")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 670, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_train_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_train_noActionPerformed
    }//GEN-LAST:event_txt_train_noActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try 
        {
            // Retrieve and validate inputs
            int trainNo = Integer.parseInt(txt_train_no.getText().trim());
            int noOfSeatsInTrain = Integer.parseInt(txt_seats.getText().trim());
            
            // Format departure date to 'yyyy-MM-dd'
            Date selectedDate = date_ddate.getDate();
            if (selectedDate == null) 
            {
                throw new IllegalArgumentException("Please select a valid departure date.");
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String departureDate = dateFormat.format(selectedDate);
        
            String departureTime = txt_dtime.getText().trim();
            String departureStation = txt_dstation.getText().trim();
            String arrivalTime = txt_atime.getText().trim();
            String arrivalStation = txt_astation.getText().trim();
            String travelTime = txt_ttime.getText().trim();
            double travelCost = Double.parseDouble(txt_cost.getText().trim());

            // Validate the date and essential fields
            if (departureDate == null) 
            {
                throw new IllegalArgumentException("Please select a valid departure date.");
            }
            if (departureTime.isEmpty() || departureStation.isEmpty() || arrivalStation.isEmpty()) 
            {
                throw new IllegalArgumentException("Departure time, departure station, and arrival station cannot be empty.");
            }
        
            // Call the controller to add train schedule
            CAddTrain addTrainController = new CAddTrain();
            addTrainController.addTrainSchedule(trainNo, noOfSeatsInTrain, departureDate,departureTime, departureStation, arrivalTime, arrivalStation, travelTime, travelCost);

            // Show success message
            javax.swing.JOptionPane.showMessageDialog(this, "Train schedule added successfully!","Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (NumberFormatException ex) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter valid numeric values for train number, seats, and cost.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } 
        catch (IllegalArgumentException ex) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } 
        catch (Exception ex) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        MainWindow report = new MainWindow();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VAddTrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private org.jdesktop.swingx.JXDatePicker date_ddate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_astation;
    private javax.swing.JTextField txt_atime;
    private javax.swing.JTextField txt_cost;
    private javax.swing.JTextField txt_dstation;
    private javax.swing.JTextField txt_dtime;
    private javax.swing.JTextField txt_seats;
    private javax.swing.JTextField txt_train_no;
    private javax.swing.JTextField txt_ttime;
    // End of variables declaration//GEN-END:variables
}
