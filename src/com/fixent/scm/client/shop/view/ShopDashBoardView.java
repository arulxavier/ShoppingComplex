/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fixent.scm.client.shop.view;

/**
 *
 * @author Rathi
 */
public class ShopDashBoardView extends javax.swing.JPanel {

    /**
     * Creates new form DashBoardShop
     */
    public ShopDashBoardView() {
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

        shopNoLbl = new javax.swing.JLabel();
        shopNoTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        shopNameLbl = new javax.swing.JLabel();
        shopNameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        shopNoLbl.setText("Shop No");

        addBtn.setBackground(new java.awt.Color(153, 204, 255));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");

        searchBtn.setBackground(new java.awt.Color(153, 204, 255));
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");

        shopNameLbl.setText("Shop Name");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("DashBoard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shopNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(shopNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shopNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addBtn))
                                    .addComponent(shopNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shopNoLbl)
                    .addComponent(shopNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shopNameLbl)
                    .addComponent(shopNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(addBtn))
                .addContainerGap(246, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel shopNameLbl;
    private javax.swing.JTextField shopNameTxt;
    private javax.swing.JLabel shopNoLbl;
    private javax.swing.JTextField shopNoTxt;
    // End of variables declaration//GEN-END:variables
	public javax.swing.JButton getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(javax.swing.JButton addBtn) {
		this.addBtn = addBtn;
	}

	public javax.swing.JButton getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(javax.swing.JButton searchBtn) {
		this.searchBtn = searchBtn;
	}

	public javax.swing.JLabel getShopNameLbl() {
		return shopNameLbl;
	}

	public void setShopNameLbl(javax.swing.JLabel shopNameLbl) {
		this.shopNameLbl = shopNameLbl;
	}

	public javax.swing.JTextField getShopNameTxt() {
		return shopNameTxt;
	}

	public void setShopNameTxt(javax.swing.JTextField shopNameTxt) {
		this.shopNameTxt = shopNameTxt;
	}

	public javax.swing.JLabel getShopNoLbl() {
		return shopNoLbl;
	}

	public void setShopNoLbl(javax.swing.JLabel shopNoLbl) {
		this.shopNoLbl = shopNoLbl;
	}

	public javax.swing.JTextField getShopNoTxt() {
		return shopNoTxt;
	}

	public void setShopNoTxt(javax.swing.JTextField shopNoTxt) {
		this.shopNoTxt = shopNoTxt;
	}
    
}
