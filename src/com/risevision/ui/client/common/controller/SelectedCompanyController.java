// Copyright © 2010 - May 2014 Rise Vision Incorporated.
// Use of this software is governed by the GPLv3 license
// (reproduced in the LICENSE file).

package com.risevision.ui.client.common.controller;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.risevision.ui.client.common.info.CompanyInfo;
import com.risevision.ui.client.common.service.CompanyServiceAsync;
import com.risevision.ui.client.common.service.oauth2.OAuth2ServiceWrapper;

public class SelectedCompanyController {
	private static SelectedCompanyController instance;

	private CompanyInfo selectedCompany; //company selected in Company Selector
	private CompanyInfo userCompany; //company of the logged in user

	private final CompanyServiceAsync companyService = OAuth2ServiceWrapper.getCompanyService();;
	private RpcCallBackHandler rpcCallBackHandler = new RpcCallBackHandler();

	private Command cmdDataLoadedCallBack;

	public void setSelectedCompany(String companyId) {
		companyService.getCompany(companyId, rpcCallBackHandler);
	}
	public void setSelectedCompany(CompanyInfo selectedCompany) {
		this.selectedCompany = selectedCompany;
	}
	public CompanyInfo getSelectedCompany() {
		return selectedCompany;
	}
	public void setUserCompany(CompanyInfo userCompany) {
		this.userCompany = userCompany;
	}
	public CompanyInfo getUserCompany() {
		return userCompany;
	}

	public String getUserCompanyId() {
		if (userCompany != null)
			return userCompany.getId();
		return null;
	}

	public String getSelectedCompanyId() {
		if (selectedCompany!= null)
			return selectedCompany.getId();
		return null;
	}
	
	public boolean isUserCompanySelected() {
		boolean result = true;
		try {
			result = getSelectedCompanyId().equals(getUserCompanyId());
		} catch (Exception e) {}
		
		return result;
	}

	public void setDataLoadedCallBack(Command cmdDataLoadedCallBack) {
		this.cmdDataLoadedCallBack = cmdDataLoadedCallBack;
	}

	public static SelectedCompanyController getInstance() {
		try {
			if (instance == null)
				instance = new SelectedCompanyController();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}

	public void reset() {
		selectedCompany = userCompany;
		bindData();
	}
	
	public void bindData() {
		if (cmdDataLoadedCallBack != null)
			cmdDataLoadedCallBack.execute();
	}

	class RpcCallBackHandler implements AsyncCallback<CompanyInfo> {

		public void onFailure(Throwable caught) {
			// Show the RPC error message to the user
			bindData();
		}

		public void onSuccess(CompanyInfo result) {
			selectedCompany = result;
			bindData();
		}
	}

}
