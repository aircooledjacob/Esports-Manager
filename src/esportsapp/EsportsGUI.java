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
        mainPanel = new javax.swing.JPanel();
        minimiseButton = new javax.swing.JButton();
        maximiseButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        eventsToggleButton = new javax.swing.JToggleButton();
        teamsToggleButton = new javax.swing.JToggleButton();
        leaderboardToggleButton = new javax.swing.JToggleButton();
        settingsToggleButton = new javax.swing.JToggleButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        activePanel = new javax.swing.JPanel();
        eventsPanel = new javax.swing.JPanel();
        teamsPanel = new javax.swing.JPanel();
        leaderboardPanel = new javax.swing.JPanel();
        settingsPanel = new javax.swing.JPanel();
        appearanceLabel = new javax.swing.JLabel();
        alwaysOnTopCheck = new javax.swing.JCheckBox();
        versionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Esports Manager");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setBackground(new java.awt.Color(32, 34, 37));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainPanelMouseDragged(evt);
            }
        });
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPanelMousePressed(evt);
            }
        });
        mainPanel.setLayout(new java.awt.GridBagLayout());

        minimiseButton.setBackground(mainPanel.getBackground());
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
        mainPanel.add(minimiseButton, gridBagConstraints);

        maximiseButton.setBackground(mainPanel.getBackground());
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
        mainPanel.add(maximiseButton, gridBagConstraints);

        closeButton.setBackground(mainPanel.getBackground());
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
        mainPanel.add(closeButton, gridBagConstraints);

        menuPanel.setBackground(new java.awt.Color(47, 49, 54));
        menuPanel.setLayout(new java.awt.GridBagLayout());

        eventsToggleButton.setBackground(menuPanel.getBackground());
        menuButtonGroup.add(eventsToggleButton);
        eventsToggleButton.setFont(eventsToggleButton.getFont().deriveFont(eventsToggleButton.getFont().getSize()+7f));
        eventsToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        eventsToggleButton.setText("Events");
        eventsToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eventsToggleButton.setBorderPainted(false);
        eventsToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eventsToggleButton.setFocusable(false);
        eventsToggleButton.setOpaque(true);
        eventsToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eventsToggleButtonItemStateChanged(evt);
            }
        });
        eventsToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eventsToggleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eventsToggleButtonMouseExited(evt);
            }
        });
        eventsToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        menuPanel.add(eventsToggleButton, gridBagConstraints);

        teamsToggleButton.setBackground(menuPanel.getBackground());
        menuButtonGroup.add(teamsToggleButton);
        teamsToggleButton.setFont(teamsToggleButton.getFont().deriveFont(teamsToggleButton.getFont().getSize()+7f));
        teamsToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        teamsToggleButton.setText("Teams");
        teamsToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        teamsToggleButton.setBorderPainted(false);
        teamsToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teamsToggleButton.setFocusable(false);
        teamsToggleButton.setOpaque(true);
        teamsToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teamsToggleButtonItemStateChanged(evt);
            }
        });
        teamsToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teamsToggleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teamsToggleButtonMouseExited(evt);
            }
        });
        teamsToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamsToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        menuPanel.add(teamsToggleButton, gridBagConstraints);

        leaderboardToggleButton.setBackground(menuPanel.getBackground());
        menuButtonGroup.add(leaderboardToggleButton);
        leaderboardToggleButton.setFont(leaderboardToggleButton.getFont().deriveFont(leaderboardToggleButton.getFont().getSize()+7f));
        leaderboardToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        leaderboardToggleButton.setText("Leaderboard");
        leaderboardToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leaderboardToggleButton.setBorderPainted(false);
        leaderboardToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaderboardToggleButton.setFocusable(false);
        leaderboardToggleButton.setOpaque(true);
        leaderboardToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                leaderboardToggleButtonItemStateChanged(evt);
            }
        });
        leaderboardToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leaderboardToggleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leaderboardToggleButtonMouseExited(evt);
            }
        });
        leaderboardToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboardToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        menuPanel.add(leaderboardToggleButton, gridBagConstraints);

        settingsToggleButton.setBackground(menuPanel.getBackground());
        menuButtonGroup.add(settingsToggleButton);
        settingsToggleButton.setFont(settingsToggleButton.getFont().deriveFont(settingsToggleButton.getFont().getSize()+7f));
        settingsToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        settingsToggleButton.setText("Settings");
        settingsToggleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        settingsToggleButton.setBorderPainted(false);
        settingsToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsToggleButton.setFocusable(false);
        settingsToggleButton.setOpaque(true);
        settingsToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                settingsToggleButtonItemStateChanged(evt);
            }
        });
        settingsToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsToggleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsToggleButtonMouseExited(evt);
            }
        });
        settingsToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        menuPanel.add(settingsToggleButton, gridBagConstraints);

        saveButton.setBackground(menuPanel.getBackground());
        saveButton.setFont(saveButton.getFont().deriveFont(saveButton.getFont().getSize()+7f));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveButton.setBorderPainted(false);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.setFocusable(false);
        saveButton.setOpaque(true);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        menuPanel.add(saveButton, gridBagConstraints);

        loadButton.setBackground(menuPanel.getBackground());
        loadButton.setFont(loadButton.getFont().deriveFont(loadButton.getFont().getSize()+7f));
        loadButton.setForeground(new java.awt.Color(255, 255, 255));
        loadButton.setText("Load");
        loadButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loadButton.setBorderPainted(false);
        loadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadButton.setFocusable(false);
        loadButton.setOpaque(true);
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadButtonMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        menuPanel.add(loadButton, gridBagConstraints);

        exitButton.setBackground(menuPanel.getBackground());
        exitButton.setFont(exitButton.getFont().deriveFont(exitButton.getFont().getSize()+7f));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.setBorderPainted(false);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.setFocusable(false);
        exitButton.setOpaque(true);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        menuPanel.add(exitButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(menuPanel, gridBagConstraints);

        activePanel.setLayout(new java.awt.CardLayout());

        eventsPanel.setLayout(new java.awt.GridLayout(0, 1));
        activePanel.add(eventsPanel, "eventsCard");
        activePanel.add(teamsPanel, "teamsCard");
        activePanel.add(leaderboardPanel, "leaderboardCard");

        java.awt.GridBagLayout settingsPanelLayout = new java.awt.GridBagLayout();
        settingsPanelLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        settingsPanelLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        settingsPanel.setLayout(settingsPanelLayout);

        appearanceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        appearanceLabel.setText("Appearance:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        settingsPanel.add(appearanceLabel, gridBagConstraints);

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

        activePanel.add(settingsPanel, "settingsCard");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(activePanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mainPanel, gridBagConstraints);

        setSize(new java.awt.Dimension(720, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventsToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsToggleButtonActionPerformed
        // TODO add your handling code here:
		CardLayout card = (CardLayout)activePanel.getLayout();
		card.show(activePanel, "eventsCard");
    }//GEN-LAST:event_eventsToggleButtonActionPerformed

    private void teamsToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamsToggleButtonActionPerformed
        // TODO add your handling code here:
		CardLayout card = (CardLayout)activePanel.getLayout();
		card.show(activePanel, "teamsCard");
    }//GEN-LAST:event_teamsToggleButtonActionPerformed

    private void leaderboardToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboardToggleButtonActionPerformed
        // TODO add your handling code here:
		CardLayout card = (CardLayout)activePanel.getLayout();
		card.show(activePanel, "leaderboardCard");
    }//GEN-LAST:event_leaderboardToggleButtonActionPerformed

    private void settingsToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsToggleButtonActionPerformed
        // TODO add your handling code here:
		CardLayout card = (CardLayout)activePanel.getLayout();
		card.show(activePanel, "settingsCard");
    }//GEN-LAST:event_settingsToggleButtonActionPerformed

    private void alwaysOnTopCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alwaysOnTopCheckActionPerformed
        // TODO add your handling code here:
		this.setAlwaysOnTop(alwaysOnTopCheck.isSelected());
    }//GEN-LAST:event_alwaysOnTopCheckActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
		this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void mainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMousePressed
        // TODO add your handling code here:
		posX = evt.getX();
		posY = evt.getY();
    }//GEN-LAST:event_mainPanelMousePressed

    private void mainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseDragged
        // TODO add your handling code here:
		Rectangle rectangle = getBounds();
		this.setBounds(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY, rectangle.width, rectangle.height);
    }//GEN-LAST:event_mainPanelMouseDragged

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        // TODO add your handling code here:
		closeButton.setBackground(new java.awt.Color(240, 71, 71));
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        // TODO add your handling code here:
		closeButton.setBackground(mainPanel.getBackground());
    }//GEN-LAST:event_closeButtonMouseExited

    private void maximiseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximiseButtonMouseEntered
        // TODO add your handling code here:
		maximiseButton.setBackground(new java.awt.Color(38, 41, 46));
    }//GEN-LAST:event_maximiseButtonMouseEntered

    private void maximiseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximiseButtonMouseExited
        // TODO add your handling code here:
		maximiseButton.setBackground(mainPanel.getBackground());
    }//GEN-LAST:event_maximiseButtonMouseExited

    private void minimiseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseButtonMouseEntered
        // TODO add your handling code here:
		minimiseButton.setBackground(new java.awt.Color(38, 41, 46));
    }//GEN-LAST:event_minimiseButtonMouseEntered

    private void minimiseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimiseButtonMouseExited
        // TODO add your handling code here:
		minimiseButton.setBackground(mainPanel.getBackground());
    }//GEN-LAST:event_minimiseButtonMouseExited

    private void eventsToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eventsToggleButtonItemStateChanged
        // TODO add your handling code here:
		if (eventsToggleButton.isSelected()) {
			eventsToggleButton.setBackground(new java.awt.Color(57, 60, 66));
		} else {
			eventsToggleButton.setBackground(menuPanel.getBackground());
		}
    }//GEN-LAST:event_eventsToggleButtonItemStateChanged

    private void teamsToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_teamsToggleButtonItemStateChanged
        // TODO add your handling code here:
		if (teamsToggleButton.isSelected()) {
			teamsToggleButton.setBackground(new java.awt.Color(57, 60, 66));
		} else {
			teamsToggleButton.setBackground(menuPanel.getBackground());
		}
    }//GEN-LAST:event_teamsToggleButtonItemStateChanged

    private void leaderboardToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_leaderboardToggleButtonItemStateChanged
        // TODO add your handling code here:
		if (leaderboardToggleButton.isSelected()) {
			leaderboardToggleButton.setBackground(new java.awt.Color(57, 60, 66));
		} else {
			leaderboardToggleButton.setBackground(menuPanel.getBackground());
		}
    }//GEN-LAST:event_leaderboardToggleButtonItemStateChanged

    private void settingsToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_settingsToggleButtonItemStateChanged
        // TODO add your handling code here:
		if (settingsToggleButton.isSelected()) {
			settingsToggleButton.setBackground(new java.awt.Color(57, 60, 66));
		} else {
			settingsToggleButton.setBackground(menuPanel.getBackground());
		}
    }//GEN-LAST:event_settingsToggleButtonItemStateChanged

    private void eventsToggleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventsToggleButtonMouseEntered
        // TODO add your handling code here:
		if (!eventsToggleButton.isSelected()) {
			eventsToggleButton.setBackground(new java.awt.Color(51, 54, 60));
		}
    }//GEN-LAST:event_eventsToggleButtonMouseEntered

    private void teamsToggleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamsToggleButtonMouseEntered
        // TODO add your handling code here:
		if (!teamsToggleButton.isSelected()) {
			teamsToggleButton.setBackground(new java.awt.Color(51, 54, 60));
		}
    }//GEN-LAST:event_teamsToggleButtonMouseEntered

    private void leaderboardToggleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderboardToggleButtonMouseEntered
        // TODO add your handling code here:
		if (!leaderboardToggleButton.isSelected()) {
			leaderboardToggleButton.setBackground(new java.awt.Color(51, 54, 60));
		}
    }//GEN-LAST:event_leaderboardToggleButtonMouseEntered

    private void settingsToggleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsToggleButtonMouseEntered
        // TODO add your handling code here:
		if (!settingsToggleButton.isSelected()) {
			settingsToggleButton.setBackground(new java.awt.Color(51, 54, 60));
		}
    }//GEN-LAST:event_settingsToggleButtonMouseEntered

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        // TODO add your handling code here:
		saveButton.setBackground(new java.awt.Color(51, 54, 60));
    }//GEN-LAST:event_saveButtonMouseEntered

    private void loadButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadButtonMouseEntered
        // TODO add your handling code here:
		loadButton.setBackground(new java.awt.Color(51, 54, 60));
    }//GEN-LAST:event_loadButtonMouseEntered

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        // TODO add your handling code here:
		exitButton.setBackground(new java.awt.Color(51, 54, 60));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void eventsToggleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventsToggleButtonMouseExited
        // TODO add your handling code here:
		if (!eventsToggleButton.isSelected()) {
			eventsToggleButton.setBackground(menuPanel.getBackground());
		}
    }//GEN-LAST:event_eventsToggleButtonMouseExited

    private void teamsToggleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teamsToggleButtonMouseExited
        // TODO add your handling code here:
		if (!teamsToggleButton.isSelected()) {
			teamsToggleButton.setBackground(menuPanel.getBackground());
		}
    }//GEN-LAST:event_teamsToggleButtonMouseExited

    private void leaderboardToggleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderboardToggleButtonMouseExited
        // TODO add your handling code here:
		if (!leaderboardToggleButton.isSelected()) {
			leaderboardToggleButton.setBackground(menuPanel.getBackground());
		}
    }//GEN-LAST:event_leaderboardToggleButtonMouseExited

    private void settingsToggleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsToggleButtonMouseExited
        // TODO add your handling code here:
		if (!settingsToggleButton.isSelected()) {
			settingsToggleButton.setBackground(menuPanel.getBackground());
		}
    }//GEN-LAST:event_settingsToggleButtonMouseExited

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        // TODO add your handling code here:
		saveButton.setBackground(menuPanel.getBackground());
    }//GEN-LAST:event_saveButtonMouseExited

    private void loadButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadButtonMouseExited
        // TODO add your handling code here:
		loadButton.setBackground(menuPanel.getBackground());
    }//GEN-LAST:event_loadButtonMouseExited

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        // TODO add your handling code here:
		exitButton.setBackground(menuPanel.getBackground());
    }//GEN-LAST:event_exitButtonMouseExited

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
    private javax.swing.JPanel activePanel;
    private javax.swing.JCheckBox alwaysOnTopCheck;
    private javax.swing.JLabel appearanceLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel eventsPanel;
    private javax.swing.JToggleButton eventsToggleButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel leaderboardPanel;
    private javax.swing.JToggleButton leaderboardToggleButton;
    private javax.swing.JButton loadButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton maximiseButton;
    private javax.swing.ButtonGroup menuButtonGroup;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton minimiseButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JToggleButton settingsToggleButton;
    private javax.swing.JPanel teamsPanel;
    private javax.swing.JToggleButton teamsToggleButton;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables
}
