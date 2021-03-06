/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5.Panels;

import java.awt.Dimension;
import javax.swing.JOptionPane;
/**
 *
 * @author rachelrudolph
 */
public class ClosetPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public ClosetPanel() {
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

        SearchPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Tops = new javax.swing.JButton();
        Bottoms = new javax.swing.JButton();
        Dresses = new javax.swing.JButton();
        Jewelry = new javax.swing.JButton();
        Accessories = new javax.swing.JButton();
        Shoes = new javax.swing.JButton();
        Kitchen = new javax.swing.JButton();
        AddCategory = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(711, 388));
        setLayout(new java.awt.BorderLayout());

        SearchPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextField1.setText("I'm Looking To Borrow...");
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

        jPanel6.setPreferredSize(new java.awt.Dimension(730, 250));
        jPanel6.setLayout(new java.awt.GridLayout(2, 4));

        Tops.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Tops.setText("Tops");
        Tops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TopsActionPerformed(evt);
            }
        });
        jPanel6.add(Tops);

        Bottoms.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Bottoms.setText("Bottoms");
        Bottoms.setPreferredSize(new java.awt.Dimension(194, 186));
        Bottoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottomsActionPerformed(evt);
            }
        });
        jPanel6.add(Bottoms);

        Dresses.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Dresses.setText("Dresses");
        Dresses.setPreferredSize(new java.awt.Dimension(194, 186));
        jPanel6.add(Dresses);

        Jewelry.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Jewelry.setText("Jewelry");
        Jewelry.setPreferredSize(new java.awt.Dimension(194, 186));
        jPanel6.add(Jewelry);

        Accessories.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Accessories.setText("Accessories");
        Accessories.setToolTipText("");
        Accessories.setPreferredSize(new java.awt.Dimension(194, 186));
        jPanel6.add(Accessories);

        Shoes.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Shoes.setText("Shoes");
        Shoes.setPreferredSize(new java.awt.Dimension(194, 186));
        Shoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoesActionPerformed(evt);
            }
        });
        jPanel6.add(Shoes);

        Kitchen.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Kitchen.setText("Kitchen");
        jPanel6.add(Kitchen);

        AddCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project5/Images/add-512.png"))); // NOI18N
        AddCategory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCategoryActionPerformed(evt);
            }
        });
        jPanel6.add(AddCategory);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainPanelLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

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
    }//GEN-LAST:event_TopsActionPerformed

    private void BottomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BottomsActionPerformed

    private void ShoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShoesActionPerformed

    private void AddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCategoryActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, 
            "In future version you will be able to add closet category.");
    }//GEN-LAST:event_AddCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accessories;
    private javax.swing.JButton AddCategory;
    private javax.swing.JButton Bottoms;
    private javax.swing.JButton Dresses;
    private javax.swing.JButton Jewelry;
    private javax.swing.JButton Kitchen;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton Shoes;
    private javax.swing.JButton Tops;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
