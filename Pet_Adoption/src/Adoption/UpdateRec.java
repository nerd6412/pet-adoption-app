package Adoption;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Joax
 */
public class UpdateRec extends javax.swing.JInternalFrame {
    Connection con;
    /**
     * Creates new form UpdateRec
     */
    public UpdateRec() {
        initComponents();
        
        String url = "jdbc:mysql://localhost:3306/pet_adoption?serverTimezone=UTC";
        String username = "root";
        String password = "Czar!na12";
        try {
            con = DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());    // Handle any database errors here
        }
        
        this.setBorder (BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi;
        bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UPDgenID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UPDtextarea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        UPDname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UPDage = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UPDaddress = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        UPDcellnum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        UPDemail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        UPDoccu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UPDhometype = new javax.swing.JTextField();
        UPDperm = new javax.swing.JTextField();
        UPDtenure = new javax.swing.JTextField();
        UPDsearch = new Home.landingPage.Button();
        UPDsave = new Home.landingPage.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        UPDtextarea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(219, 180, 167));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Applicant ID:");

        UPDgenID.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        UPDgenID.setForeground(new java.awt.Color(153, 153, 153));
        UPDgenID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UPDgenID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPDgenIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPDgenIDFocusLost(evt);
            }
        });
        UPDgenID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDgenIDActionPerformed(evt);
            }
        });

        UPDtextarea.setEditable(false);
        UPDtextarea.setBackground(new java.awt.Color(255, 255, 255));
        UPDtextarea.setColumns(20);
        UPDtextarea.setRows(5);
        jScrollPane1.setViewportView(UPDtextarea);

        jLabel5.setText("Applicant Name:");

        UPDname.setForeground(new java.awt.Color(153, 153, 153));
        UPDname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPDnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPDnameFocusLost(evt);
            }
        });

        jLabel6.setText("Applicant Age:");

        UPDage.setForeground(new java.awt.Color(153, 153, 153));
        UPDage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPDageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPDageFocusLost(evt);
            }
        });

        jLabel8.setText("Address:");

        UPDaddress.setColumns(20);
        UPDaddress.setForeground(new java.awt.Color(153, 153, 153));
        UPDaddress.setRows(5);
        UPDaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPDaddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPDaddressFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(UPDaddress);

        jLabel10.setText("Cellphone #:");

        UPDcellnum.setForeground(new java.awt.Color(153, 153, 153));
        UPDcellnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPDcellnumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPDcellnumFocusLost(evt);
            }
        });

        jLabel11.setText("Email Address:");

        UPDemail.setForeground(new java.awt.Color(153, 153, 153));
        UPDemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPDemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPDemailFocusLost(evt);
            }
        });
        UPDemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDemailActionPerformed(evt);
            }
        });

        jLabel18.setText("Occupation:");

        UPDoccu.setForeground(new java.awt.Color(153, 153, 153));
        UPDoccu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UPDoccuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UPDoccuFocusLost(evt);
            }
        });

        jLabel2.setText("House Type:");

        jLabel3.setText("Pets Allowed:");

        jLabel4.setText("Home Tenure:");

        UPDhometype.setToolTipText("");

        UPDperm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDpermActionPerformed(evt);
            }
        });

        UPDsearch.setForeground(new java.awt.Color(51, 51, 51));
        UPDsearch.setText("Search");
        UPDsearch.setColor1(new java.awt.Color(226, 226, 226));
        UPDsearch.setColor2(new java.awt.Color(149, 182, 108));
        UPDsearch.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        UPDsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDsearchActionPerformed(evt);
            }
        });

        UPDsave.setForeground(new java.awt.Color(51, 51, 51));
        UPDsave.setText("Save");
        UPDsave.setColor1(new java.awt.Color(226, 226, 226));
        UPDsave.setColor2(new java.awt.Color(149, 182, 108));
        UPDsave.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        UPDsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDsaveActionPerformed(evt);
            }
        });

        UPDtextarea1.setEditable(false);
        UPDtextarea1.setBackground(new java.awt.Color(255, 255, 255));
        UPDtextarea1.setColumns(20);
        UPDtextarea1.setRows(5);
        jScrollPane3.setViewportView(UPDtextarea1);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Recent record:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Updated record:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(UPDsave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(UPDgenID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UPDsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UPDage, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UPDname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UPDcellnum, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UPDperm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UPDemail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UPDoccu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UPDhometype, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UPDtenure, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UPDgenID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UPDsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(UPDname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(UPDage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel8)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UPDcellnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(UPDemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(UPDoccu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(UPDhometype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(UPDperm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(UPDtenure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(39, 39, 39)
                .addComponent(UPDsave, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UPDgenIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDgenIDFocusGained
        if(UPDgenID.getText().equals("Generated ID")){
            UPDgenID.setText("");
            UPDgenID.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDgenIDFocusGained

    private void UPDgenIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDgenIDFocusLost
        if(UPDgenID.getText().equals("")){
            UPDgenID.setText("Generated ID");
            UPDgenID.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDgenIDFocusLost

    private void UPDgenIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDgenIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDgenIDActionPerformed

    private void UPDnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDnameFocusGained
        if(UPDname.getText().equals("Enter your name")){
            UPDname.setText("");
            UPDname.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDnameFocusGained

    private void UPDnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDnameFocusLost
        if(UPDname.getText().equals("")){
            UPDname.setText("Enter your name");
            UPDname.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDnameFocusLost

    private void UPDageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDageFocusGained
        if(UPDage.getText().equals("Enter your age")){
            UPDage.setText("");
            UPDage.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDageFocusGained

    private void UPDageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDageFocusLost
        if(UPDage.getText().equals("")){
            UPDage.setText("Enter your age");
            UPDage.setForeground(new Color (153,153,153));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_UPDageFocusLost

    private void UPDaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDaddressFocusGained
        if(UPDaddress.getText().equals("Unit #, St., Brgy., City")){
            UPDaddress.setText("");
            UPDaddress.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDaddressFocusGained

    private void UPDaddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDaddressFocusLost
        if(UPDaddress.getText().equals("")){
            UPDaddress.setText("Unit #, St., Brgy., City");
            UPDaddress.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDaddressFocusLost

    private void UPDcellnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDcellnumFocusGained
        if(UPDcellnum.getText().equals("+63 XXX YYY ZZZZ")){
            UPDcellnum.setText("");
            UPDcellnum.setForeground(new Color (153,153,153));
        }    // TODO add your handling code here:
    }//GEN-LAST:event_UPDcellnumFocusGained

    private void UPDcellnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDcellnumFocusLost
        if(UPDcellnum.getText().equals("")){
            UPDcellnum.setText("+63 XXX YYY ZZZZ");
            UPDcellnum.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDcellnumFocusLost

    private void UPDemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDemailFocusGained
        if(UPDemail.getText().equals("email123@address.com")){
            UPDemail.setText("");
            UPDemail.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDemailFocusGained

    private void UPDemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDemailFocusLost
        if(UPDemail.getText().equals("")){
            UPDemail.setText("email123@address.com");
            UPDemail.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_UPDemailFocusLost

    private void UPDoccuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDoccuFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDoccuFocusGained

    private void UPDoccuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UPDoccuFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDoccuFocusLost

    private void UPDemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDemailActionPerformed

    private void UPDpermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDpermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDpermActionPerformed

    private void UPDsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDsearchActionPerformed
       try {
        String sql = "SELECT * FROM applicant WHERE applicant_id = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(UPDgenID.getText()));
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int applicantId = rs.getInt("applicant_id");
            String appName = rs.getString("app_name");
            int appAge = rs.getInt("app_age");
            String appNationality = rs.getString("app_nationality");
            String address = rs.getString("address");
            String tel_no = rs.getString("tel_no");
            String cell_no = rs.getString("cell_no");
            String email = rs.getString("email");
            String occupation = rs.getString("occupation");
            String home_type = rs.getString("home_type");
            String pet_allowed = rs.getString("pet_allowed");
            String home_tenure = rs.getString("home_tenure");

            UPDtextarea.setText("Applicant ID: " + applicantId + "\n"
                    + "Name: " + appName + "\n"
                    + "Age: " + appAge + "\n"
                    + "Nationality: " + appNationality + "\n"
                    + "Address: " + address + "\n"
                    + "Telephone Number: " + tel_no + "\n"
                    + "Cellphone Number: " + cell_no + "\n"
                    + "Email: " + email + "\n"
                    + "Occupation: " + occupation + "\n"
                    + "Home Type: " + home_type + "\n"
                    + "Pets Allowed? : " + pet_allowed + "\n"
                    + "Home Tenured?: " + home_tenure + "\n");   
            } else {
                JOptionPane.showMessageDialog(this, "Record not found!");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_UPDsearchActionPerformed

    private void UPDsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDsaveActionPerformed
    try {
            String sql = "UPDATE applicant SET app_name = ?, app_age = ?, address = ?, cell_no = ?, email = ?, occupation = ?, home_type = ?, pet_allowed = ?, home_tenure = ? WHERE applicant_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, UPDname.getText());
            pst.setInt(2, Integer.parseInt(UPDage.getText()));
            pst.setString(3, UPDaddress.getText());
            pst.setString(4, UPDcellnum.getText());
            pst.setString(5, UPDemail.getText());
            pst.setString(6, UPDoccu.getText());
            pst.setString(7, UPDhometype.getText());
            pst.setString(8, UPDperm.getText());
            pst.setString(9, UPDtenure.getText());
            pst.setInt(10, Integer.parseInt(UPDgenID.getText()));
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                // Retrieve the updated record
                sql = "SELECT * FROM applicant WHERE applicant_id = ?";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(UPDgenID.getText()));
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    int applicantId = rs.getInt("applicant_id");
                    String appName = rs.getString("app_name");
                    int appAge = rs.getInt("app_age");
                    String appNationality = rs.getString("app_nationality");
                    String address = rs.getString("address");
                    String tel_no = rs.getString("tel_no");
                    String cell_no = rs.getString("cell_no");
                    String email = rs.getString("email");
                    String occupation = rs.getString("occupation");
                    String home_type = rs.getString("home_type");
                    String pet_allowed = rs.getString("pet_allowed");
                    String home_tenure = rs.getString("home_tenure");

                    UPDtextarea1.setText("Applicant ID: " + applicantId + "\n"
                            + "Name: " + appName + "\n"
                            + "Age: " + appAge + "\n"
                            + "Nationality: " + appNationality + "\n"
                            + "Address: " + address + "\n"
                            + "Telephone Number: " + tel_no + "\n"
                            + "Cellphone Number: " + cell_no + "\n"
                            + "Email: " + email + "\n"
                            + "Occupation: " + occupation + "\n"
                            + "Home Type: " + home_type + "\n"
                            + "Pets Allowed? : " + pet_allowed + "\n"
                            + "Home Tenured?: " + home_tenure + "\n");
                    JOptionPane.showMessageDialog(this, "Record updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Record not found!");
                }
            } else {
                JOptionPane.showMessageDialog(this,"Failed to update record!");
                UPDtextarea1.setText("");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_UPDsaveActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea UPDaddress;
    private javax.swing.JTextField UPDage;
    private javax.swing.JTextField UPDcellnum;
    private javax.swing.JTextField UPDemail;
    private javax.swing.JTextField UPDgenID;
    private javax.swing.JTextField UPDhometype;
    private javax.swing.JTextField UPDname;
    private javax.swing.JTextField UPDoccu;
    private javax.swing.JTextField UPDperm;
    private Home.landingPage.Button UPDsave;
    private Home.landingPage.Button UPDsearch;
    private javax.swing.JTextField UPDtenure;
    private javax.swing.JTextArea UPDtextarea;
    private javax.swing.JTextArea UPDtextarea1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
