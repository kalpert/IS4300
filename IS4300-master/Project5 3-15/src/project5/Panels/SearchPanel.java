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
import project5.Panels.HomePanel;
import project5.utilities.Item;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rachelrudolph
 */
public class SearchPanel extends javax.swing.JPanel {
    TextPrompt tp7;
    int width;
    int height;
    String resultsText;
    DefaultTableModel table = new DefaultTableModel(0,0);
    
    
  
    public SearchPanel() {
        // SearchPanel search = new SearchPanel();
        //resultsText = HomePanel.getSearch();
        
        initComponents();
        initTable();
        // search.setVisible(true);
        this.tp7 = new TextPrompt( "I'm Looking To Borrow...", jTextField1);
        this.tp7.setShow(TextPrompt.Show.FOCUS_LOST);
       
    }

            
            
    public void setResults(String text){
        this.ResultsText.setText(text);
    }
    
    public final void initTable(){
       String header[] = new String[] {"Description", "Lender", "Image"};
       
       table.setColumnIdentifiers(header);
       
       table.addRow(new Object[] {"NameTest", "DescrTest", "LenderTest", "ImageTest"});
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
        SearchPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ResultsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ResultsText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        returnPanel = new project5.Panels.ReturnPanel();

        setMinimumSize(new java.awt.Dimension(703, 371));
        setLayout(new javax.swing.OverlayLayout(this));

        HomePanel.setLayout(new java.awt.BorderLayout());

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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Results for: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ResultsText, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ResultsText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable1.setModel(this.table);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout ResultsPanelLayout = new javax.swing.GroupLayout(ResultsPanel);
        ResultsPanel.setLayout(ResultsPanelLayout);
        ResultsPanelLayout.setHorizontalGroup(
            ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ResultsPanelLayout.setVerticalGroup(
            ResultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultsPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        HomePanel.add(ResultsPanel, java.awt.BorderLayout.CENTER);

        add(HomePanel);
        add(returnPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          returnPanel.setVisible(false);
          ResultsText.setText(jTextField1.getText());
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel ResultsPanel;
    private javax.swing.JLabel ResultsText;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private project5.Panels.ReturnPanel returnPanel;
    // End of variables declaration//GEN-END:variables



}
