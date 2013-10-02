package com.fixent.scm.client.tenant.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.fixent.scm.client.common.RightSidePanel;
import com.fixent.scm.client.tenant.view.TenantView;
import com.fixent.scm.server.model.Address;
import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.model.Tenant;
import com.fixent.scm.server.service.impl.ShopServiceImpl;
import com.fixent.scm.server.service.impl.TenantServiceImpl;

public class TenantViewController {

	TenantView view;
	List<Shop> shops;
	SaveAction saveAction;
	CancelAction cancelAction;
	Tenant tenant;

	public TenantViewController() {

		saveAction = new SaveAction();
		cancelAction = new CancelAction();
		view = new TenantView();
		view.getSaveBtn().addActionListener(saveAction);
		view.getCancelBtn().addActionListener(cancelAction);
		preInit();
	}

	@SuppressWarnings("unchecked")
	private void preInit() {

		ShopServiceImpl shopServiceImpl = new ShopServiceImpl();
		shops = shopServiceImpl.getShops();

		view.getShopNoCbx().addItem("Select one");

		if (shops != null && !shops.isEmpty()) {
			for (Shop shop : shops) {
				view.getShopNoCbx().addItem(shop.getNumber());
			}
		}

	}

	class SaveAction implements ActionListener {

		public SaveAction() {
			super();
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			tenant = new Tenant();

			tenant.setContactPersonName(view.getNameTxt().getText());
			Address address = new Address();
			address.setCity(view.getCityTxt().getText());
			address.setPincode(((Number) view.getPinCodeTxt().getValue())
					.intValue());
			address.setStreet(view.getStreetTxt().getText());
			address.setState(view.getStateTxt().getText());
			tenant.setAddress(address);
			tenant.setLandLineNumber(((Number) view.getLandlineNoTxt()
					.getValue()).intValue());
			tenant.setMobileNumber(((Number) view.getMobileNoTxt().getValue())
					.intValue());
			Shop shop = null;
			int shopNo = Integer.parseInt(view.getShopNoCbx().getSelectedItem()
					.toString());
			if (shops != null && !shops.isEmpty()) {
				for (Shop dbShops : shops) {
					if (dbShops.getNumber() == shopNo) {
						shop = dbShops;
					}
				}
			}
			shop.setNumber(Integer.parseInt(view.getShopNoCbx()
					.getSelectedItem().toString()));
			tenant.setShopName(view.getShopNameTxt().getText());
			tenant.setShop(shop);

			TenantServiceImpl tenantServiceImpl = new TenantServiceImpl();
			tenantServiceImpl.createTenant(tenant);

			RightSidePanel rightSidePanel = (RightSidePanel) view.getParent();
			rightSidePanel.removeAll();
			rightSidePanel.add(new TenantDashboardController().view,
					BorderLayout.CENTER);
			rightSidePanel.repaint();
			rightSidePanel.revalidate();
			rightSidePanel.setVisible(true);

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

}
