package Adoption;

import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joax
 */
public class Adoption_Form extends javax.swing.JFrame {

    /**
     * Creates new form Adoption_Form
     */
    public Adoption_Form() {
        initComponents();
        establishConnection();
        genID.setEnabled(false);
        HHtable.setEnabled(false);
        HHaddBtn.setEnabled(false);
        HHdeleteBtn.setEnabled(false);
        AllerYes.setEnabled(false);
        AllerNo.setEnabled(false);
        SuppYes.setEnabled(false);
        SuppNo.setEnabled(false);
        BehYes.setEnabled(false);
        BehNo.setEnabled(false);
        VisitYes.setEnabled(false);
        VisitNo.setEnabled(false);
        CPtable.setEnabled(false);
        CPaddBtn.setEnabled(false);
        CPdeleteBtn.setEnabled(false);
        vetName.setEnabled(false);
        vetNum.setEnabled(false);
    }
    
    Connection con;
    PreparedStatement pst;
    
    private void establishConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/pet_adoption?serverTimezone=UTC";
            String username = "root";
            String password = "Czar!na12";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error connecting to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Adoption_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        gradientPanel1 = new com.k33ptoo.components.gradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HomeBtn = new Home.landingPage.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AppName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AppAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AppNation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppAdd = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        telnum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cellnum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AppEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        HThouse = new javax.swing.JRadioButton();
        HTcondo = new javax.swing.JRadioButton();
        HTown = new javax.swing.JRadioButton();
        HTrented = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        HOyes = new javax.swing.JRadioButton();
        HOno = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        TenureCB = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        HHaddBtn = new javax.swing.JButton();
        HHdeleteBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        CPyes = new javax.swing.JRadioButton();
        CPno = new javax.swing.JRadioButton();
        CPaddBtn = new javax.swing.JButton();
        CPdeleteBtn = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HHtable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        CPtable = new javax.swing.JTable();
        vetName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        vetNum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        AdjYes = new javax.swing.JRadioButton();
        AdjNo = new javax.swing.JRadioButton();
        EutYes = new javax.swing.JRadioButton();
        EutNo = new javax.swing.JRadioButton();
        SurrYes = new javax.swing.JRadioButton();
        SurrNo = new javax.swing.JRadioButton();
        LostYes = new javax.swing.JRadioButton();
        LostNo = new javax.swing.JRadioButton();
        MoveYes = new javax.swing.JRadioButton();
        MoveNo = new javax.swing.JRadioButton();
        SubmitBTN = new Home.landingPage.Button();
        jLabel18 = new javax.swing.JLabel();
        AppOccu = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        AllerYes = new javax.swing.JRadioButton();
        AllerNo = new javax.swing.JRadioButton();
        SuppYes = new javax.swing.JRadioButton();
        SuppNo = new javax.swing.JRadioButton();
        BehYes = new javax.swing.JRadioButton();
        BehNo = new javax.swing.JRadioButton();
        VisitYes = new javax.swing.JRadioButton();
        VisitNo = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        AntYes = new javax.swing.JRadioButton();
        AntNo = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        HHyes = new javax.swing.JRadioButton();
        HHno = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 650));

        gradientPanel1.setkEndColor(new java.awt.Color(222, 236, 207));
        gradientPanel1.setkStartColor(new java.awt.Color(195, 221, 166));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k33ptoo/components/Pets_1.png"))); // NOI18N
        jLabel1.setText(" ");

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Pet Adoption Application Form");

        HomeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k33ptoo/components/Home_4.png"))); // NOI18N
        HomeBtn.setColor1(new java.awt.Color(255, 255, 255));
        HomeBtn.setColor2(new java.awt.Color(238, 198, 185));
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Applicant Form");

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jLabel4.setText("Applicant ID:");

        genID.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        genID.setForeground(new java.awt.Color(153, 153, 153));
        genID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        genID.setText("Generated ID");
        genID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                genIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                genIDFocusLost(evt);
            }
        });
        genID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Applicant Name:");

        AppName.setForeground(new java.awt.Color(153, 153, 153));
        AppName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AppNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AppNameFocusLost(evt);
            }
        });
        AppName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Applicant Age:");

        AppAge.setForeground(new java.awt.Color(153, 153, 153));
        AppAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AppAgeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AppAgeFocusLost(evt);
            }
        });

        jLabel7.setText("Nationality:");

        AppNation.setForeground(new java.awt.Color(153, 153, 153));
        AppNation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AppNationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AppNationFocusLost(evt);
            }
        });

        jLabel8.setText("Address:");

        AppAdd.setColumns(20);
        AppAdd.setForeground(new java.awt.Color(153, 153, 153));
        AppAdd.setRows(5);
        AppAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AppAddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AppAddFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(AppAdd);

        jLabel9.setText("Telephone #:");

        telnum.setForeground(new java.awt.Color(153, 153, 153));
        telnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telnumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telnumFocusLost(evt);
            }
        });

        jLabel10.setText("Cellphone #:");

        cellnum.setForeground(new java.awt.Color(153, 153, 153));
        cellnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cellnumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cellnumFocusLost(evt);
            }
        });

        jLabel11.setText("Email Address:");

        AppEmail.setForeground(new java.awt.Color(153, 153, 153));
        AppEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AppEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AppEmailFocusLost(evt);
            }
        });

        jLabel12.setText("Please select whichever is applicable:");

        buttonGroup1.add(HThouse);
        HThouse.setText("House");
        HThouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HThouseActionPerformed(evt);
            }
        });

        buttonGroup1.add(HTcondo);
        HTcondo.setText("Condo");
        HTcondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTcondoActionPerformed(evt);
            }
        });

        buttonGroup1.add(HTown);
        HTown.setText("Owned");
        HTown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTownActionPerformed(evt);
            }
        });

        buttonGroup1.add(HTrented);
        HTrented.setText("Rented");
        HTrented.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTrentedActionPerformed(evt);
            }
        });

        jLabel13.setText("If not a homeowner, do you have permission to keep pets?:");

        buttonGroup2.add(HOyes);
        HOyes.setText("Yes");
        HOyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOyesActionPerformed(evt);
            }
        });

        buttonGroup2.add(HOno);
        HOno.setText("No");
        HOno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOnoActionPerformed(evt);
            }
        });

        jLabel14.setText("How long have you lived here?");

        TenureCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1 - 6 mos.", "1 - 5 yrs.", "6 - 10 yrs.", "10 - 20 yrs." }));
        TenureCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenureCBActionPerformed(evt);
            }
        });

        jLabel15.setText("List household members (excluding pets) in order, including children.");

        HHaddBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        HHaddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k33ptoo/components/Add_1.png"))); // NOI18N
        HHaddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HHaddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HHaddBtnActionPerformed(evt);
            }
        });

        HHdeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k33ptoo/components/Delete_3.png"))); // NOI18N
        HHdeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HHdeleteBtnActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        jLabel19.setText("Current Pets");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel20.setText("Do you currently have any pets?");

        buttonGroup3.add(CPyes);
        CPyes.setText("Yes");
        CPyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPyesActionPerformed(evt);
            }
        });

        buttonGroup3.add(CPno);
        CPno.setText("No");
        CPno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPnoActionPerformed(evt);
            }
        });

        CPaddBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        CPaddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k33ptoo/components/Add_1.png"))); // NOI18N
        CPaddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CPaddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPaddBtnActionPerformed(evt);
            }
        });

        CPdeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/k33ptoo/components/Delete_3.png"))); // NOI18N
        CPdeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPdeleteBtnActionPerformed(evt);
            }
        });

        jLabel26.setText("Your veterinarian -");

        HHtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Relationship", "Age"
            }
        ));
        jScrollPane2.setViewportView(HHtable);

        CPtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Breed", "Rescue", "Age", "Gender", "Spayed/Neutered"
            }
        ));
        jScrollPane4.setViewportView(CPtable);

        vetName.setForeground(new java.awt.Color(153, 153, 153));
        vetName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vetNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vetNameFocusLost(evt);
            }
        });
        vetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vetNameActionPerformed(evt);
            }
        });

        jLabel16.setText("Contact #:");

        vetNum.setForeground(new java.awt.Color(153, 153, 153));
        vetNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vetNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vetNumFocusLost(evt);
            }
        });

        jLabel17.setText("Do you anticipate any problems of adjustment with the new pet?");

        jLabel21.setText("Have you ever had a pet euthanized?");

        jLabel25.setText("Have you ever surrended a pet?");

        jLabel28.setText("Have you lost a pet?");

        jLabel29.setText("If you were to ever move would you take your pets with you?");

        buttonGroup8.add(AdjYes);
        AdjYes.setText("Yes");

        buttonGroup8.add(AdjNo);
        AdjNo.setText("No");

        buttonGroup9.add(EutYes);
        EutYes.setText("Yes");

        buttonGroup9.add(EutNo);
        EutNo.setText("No");

        buttonGroup10.add(SurrYes);
        SurrYes.setText("Yes");

        buttonGroup10.add(SurrNo);
        SurrNo.setText("No");

        buttonGroup11.add(LostYes);
        LostYes.setText("Yes");

        buttonGroup11.add(LostNo);
        LostNo.setText("No");

        buttonGroup12.add(MoveYes);
        MoveYes.setText("Yes");

        buttonGroup12.add(MoveNo);
        MoveNo.setText("No");

        SubmitBTN.setForeground(new java.awt.Color(76, 76, 76));
        SubmitBTN.setText("Submit");
        SubmitBTN.setColor1(new java.awt.Color(195, 221, 166));
        SubmitBTN.setColor2(new java.awt.Color(244, 218, 209));
        SubmitBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SubmitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBTNActionPerformed(evt);
            }
        });

        jLabel18.setText("Occupation:");

        AppOccu.setForeground(new java.awt.Color(153, 153, 153));
        AppOccu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AppOccuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AppOccuFocusLost(evt);
            }
        });

        jLabel23.setText("Does any member of your household have any known allergies to animals?");

        jLabel24.setText("Do all members of the family support your decision to adopt a pet?");

        jLabel27.setText("If you have children, have they been taught how to behave with animals?");

        jLabel30.setText("Do we have permission to visit your home?");

        buttonGroup4.add(AllerYes);
        AllerYes.setText("Yes");
        AllerYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllerYesActionPerformed(evt);
            }
        });

        buttonGroup4.add(AllerNo);
        AllerNo.setText("No");

        buttonGroup5.add(SuppYes);
        SuppYes.setText("Yes");

        buttonGroup5.add(SuppNo);
        SuppNo.setText("No");

        buttonGroup6.add(BehYes);
        BehYes.setText("Yes");

        buttonGroup6.add(BehNo);
        BehNo.setText("No");
        BehNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BehNoActionPerformed(evt);
            }
        });

        buttonGroup7.add(VisitYes);
        VisitYes.setText("Yes");

        buttonGroup7.add(VisitNo);
        VisitNo.setText("No");

        jLabel31.setText("Do you anticipate moving soon?");

        buttonGroup13.add(AntYes);
        AntYes.setText("Yes");

        buttonGroup13.add(AntNo);
        AntNo.setText("No");

        jLabel32.setText("Do you have household members?");

        buttonGroup14.add(HHyes);
        HHyes.setText("Yes");
        HHyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HHyesActionPerformed(evt);
            }
        });

        buttonGroup14.add(HHno);
        HHno.setText("No");
        HHno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HHnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppAge, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppNation, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HThouse)
                                .addGap(18, 18, 18)
                                .addComponent(HTcondo)
                                .addGap(18, 18, 18)
                                .addComponent(HTown)
                                .addGap(18, 18, 18)
                                .addComponent(HTrented))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HOyes)
                                .addGap(18, 18, 18)
                                .addComponent(HOno))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(TenureCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(telnum)
                                        .addComponent(cellnum)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(62, 62, 62)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel18))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AppEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(AppOccu))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(SubmitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(HHyes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HHno)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HHaddBtn)
                                .addGap(6, 6, 6)
                                .addComponent(HHdeleteBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(24, 24, 24)
                                .addComponent(AllerYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AllerNo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CPaddBtn)
                                .addGap(6, 6, 6)
                                .addComponent(CPdeleteBtn))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(33, 33, 33)
                                .addComponent(CPyes)
                                .addGap(31, 31, 31)
                                .addComponent(CPno))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(166, 166, 166)
                                .addComponent(EutYes)
                                .addGap(12, 12, 12)
                                .addComponent(EutNo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel25))
                                .addGap(194, 194, 194)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LostYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(LostNo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(SurrYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(SurrNo))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SuppYes)
                                    .addGap(12, 12, 12)
                                    .addComponent(SuppNo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel30))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(VisitYes)
                                            .addGap(12, 12, 12)
                                            .addComponent(VisitNo))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(BehYes)
                                            .addGap(12, 12, 12)
                                            .addComponent(BehNo)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AntYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(AntNo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MoveYes)
                                        .addGap(12, 12, 12)
                                        .addComponent(MoveNo))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vetName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(vetNum))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(18, 18, 18)
                                    .addComponent(AdjYes)
                                    .addGap(12, 12, 12)
                                    .addComponent(AdjNo))))))
                .addGap(0, 89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22))
                    .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HHaddBtn)
                            .addComponent(HHdeleteBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AllerNo)
                                .addComponent(AllerYes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SuppYes)
                                .addComponent(jLabel24))
                            .addComponent(SuppNo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(genID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AppAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AppNation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(AppEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(AppOccu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HThouse)
                            .addComponent(HTcondo)
                            .addComponent(HTown)
                            .addComponent(HTrented))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HOyes)
                            .addComponent(HOno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14))
                            .addComponent(TenureCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(HHyes)
                            .addComponent(HHno))
                        .addGap(23, 23, 23)
                        .addComponent(SubmitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(BehYes)
                                    .addComponent(BehNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(VisitYes)
                                    .addComponent(VisitNo)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel20))
                                    .addComponent(CPyes)
                                    .addComponent(CPno)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel9)
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(cellnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(telnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPaddBtn)
                            .addComponent(CPdeleteBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vetNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26)
                                        .addComponent(vetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel17))
                            .addComponent(AdjYes)
                            .addComponent(AdjNo))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel21))
                            .addComponent(EutYes)
                            .addComponent(EutNo))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SurrYes)
                                    .addComponent(SurrNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LostYes)
                                        .addComponent(jLabel28))
                                    .addComponent(LostNo)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AntYes)
                                .addComponent(AntNo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MoveYes)
                                .addComponent(jLabel29))
                            .addComponent(MoveNo))))
                .addGap(17, 17, 17))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        new Home_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void HHdeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HHdeleteBtnActionPerformed
        DefaultTableModel HHtbl = (DefaultTableModel)HHtable.getModel();
        HHtbl.removeRow(HHtbl.getRowCount()-1);
    }//GEN-LAST:event_HHdeleteBtnActionPerformed

    private void CPdeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPdeleteBtnActionPerformed
        DefaultTableModel CPtbl = (DefaultTableModel)CPtable.getModel();
        CPtbl.removeRow(CPtbl.getRowCount()-1);        // TODO add your handling code here:
    }//GEN-LAST:event_CPdeleteBtnActionPerformed

    private void genIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genIDFocusGained

    }//GEN-LAST:event_genIDFocusGained

    private void genIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genIDFocusLost

    }//GEN-LAST:event_genIDFocusLost

    private void genIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genIDActionPerformed

    }//GEN-LAST:event_genIDActionPerformed

    private void AppNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppNameFocusGained

    }//GEN-LAST:event_AppNameFocusGained

    private void AppNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppNameFocusLost

    }//GEN-LAST:event_AppNameFocusLost

    private void AppAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppAgeFocusGained

    }//GEN-LAST:event_AppAgeFocusGained

    private void AppAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppAgeFocusLost
    // TODO add your handling code here:
    }//GEN-LAST:event_AppAgeFocusLost

    private void AppNationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppNationFocusGained

    }//GEN-LAST:event_AppNationFocusGained

    private void AppNationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppNationFocusLost

    }//GEN-LAST:event_AppNationFocusLost

    private void AppAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppAddFocusGained

    }//GEN-LAST:event_AppAddFocusGained

    private void AppAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppAddFocusLost

    }//GEN-LAST:event_AppAddFocusLost

    private void telnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telnumFocusGained

    }//GEN-LAST:event_telnumFocusGained

    private void telnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telnumFocusLost

    }//GEN-LAST:event_telnumFocusLost

    private void cellnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cellnumFocusGained
  // TODO add your handling code here:
    }//GEN-LAST:event_cellnumFocusGained

    private void cellnumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cellnumFocusLost

    }//GEN-LAST:event_cellnumFocusLost

    private void AppEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppEmailFocusGained

    }//GEN-LAST:event_AppEmailFocusGained

    private void AppEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppEmailFocusLost

    }//GEN-LAST:event_AppEmailFocusLost

    private void vetNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetNameFocusGained

    }//GEN-LAST:event_vetNameFocusGained

    private void vetNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetNameFocusLost

    }//GEN-LAST:event_vetNameFocusLost

    private void vetNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetNumFocusGained

    }//GEN-LAST:event_vetNumFocusGained

    private void vetNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vetNumFocusLost

    }//GEN-LAST:event_vetNumFocusLost

    private void SubmitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBTNActionPerformed
        try {
            String name = AppName.getText();
            while(!name.matches("^[a-zA-Z\\\\s]*$")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid name. It must not contain\nnumbers or special characters.");
                name = JOptionPane.showInputDialog(this, "Applicant Name:");
                AppName.setText(name);
            }
            int applicantAge;
            try {
                applicantAge = Integer.parseInt(AppAge.getText());
                if (applicantAge <= 17) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Applicant age is invalid!\nApplicant must have entered an age less than 18\nor a non-digit number");
                return; // Stop further execution
            }

            int age = applicantAge;
            String nationality = AppNation.getText();
            while(!nationality.matches("^[a-zA-Z\\\\s]*$")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid nationality. It must not contain\nnumbers or special characters.");
                nationality = JOptionPane.showInputDialog(this, "Nationality:");
                AppNation.setText(nationality);
            }
            String add = AppAdd.getText();
            String tel = telnum.getText();
            String cell = cellnum.getText();
            String mail = AppEmail.getText();
            String job = AppOccu.getText();
            String hometype = "";
            String permission = "";
            String pets = "";
            String allergy = "";
            String support = "";
            String behave = "";
            String visit = "";

            if (name.isEmpty() || AppAge.getText().isEmpty() || nationality.isEmpty() || add.isEmpty() || cell.isEmpty() || mail.isEmpty() || job.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
                return; // Stop further execution
            }
            if (HThouse.isSelected()) {
                hometype = "H";
            }
            if (HTcondo.isSelected()) {
                hometype = "C";
            }
            if (HTown.isSelected()) {
                hometype = "O";
            }
            if (HTrented.isSelected()) {
                hometype = "R";
            }
            if(!HThouse.isSelected() && !HTcondo.isSelected() && !HTown.isSelected() && !HTrented.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
                return; // Stop further execution
            }
            if (HOyes.isSelected()) {
                permission = "Y";
            }
            if (HOno.isSelected()) {
                permission = "N";
            }
            if(!HOyes.isSelected() && !HOno.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
                return; // Stop further execution
            }
            String tenure = TenureCB.getSelectedItem().toString();
            if(tenure.equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
                return; // Stop further execution
            }
            if (CPyes.isSelected()) {
                pets = "Y";
            }
            if (CPno.isSelected()) {
                pets = "N";
            }
            if(!CPyes.isSelected() && !CPno.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
                return; // Stop further execution
            }
            
            String adjustment = "";
            String euthanize = "";
            String surrendered = "";
            String anticipate = "";
            String lost = "";
            String move = "";
            if (AdjYes.isSelected()) {
                adjustment = "Y";
            }
            if (AdjNo.isSelected()) {
                adjustment = "N";
            }
            if (EutYes.isSelected()) {
                euthanize = "Y";
            }
            if (EutNo.isSelected()) {
                euthanize = "N";
            }
            if (SurrYes.isSelected()) {
                surrendered = "Y";
            }
            if (SurrNo.isSelected()) {
                surrendered = "N";
            }
            if (LostYes.isSelected()) {
                lost = "Y";
            }
            if (LostNo.isSelected()) {
                lost = "N";
            }
            if (AntYes.isSelected()) {
                anticipate = "Y";
            }
            if (AntNo.isSelected()) {
                anticipate = "N";
            }
            if (MoveYes.isSelected()) {
                move = "Y";
            }
            if (MoveNo.isSelected()) {
                move = "N";
            }
            
            if((!AdjYes.isSelected() && !AdjNo.isSelected()) || (!EutYes.isSelected() && !EutNo.isSelected()) || (!SurrYes.isSelected() && !SurrNo.isSelected()) || (!LostYes.isSelected() && !LostNo.isSelected()) || (!AntYes.isSelected() && !AntNo.isSelected()) || (!MoveYes.isSelected() && !MoveNo.isSelected())) {
                JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
                return; // Stop further execution
            }
            
            String query = "INSERT INTO applicant(app_name, app_age, app_nationality, address, tel_no, cell_no, email, occupation, home_type, pet_allowed, home_tenure, current_pet) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            String query2 = "INSERT INTO house_members(applicant_id, member_name, member_age, member_relation, animal_allergy, family_support, behave_kids, visitation) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            String query3 = "INSERT INTO current_pets(applicant_id, pet_type, pet_breed, pet_rescue, pet_age, pet_gender, spay_neuter, vet_name, vet_no) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            String query4 = "INSERT INTO pet_status(applicant_id, adjust_prob, euthanize, surrender_pet, lost_pet, anticipate_move, move_pet) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setString(3, nationality);
            pst.setString(4, add);
            pst.setString(5, tel);
            pst.setString(6, cell);
            pst.setString(7, mail);
            pst.setString(8, job);
            pst.setString(9, hometype);
            pst.setString(10, permission);
            pst.setString(11, tenure);
            pst.setString(12, pets);
            pst.executeUpdate();
            
            int applicantId = -1; // Initialize with a value that is not a valid applicant_id
            String query1 = "SELECT LAST_INSERT_ID() AS applicant_id"; // Retrieve the last inserted ID
            pst = con.prepareStatement(query1);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                applicantId = rs.getInt("applicant_id");
            }

            DefaultTableModel HHtbl = (DefaultTableModel) HHtable.getModel();
            for (int i = 0; i < HHtbl.getRowCount(); i++) {
                String mname = HHtbl.getValueAt(i, 0).toString();
                String memAge = HHtbl.getValueAt(i, 2).toString();
                String mrelate = HHtbl.getValueAt(i, 1).toString();
                int mem_age = Integer.parseInt(memAge);
                if (AllerYes.isSelected()) {
                    allergy = "Y";
                }
                if (AllerNo.isSelected()) {
                    allergy = "N";
                }
                if (SuppYes.isSelected()) {
                    support = "Y";
                }
                if (SuppNo.isSelected()) {
                    support = "N";
                }
                if (BehYes.isSelected()) {
                    behave = "Y";
                }
                if (BehNo.isSelected()) {
                    behave = "N";
                }
                if (VisitYes.isSelected()) {
                    visit = "Y";
                }
                if (VisitNo.isSelected()) {
                    visit = "N";
                }
                if((!AllerYes.isSelected() && !AllerNo.isSelected()) || (!SuppYes.isSelected() && !SuppNo.isSelected()) || (!BehYes.isSelected() && !BehNo.isSelected()) || (!VisitYes.isSelected() && !VisitNo.isSelected())) {
                    JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
                    return; // Stop further execution
                }
                
                pst = con.prepareStatement(query2);
                pst.setInt(1, applicantId);
                pst.setString(2, mname);
                pst.setInt(3, mem_age);
                pst.setString(4, mrelate);
                pst.setString(5, allergy);
                pst.setString(6, support);
                pst.setString(7, behave);
                pst.setString(8, visit);
                pst.execute();
            }
            
            DefaultTableModel CPtbl = (DefaultTableModel) CPtable.getModel();
            for (int j = 0; j < CPtbl.getRowCount(); j++) {
                String petType = CPtbl.getValueAt(j, 0).toString();
                String petBreed = CPtbl.getValueAt(j, 1).toString();
                String petRescue = CPtbl.getValueAt(j, 2).toString();
                String petAge = CPtbl.getValueAt(j, 3).toString();
                int pet_age = Integer.parseInt(petAge);
                String petGender = CPtbl.getValueAt(j, 4).toString();
                String petSpNe = CPtbl.getValueAt(j, 5).toString();
                String vName = vetName.getText();
                String vNum = vetNum.getText();
                if (vName.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please provide the name of your veterinarian.");
                    vName = JOptionPane.showInputDialog(this, "Your Veterinarian:");
                    vetName.setText(vName);
                }
                if(vNum.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please provide your veterinarian's contact details.");
                    vNum = JOptionPane.showInputDialog(this, "Contact #:");
                    vetNum.setText(vNum);
                }

                pst = con.prepareStatement(query3);
                pst.setInt(1, applicantId);
                pst.setString(2, petType);
                pst.setString(3, petBreed);
                pst.setString(4, petRescue);
                pst.setInt(5, pet_age); // Use the parsed integer value directly
                pst.setString(6, petGender);
                pst.setString(7, petSpNe);
                pst.setString(8, vName);
                pst.setString(9, vNum);
                pst.execute();
            }
            
            pst = con.prepareStatement(query4);
            pst.setInt(1, applicantId);
            pst.setString(2, adjustment);
            pst.setString(3, euthanize);
            pst.setString(4, surrendered);
            pst.setString(5, lost);
            pst.setString(6, anticipate);
            pst.setString(7, move);
            pst.execute();

            JOptionPane.showMessageDialog(this, "Successfully Submitted!");
            AppName.setText("");
            AppAge.setText("");
            AppNation.setText("");
            AppAdd.setText("");
            telnum.setText("");
            cellnum.setText("");
            AppEmail.setText("");
            AppOccu.setText("");
            int removeRow1 = HHtbl.getRowCount();
            for (int y = removeRow1 - 1; y >= 0; y--) {
                HHtbl.removeRow(y);
            }
            int removeRow = CPtbl.getRowCount();
            for (int x = removeRow - 1; x >= 0; x--) {
                CPtbl.removeRow(x);
            }
            vetName.setText("");
            vetNum.setText("");
            buttonGroup1.clearSelection();
            buttonGroup2.clearSelection();
            TenureCB.setSelectedIndex(0);
            buttonGroup4.clearSelection();
            buttonGroup5.clearSelection();
            buttonGroup6.clearSelection();
            buttonGroup7.clearSelection();
            buttonGroup3.clearSelection();
            buttonGroup8.clearSelection();
            buttonGroup9.clearSelection();
            buttonGroup10.clearSelection();
            buttonGroup11.clearSelection();
            buttonGroup12.clearSelection();
            buttonGroup13.clearSelection();
            buttonGroup14.clearSelection();
        } catch (SQLException ex) {
            Logger.getLogger(Adoption_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitBTNActionPerformed

    private void HHaddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HHaddBtnActionPerformed
        String membername = JOptionPane.showInputDialog(this, "Enter name: ");
        String memage = null;
        boolean validAge = false;
        while (!validAge) {
            memage = JOptionPane.showInputDialog(this, "Enter age: ");
            if (isValidPositiveInteger(memage)) {
                validAge = true;
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a valid positive integer for age.");
            }
        }
        String memrelation = JOptionPane.showInputDialog(this, "Enter relationship with applicant: ");

        String data[] = {membername, memrelation, memage};
        DefaultTableModel HHtbl = (DefaultTableModel)HHtable.getModel();
        HHtbl.addRow(data);
    }//GEN-LAST:event_HHaddBtnActionPerformed

    private boolean isValidPositiveInteger(String value) {
        try {
            int intValue = Integer.parseInt(value);
            return intValue > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void CPaddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPaddBtnActionPerformed
        String ptype = JOptionPane.showInputDialog(this, "Enter Pet Type (Cat/Dog): ").toUpperCase();
        while (!ptype.equals("CAT") && !ptype.equals("DOG")) {
            JOptionPane.showMessageDialog(this, "Invalid Input! Please try again.");
            ptype = JOptionPane.showInputDialog(this, "Enter Pet Type (Cat/Dog): ").toUpperCase();
        }
        String pbreed = JOptionPane.showInputDialog(this, "Enter Breed: ");
        String prescue = JOptionPane.showInputDialog(this, "Is your pet a rescue? (Y/N): ").toUpperCase();
        while (!prescue.equals("Y") && !prescue.equals("N")) {
            JOptionPane.showMessageDialog(this, "Invalid Input! Please try again.");
            prescue = JOptionPane.showInputDialog(this, "Is your pet a rescue? (Y/N): ").toUpperCase();
        }
        String p_age = null;
        boolean validAge = false;
        while (!validAge) {
            p_age = JOptionPane.showInputDialog(this, "Enter age: ");
            if (isValidPositiveInteger(p_age)) {
                validAge = true;
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a valid positive integer for age.");
            }
        }
        String pgender = JOptionPane.showInputDialog(this, "Enter Pet Gender(M/F): ").toUpperCase();
        while (!pgender.equals("M") && !pgender.equals("F")) {
            JOptionPane.showMessageDialog(this, "Invalid Input! Please try again.");
            pgender = JOptionPane.showInputDialog(this, "Enter Pet Gender(M/F): ").toUpperCase();
        }
        String spne = JOptionPane.showInputDialog(this, "Is your pet spayed or neutered? (Y/N): ").toUpperCase();
        while (!spne.equals("Y") && !spne.equals("N")) {
            JOptionPane.showMessageDialog(this, "Invalid Input! Please try again.");
            spne = JOptionPane.showInputDialog(this, "Is your pet spayed or neutered? (Y/N): ").toUpperCase();
        }
        String data[] = {ptype, pbreed, prescue, p_age, pgender, spne};
        DefaultTableModel CPtbl = (DefaultTableModel) CPtable.getModel();
        CPtbl.addRow(data);  
        if(CPtbl.getRowCount() >= 5) {
            JOptionPane.showMessageDialog(this, "You are ineligible to house another pet for you are currently housing 5 or more pets.");
            int removeRow = CPtbl.getRowCount();
            for (int x = removeRow - 1; x >= 0; x--) {
                CPtbl.removeRow(x);
            }
            return;
        }
    }//GEN-LAST:event_CPaddBtnActionPerformed

    private void HThouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HThouseActionPerformed
        
    }//GEN-LAST:event_HThouseActionPerformed

    private void HTcondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTcondoActionPerformed
        
    }//GEN-LAST:event_HTcondoActionPerformed

    private void HTownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTownActionPerformed
        
    }//GEN-LAST:event_HTownActionPerformed

    private void HTrentedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTrentedActionPerformed
        
    }//GEN-LAST:event_HTrentedActionPerformed

    private void HOyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOyesActionPerformed
        
    }//GEN-LAST:event_HOyesActionPerformed

    private void HOnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOnoActionPerformed
        
    }//GEN-LAST:event_HOnoActionPerformed

    private void AppOccuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppOccuFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_AppOccuFocusGained

    private void AppOccuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AppOccuFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_AppOccuFocusLost

    private void CPyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPyesActionPerformed
        CPaddBtn.setEnabled(true);
        CPdeleteBtn.setEnabled(true);
        vetName.setEnabled(true);
        vetNum.setEnabled(true);
    }//GEN-LAST:event_CPyesActionPerformed

    private void CPnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPnoActionPerformed
        CPaddBtn.setEnabled(false);
        CPdeleteBtn.setEnabled(false);
        vetName.setEnabled(false);
        vetNum.setEnabled(false);
    }//GEN-LAST:event_CPnoActionPerformed

    private void AllerYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllerYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AllerYesActionPerformed

    private void BehNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BehNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BehNoActionPerformed

    private void HHnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HHnoActionPerformed
        HHaddBtn.setEnabled(false);
        HHdeleteBtn.setEnabled(false);
        AllerYes.setEnabled(false);
        AllerNo.setEnabled(false);
        SuppYes.setEnabled(false);
        SuppNo.setEnabled(false);
        BehYes.setEnabled(false);
        BehNo.setEnabled(false);
        VisitYes.setEnabled(false);
        VisitNo.setEnabled(false);
    }//GEN-LAST:event_HHnoActionPerformed

    private void HHyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HHyesActionPerformed
        HHaddBtn.setEnabled(true);
        HHdeleteBtn.setEnabled(true);
        AllerYes.setEnabled(true);
        AllerNo.setEnabled(true);
        SuppYes.setEnabled(true);
        SuppNo.setEnabled(true);
        BehYes.setEnabled(true);
        BehNo.setEnabled(true);
        VisitYes.setEnabled(true);
        VisitNo.setEnabled(true);
    }//GEN-LAST:event_HHyesActionPerformed

    private void AppNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppNameActionPerformed

    private void vetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vetNameActionPerformed

    private void TenureCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenureCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenureCBActionPerformed

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
            java.util.logging.Logger.getLogger(Adoption_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adoption_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adoption_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adoption_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Adoption_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdjNo;
    private javax.swing.JRadioButton AdjYes;
    private javax.swing.JRadioButton AllerNo;
    private javax.swing.JRadioButton AllerYes;
    private javax.swing.JRadioButton AntNo;
    private javax.swing.JRadioButton AntYes;
    private javax.swing.JTextArea AppAdd;
    private javax.swing.JTextField AppAge;
    private javax.swing.JTextField AppEmail;
    private javax.swing.JTextField AppName;
    private javax.swing.JTextField AppNation;
    private javax.swing.JTextField AppOccu;
    private javax.swing.JRadioButton BehNo;
    private javax.swing.JRadioButton BehYes;
    private javax.swing.JButton CPaddBtn;
    private javax.swing.JButton CPdeleteBtn;
    private javax.swing.JRadioButton CPno;
    private javax.swing.JTable CPtable;
    private javax.swing.JRadioButton CPyes;
    private javax.swing.JRadioButton EutNo;
    private javax.swing.JRadioButton EutYes;
    private javax.swing.JButton HHaddBtn;
    private javax.swing.JButton HHdeleteBtn;
    private javax.swing.JRadioButton HHno;
    private javax.swing.JTable HHtable;
    private javax.swing.JRadioButton HHyes;
    private javax.swing.JRadioButton HOno;
    private javax.swing.JRadioButton HOyes;
    private javax.swing.JRadioButton HTcondo;
    private javax.swing.JRadioButton HThouse;
    private javax.swing.JRadioButton HTown;
    private javax.swing.JRadioButton HTrented;
    private Home.landingPage.Button HomeBtn;
    private javax.swing.JRadioButton LostNo;
    private javax.swing.JRadioButton LostYes;
    private javax.swing.JRadioButton MoveNo;
    private javax.swing.JRadioButton MoveYes;
    private Home.landingPage.Button SubmitBTN;
    private javax.swing.JRadioButton SuppNo;
    private javax.swing.JRadioButton SuppYes;
    private javax.swing.JRadioButton SurrNo;
    private javax.swing.JRadioButton SurrYes;
    private javax.swing.JComboBox<String> TenureCB;
    private javax.swing.JRadioButton VisitNo;
    private javax.swing.JRadioButton VisitYes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JTextField cellnum;
    private javax.swing.JTextField genID;
    private com.k33ptoo.components.gradientPanel gradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField telnum;
    private javax.swing.JTextField vetName;
    private javax.swing.JTextField vetNum;
    // End of variables declaration//GEN-END:variables
}
