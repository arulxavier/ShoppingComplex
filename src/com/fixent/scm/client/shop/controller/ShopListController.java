package com.fixent.scm.client.shop.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.fixent.scm.client.common.RightSidePanel;
import com.fixent.scm.client.shop.view.ShopListView;
import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.service.impl.ShopServiceImpl;

public class ShopListController {

	public ShopListView view;
	ModifyAction modifyAction;
	ViewAction viewAction;
	DeleteAction deleteAction;
	CancelAction cancelAction;
	Shop student;

	public ShopListController() {

		modifyAction = new ModifyAction();
		viewAction = new ViewAction();
		deleteAction = new DeleteAction();
		cancelAction = new CancelAction();
		view = new ShopListView();
		view.getModifyBtn().addActionListener(modifyAction);
		view.getViewBtn().addActionListener(viewAction);
		view.getDeleteBtn().addActionListener(deleteAction);
		view.getCancelBtn().addActionListener(cancelAction);
		preInit();
	}

	private void preInit() {
		
		ShopServiceImpl shopServiceImpl = new ShopServiceImpl();
		List<Shop> shops = shopServiceImpl.getShops();
		ShopListDataTable model = new ShopListDataTable(shops);
		view.getListTable().setModel(model);
	}

	class ModifyAction implements ActionListener {

		public ModifyAction() {
			super();
		}

		
		public void actionPerformed(ActionEvent e) {
/*
			RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new ShopDashboardController().view,
					BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);
		*/
		}

	}

	class CancelAction implements ActionListener {

		public CancelAction() {
			super();
		}

		
		public void actionPerformed(ActionEvent e) {

			RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new ShopDashboardController().view,
					BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);
		}
	}
	
	class DeleteAction implements ActionListener {

		public DeleteAction() {
			super();
		}

		
		public void actionPerformed(ActionEvent e) {

		/*	RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new ShopDashboardController().view,
					BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);*/
		}
	}
	
	
	class ViewAction implements ActionListener {

		public ViewAction() {
			super();
		}

		
		public void actionPerformed(ActionEvent e) {

		/*	RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new ShopDashboardController().view,
					BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);*/
		}
	}

}
