// New Edited Track New Dt = 16/3/2018; Time = 12:20 AM
package formsTrack;

import BayesClassifier.BayesAlgorithm;
import static BayesClassifier.BayesAlgorithm.BayesClassifier;
import static BayesClassifier.BayesAlgorithm.calcProbability;
import static BayesClassifier.BayesAlgorithm.getMatchedWords;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Post;
import commenttracker.Track;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrackNew extends javax.swing.JFrame {

    TrackFunctions TNF = new TrackFunctions();
    ResultSet RSG;
    String accessToken = "";
    String[][] dbwords;
    int ID;
    boolean ExtFlag = true;
    boolean SetCompletely = false;

    public TrackNew(int ID, String accessToken) {
        initComponents();
        this.ID = ID;
        this.accessToken = accessToken;
        jTextField1.setText(accessToken);
        dbwords = BayesClassifierDataBaseConnection.dbConnection.getDBWords("jdbc:mysql://localhost:3306/commenttracker", "root", "", "vocabulary");
        TNF.getSet(jComboBox1);
        setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        SetCompletely = true;
    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        MatchedTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        UnmatchedTable = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PostsTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog2.setBounds(new java.awt.Rectangle(100, 110, 900, 380));
        jDialog2.setMinimumSize(new java.awt.Dimension(800, 450));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Post ID :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("cmt ID");

        commentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sr.No.", "Comment ID", "Comment Message", "Status", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        commentTable.setToolTipText("**Note : Please Double Click On Comment To Download Comment Data");
        commentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                commentTableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(commentTable);
        if (commentTable.getColumnModel().getColumnCount() > 0) {
            commentTable.getColumnModel().getColumn(0).setMinWidth(60);
            commentTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            commentTable.getColumnModel().getColumn(0).setMaxWidth(200);
            commentTable.getColumnModel().getColumn(1).setMinWidth(300);
            commentTable.getColumnModel().getColumn(1).setPreferredWidth(300);
            commentTable.getColumnModel().getColumn(1).setMaxWidth(700);
            commentTable.getColumnModel().getColumn(3).setMinWidth(60);
            commentTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            commentTable.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jButton1.setText("Verify All Comments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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

        jButton2.setBackground(new java.awt.Color(145, 161, 195));
        jButton2.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(56, 85, 145));
        jButton2.setText("<< Prev");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(145, 161, 195));
        jButton3.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(56, 85, 145));
        jButton3.setText("Next >>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(56, 85, 145));
        jLabel4.setText("Comment Id");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(56, 85, 145));
        jLabel11.setText("Comment Msg");

        jTextField2.setEditable(false);
        jTextField2.setForeground(new java.awt.Color(56, 85, 145));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(56, 85, 145));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea1);

        jButton4.setBackground(new java.awt.Color(145, 161, 195));
        jButton4.setFont(new java.awt.Font("Bell MT", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(56, 85, 145));
        jButton4.setText("First");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
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
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
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
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        MatchedTable.setModel(new javax.swing.table.DefaultTableModel(
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
        MatchedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatchedTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MatchedTableMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MatchedTableMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(MatchedTable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Matched Words", jPanel6);

        UnmatchedTable.setModel(new javax.swing.table.DefaultTableModel(
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
        UnmatchedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnmatchedTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UnmatchedTableMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                UnmatchedTableMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(UnmatchedTable);
        if (UnmatchedTable.getColumnModel().getColumnCount() > 0) {
            UnmatchedTable.getColumnModel().getColumn(0).setResizable(false);
            UnmatchedTable.getColumnModel().getColumn(1).setResizable(false);
            UnmatchedTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            UnmatchedTable.getColumnModel().getColumn(4).setResizable(false);
        }

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
            .addComponent(jScrollPane5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 85, 145));
        jLabel2.setText("Access Token :");

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1.setText("EAATrgOlwRfkBAJm4DDHZA8UCHdOZB1zysWbJF4t7uFCuREoxqJOvNKv19x4ZAJVmozkYExspYiBpCQcWBJ1IzFkW6vj1xNGlXH2CRq2gJnrnJ37AiyIuHUWp0cY1QYFuW55Opm0Gp3ymjuZApM6xl9SQjkvxa79GreVC54dteRhJyqzYu5Pfg1ELZB4iyc6mOfAvM2pzJXQZDZD");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 85, 145));
        jLabel3.setText("Select Page :");

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select Page>" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 85, 145));
        jLabel5.setText("Track Up To Date : ");

        jButton6.setBackground(new java.awt.Color(56, 85, 145));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 255));
        jButton6.setText("Track Posts");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(56, 85, 145));
        jButton11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 255));
        jButton11.setText("Validate Token Again");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Page ID :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("post id");

        jScrollPane1.setToolTipText("Note : Please Double Click On Post To Download Post Data");

        PostsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
        PostsTable.setToolTipText(getPostMessage());
        PostsTable.setColumnSelectionAllowed(true);
        PostsTable.getTableHeader().setReorderingAllowed(false);
        PostsTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PostsTableMouseMoved(evt);
            }
        });
        PostsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PostsTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PostsTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(PostsTable);
        PostsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (PostsTable.getColumnModel().getColumnCount() > 0) {
            PostsTable.getColumnModel().getColumn(0).setMinWidth(50);
            PostsTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            PostsTable.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("**Note : Please Double Click On Post To Download Post Data");
        jLabel12.setToolTipText("Note : Please Double Click On Post To Download Post Data");

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(56, 85, 145));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jLabel1.setFont(new java.awt.Font("Lao UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 85, 145));
        jLabel1.setText("facebook");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Back Button 
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Track(ID).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    //Track Posts
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String pageID = "";
        String pageName = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/commenttracker", "root", "");
            Statement stmtBook = con.createStatement();
            ResultSet rs = stmtBook.executeQuery("SELECT * FROM `pages` ORDER BY `pages`.`PageName` ASC");

            while (rs.next()) {
                String ITEM = (String) jComboBox1.getSelectedItem();
                if (ITEM.contains(rs.getString(1))) {
                    pageID = rs.getString(2);
                    System.out.println(rs.getString(1) + "(" + rs.getString(2) + ")");
                    pageName = rs.getString(1);
                }
            }
            rs.close();
        } catch (Exception e) {
        }
        Date Date = jDateChooser1.getDate();
        BayesClassifierDataBaseConnection.dbConnection.DeleteFromDB();
        FacebookClient fbClient = new DefaultFacebookClient(jTextField1.getText());
        Connection<Post> result = fbClient.fetchConnection(pageID + "/posts", Post.class);
        for (List<Post> posts : result) {
            if (ExtFlag) {
                for (Post Post : posts) {
                    String Id = Post.getId();
                    String Message = Post.getMessage();
                    Date = Post.getCreatedTime();
                    if (Date.after(jDateChooser1.getDate())) {
                        TNF.insertPost(pageName, Id, Message, Date.toString());
                    } else if (Date.before(jDateChooser1.getDate())) {
                        break;

                    }
                    if (Date.before(jDateChooser1.getDate())) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        ExtFlag = true;
        TNF.getTableDetailsPost(pageName, PostsTable);
        jLabel8.setText(pageName);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void PostsTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostsTableMouseReleased
    }//GEN-LAST:event_PostsTableMouseReleased

    private void PostsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostsTableMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            PostsTable.setEnabled(false);
            DefaultTableModel model = (DefaultTableModel) PostsTable.getModel();
            int index = PostsTable.getSelectedRow();
            String PostID = model.getValueAt(index, 1).toString();

            Date Date;
            int Count = 0;
            FacebookClient fbClient = new DefaultFacebookClient(jTextField1.getText());
            Connection<Post> result = fbClient.fetchConnection(PostID + "/comments", Post.class);

            for (List<Post> posts : result) {
                if (ExtFlag) {
                    for (Post Post : posts) {
                        String Id = Post.getId();
                        String Message = Post.getMessage();
                        Date = Post.getCreatedTime();
                        TNF.insertComment(PostID, Id, Message, Date.toString());
                        Count++;
                    }
                } else {
                    break;
                }
            }
            ExtFlag = true;
            System.out.println("\n\n\nTotal Comments Tracked : " + Count);
            TNF.getTableDetailsComments(PostsTable, commentTable);
            jDialog2.setVisible(true);
            PostsTable.setEnabled(true);

            try {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerComment", "root", "");
                Statement stmtBook = con.createStatement();
                RSG = stmtBook.executeQuery("SELECT * FROM `" + PostID + "`");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_PostsTableMouseClicked

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
    }//GEN-LAST:event_commentTableMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            RSG.previous();
            getDBRecord();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            RSG.next();
            getDBRecord();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            RSG.first();
            getDBRecord();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            RSG.last();
            getDBRecord();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int count = 0;
        try {
            DefaultTableModel TablePost = (DefaultTableModel) PostsTable.getModel();
            ResultSet rs = TNF.getCommentDetails(TablePost.getValueAt(PostsTable.getSelectedRow(), 1).toString());;
            while (rs.next()) { // Remove && count < 5 : Test Purpose
                boolean Prob = false;
                float ProbVal = 0;
                try {
                    Prob = BayesClassifier(rs.getString(2), dbwords);
                    ProbVal = calcProbability(getMatchedWords(rs.getString(2), dbwords), 1);
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CommentTrackerComment", "root", "");
                    Statement stmt = con.createStatement();
                    String PostID = TablePost.getValueAt(PostsTable.getSelectedRow(), 1).toString();
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
        TNF.getTableDetailsComments(PostsTable, commentTable);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setForeground(Color.red);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setForeground(new java.awt.Color(56, 85, 145));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
        getMatchedWordsList();
        getUnmatchedWordsList();
        jDialog4.setVisible(true);
        jTabbedPane1.setSelectedComponent(jPanel6);

    }//GEN-LAST:event_jLabel14MouseReleased
    private void getMatchedWordsList() {
        dbwords = BayesClassifierDataBaseConnection.dbConnection.getDBWords("jdbc:mysql://localhost:3306/commenttracker", "root", "", "vocabulary");
        String[][] WordData = BayesAlgorithm.getAllMatchedWords(jTextArea1.getText(), dbwords);

        try {
            int SrNo = 0;
            DefaultTableModel model;
            model = (DefaultTableModel) MatchedTable.getModel();
            SrNo = model.getRowCount() - 1;
            for (int i = SrNo; i >= 0; i--) {
                model.removeRow(i);
            }
            SrNo = 0;
            for (int i = 0; i < WordData.length; i++) {
                SrNo++;
                String Words = WordData[i][0];
                int Political = Integer.parseInt(WordData[i][1]);
                boolean Category = false;
                if (WordData[i][3].equals("Political")) {
                    Category = true;
                }
                Object[] row = {SrNo, Words, Political, Category};
                model.addRow(row);
                System.out.println(" " + WordData[i][0]);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

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
            DefaultTableModel model = (DefaultTableModel) UnmatchedTable.getModel();
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


    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setForeground(new java.awt.Color(56, 85, 145));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel15.setForeground(Color.red);
    }//GEN-LAST:event_jLabel15MouseEntered

    private void MatchedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchedTableMouseClicked

    }//GEN-LAST:event_MatchedTableMouseClicked

    private void MatchedTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchedTableMouseEntered

    }//GEN-LAST:event_MatchedTableMouseEntered

    private void MatchedTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatchedTableMouseReleased

    }//GEN-LAST:event_MatchedTableMouseReleased

    private void UnmatchedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnmatchedTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UnmatchedTableMouseClicked

    private void UnmatchedTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnmatchedTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_UnmatchedTableMouseEntered

    private void UnmatchedTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnmatchedTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_UnmatchedTableMouseReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dbwords = BayesClassifierDataBaseConnection.dbConnection.getDBWords("jdbc:mysql://localhost:3306/commenttracker", "root", "", "vocabulary");
        DefaultTableModel model = (DefaultTableModel) UnmatchedTable.getModel();
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String AppID = "1384838811633145";
        String RedirectURI = "https://www.google.com/";
        String URL = "https://www.facebook.com/v3.2/dialog/oauth?response_type=token&display=popup&client_id=" + AppID + "&redirect_uri=" + RedirectURI
                + "&scope=pages_messaging_phone_number,ads_read,pages_manage_instant_articles,publish_pages,pages_messaging,pages_messaging_phone_number,"
                + "manage_pages,pages_messaging_subscriptions";

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        while (true) {
            if (!driver.getCurrentUrl().contains("facebook.com")) {
                String url = driver.getCurrentUrl();
                accessToken = url.replaceAll(".*#access_token=(.+)&expir.*", "$1");

                jTextField1.setText(accessToken);
                driver.quit();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void PostsTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostsTableMouseMoved
    }//GEN-LAST:event_PostsTableMouseMoved

    public String getPostMessage() {
        DefaultTableModel model = (DefaultTableModel) PostsTable.getModel();
        int index = PostsTable.getSelectedRow();
        String PostMessage = "";
        if (SetCompletely) {
            PostMessage = model.getValueAt(index, 2).toString() + "\nNote : Please Double Click On Post To Download Post Data";
        }
        System.out.println("Tool Tip : " + PostMessage);
        return PostMessage;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrackNew(1, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MatchedTable;
    private javax.swing.JTable PostsTable;
    private javax.swing.JTable UnmatchedTable;
    private javax.swing.JTable commentTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    private void setvalue(String Message) {
        int MWordsCount = TNF.MatchedWordsCount(Message, dbwords);
        int TWordsCount = BayesClassifier.simplifyStatement.countWords(Message);
        jProgressBar1.setValue(MWordsCount * 100 / TWordsCount);
        jLabel14.setText(Integer.toString(MWordsCount) + "  Matched Word(s)(" + Integer.toString(jProgressBar1.getValue()) + " %)");
        jLabel15.setText(Integer.toString(TWordsCount - MWordsCount) + "  UnMatched Word(s)(" + Integer.toString(100 - jProgressBar1.getValue()) + " %)");
    }

}
