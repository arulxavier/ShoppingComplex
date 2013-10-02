package com.fixent.scm.client.tenant.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.fixent.scm.client.common.RightSidePanel;
import com.fixent.scm.client.shop.view.ShopListView;
import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.model.Tenant;
import com.fixent.scm.server.service.impl.TenantServiceImpl;

public class TenantListController {

	public ShopListView view;
	ModifyAction modifyAction;
	ViewAction viewAction;
	DeleteAction deleteAction;
	CancelAction cancelAction;
	Shop student;

	public TenantListController() {

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

		TenantServiceImpl tenantServiceImpl = new TenantServiceImpl();
		List<Tenant> tenants = tenantServiceImpl.getTenants();
		TenantListDataTable model = new TenantListDataTable(tenants);
		view.getListTable().setModel(model);
	}

	class ModifyAction implements ActionListener {

		public ModifyAction() {
			super();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			/*
			 * RightSidePanel rightSidePanel = (RightSidePanel)
			 * view.getParent(); rightSidePanel.removeAll();
			 * rightSidePanel.add(new ShopDashboardController().view,
			 * BorderLayout.CENTER); rightSidePanel.repaint();
			 * rightSidePanel.revalidate(); rightSidePanel.setVisible(true);
			 */
		}

	}

	class CancelAction implements ActionListener {

		public CancelAction() {
			super();
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new TenantDashboardController().view,
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

		@Override
		public void actionPerformed(ActionEvent e) {

			/*
			 * RightSidePanel rightSidePanel = (RightSidePanel)
			 * view.getParent(); rightSidePanel.removeAll();
			 * rightSidePanel.add(new ShopDashboardController().view,
			 * BorderLayout.CENTER); rightSidePanel.repaint();
			 * rightSidePanel.revalidate(); rightSidePanel.setVisible(true);
			 */
		}
	}

	class ViewAction implements ActionListener {

		public ViewAction() {
			super();
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			/*
			 * RightSidePanel rightSidePanel = (RightSidePanel)
			 * view.getParent(); rightSidePanel.removeAll();
			 * rightSidePanel.add(new ShopDashboardController().view,
			 * BorderLayout.CENTER); rightSidePanel.repaint();
			 * rightSidePanel.revalidate(); rightSidePanel.setVisible(true);
			 */
		}
	}

}
