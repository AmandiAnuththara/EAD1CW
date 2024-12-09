package view;
import controller.CSelectTrain;
import ead1cw.MainWindow;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
public class VSelectTrain extends javax.swing.JFrame 
{
    String Departure_Date = "";
    public VSelectTrain() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmd_from = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmd_to = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        date_date = new org.jdesktop.swingx.JXDatePicker();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_book = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmd_from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo Fort", "Kandy", "Badulla", "Jaffna", "Matara", "Trincomalee", "Batticaloa", " " }));
        getContentPane().add(cmd_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 102, 99, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Select the Train");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 6, 219, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("From");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 51, 72, 14));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("To");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 51, 72, 14));

        cmd_to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo Fort", "Kandy", "Badulla", "Jaffna", "Matara", "Trincomalee", "Batticaloa", " " }));
        getContentPane().add(cmd_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 102, 99, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Departure Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 51, 139, 14));
        getContentPane().add(date_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 101, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null,  new Boolean(false)},
                {null, null, null, null, null,  new Boolean(false)},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Departure Time", "Arrival Time", "Train Number", "Duration", "Price", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(102, 102, 102));
        table.setRowHeight(60);
        table.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(table);

        btn_book.setBackground(new java.awt.Color(102, 102, 255));
        btn_book.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_book.setForeground(new java.awt.Color(255, 255, 255));
        btn_book.setText("Book");
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(102, 102, 255));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btn_book, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_back))
            .addComponent(jScrollPane1)
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_book, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, -1, -1));

        btn_search.setBackground(new java.awt.Color(102, 102, 255));
        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 102, 167, 24));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 95, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\Untitled design.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 730, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String From = cmd_from.getSelectedItem().toString();
        String To = cmd_to.getSelectedItem().toString();
                
        // Format departure date to 'yyyy-MM-dd'
        Date selectedDate = date_date.getDate();
        if (selectedDate == null) 
        {
            throw new IllegalArgumentException("Please select a valid departure date.");
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String departureDate = dateFormat.format(selectedDate);
        
        Departure_Date = departureDate;
        
        try 
        {
            CSelectTrain controller = new CSelectTrain();
            List<Object[]> trainDetails = controller.getTrainDetails(From,To,departureDate);
        
            // Define column names for the table
            String[] columnNames = {"Train Number", "Travel Time", "Departure Date", "Departure Time", "Arrival Time", "Travel Cost","Select"};

            // Create a table model with the train details
            javax.swing.table.DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(columnNames, 0);

            // Add rows to the table model
            for (Object[] row : trainDetails) 
            {
                tableModel.addRow(row);
            }

            // Set the updated table model
            table.setModel(tableModel);

            // Show a message if no trains were found
            if (trainDetails.isEmpty()) 
            {
                javax.swing.JOptionPane.showMessageDialog(this, "No trains found for the selected criteria.", "Info", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch (IllegalArgumentException ex) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } 
        catch (Exception ex) 
        {
            javax.swing.JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        // Check if a row is selected in the table
    int selectedRow = table.getSelectedRow();
    
    if (selectedRow == -1) {
        // Show an error message if no train is selected
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a train to proceed.", "No Selection", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Get the Train_No from the selected row (assuming it's in column 0)
        int trainNo = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

        // Fetch the schedule_id using the controller
        CSelectTrain controller = new CSelectTrain();
        int scheduleId = controller.getScheduleId(trainNo);

        if (scheduleId == -1) {
            // If no schedule_id is found, display an error
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to retrieve schedule details for the selected train.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Proceed to VBookingSeats and pass the schedule_id
        dispose(); // Close the current window
        VBookingSeats booking = new VBookingSeats(scheduleId,Departure_Date); // Pass schedule_id to the booking screen
        booking.setVisible(true); // Show the booking screen
    } catch (NumberFormatException ex) {
        // Handle any parsing errors
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid train number selected.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        // Handle any unexpected errors
        javax.swing.JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btn_bookActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        MainWindow report = new MainWindow();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VSelectTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VSelectTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VSelectTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VSelectTrain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VSelectTrain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_book;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cmd_from;
    private javax.swing.JComboBox<String> cmd_to;
    private org.jdesktop.swingx.JXDatePicker date_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
