/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import advertisement.abstracts.House;
import advertisement.concretes.Advertisement;
import advertisement.concretes.Apartment;
import advertisement.concretes.Comment;
import advertisement.concretes.HouseFactory;
import advertisement.concretes.Manor;
import advertisement.concretes.TreeHouse;
import advertisement.concretes.Villa;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import user.concretes.Customer;
import user.concretes.HouseOwner;

/**
 *
 * @author EmreOzkaya
 */
public class advertisementDetailScreen extends javax.swing.JFrame {

    /**
     * Creates new form advertisementDetailPage
     */
    DefaultTableModel dfmodel = new DefaultTableModel();
    DefaultTableModel dfmodelforPersonnel = new DefaultTableModel();

    private int advertisementId;
    private int houseId;
    private boolean isCommentZoom = false;

    private int personId;
    ArrayList<byte[]> images = new ArrayList();
    ArrayList<Comment> commentList = new ArrayList();
    Advertisement ad = new Advertisement();
    PreparedStatement pst;
    Connection db = Singleton.SingletonConnection.getCon();
    Statement st;
    ResultSet rs;

    public void viewAdvertisementDetails(int advertisementId, int houseId, int personId) {
        contentScroll.getVerticalScrollBar().setUnitIncrement(20);
        this.advertisementId = advertisementId;
        this.houseId = houseId;
        this.personId = personId;
        ad = ad.showDetailedInfo(advertisementId);
        images = ad.getHouse().getImages();
        Image img = Toolkit.getDefaultToolkit().createImage(images.get(0)).getScaledInstance(178, 135, Image.SCALE_SMOOTH);
        ImageIcon imgicn = new ImageIcon(img);
        image1.setIcon(imgicn);
        img = Toolkit.getDefaultToolkit().createImage(images.get(1)).getScaledInstance(178, 135, Image.SCALE_SMOOTH);
        imgicn = new ImageIcon(img);
        image2.setIcon(imgicn);
        img = Toolkit.getDefaultToolkit().createImage(images.get(2)).getScaledInstance(178, 135, Image.SCALE_SMOOTH);
        imgicn = new ImageIcon(img);
        image3.setIcon(imgicn);
        img = Toolkit.getDefaultToolkit().createImage(images.get(3)).getScaledInstance(178, 135, Image.SCALE_SMOOTH);
        imgicn = new ImageIcon(img);
        image4.setIcon(imgicn);
        img = Toolkit.getDefaultToolkit().createImage(images.get(4)).getScaledInstance(178, 135, Image.SCALE_SMOOTH);
        imgicn = new ImageIcon(img);
        image5.setIcon(imgicn);
        img = Toolkit.getDefaultToolkit().createImage(images.get(5)).getScaledInstance(178, 135, Image.SCALE_SMOOTH);
        imgicn = new ImageIcon(img);
        image6.setIcon(imgicn);
        addressText.setText(ad.getHouse().getLocation());
        dailyPriceText.setText(String.valueOf(ad.getPrice()));
        houseTypeText.setText(ad.getAdvertisementType());
        vehicleParkText.setText(String.valueOf(ad.getHouse().isHasVehiclePark()));
        heatingTypeText.setText(ad.getHouse().getHeating());
        roomNumberText.setText(ad.getHouse().getRoomNumber());
        shortDescriptionText.setText(ad.getHouse().getShortDescription());
        populateCommentTable();

    }

    public advertisementDetailScreen() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public void populateCommentTable() {
        Comment comment = new Comment();
        comment.setAdvertisementId(advertisementId);
        commentList = comment.getAllComments();
        dfmodel.setRowCount(0);
        dfmodel = (DefaultTableModel) jTable1.getModel();
        dfmodel.getColumnClass(0);
        Advertisement ad = new Advertisement();
        for (Comment commitem : commentList) {
            Object tbData[] = {commitem.getUserName(), commitem.getContent(), commitem.getPoint()};
            dfmodel.addRow(tbData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        contentScroll = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        image1 = new javax.swing.JButton();
        image2 = new javax.swing.JButton();
        image3 = new javax.swing.JButton();
        image4 = new javax.swing.JButton();
        image5 = new javax.swing.JButton();
        image6 = new javax.swing.JButton();
        advertisementName = new javax.swing.JLabel();
        houseTypeLabel = new javax.swing.JLabel();
        houseTypeText = new javax.swing.JTextField();
        heatingTypeLabel = new javax.swing.JLabel();
        heatingTypeText = new javax.swing.JTextField();
        dailyPriceLabel = new javax.swing.JLabel();
        dailyPriceText = new javax.swing.JTextField();
        roomNumberLabel = new javax.swing.JLabel();
        roomNumberText = new javax.swing.JTextField();
        vehicleParkLabel = new javax.swing.JLabel();
        vehicleParkText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        shortDescriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shortDescriptionText = new javax.swing.JTextArea();
        commentPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        dayAmount = new javax.swing.JTextField();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Point", "Comment", "Block", "Delete"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 90, 95));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1330, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        image1.setBackground(new java.awt.Color(51, 51, 51));
        image1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        image1.setForeground(new java.awt.Color(255, 255, 255));
        image1.setText("IMAGE1");
        image1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image1MouseClicked(evt);
            }
        });
        image1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image1ActionPerformed(evt);
            }
        });

        image2.setBackground(new java.awt.Color(51, 51, 51));
        image2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        image2.setForeground(new java.awt.Color(255, 255, 255));
        image2.setText("IMAGE2");
        image2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image2MouseClicked(evt);
            }
        });
        image2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image2ActionPerformed(evt);
            }
        });

        image3.setBackground(new java.awt.Color(51, 51, 51));
        image3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        image3.setForeground(new java.awt.Color(255, 255, 255));
        image3.setText("IMAGE3");
        image3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image3MouseClicked(evt);
            }
        });
        image3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image3ActionPerformed(evt);
            }
        });

        image4.setBackground(new java.awt.Color(51, 51, 51));
        image4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        image4.setForeground(new java.awt.Color(255, 255, 255));
        image4.setText("IMAGE5");
        image4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image4ActionPerformed(evt);
            }
        });

        image5.setBackground(new java.awt.Color(51, 51, 51));
        image5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        image5.setForeground(new java.awt.Color(255, 255, 255));
        image5.setText("IMAGE4");
        image5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image5ActionPerformed(evt);
            }
        });

        image6.setBackground(new java.awt.Color(51, 51, 51));
        image6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        image6.setForeground(new java.awt.Color(255, 255, 255));
        image6.setText("IMAGE1");
        image6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                image6ActionPerformed(evt);
            }
        });

        advertisementName.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        advertisementName.setForeground(new java.awt.Color(255, 255, 255));
        advertisementName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        advertisementName.setText("Advertisement Name");

        houseTypeLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        houseTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        houseTypeLabel.setText("House Type : ");

        houseTypeText.setEditable(false);
        houseTypeText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        houseTypeText.setText("asdasda");
        houseTypeText.setToolTipText("");

        heatingTypeLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        heatingTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        heatingTypeLabel.setText("Heating Type : ");

        heatingTypeText.setEditable(false);
        heatingTypeText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        heatingTypeText.setText("asdasda");
        heatingTypeText.setToolTipText("");

        dailyPriceLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        dailyPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        dailyPriceLabel.setText("Daily Price : ");

        dailyPriceText.setEditable(false);
        dailyPriceText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dailyPriceText.setText("asdasda");
        dailyPriceText.setToolTipText("");

        roomNumberLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        roomNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomNumberLabel.setText("Room Number :");

        roomNumberText.setEditable(false);
        roomNumberText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        roomNumberText.setText("asdasda");
        roomNumberText.setToolTipText("");

        vehicleParkLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        vehicleParkLabel.setForeground(new java.awt.Color(255, 255, 255));
        vehicleParkLabel.setText("Vehicle Park :");

        vehicleParkText.setEditable(false);
        vehicleParkText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        vehicleParkText.setText("asdasda");
        vehicleParkText.setToolTipText("");

        addressLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address :");

        addressText.setEditable(false);
        addressText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        addressText.setText("asdasda");
        addressText.setToolTipText("");
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        shortDescriptionLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        shortDescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        shortDescriptionLabel.setText("Short Description : ");

        shortDescriptionText.setEditable(false);
        shortDescriptionText.setColumns(20);
        shortDescriptionText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        shortDescriptionText.setLineWrap(true);
        shortDescriptionText.setRows(5);
        shortDescriptionText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(shortDescriptionText);

        commentPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("Add comment...");
        jScrollPane7.setViewportView(jTextArea5);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMMENTS");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jSpinner1.setBorder(null);

        jTable1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Comment", "Point"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setEnabled(false);
        jTable1.setFocusable(false);
        jTable1.setRowSelectionAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout commentPanel1Layout = new javax.swing.GroupLayout(commentPanel1);
        commentPanel1.setLayout(commentPanel1Layout);
        commentPanel1Layout.setHorizontalGroup(
            commentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentPanel1Layout.createSequentialGroup()
                .addGroup(commentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(commentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)))))
                .addContainerGap())
        );
        commentPanel1Layout.setVerticalGroup(
            commentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(commentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\emrec\\OneDrive\\Masa??st??\\repo\\airbnb_desktop\\src\\main\\img\\img\\main_logo_1.png")); // NOI18N

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RENT");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 95, 90)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dayAmount.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dayAmount.setText("Enter How Many Day You Want To Hired");
        dayAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(advertisementName, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(commentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(image5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(image4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(image6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(dayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(heatingTypeLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(heatingTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(dailyPriceLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dailyPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(houseTypeLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(houseTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(roomNumberLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                    .addComponent(roomNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(vehicleParkLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vehicleParkText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(addressLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(shortDescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(advertisementName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dailyPriceLabel)
                            .addComponent(dailyPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(houseTypeLabel)
                            .addComponent(houseTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleParkLabel)
                            .addComponent(vehicleParkText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heatingTypeLabel)
                            .addComponent(heatingTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomNumberLabel)
                            .addComponent(roomNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(shortDescriptionLabel)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(image6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(image5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(image4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(commentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        contentScroll.setViewportView(jPanel2);

        jPanel1.add(contentScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 1280, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void image1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image1ActionPerformed

//        image1.setPreferredSize(new Dimension(500, 500));
//        image1.show();

    }//GEN-LAST:event_image1ActionPerformed

    private void image2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_image2ActionPerformed

    private void image3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_image3ActionPerformed

    private void image4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_image4ActionPerformed

    private void image5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_image5ActionPerformed

    private void image6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_image6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_image6ActionPerformed

    private void image3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_image3MouseClicked

    private void image2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_image2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (personId != 0) {
            if (jTextArea5.getText().length() <= 185) {
                Comment postComment = new Comment();
                postComment.setContent(jTextArea5.getText());
                postComment.setPersonId(personId);
                postComment.setPoint((int) jSpinner1.getValue());
                postComment.setAdvertisementId(advertisementId);
                postComment.post();
                populateCommentTable();
            } else {
                JOptionPane.showMessageDialog(null, "Please Short Your Comment");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Log In For Make A Comment");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (!isCommentZoom) {
            TableModel model = jTable1.getModel();
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(1200);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(0);

            jTable1.setFont(new FontUIResource(Font.SANS_SERIF, Font.BOLD, 11));
            isCommentZoom = true;
        } else {

            TableModel model = jTable1.getModel();
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(250);

            jTable1.setFont(new FontUIResource(Font.SANS_SERIF, Font.BOLD, 14));
            isCommentZoom = false;

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void image1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_image1MouseClicked

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void dayAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayAmountActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (personId != 0) {
            ad = ad.showDetailedInfo(advertisementId);
            if (Integer.parseInt(dayAmount.getText()) > 30) {
                JOptionPane.showMessageDialog(null, "You can rent most 30 day");
            } else {
                int totalPrice = ad.getPrice() * Integer.parseInt(dayAmount.getText());
                if(ad.getAdvertisementType().equalsIgnoreCase("apartment")){
                    Apartment apartment = new Apartment();
                    apartment.rent(totalPrice, ad, personId);
                }else if(ad.getAdvertisementType().equalsIgnoreCase("manor")){
                    Manor manor = new Manor();
                    manor.rent(totalPrice, ad, personId);
                }else if(ad.getAdvertisementType().equalsIgnoreCase("villa")){
                    Villa villa = new Villa();
                    villa.rent(totalPrice, ad, personId);
                }else if(ad.getAdvertisementType().equalsIgnoreCase("tree house")){
                    TreeHouse tree = new TreeHouse();
                    tree.rent(totalPrice, ad, personId);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Log In For Rent");

        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(advertisementDetailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(advertisementDetailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(advertisementDetailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(advertisementDetailScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new advertisementDetailScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JLabel advertisementName;
    private javax.swing.JPanel commentPanel1;
    private javax.swing.JScrollPane contentScroll;
    private javax.swing.JLabel dailyPriceLabel;
    private javax.swing.JTextField dailyPriceText;
    private javax.swing.JTextField dayAmount;
    private javax.swing.JLabel heatingTypeLabel;
    private javax.swing.JTextField heatingTypeText;
    private javax.swing.JLabel houseTypeLabel;
    private javax.swing.JTextField houseTypeText;
    private javax.swing.JButton image1;
    private javax.swing.JButton image2;
    private javax.swing.JButton image3;
    private javax.swing.JButton image4;
    private javax.swing.JButton image5;
    private javax.swing.JButton image6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel roomNumberLabel;
    private javax.swing.JTextField roomNumberText;
    private javax.swing.JLabel shortDescriptionLabel;
    private javax.swing.JTextArea shortDescriptionText;
    private javax.swing.JLabel vehicleParkLabel;
    private javax.swing.JTextField vehicleParkText;
    // End of variables declaration//GEN-END:variables
}
