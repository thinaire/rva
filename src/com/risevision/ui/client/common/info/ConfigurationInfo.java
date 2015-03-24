// Copyright © 2010 - May 2014 Rise Vision Incorporated.
// Use of this software is governed by the GPLv3 license
// (reproduced in the LICENSE file).

package com.risevision.ui.client.common.info;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ConfigurationInfo implements Serializable  {
	private String riseId;
	private String serverURL;
	private String viewerURL;
	private String mediaLibraryURL;
	private String storeURL;
	private String windowsInstallerURL;
	private String linuxInstallerURL;
	private String macInstallerURL;
	private String installerURL;

	private String logoutURL;
	private String termsURL;
	
	private String financialServerURL;

	private String storeApiURL;
	
	public String getRiseId() {
		return riseId;
	}

	public void setRiseId(String riseId) {
		this.riseId = riseId;
	}
	
	public String getServerURL() {
		return serverURL;
	}
	
	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}

	public String getViewerURL() {
		return viewerURL;
	}

	public void setViewerURL(String viewerURL) {
		this.viewerURL = viewerURL;
	}
	
	public String getMediaLibraryURL() {
		return mediaLibraryURL;
	}

	public void setMediaLibraryURL(String mediaLibraryURL) {
		this.mediaLibraryURL = mediaLibraryURL;
	}

	public String getWindowsInstallerURL() {
		return windowsInstallerURL;
	}

	public void setWindowsInstallerURL(String windowsInstallerURL) {
		this.windowsInstallerURL = windowsInstallerURL;
	}
	
	public String getLinuxInstallerURL() {
		return linuxInstallerURL;
	}

	public void setLinuxInstallerURL(String linuxInstallerURL) {
		this.linuxInstallerURL = linuxInstallerURL;
	}
	
	public String getMacInstallerURL() {
		return macInstallerURL;
	}

	public void setMacInstallerURL(String macInstallerURL) {
		this.macInstallerURL = macInstallerURL;
	}
	
	public String getInstallerURL() {
		return installerURL;
	}

	public void setInstallerURL(String installerURL) {
		this.installerURL = installerURL;
	}
	
	public String getLogoutURL() {
		return logoutURL;
	}

	public void setLogoutURL(String logoutURL) {
		this.logoutURL = logoutURL;
	}
	
	public String getTermsURL() {
		return termsURL;
	}

	public void setTermsURL(String termsURL) {
		this.termsURL = termsURL;
	}

	public String getFinancialServerURL() {
		return financialServerURL;
	}
	
	public void setFinancialServerURL(String financialServerURL) {
		this.financialServerURL = financialServerURL;
	}

	public String getStoreURL() {
		return storeURL;
	}

	public void setStoreURL(String storeURL) {
		this.storeURL = storeURL;
	}
	
	public String getStoreApiURL() {
		return storeApiURL;
	}
	
	public void setStoreApiURL(String storeApiURL) {
		this.storeApiURL = storeApiURL;
	}

}
