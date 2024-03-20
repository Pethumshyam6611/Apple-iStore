package USER;
import Business.Products;
import DATA.DBProduct;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;  // Import the File class
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class ManagerMenuUI extends javax.swing.JFrame {

    DBProduct pDB = new DBProduct();
    public ManagerMenuUI() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtDetails = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        View = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ReturnMenuM = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BTNDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Manager Menu");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Product ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Product Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Details");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Price");

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        txtDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetailsActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Stock");

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        View.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        View.setText("View All");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        ADD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search.setText("Filter");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Details", "Price", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ReturnMenuM.setText("Back");
        ReturnMenuM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnMenuMActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Search Bar");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Products Details");

        BTNDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNDelete.setText("Delete");
        BTNDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ReturnMenuM)
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtProductID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice)
                                    .addComponent(txtStock)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(223, 223, 223))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BTNDelete)
                                    .addGap(14, 14, 14)
                                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReturnMenuM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(View, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {                                               

    }       
    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed
   
    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
                                                
        int ProductID = Integer.parseInt(txtProductID.getText());
        String Name = txtProductName.getText();
        String Price = txtPrice.getText();
        String Details=txtDetails.getText();
        int Stock=Integer.parseInt(txtStock.getText());

        Products p1 = new Products(ProductID,Name,Price,Details,Stock);

        if (pDB.add(p1)) {
            JOptionPane.showMessageDialog(this, "Record added succesfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Error occured.");
        }

        txtProductID.setText("");
        txtProductName.setText("");
        txtDetails.setText("");
        txtStock.setText("");
        
         {                                        
        ArrayList<Products> Plist = pDB.getAll();
        String outPutText = "";
        for (Products pp : Plist) {
            outPutText = outPutText + "\n" + (pp.getProductID()+ " "+ pp.getName()+ " "+pp.getDetails()+ " "+pp.getPrice()+" "+pp.getStock());
        }
          try {
        FileWriter writer = new FileWriter("Product.txt", true);
        writer.write(ProductID + " " + Name + " " + Price + " "+Details+" "+ Stock);
        writer.write(System.getProperty("line.separator")); // Corrected system property
        writer.close();
        JOptionPane.showMessageDialog(null, "Success");
        
        new ManagerMenuUI.InsertData().setVisible(true);

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error");
    }
         }   

                
       
    }//GEN-LAST:event_ADDActionPerformed

    
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       {
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tblModel);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(SearchBar.getText().toString()));                                          
       
    }                                         
    }//GEN-LAST:event_SearchActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
    String filePath = "Product.txt";
    File file = new File(filePath);

    try {
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "File not found: " + filePath);
            return;
        }

        FileReader PR = new FileReader(file);
        BufferedReader SR = new BufferedReader(PR);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the table before populating it with new data

        String line;
        while ((line = SR.readLine()) != null) {
            String[] row = line.split(" ");
            model.addRow(row);
        }

        SR.close();
        PR.close();

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
    }
        
    }//GEN-LAST:event_ViewActionPerformed
        
//GEN-FIRST:event_txtProductNameActionPerformed
    
//GEN-LAST:event_txtProductNameActionPerformed

    private void ReturnMenuMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnMenuMActionPerformed
         ManagerMainMenuUI MMM1 = new ManagerMainMenuUI();
         MMM1.show();
         dispose();
    }//GEN-LAST:event_ReturnMenuMActionPerformed

    private void txtDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetailsActionPerformed

    private void BTNDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDeleteActionPerformed
   DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

if (jTable1.getSelectedRowCount() == 1) {
    int selectedRow = jTable1.getSelectedRow();
    tblModel.removeRow(selectedRow);

    // Update "Product.txt" file after removing the row from the table
    try {
        File inputFile = new File("Product.txt");
        File tempFile = new File("TempProduct.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;
        String removedData = "";

        for (int i = 0; (currentLine = reader.readLine()) != null; i++) {
            if (i != selectedRow) {
                writer.write(currentLine + System.getProperty("line.separator"));
            } else {
                // Store the removed data for later use
                removedData = currentLine;
            }
        }

        writer.close();
        reader.close();

        // Replace the original file with the temporary file
        inputFile.delete();
        tempFile.renameTo(inputFile);

        // At this point, "Product.txt" has been updated, and we can use `removedData` if needed.

    } catch (IOException ex) {
        ex.printStackTrace();
    }

} else {
    if (jTable1.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "This table is Empty");
    } else {
        JOptionPane.showMessageDialog(this, "Please select any single row for delete");
    }
}
    }//GEN-LAST:event_BTNDeleteActionPerformed
                           
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
            java.util.logging.Logger.getLogger(ManagerMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton BTNDelete;
    private javax.swing.JButton ReturnMenuM;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDetails;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    private static class InsertData {

        public InsertData() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}
