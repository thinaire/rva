package com.risevision.ui.client.common.controller;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.risevision.ui.client.UiEntryPoint;

public class CommonHeaderController {

	public static void init() {
		exportStaticMethods();
	}
	
	public static native void exportStaticMethods() /*-{
		$wnd.rva__reportUserLoggedIn =
		$entry(@com.risevision.ui.client.common.controller.CommonHeaderController::reportUserLoggedIn());
		
		$wnd.rva__reportUserLoggedOut =
		$entry(@com.risevision.ui.client.common.controller.CommonHeaderController::reportUserLoggedOut());
	}-*/;
	
	private static void reportUserLoggedIn() {
		UiEntryPoint.getInstance().loadPrerequisites();
	}
	
	private static void reportUserLoggedOut() {
		PrerequisitesController.getInstance().clear();
	}
	
	public static void updateCompanyId(String companyId) {
		updateCompanyIdNative(companyId);
	}
	
	public static int getContentHeight() {
		return Window.getClientHeight() - (31 +
		RootPanel.get("commonHeaderContainer").getElement().getClientHeight());
	}
	
	private static native void updateCompanyIdNative(String companyId) /*-{
		$wnd.angular.element($wnd.document.getElementsByTagName("common-header")).scope().updateCompanyId(companyId);
	}-*/;
}
