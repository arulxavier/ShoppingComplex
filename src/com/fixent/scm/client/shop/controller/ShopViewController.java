package com.fixent.scm.client.shop.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.fixent.scm.client.common.RightSidePanel;
import com.fixent.scm.client.shop.view.ShopView;
import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.model.ShopGroup;
import com.fixent.scm.server.service.impl.ShopServiceImpl;

public class ShopViewController {
	
	ShopView view;
	
	SaveAction saveAction;
	CancelAction cancelAction;
	Shop shop;
	
	public ShopViewController() {
		
		saveAction = new SaveAction();
		cancelAction= new CancelAction();
		view = new ShopView();
		view.getSaveBtn().addActionListener(saveAction);
		view.getCancelBtn().addActionListener(cancelAction);
		preInit();
	}
	
	@SuppressWarnings("unchecked")
	private void preInit() {
		view.getGroupNameCbx().addItem("Select one");
		view.getGroupNameCbx().addItem("Group1");
	}

	class SaveAction 
	implements ActionListener {
		
		public SaveAction() {
			super();
		}

		
		public void actionPerformed(ActionEvent e) {
			
			shop = new Shop();
			ShopGroup shopGroup = new ShopGroup();
			shopGroup.setId(1);
			shop.setGroup(shopGroup);
			shop.setNumber(Integer.parseInt(view.getShopNoTxt().getText()));
			shop.setRentPerSqrtFeet(((Number)view.getSqFtRateTxt().getValue()).doubleValue());
			shop.setSqrtFeet(((Number)view.getTotalSqlfeetTxt().getValue()).doubleValue());
						
			ShopServiceImpl shopServiceImpl = new ShopServiceImpl();
			shopServiceImpl.createShop(shop);
			
			RightSidePanel rightSidePanel = (RightSidePanel)view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new ShopDashboardController().view, BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);
			
		}
		
	}
	
	class CancelAction 
	implements ActionListener {
		
		public CancelAction() {
			super();
		}

		
		public void actionPerformed(ActionEvent e) {
			
			RightSidePanel rightSidePanel = (RightSidePanel)view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new ShopDashboardController().view, BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);
		}
	}

}
