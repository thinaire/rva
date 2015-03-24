// Copyright © 2010 - May 2014 Rise Vision Incorporated.
// Use of this software is governed by the GPLv3 license
// (reproduced in the LICENSE file).

package com.risevision.ui.client.common.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.risevision.ui.client.common.exception.ServiceFailedException;
import com.risevision.ui.client.common.info.EmailInfo;
import com.risevision.ui.client.common.info.PrerequisitesInfo;
import com.risevision.ui.client.common.info.RpcResultInfo;
import com.risevision.ui.client.common.info.UserInfo;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("user")
public interface UserService extends RemoteService  {
//    public UsersInfo getUsers(UsersInfo usersInfo) throws ServiceFailedException;
    public UserInfo getUser(String companyId, String userId) throws ServiceFailedException;
    public RpcResultInfo putUser(String companyId, UserInfo user) throws ServiceFailedException;
    public RpcResultInfo updateLastLogin(String companyId, UserInfo user) throws ServiceFailedException;
    public RpcResultInfo deleteUser(String companyId, String userId) throws ServiceFailedException;

//    public UserInfo getUser(String username) throws ServiceFailedException;
    public PrerequisitesInfo getCurrent() throws ServiceFailedException;
    
	public void sendEmail(EmailInfo email);
//	public String getLoginURL(String URL);

}
