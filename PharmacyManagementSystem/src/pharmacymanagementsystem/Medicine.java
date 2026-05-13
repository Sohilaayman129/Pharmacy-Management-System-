/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class Medicine extends javax.swing.JFrame {

    /**
     * Creates new form Medicine
     */
    public Medicine() {
        initComponents();
        GetAllMedicines();
        GetCompany();
    }

    /* Connection with db*/
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    java.util.Date fabDate,expDate;
    java.util.Date myFabDate, myExpDate;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSelling = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbMedPrice = new javax.swing.JTextField();
        tbMedId = new javax.swing.JTextField();
        tbMedName = new javax.swing.JTextField();
        tbMedQty = new javax.swing.JTextField();
        ddlCompany = new javax.swing.JComboBox<>();
        dpFabDate = new com.toedter.calendar.JDateChooser();
        dpExpDate = new com.toedter.calendar.JDateChooser();
        btnAddMedicine = new javax.swing.JButton();
        btnUpdateMedicine = new javax.swing.JButton();
        btnDeleteMedicine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblAgents = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        lblSelling.setBackground(new java.awt.Color(255, 255, 255));
        lblSelling.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblSelling.setForeground(new java.awt.Color(255, 255, 255));
        lblSelling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSelling.setText("Selling");
        lblSelling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSellingMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Medicines ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("MEDNAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("PRICE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("QUANTITY");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("FABDATE");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("EXPDATE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("COMPANY");

        tbMedPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedPrice.setForeground(new java.awt.Color(0, 0, 0));
        tbMedPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbMedPriceActionPerformed(evt);
            }
        });

        tbMedId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedId.setForeground(new java.awt.Color(0, 0, 0));

        tbMedName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedName.setForeground(new java.awt.Color(0, 0, 0));

        tbMedQty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbMedQty.setForeground(new java.awt.Color(0, 0, 0));

        ddlCompany.setEditable(true);
        ddlCompany.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ddlCompany.setForeground(new java.awt.Color(0, 0, 0));

        btnAddMedicine.setBackground(new java.awt.Color(51, 153, 255));
        btnAddMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnAddMedicine.setText("ADD");
        btnAddMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMedicineMouseClicked(evt);
            }
        });

        btnUpdateMedicine.setBackground(new java.awt.Color(51, 153, 255));
        btnUpdateMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateMedicine.setText("UPDATE");
        btnUpdateMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMedicineMouseClicked(evt);
            }
        });

        btnDeleteMedicine.setBackground(new java.awt.Color(51, 153, 255));
        btnDeleteMedicine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteMedicine.setText("DELETE");
        btnDeleteMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMedicineMouseClicked(evt);
            }
        });

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
        jScrollPane1.setViewportView(MedicineTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("Medicines List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tbMedQty, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                    .addComponent(tbMedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dpFabDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dpExpDate, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(ddlCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnUpdateMedicine)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteMedicine))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnAddMedicine)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(tbMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(472, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dpFabDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(dpExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddlCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(tbMedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbMedQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(tbMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
        );

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

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSelling)
                                    .addComponent(lblAgents))
                                .addGap(20, 20, 20))
                            .addComponent(lblCompany))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    public void GetCompany()
    {
        try {
              conn=DBConnection.getConnection();
           // conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","User123!");
           st = conn.createStatement();
           rs = st.executeQuery("Select * from Companies");
           
           while(rs.next())
           {
               String myCompany = rs.getString("name");
               ddlCompany.addItem(myCompany);
           }
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
    /* insert new medicine */
    private void btnAddMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMedicineMouseClicked
        
        fabDate = dpFabDate.getDate();
        myFabDate = new java.sql.Date(fabDate.getTime());
        expDate = dpExpDate.getDate();
        myExpDate = new java.sql.Date(expDate.getTime());
        
        try {          
            conn=DBConnection.getConnection();
           
            PreparedStatement ps = conn.prepareStatement("insert into medicines values(?,?,?,?,?,?,?)");
            
            ps.setInt(1, Integer.valueOf(tbMedId.getText()));
            ps.setString(2, tbMedName.getText());
            ps.setInt(3, Integer.valueOf(tbMedQty.getText()));
            ps.setDate(4, (Date) myFabDate);
            ps.setDate(5, (Date) myExpDate);
            ps.setString(6, ddlCompany.getSelectedItem().toString());
            ps.setDouble(7, Double.valueOf(tbMedPrice.getText()));
        
            
            int row =  ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Medicine Successfully Added!");
            conn.close();
            GetAllMedicines();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }       
    }//GEN-LAST:event_btnAddMedicineMouseClicked

    /* delete existing medicine */
    private void btnDeleteMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMedicineMouseClicked
        
        if (tbMedId.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Enter ID of The Medicine To Be Deleted....");
        }
        else
        {
            try {
                conn=DBConnection.getConnection();
               
                String id = tbMedId.getText();
                String query = "Delete from Medicines where id = " + id;
                Statement st = conn.createStatement();
                st.executeUpdate(query);
                
                GetAllMedicines();
                JOptionPane.showMessageDialog(this, "Medicine Successfully Deleted!");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }      
    }//GEN-LAST:event_btnDeleteMedicineMouseClicked

    /* update existing medicine by click on wanted table row*/
    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked
       
        DefaultTableModel model = (DefaultTableModel)MedicineTable.getModel();
        int myIndex = MedicineTable.getSelectedRow();
        tbMedId.setText(model.getValueAt(myIndex, 0).toString());
        tbMedName.setText(model.getValueAt(myIndex, 1).toString());
        tbMedQty.setText(model.getValueAt(myIndex, 2).toString());
        dpFabDate.setDate((Date)model.getValueAt(myIndex, 3));
        dpExpDate.setDate((Date)model.getValueAt(myIndex, 4));
        tbMedPrice.setText(model.getValueAt(myIndex, 6).toString());

    }//GEN-LAST:event_MedicineTableMouseClicked

    
    /* update existing medicine */
    private void btnUpdateMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMedicineMouseClicked
        if (tbMedId.getText().isEmpty() || tbMedName.getText().isEmpty() || tbMedPrice.getText().isEmpty() || tbMedQty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information about Medicine");
        }
        else
        {
            try {
                conn=DBConnection.getConnection();
               
                String id = tbMedId.getText();
                fabDate = dpFabDate.getDate();
                myFabDate = new java.sql.Date(fabDate.getTime());
                expDate = dpExpDate.getDate();
                myExpDate = new java.sql.Date(expDate.getTime());
                
                String queryUpdate = "Update Medicines set medname = '" + tbMedName.getText() + "'" + ",price = " + tbMedPrice.getText() + "" + ",quantity = " + tbMedQty.getText() + "" + ",fabdate = '" + myFabDate + "'" + ",expdate = '" + myExpDate + "'" + ",medcomp = '" + ddlCompany.getSelectedItem().toString() + "'" + "where id = " + id;
                Statement st = conn.createStatement();
                st.executeUpdate(queryUpdate);
                
                GetAllMedicines();
                JOptionPane.showMessageDialog(this, "Medicine Successfully Updated!");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }     
    }//GEN-LAST:event_btnUpdateMedicineMouseClicked

    private void lblCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMouseClicked
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCompanyMouseClicked

    private void lblAgentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgentsMouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAgentsMouseClicked

    private void lblSellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSellingMouseClicked
         new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSellingMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void tbMedPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbMedPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbMedPriceActionPerformed

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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MedicineTable;
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnDeleteMedicine;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnUpdateMedicine;
    private javax.swing.JComboBox<String> ddlCompany;
    private com.toedter.calendar.JDateChooser dpExpDate;
    private com.toedter.calendar.JDateChooser dpFabDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgents;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblSelling;
    private javax.swing.JTextField tbMedId;
    private javax.swing.JTextField tbMedName;
    private javax.swing.JTextField tbMedPrice;
    private javax.swing.JTextField tbMedQty;
    // End of variables declaration//GEN-END:variables
}
