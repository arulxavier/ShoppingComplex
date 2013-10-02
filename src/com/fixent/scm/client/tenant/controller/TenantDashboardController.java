package com.fixent.scm.client.tenant.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.fixent.scm.client.common.RightSidePanel;
import com.fixent.scm.client.tenant.view.TenantDashBoardView;
import com.fixent.scm.server.model.Shop;

public class TenantDashboardController {

	public TenantDashBoardView view;
	SearchAction searchAction;
	AddAction addAction;
	Shop student;

	public TenantDashboardController() {

		searchAction = new SearchAction();
		addAction = new AddAction();
		view = new TenantDashBoardView();
		view.getSearchBtn().addActionListener(searchAction);
		view.getAddBtn().addActionListener(addAction);
	}

	class SearchAction implements ActionListener {

		public SearchAction() {
			super();
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new TenantListController().view,
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

		@Override
		public void actionPerformed(ActionEvent e) {

			RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new TenantViewController().view,
					BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);
		}
	}

}
