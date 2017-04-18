/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5.Panels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import project5.utilities.TextPrompt;
/**
 *
 * @author rachelrudolph
 */
public class HomePanel extends javax.swing.JPanel {
    TextPrompt tp7;
    int width;
    int height;
    public String resultsText;

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        initComponents();
        HomePanel.setVisible(true);
        returnPanel.setVisible(false);
        searchPanel.setVisible(false);
        
        this.width = Item1.getWidth();
        this.height = Item1.getHeight();
        
        this.tp7 = new TextPrompt( "I'm Looking To Borrow...", jTextField1);
        this.tp7.setShow(TextPrompt.Show.FOCUS_LOST);
       
    }

    public String getSearch(){
        return this.resultsText;
    }
    
    ImageIcon testIcon = new javax.swing.ImageIcon(getClass().getResource("/project5/Images/008-sunglasses.png"));
    Image testImage = testIcon.getImage();
    Image testNew = testImage.getScaledInstance(32, 32,  java.awt.Image.SCALE_DEFAULT);
    ImageIcon finalTestIcon = new ImageIcon(testNew);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePanel = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        FeaturesPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Item1 = new javax.swing.JLabel();
        Item2 = new javax.swing.JLabel();
        Item3 = new javax.swing.JLabel();
        PopularPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Item4 = new javax.swing.JLabel();
        Item5 = new javax.swing.JLabel();
        Item6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BorrowedPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Item8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        Item14 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        Item15 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ViewAllBorrowed = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        SocialPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        Item16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        Item17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        Item18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        SearchPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        returnPanel = new project5.Panels.ReturnPanel();
        searchPanel = new project5.Panels.SearchPanel();

        setMinimumSize(new java.awt.Dimension(703, 371));
        setLayout(new javax.swing.OverlayLayout(this));

        HomePanel.setLayout(new java.awt.BorderLayout());

        MainPanel.setMaximumSize(new java.awt.Dimension(702, 326));
        MainPanel.setLayout(new java.awt.GridLayout(2, 2));

        FeaturesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FeaturesPanel.setMaximumSize(new java.awt.Dimension(351, 163));
        FeaturesPanel.setMinimumSize(new java.awt.Dimension(351, 163));
        FeaturesPanel.setPreferredSize(new java.awt.Dimension(351, 163));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Today's Features");

        Item1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item1.setIcon(finalTestIcon);
        Item1.setPreferredSize(new java.awt.Dimension(100, 100));

        Item2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/007-winter-hat.png"))); // NOI18N
        Item2.setPreferredSize(new java.awt.Dimension(100, 100));

        Item3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/011-clothing.png"))); // NOI18N
        Item3.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout FeaturesPanelLayout = new javax.swing.GroupLayout(FeaturesPanel);
        FeaturesPanel.setLayout(FeaturesPanelLayout);
        FeaturesPanelLayout.setHorizontalGroup(
            FeaturesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeaturesPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Item1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FeaturesPanelLayout.setVerticalGroup(
            FeaturesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeaturesPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FeaturesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );

        MainPanel.add(FeaturesPanel);

        PopularPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PopularPanel.setMaximumSize(new java.awt.Dimension(351, 163));
        PopularPanel.setMinimumSize(new java.awt.Dimension(351, 163));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Items That You Have Lent Out");
        jLabel3.setMaximumSize(new java.awt.Dimension(145, 22));
        jLabel3.setMinimumSize(new java.awt.Dimension(145, 22));
        jLabel3.setPreferredSize(new java.awt.Dimension(145, 22));

        Item4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/005-rolling-pin.png"))); // NOI18N
        Item4.setPreferredSize(new java.awt.Dimension(100, 100));

        Item5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/015-tie.png"))); // NOI18N
        Item5.setPreferredSize(new java.awt.Dimension(100, 100));

        Item6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/010-high-heel.png"))); // NOI18N
        Item6.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel12.setText("Due 4/07/17");

        jLabel13.setText("Due 4/07/17");

        jLabel16.setText("Due 4/07/17");

        javax.swing.GroupLayout PopularPanelLayout = new javax.swing.GroupLayout(PopularPanel);
        PopularPanel.setLayout(PopularPanelLayout);
        PopularPanelLayout.setHorizontalGroup(
            PopularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PopularPanelLayout.createSequentialGroup()
                .addGroup(PopularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PopularPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Item4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PopularPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel16)))
                .addGroup(PopularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PopularPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Item6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Item5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PopularPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(42, 42, 42))))
        );
        PopularPanelLayout.setVerticalGroup(
            PopularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PopularPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PopularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Item6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(Item4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Item5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PopularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        MainPanel.add(PopularPanel);

        BorrowedPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BorrowedPanel.setMaximumSize(new java.awt.Dimension(351, 163));
        BorrowedPanel.setMinimumSize(new java.awt.Dimension(351, 163));
        BorrowedPanel.setPreferredSize(new java.awt.Dimension(351, 163));
        BorrowedPanel.setLayout(new java.awt.GridLayout(4, 1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Currently Borrowed");
        BorrowedPanel.add(jLabel4);

        Item8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/006-coffee-maker.png"))); // NOI18N

        jLabel11.setText("Due 4/07/17");

        jButton3.setText("Return");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Item8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jButton3))
                    .addComponent(Item8))
                .addContainerGap())
        );

        BorrowedPanel.add(jPanel8);

        Item14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/014-shoe.png"))); // NOI18N

        jLabel14.setText("Due 4/14/17");

        jButton5.setText("Return");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Item14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jButton5))
                    .addComponent(Item14))
                .addContainerGap())
        );

        BorrowedPanel.add(jPanel11);

        Item15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/012-coat.png"))); // NOI18N

        jLabel15.setText("Due 4/23/17");

        ViewAllBorrowed.setText("View All");
        ViewAllBorrowed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewAllBorrowedMouseClicked(evt);
            }
        });
        ViewAllBorrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllBorrowedActionPerformed(evt);
            }
        });

        jButton7.setText("Return");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Item15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewAllBorrowed)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(ViewAllBorrowed)
                        .addComponent(jButton7))
                    .addComponent(Item15))
                .addContainerGap())
        );

        BorrowedPanel.add(jPanel12);

        MainPanel.add(BorrowedPanel);

        SocialPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SocialPanel.setLayout(new java.awt.GridLayout(4, 1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Social");
        SocialPanel.add(jLabel10);

        Item16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/001-facebook.png"))); // NOI18N
        Item16.setMaximumSize(new java.awt.Dimension(64, 64));

        jLabel19.setText("Like us on Facebook!");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Item16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(Item16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        SocialPanel.add(jPanel15);

        Item17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/004-instagram.png"))); // NOI18N

        jLabel20.setText("Follow us on Instagram!");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Item17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(Item17))
                .addContainerGap())
        );

        SocialPanel.add(jPanel16);

        Item18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Item18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/003-twitter.png"))); // NOI18N

        jLabel21.setText("Join us on Twitter!");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Item18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(Item18))
                .addContainerGap())
        );

        SocialPanel.add(jPanel17);

        MainPanel.add(SocialPanel);

        HomePanel.add(MainPanel, java.awt.BorderLayout.CENTER);

        SearchPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HomePanel.add(SearchPanel, java.awt.BorderLayout.PAGE_START);

        add(HomePanel);
        add(returnPanel);
        add(searchPanel);
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        Object[] options = {"Yes I do!", "No I don't :("};
//        int n = JOptionPane.showOptionDialog(this,
//            "Do you want to borrow this black belt?", "",
//            JOptionPane.YES_NO_OPTION,
//            JOptionPane.QUESTION_MESSAGE,
//            null,
//            options,options);
      // jButton1.setText("HomePanel");
        HomePanel.setVisible(false);
        searchPanel.setVisible(true);
        searchPanel.setResults(jTextField1.getText());
        searchPanel.initTable();
       
               
//        SearchPanel search = new SearchPanel();
//        search.setVisible(true);
//        search.setResults(jTextField1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Object[] options = {"OK"};
        int n = JOptionPane.showOptionDialog(this,
            "Return pending...", "",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,options);
        jButton3.setText("Pending");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Object[] options = {"OK"};
        int n = JOptionPane.showOptionDialog(this,
            "Return pending...", "",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,options);
        jButton3.setText("Pending");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ViewAllBorrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllBorrowedActionPerformed
        // TODO add your handling code here:
        HomePanel.setVisible(false);
        returnPanel.setVisible(true);
    }//GEN-LAST:event_ViewAllBorrowedActionPerformed

    private void ViewAllBorrowedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAllBorrowedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewAllBorrowedMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BorrowedPanel;
    private javax.swing.JPanel FeaturesPanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel Item1;
    private javax.swing.JLabel Item14;
    private javax.swing.JLabel Item15;
    private javax.swing.JLabel Item16;
    private javax.swing.JLabel Item17;
    private javax.swing.JLabel Item18;
    private javax.swing.JLabel Item2;
    private javax.swing.JLabel Item3;
    private javax.swing.JLabel Item4;
    private javax.swing.JLabel Item5;
    private javax.swing.JLabel Item6;
    private javax.swing.JLabel Item8;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PopularPanel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JPanel SocialPanel;
    private javax.swing.JButton ViewAllBorrowed;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private project5.Panels.ReturnPanel returnPanel;
    private project5.Panels.SearchPanel searchPanel;
    // End of variables declaration//GEN-END:variables



}
