package formsTrack;

import BayesClassifier.BayesAlgorithm;
import static BayesClassifier.BayesAlgorithm.BayesClassifier;
import static BayesClassifier.BayesAlgorithm.calcProbability;
import static BayesClassifier.BayesAlgorithm.getMatchedWords;
import commenttracker.HomePage;
import commenttracker.Track;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TrackExisting extends javax.swing.JFrame {

    int ID;
    ResultSet RSG;
    TrackFunctions TNF;
    String[][] dbwords;

    public TrackExisting(int ID) {
        initComponents();
        this.ID = ID;
        getTableContents();
        setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        postTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jDialog4 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PageTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setBounds(new java.awt.Rectangle(90, 90, 920, 420));
        jDialog1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDialog1.setType(java.awt.Window.Type.POPUP);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Posts Tracked : ");

        postTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr.No.", "Post ID", "Post Message", "Time Created"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        postTable.setColumnSelectionAllowed(true);
        postTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                postTableMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(postTable);
        postTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(56, 85, 145));
        jButton3.setText("Delete Post Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog2.setBounds(new java.awt.Rectangle(100, 110, 900, 380));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Comments Tracked : ");

        commentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sr.No.", "Comment ID", "Comment Message", "Time Created", "Status", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        commentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                commentTableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(commentTable);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton10.setText("Verify All Comments");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("**Note : Please Double Click On Comment To Download Comment Data");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog3.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog3.setBounds(new java.awt.Rectangle(100, 110, 900, 380));
        jDialog3.setMinimumSize(new java.awt.Dimension(900, 450));

        jPanel5.setMaximumSize(new java.awt.Dimension(900, 500));
        jPanel5.setMinimumSize(new java.awt.Dimension(900, 500));

        jButton4.setBackground(new java.awt.Color(145, 161, 195));
        jButton4.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(56, 85, 145));
        jButton4.setText("<< Prev");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(145, 161, 195));
        jButton5.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(56, 85, 145));
        jButton5.setText("Next >>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(56, 85, 145));
        jLabel4.setText("Comment Id");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(56, 85, 145));
        jLabel12.setText("Comment Msg");

        jTextField2.setEditable(false);
        jTextField2.setForeground(new java.awt.Color(56, 85, 145));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(56, 85, 145));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea1);

        jButton6.setBackground(new java.awt.Color(145, 161, 195));
        jButton6.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(56, 85, 145));
        jButton6.setText("First");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(145, 161, 195));
        jButton8.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton8.setForeground(new java.awt.Color(56, 85, 145));
        jButton8.setText("Last");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(255, 0, 51));
        jProgressBar1.setForeground(new java.awt.Color(0, 255, 0));
        jProgressBar1.setValue(50);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(56, 85, 145));
        jLabel14.setText("jLabel1");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(56, 85, 145));
        jLabel16.setText("Status");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(56, 85, 145));
        jLabel15.setText("jLabel1");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel15MouseReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(56, 85, 145));
        jLabel19.setText("Time Created");

        jTextField5.setEditable(false);
        jTextField5.setForeground(new java.awt.Color(56, 85, 145));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(56, 85, 145));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(56, 85, 145));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(56, 85, 145));
        jLabel17.setText("Intensity");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 133, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField7))))
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialog4.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog4.setBounds(new java.awt.Rectangle(100, 110, 900, 380));
        jDialog4.setMinimumSize(new java.awt.Dimension(600, 350));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr.No.", "Words", "Strength", "Category(Political)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable3MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable3MouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Matched Words", jPanel6);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Add Word", "Sr.No.", "Words", "Strength", "Category(Political)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable4MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable4MouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTable4);

        jButton9.setText("Update Dictionary");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("UnMatched Words", jPanel7);

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 85, 145));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtering Political Sentiment");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(56, 85, 145));
        jLabel6.setText("Loged In :");

        PageTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr. No.", "Page Name", "Page ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PageTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PageTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PageTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(PageTable);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(56, 85, 145));
        jLabel7.setText("Your Pages");

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(56, 85, 145));
        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(620, 620, 620)
                                .addComponent(jButton7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(56, 85, 145));
        jButton1.setText("Delete Page Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(56, 85, 145));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton1)
                .addGap(150, 150, 150)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "LOGOUT") == 0) {
            setVisible(false);
            new HomePage().setVisible(true);
            updateSysLogin();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void PageTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PageTableMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            DefaultTableModel model = (DefaultTableModel) PageTable.getModel();
            int index = PageTable.getSelectedRow();
            String PageName = model.getValueAt(index, 1).toString();
            try {
                int SrNo = 0;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttrackerposts", "root", "");
                Statement stmtBook = con.createStatement();
                ResultSet rs = stmtBook.executeQuery("SELECT `PostID`, `Message`, `CreatedTime` FROM `" + PageName + "`");

                DefaultTableModel modelPost = (DefaultTableModel) postTable.getModel();
                for (int i = modelPost.getRowCount() - 1; i >= 0; i--) {
                    modelPost.removeRow(i);
                }
                while (rs.next()) {
                    SrNo++;
                    String Name = rs.getString(1);
                    String ID = rs.getString(2);
                    String Date = rs.getString(3);
                    Object[] row = {SrNo, Name, ID, Date};
                    modelPost.addRow(row);
                }
                rs.close();
                jDialog1.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_PageTableMouseClicked

    private void PageTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PageTableMouseReleased

    }//GEN-LAST:event_PageTableMouseReleased

    private void commentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commentTableMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            jDialog3.setVisible(true);
            try {
                RSG.first();
                DefaultTableModel TableComment = (DefaultTableModel) commentTable.getModel();
                String ComentID = TableComment.getValueAt(commentTable.getSelectedRow(), 1).toString();
                do {
                    if (ComentID.equals(RSG.getString(1))) {
                        getDBRecord();
                        break;
                    }
                } while (RSG.next());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_commentTableMouseClicked

    private void commentTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commentTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_commentTableMouseReleased

    private void postTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postTableMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            DefaultTableModel model = (DefaultTableModel) postTable.getModel();
            int index = postTable.getSelectedRow();
            String PostID = model.getValueAt(index, 1).toString();
            try {
                int SrNo = 0;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerComment", "root", "");
                Statement stmtBook = con.createStatement();
                RSG = stmtBook.executeQuery("SELECT * FROM `" + PostID + "`");

                DefaultTableModel modelComment = (DefaultTableModel) commentTable.getModel();
                for (int i = modelComment.getRowCount() - 1; i >= 0; i--) {
                    modelComment.removeRow(i);
                }
                while (RSG.next()) {
                    SrNo++;
                    String Name = RSG.getString(1);
                    String ID = RSG.getString(2);
                    String Date = RSG.getString(3);
                    String status = RSG.getString(4);
                    String Value = RSG.getString(5);
                    Object[] row = {SrNo, Name, ID, Date, status, Value};
                    modelComment.addRow(row);
                }
                jDialog2.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_postTableMouseClicked

    private void postTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postTableMouseReleased
        /*DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         int index = jTable1.getSelectedRow();
         String postID = model.getValueAt(index, 1).toString(); */
    }//GEN-LAST:event_postTableMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Offline Data Will Be Deleted Permenently") == 0) {
            DefaultTableModel model = (DefaultTableModel) PageTable.getModel();
            int index = PageTable.getSelectedRow();
            String PageName = model.getValueAt(index, 1).toString();
            deletePageRecord(PageName);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Track(ID).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Offline Data Will Be Deleted Permenently") == 0) {
            DefaultTableModel model = (DefaultTableModel) postTable.getModel();
            int index = postTable.getSelectedRow();
            String PostID = model.getValueAt(index, 1).toString();
            deleteCommentData(PostID);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            RSG.previous();
            getDBRecord();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            RSG.next();
            getDBRecord();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            RSG.first();
            getDBRecord();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            RSG.last();
            getDBRecord();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setForeground(Color.red);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setForeground(new java.awt.Color(56, 85, 145));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        getMatchedWordsList();
        getUnmatchedWordsList();
        try {
            BayesClassifierDataBaseConnection.dbConnection.DeleteFromDB();
        } catch (Exception e) {
            System.out.println("DeleteFromDB()" + e.getMessage());
        }
        jDialog4.setVisible(true);
        jTabbedPane1.setSelectedComponent(jPanel6);
    }//GEN-LAST:event_jLabel14MouseReleased

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel15.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setForeground(new java.awt.Color(56, 85, 145));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseReleased
        getMatchedWordsList();
        getUnmatchedWordsList();
        try {
            BayesClassifierDataBaseConnection.dbConnection.DeleteFromDB();
        } catch (Exception e) {
            System.out.println("DeleteFromDB()" + e.getMessage());
        }
        jDialog4.setVisible(true);
        jTabbedPane1.setSelectedComponent(jPanel7);

    }//GEN-LAST:event_jLabel15MouseReleased
    private void getMatchedWordsList() {
        dbwords = BayesClassifierDataBaseConnection.dbConnection.getDBWords("jdbc:mysql://localhost:3306/commenttracker", "root", "", "vocabulary");
        String[][] WordData = BayesAlgorithm.getAllMatchedWords(jTextArea1.getText(), dbwords);
        System.out.println("\n\n\n\n\n\n\n123");
        for (int i = 0; i < WordData.length; i++) {
            System.out.println(WordData[i][0]);
        }
        System.out.println("456\n\n\n\n\n\n\n");
        try {
            DefaultTableModel model;
            model = (DefaultTableModel) jTable3.getModel();
            int SrNo = model.getRowCount() - 1;
            for (int i = SrNo; i >= 0; i--) {
                model.removeRow(i);
            }
            for (int i = 0; i < WordData.length; i++) {
                String Words = WordData[i][0];
                int Political = Integer.parseInt(WordData[i][1]);
                boolean Category = false;
                if (WordData[i][3].equals("Political")) {
                    Category = true;
                }
                Object[] row = {i + 1, Words, Political, Category};
                model.addRow(row);
                System.out.println(" " + WordData[i][0]);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void getUnmatchedWordsList() {
        String[] unWords = BayesAlgorithm.getUnMatchedWords(jTextArea1.getText(), dbwords);
        int len = unWords.length;
        String[][] unmatchedWords = new String[len][4];
        for (int i = 0; i < len; i++) {
            System.out.println(i + " : " + unmatchedWords[i][1]);
            unmatchedWords[i][0] = unWords[i];
            unmatchedWords[i][1] = "0";
            unmatchedWords[i][2] = "0";
            unmatchedWords[i][3] = "Political";
        }
        try {
            int SrNo = 0;
            DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
            SrNo = model.getRowCount() - 1;
            for (int i = SrNo; i >= 0; i--) {
                model.removeRow(i);
            }
            SrNo = 0;
            for (int i = 0; i < unWords.length; i++) {
                SrNo++;
                String Words = unmatchedWords[i][0];
                int Political = Integer.parseInt(unmatchedWords[i][1]);
                Object[] row = {false, SrNo, Words, Political, false};
                model.addRow(row);
                System.out.println(" " + unmatchedWords[i][0]);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseEntered

    }//GEN-LAST:event_jTable3MouseEntered

    private void jTable3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseReleased

    }//GEN-LAST:event_jTable3MouseReleased

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseEntered

    private void jTable4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dbwords = BayesClassifierDataBaseConnection.dbConnection.getDBWords("jdbc:mysql://localhost:3306/commenttracker", "root", "", "vocabulary");
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        int SrNo = model.getRowCount();
        for (int i = 0; i < SrNo; i++) {
            if (model.getValueAt(i, 0).equals(true)) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttracker", "root", "");
                    Statement stmt = con.createStatement();
                    String Word = model.getValueAt(i, 2).toString();
                    String Category = "Supportive";
                    String Political = "0";
                    String NonPolitical = "0";
                    if (model.getValueAt(i, 4).equals(true)) {
                        Category = "Political";
                        Political = model.getValueAt(i, 3).toString();
                        NonPolitical = Integer.toString(10 - Integer.parseInt(Political));
                        if (Political.equals("0")) {
                            continue;
                        }
                    }
                    stmt.executeUpdate("INSERT INTO `vocabulary`(`Words`, `Political`, `NonPolitical`, `Category`) VALUES "
                            + "('" + Word + "','" + Political + "','" + NonPolitical + "','" + Category + "')");
                    System.out.println("('" + Word + "','" + Political + "','" + NonPolitical + "','" + Category + "')");
                    con.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        getMatchedWordsList();
        getUnmatchedWordsList();
        try {
            BayesClassifierDataBaseConnection.dbConnection.DeleteFromDB();
        } catch (Exception e) {
            System.out.println("DeleteFromDB()" + e.getMessage());
        }
        jDialog4.setVisible(true);
        jTabbedPane1.setSelectedComponent(jPanel7);
        getDBRecord();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int count = 0;
        try {
            DefaultTableModel TablePost = (DefaultTableModel) postTable.getModel();
            ResultSet rs = TNF.getCommentDetails(TablePost.getValueAt(postTable.getSelectedRow(), 1).toString());;
            while (rs.next()) { // Remove && count < 5 : Test Purpose
                boolean Prob = false;
                float ProbVal = 0;
                try {
                    Prob = BayesClassifier(rs.getString(2), dbwords);
                    ProbVal = calcProbability(getMatchedWords(rs.getString(2), dbwords), 1);
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerComment", "root", "");
                    Statement stmt = con.createStatement();
                    String PostID = TablePost.getValueAt(postTable.getSelectedRow(), 1).toString();
                    String query = "UPDATE `" + PostID + "` SET `Probability`='" + Boolean.toString(Prob) + "',`ProbabilityValue`='" + Float.toString(ProbVal) + "' "
                            + "WHERE `CommentID`='" + rs.getString(1) + "'";
                    System.out.println(count + " Verify " + rs.getString(1) + "->Update");
                    stmt.executeUpdate(query);
                } catch (Exception e) {
                    System.out.println(rs.getString(1) + " Exception Verify Udate" + e);
                }
                count++;
            }
        } catch (Exception e) {
            System.out.println(count + "  Verify " + e);
        }
        TNF.getTableDetailsComments(postTable, commentTable);
    }//GEN-LAST:event_jButton10ActionPerformed

    void getDBRecord() {
        try {
            jTextField2.setText(RSG.getString(1));
            jTextField5.setText(RSG.getString(3));
            jTextArea1.setText(RSG.getString(2));
            if (RSG.getString(4).equals("true")) {
                jTextField6.setText("Political Sentiment");
            } else {
                jTextField6.setText("Non-Political Sentiment");
            }
            jTextField7.setText(RSG.getString(5));
            setvalue(RSG.getString(2));
        } catch (Exception e) {
        }
    }

    private void setvalue(String Message) {
        dbwords = BayesClassifierDataBaseConnection.dbConnection.getDBWords("jdbc:mysql://localhost:3306/commenttracker", "root", "", "vocabulary");

        int MWordsCount = BayesAlgorithm.getMatchedWordsOnly(Message, dbwords).length;
        int TWordsCount = BayesClassifier.simplifyStatement.countWords(Message);
        String[] unmatchedWords = BayesAlgorithm.getUnMatchedWords(jTextArea1.getText(), dbwords);
        System.out.println(MWordsCount + "  " + TWordsCount);
        jProgressBar1.setValue(MWordsCount * 100 / TWordsCount);
        jLabel14.setText(Integer.toString(MWordsCount) + "  Matched Word(s)(" + Integer.toString(jProgressBar1.getValue()) + " %)");
        jLabel15.setText(Integer.toString(unmatchedWords.length) + "  UnMatched Word(s)(" + Integer.toString(100 - jProgressBar1.getValue()) + " %)");
        try {
            BayesClassifierDataBaseConnection.dbConnection.DeleteFromDB();
        } catch (Exception e) {
            System.out.println("DeleteFromDB()" + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrackExisting(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PageTable;
    private javax.swing.JTable commentTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    public javax.swing.JDialog jDialog3;
    public javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable postTable;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="Generated Code">   
    public void updateSysLogin() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTracker", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM systemlogin");
            while (rs.next()) {
                if (ID == Integer.parseInt(rs.getString(1))) {
                    Timestamp date = Timestamp.valueOf(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
                    System.out.println("Date :" + date);
                    stmt.executeUpdate("UPDATE `systemlogin` SET `OutTime`='" + date + "' WHERE `ID`='" + ID + "'");
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getCause() + "\n" + e.getMessage());
        }
    }

    public void getTableContents() {
        try {
            int SrNo = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttracker", "root", "");
            Statement stmtBook = con.createStatement();
            ResultSet rs = stmtBook.executeQuery("SELECT PageName as `Page Name`,PageID as `Page Id` FROM `Pages`");

            DefaultTableModel model = (DefaultTableModel) PageTable.getModel();
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            while (rs.next()) {
                SrNo++;
                String Name = rs.getString(1);
                String ID = rs.getString(2);
                Object[] row = {SrNo, Name, ID};
                model.addRow(row);
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void deletePageRecord(String PageName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttracker", "root", "");
            Statement stmtBook = con.createStatement();
            ResultSet rs = stmtBook.executeQuery("SELECT `PageName`, `PageID` FROM `pages`");
            while (rs.next()) {
                deletePostData(PageName);
            }
            rs.close();
            JOptionPane.showMessageDialog(null, "All Data Deleted Related To Page " + PageName);
            getTableContents();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void deletePostData(String PageName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttrackerposts", "root", "");
            Statement stmtBook = con.createStatement();
            ResultSet rs = stmtBook.executeQuery("SELECT `PostID`, `Message`, `CreatedTime` FROM `" + PageName + "`");
            while (rs.next()) {
                deleteCommentData(rs.getString(1));
            }
            rs.close();
            stmtBook.executeUpdate("DROP TABLE `" + PageName + "`");
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }

    public void deleteCommentData(String PostID) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerComment", "root", "");
            Statement stmtBook = con.createStatement();
            stmtBook.executeUpdate("DROP TABLE `" + PostID + "`");
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
    // </editor-fold>      
}
