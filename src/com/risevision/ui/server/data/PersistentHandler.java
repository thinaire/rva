// Copyright © 2010 - May 2014 Rise Vision Incorporated.
// Use of this software is governed by the GPLv3 license
// (reproduced in the LICENSE file).

package com.risevision.ui.server.data;

import java.util.logging.Logger;

import javax.jdo.PersistenceManager;

import com.risevision.ui.server.data.PersistentOAuthInfo.OAuthType;

public class PersistentHandler {
	public static final Logger log = Logger.getLogger(PersistentHandler.class.getName());
	
	public void saveConfig() {
		saveConfig(new PersistentConfigurationInfo());
	}
	
	public void saveConfig(PersistentConfigurationInfo config) {
        PersistenceManager pm = PMF.get().getPersistenceManager();

        try {
            pm.makePersistent(config);
        }
        finally {
            pm.close();
        }
	}
	
	public PersistentConfigurationInfo getConfig() {
        PersistenceManager pm = PMF.get().getPersistenceManager();
        PersistentConfigurationInfo config = null;
        
        try {
        	config = pm.getObjectById(PersistentConfigurationInfo.class, PersistentConfigurationInfo.ENTITY_KEY);
        	log.config("Configuration parameters loaded from data store.");
        	
        	return config;
		}
		catch (Exception e) {
			log.severe(e.getMessage());
			e.printStackTrace();
			
			return null;
		}
        finally {
        	pm.close();
        }
	}
		
	public void saveOAuth(PersistentOAuthInfo oAuth) {
        PersistenceManager pm = PMF.get().getPersistenceManager();

        try {
            pm.makePersistent(oAuth);
        } finally {
            pm.close();
        }
	}
	
	public PersistentOAuthInfo getOAuth(OAuthType oAuthType) {
        PersistenceManager pm = PMF.get().getPersistenceManager();
        PersistentOAuthInfo oAuth = null;
        
        try {
        	oAuth = pm.getObjectById(PersistentOAuthInfo.class, oAuthType.getEntityKey());
        	log.config("OAuth parameters loaded from data store.");
        	
        	return oAuth;
		}
		catch (Exception e) {
			log.severe(e.getMessage());
			e.printStackTrace();
			
			return null;
		}
        finally {
        	pm.close();
        }
	}
}
