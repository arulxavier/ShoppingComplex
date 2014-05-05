package com.fixent.scm.client.shop.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.fixent.scm.client.common.RightSidePanel;
import com.fixent.scm.client.shop.view.ShopDashBoardView;
import com.fixent.scm.server.model.Shop;

public class ShopDashboardController {

	public ShopDashBoardView view;
	SearchAction searchAction;
	AddAction addAction;
	Shop student;

	public ShopDashboardController() {

		searchAction = new SearchAction();
		addAction = new AddAction();
		view = new ShopDashBoardView();
		view.getSearchBtn().addActionListener(searchAction);
		view.getAddBtn().addActionListener(addAction);
	}

	class SearchAction implements ActionListener {

		public SearchAction() {
			super();
		}

		
		public void actionPerformed(ActionEvent e) {

			RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new ShopListController().view,
					BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);
		
		}

	}

	class AddAction implements ActionListener {

		public AddAction() {
			super();
		}

		
		public void actionPerformed(ActionEvent e) {

			RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new ShopViewController().view,
					BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);
		}
	}

}
