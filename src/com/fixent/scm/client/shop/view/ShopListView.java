/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fixent.scm.client.shop.view;

/**
 *
 * @author Rathi
 */
public class ShopListView extends javax.swing.JPanel {

    /**
     * Creates new form ShopListView
     */
    public ShopListView() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        modifyBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shop ID", "Shop No", "Shop Name"
            }
        ));
        listTable.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(listTable);

        modifyBtn.setBackground(new java.awt.Color(153, 204, 255));
        modifyBtn.setForeground(new java.awt.Color(255, 255, 255));
        modifyBtn.setText("Modify");

        deleteBtn.setBackground(new java.awt.Color(153, 204, 255));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");

        viewBtn.setBackground(new java.awt.Color(153, 204, 255));
        viewBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewBtn.setText("View");

        cancelBtn.setBackground(new java.awt.Color(153, 204, 255));
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Shop List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(modifyBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewBtn)
                        .addComponent(cancelBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modifyBtn)
                        .addComponent(deleteBtn)))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTable;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
	public javax.swing.JButton getCancelBtn() {
		return cancelBtn;
	}

	public void setCancelBtn(javax.swing.JButton cancelBtn) {
		this.cancelBtn = cancelBtn;
	}

	public javax.swing.JButton getDeleteBtn() {
		return deleteBtn;
	}

	public void setDeleteBtn(javax.swing.JButton deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public javax.swing.JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
		this.jScrollPane1 = jScrollPane1;
	}

	public javax.swing.JTable getListTable() {
		return listTable;
	}

	public void setListTable(javax.swing.JTable listTable) {
		this.listTable = listTable;
	}

	public javax.swing.JButton getModifyBtn() {
		return modifyBtn;
	}

	public void setModifyBtn(javax.swing.JButton modifyBtn) {
		this.modifyBtn = modifyBtn;
	}

	public javax.swing.JButton getViewBtn() {
		return viewBtn;
	}

	public void setViewBtn(javax.swing.JButton viewBtn) {
		this.viewBtn = viewBtn;
	}
    
    
}
