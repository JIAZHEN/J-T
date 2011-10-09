/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DishesView.java
 *
 * Created on 2011-10-1, 6:28:19
 */
package ordersystemclient;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Administrator
 */
public class DishesView extends javax.swing.JPanel {

    /** Creates new form DishesView */
    public DishesView() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        banner = new javax.swing.JLabel();
        chinesePanel = new javax.swing.JPanel();
        cDishNameLabel = new javax.swing.JLabel();
        cDishNameText = new javax.swing.JTextField();
        cCatalogLabel = new javax.swing.JLabel();
        cCatalogSelection = new javax.swing.JComboBox();
        cPriceLabel = new javax.swing.JLabel();
        cPriceText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cPicLabel = new javax.swing.JLabel();
        cPicText = new javax.swing.JTextField();
        cFileSelection = new javax.swing.JButton();
        cIntrodLabel = new javax.swing.JLabel();
        cScrollPane1 = new javax.swing.JScrollPane();
        cIntrodTextArea = new javax.swing.JTextArea();
        englishPanel = new javax.swing.JPanel();
        eDishNameLabel = new javax.swing.JLabel();
        eDishNameText = new javax.swing.JTextField();
        eCatalogSelection = new javax.swing.JComboBox();
        eCatalogLabel = new javax.swing.JLabel();
        ePriceLabel = new javax.swing.JLabel();
        ePriceText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ePicLabel = new javax.swing.JLabel();
        ePicText = new javax.swing.JTextField();
        eFileSelection = new javax.swing.JButton();
        eIntrodLabel = new javax.swing.JLabel();
        eScrollPane1 = new javax.swing.JScrollPane();
        eIntrodTextArea = new javax.swing.JTextArea();
        btnPanel = new javax.swing.JPanel();
        submitBtn = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        fileChooser.setFileFilter(new MyCustomFilter());
        fileChooser.setName("fileChooser"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(ordersystemclient.OrderSystemClientApp.class).getContext().getResourceMap(DishesView.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N

        banner.setBackground(resourceMap.getColor("banner.background")); // NOI18N
        banner.setIcon(resourceMap.getIcon("banner.icon")); // NOI18N
        banner.setText(resourceMap.getString("banner.text")); // NOI18N
        banner.setName("banner"); // NOI18N

        chinesePanel.setBackground(resourceMap.getColor("chinesePanel.background")); // NOI18N
        chinesePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("chinesePanel.border.title"))); // NOI18N
        chinesePanel.setName("chinesePanel"); // NOI18N

        cDishNameLabel.setText(resourceMap.getString("cDishNameLabel.text")); // NOI18N
        cDishNameLabel.setName("cDishNameLabel"); // NOI18N

        cDishNameText.setText(resourceMap.getString("cDishNameText.text")); // NOI18N
        cDishNameText.setName("cDishNameText"); // NOI18N
        cDishNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDishNameTextActionPerformed(evt);
            }
        });

        cCatalogLabel.setText(resourceMap.getString("cCatalogLabel.text")); // NOI18N
        cCatalogLabel.setName("cCatalogLabel"); // NOI18N

        cCatalogSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cCatalogSelection.setName("cCatalogSelection"); // NOI18N

        cPriceLabel.setText(resourceMap.getString("cPriceLabel.text")); // NOI18N
        cPriceLabel.setName("cPriceLabel"); // NOI18N

        cPriceText.setName("cPriceText"); // NOI18N
        cPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPriceTextActionPerformed(evt);
            }
        });

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        cPicLabel.setText(resourceMap.getString("cPicLabel.text")); // NOI18N
        cPicLabel.setName("cPicLabel"); // NOI18N

        cPicText.setName("cPicText"); // NOI18N
        cPicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPicTextActionPerformed(evt);
            }
        });

        cFileSelection.setText(resourceMap.getString("cFileSelection.text")); // NOI18N
        cFileSelection.setName("cFileSelection"); // NOI18N
        cFileSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFileSelectionActionPerformed(evt);
            }
        });

        cIntrodLabel.setText(resourceMap.getString("cIntrodLabel.text")); // NOI18N
        cIntrodLabel.setName("cIntrodLabel"); // NOI18N

        cScrollPane1.setName("cScrollPane1"); // NOI18N

        cIntrodTextArea.setColumns(20);
        cIntrodTextArea.setRows(5);
        cIntrodTextArea.setName("cIntrodTextArea"); // NOI18N
        cScrollPane1.setViewportView(cIntrodTextArea);

        javax.swing.GroupLayout chinesePanelLayout = new javax.swing.GroupLayout(chinesePanel);
        chinesePanel.setLayout(chinesePanelLayout);
        chinesePanelLayout.setHorizontalGroup(
            chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chinesePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chinesePanelLayout.createSequentialGroup()
                        .addComponent(cIntrodLabel)
                        .addGap(18, 18, 18)
                        .addComponent(cScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addGroup(chinesePanelLayout.createSequentialGroup()
                        .addGroup(chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chinesePanelLayout.createSequentialGroup()
                                .addComponent(cPicLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cPicText, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                            .addGroup(chinesePanelLayout.createSequentialGroup()
                                .addComponent(cDishNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cDishNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(chinesePanelLayout.createSequentialGroup()
                                .addGroup(chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chinesePanelLayout.createSequentialGroup()
                                        .addComponent(cPriceLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(cPriceText, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chinesePanelLayout.createSequentialGroup()
                                        .addComponent(cCatalogLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(cCatalogSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cFileSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        chinesePanelLayout.setVerticalGroup(
            chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chinesePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cDishNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cDishNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cCatalogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCatalogSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFileSelection))
                .addGroup(chinesePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chinesePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cIntrodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chinesePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(cScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        englishPanel.setBackground(resourceMap.getColor("englishPanel.background")); // NOI18N
        englishPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("englishPanel.border.title"))); // NOI18N
        englishPanel.setName("englishPanel"); // NOI18N

        eDishNameLabel.setText(resourceMap.getString("eDishNameLabel.text")); // NOI18N
        eDishNameLabel.setName("eDishNameLabel"); // NOI18N

        eDishNameText.setName("eDishNameText"); // NOI18N
        eDishNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDishNameTextActionPerformed(evt);
            }
        });

        eCatalogSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        eCatalogSelection.setName("eCatalogSelection"); // NOI18N

        eCatalogLabel.setText(resourceMap.getString("eCatalogLabel.text")); // NOI18N
        eCatalogLabel.setName("eCatalogLabel"); // NOI18N

        ePriceLabel.setText(resourceMap.getString("ePriceLabel.text")); // NOI18N
        ePriceLabel.setName("ePriceLabel"); // NOI18N

        ePriceText.setName("ePriceText"); // NOI18N
        ePriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ePriceTextActionPerformed(evt);
            }
        });

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        ePicLabel.setText(resourceMap.getString("ePicLabel.text")); // NOI18N
        ePicLabel.setName("ePicLabel"); // NOI18N

        ePicText.setName("ePicText"); // NOI18N
        ePicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ePicTextActionPerformed(evt);
            }
        });

        eFileSelection.setText(resourceMap.getString("eFileSelection.text")); // NOI18N
        eFileSelection.setName("eFileSelection"); // NOI18N
        eFileSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eFileSelectionActionPerformed(evt);
            }
        });

        eIntrodLabel.setText(resourceMap.getString("eIntrodLabel.text")); // NOI18N
        eIntrodLabel.setName("eIntrodLabel"); // NOI18N

        eScrollPane1.setName("eScrollPane1"); // NOI18N

        eIntrodTextArea.setColumns(20);
        eIntrodTextArea.setRows(5);
        eIntrodTextArea.setName("eIntrodTextArea"); // NOI18N
        eScrollPane1.setViewportView(eIntrodTextArea);

        javax.swing.GroupLayout englishPanelLayout = new javax.swing.GroupLayout(englishPanel);
        englishPanel.setLayout(englishPanelLayout);
        englishPanelLayout.setHorizontalGroup(
            englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(englishPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(englishPanelLayout.createSequentialGroup()
                        .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eDishNameLabel)
                            .addComponent(eCatalogLabel)
                            .addComponent(ePriceLabel)
                            .addComponent(ePicLabel))
                        .addGap(25, 25, 25)
                        .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(englishPanelLayout.createSequentialGroup()
                                .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ePicText)
                                    .addComponent(eCatalogSelection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eFileSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, englishPanelLayout.createSequentialGroup()
                                .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eDishNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(ePriceText, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(englishPanelLayout.createSequentialGroup()
                        .addComponent(eIntrodLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        englishPanelLayout.setVerticalGroup(
            englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(englishPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDishNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eDishNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eCatalogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eCatalogSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ePriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ePicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ePicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eFileSelection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(englishPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eIntrodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnPanel.setBackground(resourceMap.getColor("btnPanel.background")); // NOI18N
        btnPanel.setName("btnPanel"); // NOI18N

        submitBtn.setText(resourceMap.getString("submitBtn.text")); // NOI18N
        submitBtn.setName("submitBtn"); // NOI18N

        reset.setText(resourceMap.getString("reset.text")); // NOI18N
        reset.setName("reset"); // NOI18N
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setText(resourceMap.getString("exit.text")); // NOI18N
        exit.setName("exit"); // NOI18N

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanelLayout.createSequentialGroup()
                .addContainerGap(553, Short.MAX_VALUE)
                .addComponent(submitBtn)
                .addGap(18, 18, 18)
                .addComponent(reset)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addGap(24, 24, 24))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(submitBtn)
                    .addComponent(exit))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chinesePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(englishPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chinesePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(englishPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chinesePanel, englishPanel});

    }// </editor-fold>//GEN-END:initComponents

    private void cDishNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDishNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDishNameTextActionPerformed

    private void eDishNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDishNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eDishNameTextActionPerformed

    private void cPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPriceTextActionPerformed

    private void ePriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ePriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ePriceTextActionPerformed

    private void cPicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPicTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPicTextActionPerformed

    private void cFileSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFileSelectionActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            // What to do with the file, e.g. display it in a TextArea
            String path = file.getAbsolutePath();
            cPicText.setText(path);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_cFileSelectionActionPerformed

    private void ePicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ePicTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ePicTextActionPerformed

    private void eFileSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eFileSelectionActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            // What to do with the file, e.g. display it in a TextArea
            String path = file.getAbsolutePath();
            ePicText.setText(path);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_eFileSelectionActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        cDishNameText.setText("");
        eDishNameText.setText("");
        cIntrodTextArea.setText("");
        eIntrodTextArea.setText("");
        cPicText.setText("");
        ePicText.setText("");
        cPriceText.setText("");
        ePriceText.setText("");
        cCatalogSelection.setSelectedIndex(0);
        eCatalogSelection.setSelectedIndex(0);
    }//GEN-LAST:event_resetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JLabel cCatalogLabel;
    private javax.swing.JComboBox cCatalogSelection;
    private javax.swing.JLabel cDishNameLabel;
    private javax.swing.JTextField cDishNameText;
    private javax.swing.JButton cFileSelection;
    private javax.swing.JLabel cIntrodLabel;
    private javax.swing.JTextArea cIntrodTextArea;
    private javax.swing.JLabel cPicLabel;
    private javax.swing.JTextField cPicText;
    private javax.swing.JLabel cPriceLabel;
    private javax.swing.JTextField cPriceText;
    private javax.swing.JScrollPane cScrollPane1;
    private javax.swing.JPanel chinesePanel;
    private javax.swing.JLabel eCatalogLabel;
    private javax.swing.JComboBox eCatalogSelection;
    private javax.swing.JLabel eDishNameLabel;
    private javax.swing.JTextField eDishNameText;
    private javax.swing.JButton eFileSelection;
    private javax.swing.JLabel eIntrodLabel;
    private javax.swing.JTextArea eIntrodTextArea;
    private javax.swing.JLabel ePicLabel;
    private javax.swing.JTextField ePicText;
    private javax.swing.JLabel ePriceLabel;
    private javax.swing.JTextField ePriceText;
    private javax.swing.JScrollPane eScrollPane1;
    private javax.swing.JPanel englishPanel;
    private javax.swing.JButton exit;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reset;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
