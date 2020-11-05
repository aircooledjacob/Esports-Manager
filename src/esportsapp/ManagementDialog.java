/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esportsapp;

import java.awt.*;

/**
 *
 * @author User
 * @param <T>
 */
public class ManagementDialog<T> extends javax.swing.JDialog {

	private int posX;
	private int posY;
	
	T object;
	
	/**
	 * Creates new form ManagementDialog
	 */
	public ManagementDialog(T obj) {
		super(EsportsGUI.getFrames()[0], true);
		
		this.object = obj;
		
		initComponents();
		this.setLocationRelativeTo(null);
		
		this.open();
	}
	
	private void open() {
		EsportsGUI.getComponentResizer().registerComponent(this);
		
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

        mainPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        dragBarPanel = new javax.swing.JPanel();
        managementPanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 300));
        setModal(true);
        setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setBackground(Palette.getCurrentScheme().COLOR_MAIN.getColor());
        mainPanel.setLayout(new java.awt.GridBagLayout());

        closeButton.setBackground(Palette.getCurrentScheme().COLOR_MAIN.getColor());
        closeButton.setIcon(Palette.getCurrentScheme().ICON_CLOSE.getIcon());
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        mainPanel.add(closeButton, gridBagConstraints);

        dragBarPanel.setFocusable(false);
        dragBarPanel.setOpaque(false);
        dragBarPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragBarPanelMouseDragged(evt);
            }
        });
        dragBarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragBarPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout dragBarPanelLayout = new javax.swing.GroupLayout(dragBarPanel);
        dragBarPanel.setLayout(dragBarPanelLayout);
        dragBarPanelLayout.setHorizontalGroup(
            dragBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );
        dragBarPanelLayout.setVerticalGroup(
            dragBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        mainPanel.add(dragBarPanel, gridBagConstraints);

        managementPanel.setBackground(Palette.getCurrentScheme().COLOR_ACTIVE.getColor());
        managementPanel.setLayout(new java.awt.GridBagLayout());

        nameField.setBackground(Palette.getCurrentScheme().COLOR_INPUT_BACK.getColor());
        nameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameField.setForeground(Palette.getCurrentScheme().COLOR_PRIMARY_TEXT.getColor());
        nameField.setText("Name");
        nameField.setBorder(null);
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        managementPanel.add(nameField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        mainPanel.add(managementPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mainPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        // TODO add your handling code here:
        closeButton.setIcon(Palette.getCurrentScheme().ICON_CLOSE_MOUSE_OVER.getIcon());
        closeButton.setBackground(Palette.getCurrentScheme().COLOR_CLOSE_MOUSE_OVER.getColor());
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        // TODO add your handling code here:
        closeButton.setIcon(Palette.getCurrentScheme().ICON_CLOSE.getIcon());
        closeButton.setBackground(Palette.getCurrentScheme().COLOR_MAIN.getColor());
    }//GEN-LAST:event_closeButtonMouseExited

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void dragBarPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragBarPanelMouseDragged
        // TODO add your handling code here:
        Rectangle rectangle = this.getBounds();
        this.setBounds(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY, rectangle.width, rectangle.height);
    }//GEN-LAST:event_dragBarPanelMouseDragged

    private void dragBarPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragBarPanelMousePressed
        // TODO add your handling code here:
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_dragBarPanelMousePressed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
		String proposedName = nameField.getText();
		if (proposedName == null | proposedName.equals(""))
		this.object.getClass();
    }//GEN-LAST:event_nameFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel dragBarPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel managementPanel;
    protected javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
