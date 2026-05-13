/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Anja
 */
public class Selling extends javax.swing.JFrame {

    /**
     * Creates new form Selling
     */
    public Selling() {
        initComponents();
        GetAllMedicines();
        ShowDate();
       
    }
    
    public void ShowDate()
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        lblDate.setText(sdf.format(date));
    }
    
   

    /* Connection with db*/
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbMedicine = new javax.swing.JTextField();
        btnAddBill = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        tbQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taBill = new javax.swing.JTextArea();
        lblAgents = new javax.swing.JLabel();
        lblMedicines = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFocusTraversalPolicyProvider(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(1070, 630));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Billing");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("MEDICINE");

        tbMedicine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedicine.setForeground(new java.awt.Color(0, 0, 0));
        tbMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbMedicineActionPerformed(evt);
            }
        });

        btnAddBill.setBackground(new java.awt.Color(51, 153, 255));
        btnAddBill.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAddBill.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBill.setText("ADD TO BILL");
        btnAddBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBillMouseClicked(evt);
            }
        });
        btnAddBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBillActionPerformed(evt);
            }
        });

        btnPrintBill.setBackground(new java.awt.Color(51, 153, 255));
        btnPrintBill.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPrintBill.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintBill.setText("PRINT");
        btnPrintBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintBillMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("Bill");

        btnClear.setBackground(new java.awt.Color(51, 153, 255));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(102, 102, 102));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("DD-MM-YYYY");

        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MEDNAME", "PRICE", "QUANTITY", "FABDATE", "EXPDATE", "COMPANY"
            }
        ));
        MedicineTable.setRowHeight(25);
        MedicineTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(MedicineTable);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("Medicines List");

        tbQty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbQty.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("QUANTITY");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Bill Date:");

        taBill.setColumns(20);
        taBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taBill.setRows(5);
        jScrollPane1.setViewportView(taBill);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(218, 218, 218))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAddBill)
                                .addGap(82, 82, 82)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPrintBill)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(306, 306, 306))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddBill, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrintBill)
                .addContainerGap())
        );

        lblAgents.setBackground(new java.awt.Color(255, 255, 255));
        lblAgents.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblAgents.setForeground(new java.awt.Color(255, 255, 255));
        lblAgents.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAgents.setText("Agents");
        lblAgents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgentsMouseClicked(evt);
            }
        });

        lblMedicines.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicines.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblMedicines.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicines.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicines.setText("Medicines");
        lblMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMedicinesMouseClicked(evt);
            }
        });

        lblCompany.setBackground(new java.awt.Color(255, 255, 255));
        lblCompany.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblCompany.setForeground(new java.awt.Color(255, 255, 255));
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCompany.setText("Company");
        lblCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompanyMouseClicked(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCompany))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblAgents))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMedicines)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void GetAllMedicines()
    {
        try {
            conn=DBConnection.getConnection();
          // conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","User123!");
           st = conn.createStatement();
           rs = st.executeQuery("Select * from Medicines");
           MedicineTable.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    public void UpdateQty()
    {
        int newQty;
        newQty = oldQty - Integer.valueOf(tbQty.getText());
        try {
            conn=DBConnection.getConnection();
         
                String queryUpdate = "Update Medicines set quantity = " + newQty + "" + "where id = " + medId;
                Statement st = conn.createStatement();
                st.executeUpdate(queryUpdate);
                
                GetAllMedicines();
                JOptionPane.showMessageDialog(this, "Quantity of medicine Successfully Updated!");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
    }
    
    int i = 0, medId, oldQty;
    double price;
    private void btnAddBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBillMouseClicked
        
        if (tbMedicine.getText().isEmpty() || tbQty.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Missing Information about Bill");
        }
        else
        {
           i++;
           UpdateQty();
           if (i == 1) 
           {
               taBill.setText(taBill.getText()+"                 ********************************PharmaCentar********************************\n\n  "
                                   + "\t      ID     MEDICINE  QUANTITY   PRICE         TOTAL\n\t"
                                   + "      "+i+"        "+tbMedicine.getText()+"         "+tbQty.getText()+"          "+price+"      "+ Integer.valueOf(tbQty.getText())*price);
           }
           else
           {
               taBill.setText(taBill.getText()+"\n  \t      "+i+"        "+tbMedicine.getText()+"        "+tbQty.getText()+"          "+price+"        "+ Integer.valueOf(tbQty.getText())*price);
           }
        }
    }//GEN-LAST:event_btnAddBillMouseClicked

    private void btnPrintBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintBillMouseClicked

        try {
            taBill.print();
            
        } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnPrintBillMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked

//        tbBillId.setText("");
        tbMedicine.setText("");
        tbQty.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void lblAgentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgentsMouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAgentsMouseClicked

    private void lblMedicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicinesMouseClicked
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMedicinesMouseClicked

    private void lblCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMouseClicked
         new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCompanyMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked

        DefaultTableModel model = (DefaultTableModel)MedicineTable.getModel();
        int myIndex = MedicineTable.getSelectedRow();
        medId = Integer.valueOf(model.getValueAt(myIndex, 0).toString());
        tbMedicine.setText(model.getValueAt(myIndex, 1).toString());
        oldQty = Integer.valueOf(model.getValueAt(myIndex, 2).toString());
        price = Double.valueOf(model.getValueAt(myIndex, 6).toString());
    }//GEN-LAST:event_MedicineTableMouseClicked

    private void btnAddBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBillActionPerformed

    private void tbMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbMedicineActionPerformed

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
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton btnAddBill;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAgents;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMedicines;
    private javax.swing.JTextArea taBill;
    private javax.swing.JTextField tbMedicine;
    private javax.swing.JTextField tbQty;
    // End of variables declaration//GEN-END:variables
}
