/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System_Forms;

import dbms.DBConnect;
import dbms.InventoryDB;
import java.awt.Image;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

/**
 *
 * @author Rich
 */
public class Equipment_Search_Form extends javax.swing.JFrame {

    /**
     * Creates new form Equipment_Search_Form
     */
    
    //Global Variables
    String[] order = {};
    
    //Items variable to be tagged onto the User upon Checkout
    String[] Items = {};
    
    public Equipment_Search_Form() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        // display image
        displayImage();
        DBConnect db = new DBConnect();
        String sql = ("SELECT * FROM Inventory");
        try{
        ResultSet rs = db.SqlSelectAll(sql);
        DefaultTableModel model = (DefaultTableModel)EquipTable.getModel();
      
        while (rs.next())
        {
        model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
        }
        rs.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error. Database error: "+ ex.getMessage(), "Database Error.", JOptionPane.ERROR_MESSAGE);
        }
       }
    
    // function to display image in jlabel
    public void displayImage()
    {
        // get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/System_Images/machine_dashboard_logo.png"));
        
        // make image fit jLabel
        Image image = imgIco.getImage().getScaledInstance(jLabel_Dashboard_Logo.getWidth(), jLabel_Dashboard_Logo.getHeight(), Image.SCALE_SMOOTH);
        
        // set the image into the jLabel
        jLabel_Dashboard_Logo.setIcon(new ImageIcon(image));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_Dashboard_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEquipID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEquipTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumAvailable = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotalStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtVendorID = new javax.swing.JTextField();
        btnInventorySearch = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EquipTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuRefresh = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Equipment Database");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Equipment ID");

        txtEquipID.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Equipment Title");

        txtEquipTitle.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Number Available");

        txtNumAvailable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Total in Stock");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("Vendor ID");

        btnInventorySearch.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnInventorySearch.setText("Search");
        btnInventorySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventorySearchActionPerformed(evt);
            }
        });

        btnAddToCart.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnAdd.setText("Add to Database");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEquipID)
                            .addComponent(txtEquipTitle)
                            .addComponent(txtNumAvailable)
                            .addComponent(txtTotalStock)
                            .addComponent(txtVendorID)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInventorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEquipID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEquipTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtVendorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnInventorySearch))
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        EquipTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipment ID", "Equipment Title", "Number Available", "Total in Stock", "Vendor ID"
            }
        ));
        jScrollPane1.setViewportView(EquipTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        mnuRefresh.setText("Page Refresh");
        mnuRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRefreshActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRefresh);

        jMenuItem1.setText("Dashboard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventorySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventorySearchActionPerformed
        // TODO add your handling code here: 
        
        //Grab the Equipment ID that will be used for searching the database
        String EquipmentID = txtEquipID.getText();
        
        // if txtEquipID line is blank, wipe out all other filled sections and prompt the user to fill in the Equip ID.
        
        if ("".equals(EquipmentID)) 
        {
            JOptionPane.showMessageDialog(this, "Error. Please enter the Equipment ID.",
"Error", JOptionPane.ERROR_MESSAGE);
            txtEquipID.setText("");
            txtEquipTitle.setText("");
            txtNumAvailable.setText("");
            txtTotalStock.setText("");
            txtVendorID.setText("");
            txtEquipID.requestFocus();
        }
        //Display the information in the chart, based on the Equip ID that was given
        //Connect to the DB
        DBConnect db = new DBConnect();
        //Use the search function implemented in the InventoryDB file
        try{
        ResultSet rs = InventoryDB.search(EquipmentID, db);
        DefaultTableModel model = (DefaultTableModel)EquipTable.getModel();
        model.setRowCount(0); //This is essential to clear the table prior to searching
        while(rs.next())
        {
        model.addRow(new String[]{rs.getString("equip_id"), rs.getString("title"), rs.getString("available"), rs.getString("total"), rs.getString("vendor_id")});
        }
        rs.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error. Database error: "+ ex.getMessage(), "Database Error.", JOptionPane.ERROR_MESSAGE);
        }
        db.Dispose(); //Closing the connection to the Database
        
    }//GEN-LAST:event_btnInventorySearchActionPerformed

    //Adds the searched item to a cart (list) to be pushed to the Checkout
    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        String equipID = txtEquipID.getText();
        Arrays.toString(order);
        ArrayList<String>ArrListObj  = new ArrayList<String>(Arrays.asList(order));
        //if the equipID has been input and is not empty
        if(!equipID.equals(""))
        {
            //Open the Database and run the search for that EquipID and it's respective information
            DBConnect db = new DBConnect();
        try{
        ResultSet rs = InventoryDB.search(equipID, db);
        DefaultTableModel model = (DefaultTableModel)EquipTable.getModel();
        model.setRowCount(0); //This is essential to clear the table prior to searching
        while(rs.next())
        {
        model.addRow(new String[]{rs.getString("equip_id"), rs.getString("title"), rs.getString("available"), rs.getString("total"), rs.getString("vendor_id")});
        }
        rs.close();
        
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error. Database error: "+ ex.getMessage(), "Database Error.", JOptionPane.ERROR_MESSAGE);
        }
        db.Dispose(); //Closing the connection to the Database
        }
    }//GEN-LAST:event_btnAddToCartActionPerformed

    //Delete the searched entry from the database **EQUIPMANAGER ONLY**
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        String equipID = txtEquipID.getText();
        DBConnect db = new DBConnect();
        if(equipID.equals(""))
        {
        JOptionPane.showMessageDialog(this, "Error. Please enter the Equipment ID associated with the Inventory Item you wish to delete.",
"Error", JOptionPane.ERROR_MESSAGE);
        }
        //If EquipID information is present, continue with the search..
        try{
            ResultSet rs = InventoryDB.search(equipID, db);
            DefaultTableModel model = (DefaultTableModel)EquipTable.getModel();
            model.setRowCount(0); //This is essential to clear the table prior to searching
            while(rs.next())
                {
                   model.addRow(new String[]{rs.getString("equip_id"), rs.getString("title"), rs.getString("available"), rs.getString("total"), rs.getString("vendor_id")});
                }
            
           if(JOptionPane.showConfirmDialog(frame, "Confirm if you wish to delete the shown data entry.", "Equipment Search",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
           {
               db.SqlDelete("Inventory", "equip_id = " + equipID);
           }
            rs.close();
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error. Database error: "+ ex.getMessage(), "Database Error.", JOptionPane.ERROR_MESSAGE);
        }
        //Closing the connection to the Database
        
        
        //After complete, refresh the menu with the updated database
        
        txtEquipID.setText("");
        txtEquipTitle.setText("");
        txtNumAvailable.setText("");
        txtTotalStock.setText("");
        txtVendorID.setText("");
        
        String sql = ("SELECT * FROM Inventory");
        try{
        ResultSet rs = db.SqlSelectAll(sql);
        DefaultTableModel model = (DefaultTableModel)EquipTable.getModel();
        model.setRowCount(0); //This is essential to clear the table prior to searching
        while (rs.next())
        {
        model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
        }
        rs.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error. Database error: "+ ex.getMessage(), "Database Error.", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    //The Equipment ID isn't needed here because the InventoryDB.add function allocates a new EquipID to the equipment.
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        //Grab the neccessary input to add into the Inventory Database
        String equipTitle = txtEquipTitle.getText();
        String numAvailable = txtNumAvailable.getText();
        String totalStock = txtTotalStock.getText();
        String vendorID = txtVendorID.getText();
        
        //Run the Add function in InventoryDB
        if (dataValidations() == 1)
        {
            JOptionPane.showMessageDialog(this, "Validation success. Adding entries into the Database now. Page will refresh automatically.");
            InventoryDB.add(equipTitle, numAvailable, totalStock, vendorID);
        }
        
        //Page Refresh
        txtEquipID.setText("");
        txtEquipTitle.setText("");
        txtNumAvailable.setText("");
        txtTotalStock.setText("");
        txtVendorID.setText("");
        
        DBConnect db = new DBConnect();
        String sql = ("SELECT * FROM Inventory");
        try{
        ResultSet rs = db.SqlSelectAll(sql);
        DefaultTableModel model = (DefaultTableModel)EquipTable.getModel();
        model.setRowCount(0); //This is essential to clear the table prior to searching
        while (rs.next())
        {
        model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
        }
        rs.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error. Database error: "+ ex.getMessage(), "Database Error.", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

private JFrame frame;

    //Order button to confirm the Cart list to the Account user
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        Arrays.toString(Items);
        ArrayList<String>ArrListItems  = new ArrayList<String>(Arrays.asList(Items));
        //Grab the List of Equipment ID ArrayList 
        //Validation that there is something in the ArrayList
        if(order.length == 0)
        {
        JOptionPane.showMessageDialog(this, "Error. You have no items located in your cart.",
"Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //use the ArrayList to locate each Equipment associated with that ID
        String rs = "";
        DBConnect db = new DBConnect();
        for(String ID : order)
        {
             rs = db.SqlSelectSingle("SELECT title FROM Inventory WHERE equip_id = " + ID);
             ArrListItems.add(rs);
             Items = ArrListItems.toArray(Items);
        }       
        JOptionPane.showMessageDialog(this, Items);
        
    }//GEN-LAST:event_btnOrderActionPerformed

    //Empty the input fields and Refresh the table
    private void mnuRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRefreshActionPerformed
        txtEquipID.setText("");
        txtEquipTitle.setText("");
        txtNumAvailable.setText("");
        txtTotalStock.setText("");
        txtVendorID.setText("");
        
        DBConnect db = new DBConnect();
        String sql = ("SELECT * FROM Inventory");
        try{
        ResultSet rs = db.SqlSelectAll(sql);
        DefaultTableModel model = (DefaultTableModel)EquipTable.getModel();
        model.setRowCount(0); //This is essential to clear the table prior to searching
        while (rs.next())
        {
        model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
        }
        rs.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error. Database error: "+ ex.getMessage(), "Database Error.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mnuRefreshActionPerformed

    //Exit the program
    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        // TODO add your handling code here:
        
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Equipment Search",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuExitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        User_Dashboard_Form ud = new User_Dashboard_Form();
        ud.show();
        
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Equipment_Search_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipment_Search_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipment_Search_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipment_Search_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipment_Search_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EquipTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInventorySearch;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Dashboard_Logo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuRefresh;
    private javax.swing.JTextField txtEquipID;
    private javax.swing.JTextField txtEquipTitle;
    private javax.swing.JTextField txtNumAvailable;
    private javax.swing.JTextField txtTotalStock;
    private javax.swing.JTextField txtVendorID;
    // End of variables declaration//GEN-END:variables

//Data validation for the add function
public int dataValidations() {
String equipTitle = txtEquipTitle.getText();
String numAvailable = txtNumAvailable.getText();
String totalStock = txtTotalStock.getText();
String vendorID = txtVendorID.getText();

if (equipTitle.equals("") || equipTitle.length() > 20) {
JOptionPane.showMessageDialog(this, "Error. Equipment Title field input needs to be not empty and less than 20 total characters including spaces.",
"Error", JOptionPane.ERROR_MESSAGE);
txtEquipTitle.setText("");
txtEquipTitle.requestFocus();
return 0;
}

//Ensure all these inputs are numbers
try {
Integer.parseInt(numAvailable);
Integer.parseInt(totalStock);
Integer.parseInt(vendorID);

} catch (NumberFormatException e) {
JOptionPane.showMessageDialog(this, "Incorrect Input. Ensure that Number Available, Total Stock, and Vendor ID are all numbers.",
"Input Error", JOptionPane.ERROR_MESSAGE);
txtNumAvailable.setText("");
txtTotalStock.setText("");
txtVendorID.setText("");
return 0;
}
//Ensure Number Available is not higher than Total Stock
if (Integer.parseInt(numAvailable) > Integer.parseInt(totalStock)) {
JOptionPane.showMessageDialog(this, "Available must not exceed Total Stock entered",
"Input Error", JOptionPane.ERROR_MESSAGE);
txtNumAvailable.setText("");
txtTotalStock.setText("");
txtNumAvailable.requestFocusInWindow();
return 0;
}
//Ensure VendorID is not 0
if (Integer.parseInt(vendorID) < 0) {
JOptionPane.showMessageDialog(this, "Vendor ID must be more than 0",
"Vendor ID Error", JOptionPane.ERROR_MESSAGE);
txtVendorID.setText("");
txtVendorID.requestFocusInWindow();
return 0;
}
return 1;
}
}