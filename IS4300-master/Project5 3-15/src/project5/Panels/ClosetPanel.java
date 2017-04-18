/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5.Panels;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import project5.utilities.TextPrompt;
/**
 *
 * @author rachelrudolph
 */
public class ClosetPanel extends javax.swing.JPanel {
    
    TextPrompt tp2;

    /**
     * Creates new form HomePanel
     */
    public ClosetPanel() {
        initComponents();
        Categories.setVisible(true);
        TopsPanel.setVisible(false);
        PostPanel.setVisible(false);
        
        this.tp2 = new TextPrompt( "I'm Looking To Borrow...", jTextField1);
        this.tp2.setShow(TextPrompt.Show.FOCUS_LOST);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        Categories = new javax.swing.JPanel();
        Tops = new javax.swing.JButton();
        Bottoms = new javax.swing.JButton();
        Dresses = new javax.swing.JButton();
        Jewelry = new javax.swing.JButton();
        Accessories = new javax.swing.JButton();
        Shoes = new javax.swing.JButton();
        Kitchen = new javax.swing.JButton();
        AddCategory = new javax.swing.JButton();
        TopsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AddItem = new javax.swing.JButton();
        PostPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(711, 388));
        setPreferredSize(new java.awt.Dimension(703, 371));
        setLayout(new java.awt.BorderLayout());

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
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(SearchPanel, java.awt.BorderLayout.PAGE_START);

        MainPanel.setMaximumSize(new java.awt.Dimension(702, 326));
        MainPanel.setLayout(new javax.swing.OverlayLayout(MainPanel));

        Categories.setMaximumSize(new java.awt.Dimension(716, 32767));
        Categories.setPreferredSize(new java.awt.Dimension(730, 250));
        Categories.setLayout(new java.awt.GridLayout(2, 4));

        Tops.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Tops.setText("Tops");
        Tops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TopsActionPerformed(evt);
            }
        });
        Categories.add(Tops);

        Bottoms.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Bottoms.setText("Bottoms");
        Bottoms.setPreferredSize(new java.awt.Dimension(194, 186));
        Bottoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottomsActionPerformed(evt);
            }
        });
        Categories.add(Bottoms);

        Dresses.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Dresses.setText("Dresses");
        Dresses.setPreferredSize(new java.awt.Dimension(194, 186));
        Dresses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DressesActionPerformed(evt);
            }
        });
        Categories.add(Dresses);

        Jewelry.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Jewelry.setText("Jewelry");
        Jewelry.setPreferredSize(new java.awt.Dimension(194, 186));
        Jewelry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JewelryActionPerformed(evt);
            }
        });
        Categories.add(Jewelry);

        Accessories.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Accessories.setText("Accessories");
        Accessories.setToolTipText("");
        Accessories.setPreferredSize(new java.awt.Dimension(194, 186));
        Accessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessoriesActionPerformed(evt);
            }
        });
        Categories.add(Accessories);

        Shoes.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Shoes.setText("Shoes");
        Shoes.setPreferredSize(new java.awt.Dimension(194, 186));
        Shoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoesActionPerformed(evt);
            }
        });
        Categories.add(Shoes);

        Kitchen.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Kitchen.setText("Kitchen");
        Kitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KitchenActionPerformed(evt);
            }
        });
        Categories.add(Kitchen);

        AddCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/add-512.png"))); // NOI18N
        AddCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCategoryActionPerformed(evt);
            }
        });
        Categories.add(AddCategory);

        MainPanel.add(Categories);

        TopsPanel.setLayout(new java.awt.GridLayout(2, 3));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/001-top.png"))); // NOI18N
        TopsPanel.add(jLabel2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/002-shirt-2.png"))); // NOI18N
        TopsPanel.add(jLabel1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/003-referee.png"))); // NOI18N
        TopsPanel.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/004-shirt-1.png"))); // NOI18N
        TopsPanel.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/006-basketball-jersey.png"))); // NOI18N
        TopsPanel.add(jLabel5);

        AddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/add-512.png"))); // NOI18N
        AddItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemActionPerformed(evt);
            }
        });
        TopsPanel.add(AddItem);

        MainPanel.add(TopsPanel);

        jLabel6.setText("*Item Name");

        jLabel7.setText("Description");

        jLabel8.setText("Tags");

        jLabel9.setText("Color");

        jLabel10.setText("Location");

        jLabel11.setText("*Max Lend");

        jLabel12.setText("Brand");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setText("Submit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/add-512.png"))); // NOI18N

        javax.swing.GroupLayout PostPanelLayout = new javax.swing.GroupLayout(PostPanel);
        PostPanel.setLayout(PostPanelLayout);
        PostPanelLayout.setHorizontalGroup(
            PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostPanelLayout.createSequentialGroup()
                .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PostPanelLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jButton2))
                    .addGroup(PostPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PostPanelLayout.createSequentialGroup()
                                .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PostPanelLayout.createSequentialGroup()
                                        .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel7))
                                        .addGap(40, 40, 40))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PostPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PostPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        PostPanelLayout.setVerticalGroup(
            PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PostPanelLayout.createSequentialGroup()
                        .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(13, 13, 13)
                        .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        MainPanel.add(PostPanel);

        add(MainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object[] options = {"Yes I do!", "No I don't :("};
        int n = JOptionPane.showOptionDialog(this,
            "Do you want to borrow this black belt?", "",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,options);
        jButton1.setText("Pending");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TopsActionPerformed
        // TODO add your handling code here:
        Categories.setVisible(false);
        TopsPanel.setVisible(true);
        PostPanel.setVisible(false);
    }//GEN-LAST:event_TopsActionPerformed

    private void BottomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottomsActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
            "No items in this category.");
    }//GEN-LAST:event_BottomsActionPerformed

    private void ShoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
            "No items in this category.");
    }//GEN-LAST:event_ShoesActionPerformed

    private void AddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCategoryActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
            "In future version you will be able to add closet category.");
    }//GEN-LAST:event_AddCategoryActionPerformed

    private void AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemActionPerformed
        // TODO add your handling code here:
        Categories.setVisible(false);
        TopsPanel.setVisible(false);
        PostPanel.setVisible(true);
    }//GEN-LAST:event_AddItemActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Object[] options = {"OK"};
        int n = JOptionPane.showOptionDialog(this,
            "Item posted!", "",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,options);
        PostPanel.setVisible(false);
        TopsPanel.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DressesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DressesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
            "No items in this category.");
    }//GEN-LAST:event_DressesActionPerformed

    private void JewelryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JewelryActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
            "No items in this category.");
    }//GEN-LAST:event_JewelryActionPerformed

    private void AccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessoriesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
            "No items in this category.");
    }//GEN-LAST:event_AccessoriesActionPerformed

    private void KitchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KitchenActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
            "No items in this category.");
    }//GEN-LAST:event_KitchenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accessories;
    private javax.swing.JButton AddCategory;
    private javax.swing.JButton AddItem;
    private javax.swing.JButton Bottoms;
    private javax.swing.JPanel Categories;
    private javax.swing.JButton Dresses;
    private javax.swing.JButton Jewelry;
    private javax.swing.JButton Kitchen;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PostPanel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton Shoes;
    private javax.swing.JButton Tops;
    private javax.swing.JPanel TopsPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
