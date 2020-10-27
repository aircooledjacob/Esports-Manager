/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esportsapp;

import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author User
 */

public class EsportsGUI extends javax.swing.JFrame {

	private int posX;
	private int posY;

    /**
     * Creates new form EsportsGUI
     */
    public EsportsGUI() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        menuButtonGroup = new javax.swing.ButtonGroup();
        menuBarPanel = new javax.swing.JPanel();
        minimiseButton = new javax.swing.JButton();
        maximiseButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        eventsScrollPane = new javax.swing.JScrollPane();
        eventsPanel = new javax.swing.JPanel();
        teamsScrollPane = new javax.swing.JScrollPane();
        teamsPanel = new javax.swing.JPanel();
        leaderboardPanel = new javax.swing.JPanel();
        settingsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        alwaysOnTopCheck = new javax.swing.JCheckBox();
        versionLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        eventsToggleButton = new javax.swing.JToggleButton();
        teamsToggleButton = new javax.swing.JToggleButton();
        leaderboardToggleButton = new javax.swing.JToggleButton();
        settingsToggleButton = new javax.swing.JToggleButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Esports Manager");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        menuBarPanel.setBackground(new java.awt.Color(32, 34, 37));
        menuBarPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuBarPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menuBarPanelMouseDragged(evt);
            }
        });
        menuBarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuBarPanelMousePressed(evt);
            }
        });
        menuBarPanel.setLayout(new java.awt.GridBagLayout());

        minimiseButton.setBackground(menuBarPanel.getBackground());
        minimiseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esportsapp/images/minimise.png"))); // NOI18N
        minimiseButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        minimiseButton.setBorderPainted(false);
        minimiseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimiseButton.setFocusable(false);
        minimiseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimiseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimiseButtonMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        menuBarPanel.add(minimiseButton, gridBagConstraints);

        maximiseButton.setBackground(menuBarPanel.getBackground());
        maximiseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esportsapp/images/maximise.png"))); // NOI18N
        maximiseButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        maximiseButton.setBorderPainted(false);
        maximiseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximiseButton.setFocusable(false);
        maximiseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximiseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximiseButtonMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 1.0;
        menuBarPanel.add(maximiseButton, gridBagConstraints);

        closeButton.setBackground(menuBarPanel.getBackground());
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esportsapp/images/close.png"))); // NOI18N
        closeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        closeButton.setBorderPainted(false);
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setFocusable(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weighty = 1.0;
        menuBarPanel.add(closeButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        getContentPane().add(menuBarPanel, gridBagConstraints);

        mainPanel.setLayout(new java.awt.CardLayout());

        eventsScrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eventsPanel.setLayout(new java.awt.GridLayout(0, 1));
        eventsScrollPane.setViewportView(eventsPanel);

        mainPanel.add(eventsScrollPane, "eventsCard");

        teamsScrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        teamsScrollPane.setViewportView(teamsPanel);

        mainPanel.add(teamsScrollPane, "teamsCard");

        leaderboardPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.add(leaderboardPanel, "leaderboardCard");

        settingsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        java.awt.GridBagLayout settingsPanelLayout = new java.awt.GridBagLayout();
        settingsPanelLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        settingsPanelLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        settingsPanel.setLayout(settingsPanelLayout);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Appearance:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        settingsPanel.add(jLabel1, gridBagConstraints);

        alwaysOnTopCheck.setText("Always On Top");
        alwaysOnTopCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alwaysOnTopCheckActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        settingsPanel.add(alwaysOnTopCheck, gridBagConstraints);

        versionLabel.setText("Version: 0.5.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        settingsPanel.add(versionLabel, gridBagConstraints);

        mainPanel.add(settingsPanel, "settingsCard");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mainPanel, gridBagConstraints);

        menuPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPanel.setLayout(new java.awt.GridLayout(0, 1));

        menuButtonGroup.add(eventsToggleButton);
        eventsToggleButton.setFont(eventsToggleButton.getFont().deriveFont(eventsToggleButton.getFont().getSize()+7f));
        eventsToggleButton.setText("Events");
        eventsToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eventsToggleButton.setFocusable(false);
        eventsToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsToggleButtonActionPerformed(evt);
            }
        });
        menuPanel.add(eventsToggleButton);

        menuButtonGroup.add(teamsToggleButton);
        teamsToggleButton.setFont(teamsToggleButton.getFont().deriveFont(teamsToggleButton.getFont().getSize()+7f));
        teamsToggleButton.setText("Teams");
        teamsToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teamsToggleButton.setFocusable(false);
        teamsToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamsToggleButtonActionPerformed(evt);
            }
        });
        menuPanel.add(teamsToggleButton);

        menuButtonGroup.add(leaderboardToggleButton);
        leaderboardToggleButton.setFont(leaderboardToggleButton.getFont().deriveFont(leaderboardToggleButton.getFont().getSize()+7f));
        leaderboardToggleButton.setText("Leaderboard");
        leaderboardToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaderboardToggleButton.setFocusable(false);
        leaderboardToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboardToggleButtonActionPerformed(evt);
            }
        });
        menuPanel.add(leaderboardToggleButton);

        menuButtonGroup.add(settingsToggleButton);
        settingsToggleButton.setFont(settingsToggleButton.getFont().deriveFont(settingsToggleButton.getFont().getSize()+7f));
        settingsToggleButton.setText("Settings");
        settingsToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsToggleButton.setFocusable(false);
        settingsToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsToggleButtonActionPerformed(evt);
            }
        });
        menuPanel.add(settingsToggleButton);

        saveButton.setFont(saveButton.getFont().deriveFont(saveButton.getFont().getSize()+7f));
        saveButton.setText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.setFocusable(false);
        menuPanel.add(saveButton);

        loadButton.setFont(loadButton.getFont().deriveFont(loadButton.getFont().getSize()+7f));
        loadButton.setText("Load");
        loadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadButton.setFocusable(false);
        menuPanel.add(loadButton);

        exitButton.setFont(exitButton.getFont().deriveFont(exitButton.getFont().getSize()+7f));
        exitButton.setText("Exit");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.setFocusable(false);
        menuPanel.add(exitButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(menuPanel, gridBagConstraints);

        setSize(new java.awt.Dimension(720, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventsToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsToggleButtonActionPerformed
        // TODO add your handling code here:
		CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "eventsCard");
    }//GEN-LAST:event_eventsToggleButtonActionPerformed

    private void teamsToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamsToggleButtonActionPerformed
        // TODO add your handling code here:
		CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "teamsCard");
    }//GEN-LAST:event_teamsToggleButtonActionPerformed

    private void leaderboardToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboardToggleButtonActionPerformed
        // TODO add your handling code here:
		CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "leaderboardCard");
    }//GEN-LAST:event_leaderboardToggleButtonActionPerformed

    private void settingsToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsToggleButtonActionPerformed
        // TODO add your handling code here:
		CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "settingsCard");
    }//GEN-LAST:event_settingsToggleButtonActionPerformed

    private void alwaysOnTopCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alwaysOnTopCheckActionPerformed
        // TODO add your handling code here:
		this.setAlwaysOnTop(alwaysOnTopCheck.isSelected());
    }//GEN-LAST:event_alwaysOnTopCheckActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
		this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void menuBarPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarPanelMousePressed
        // TODO add your handling code here:
		posX = evt.getX();
		posY = evt.getY();
    }//GEN-LAST:event_menuBarPanelMousePressed

    private void menuBarPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarPanelMouseDragged
        // TODO add your handling code here:
		Rectangle rectangle = getBounds();
		this.setBounds(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY, rectangle.width, rectangle.height);
    }//GEN-LAST:event_menuBarPanelMouseDragged

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        // TODO add your handling code here:
		closeButton.setBackground(new java.awt.Color(240, 71, 71));
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        // TODO add your handling code here:
		closeButton.setBackground(menuBarPanel.getBackground());
    }//GEN-LAST:event_closeButtonMouseExited

    private void maximiseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximiseButtonMouseEntered
        // TODO add your handling code here:
		maximiseButton.setBackground(new java.awt.Color(38, 41, 46));
    }//GEN-LAST:event_maximiseButtonMouseEntered

    private void maximiseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximiseButtonMouseExited
        // TODO add your handling code here:
		maximiseButton.setBackground(menuBarPanel.getBackground());
    }//GEN-LAST:event_maximiseButtonMouseExited

    private void minimiseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseButtonMouseEntered
        // TODO add your handling code here:
		minimiseButton.setBackground(new java.awt.Color(38, 41, 46));
    }//GEN-LAST:event_minimiseButtonMouseEntered

    private void minimiseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseButtonMouseExited
        // TODO add your handling code here:
		minimiseButton.setBackground(menuBarPanel.getBackground());
    }//GEN-LAST:event_minimiseButtonMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EsportsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsportsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsportsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsportsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsportsGUI().setVisible(true);
            }
        });
		
		
		
    }
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alwaysOnTopCheck;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel eventsPanel;
    private javax.swing.JScrollPane eventsScrollPane;
    private javax.swing.JToggleButton eventsToggleButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leaderboardPanel;
    private javax.swing.JToggleButton leaderboardToggleButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton maximiseButton;
    private javax.swing.JPanel menuBarPanel;
    private javax.swing.ButtonGroup menuButtonGroup;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton minimiseButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JToggleButton settingsToggleButton;
    private javax.swing.JPanel teamsPanel;
    private javax.swing.JScrollPane teamsScrollPane;
    private javax.swing.JToggleButton teamsToggleButton;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables
}
