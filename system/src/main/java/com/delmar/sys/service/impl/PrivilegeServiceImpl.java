/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delmar.sys.dao.PrivilegeDao;
import com.delmar.sys.model.Privilege;
import com.delmar.sys.service.PrivilegeService;
import com.delmar.core.dao.CoreDao;
import com.delmar.core.service.impl.CoreServiceImpl;

/**
 * @author 刘大磊 22015-01-13 09:38:52
 */
@Service("privilegeService")
public class PrivilegeServiceImpl extends CoreServiceImpl<Privilege> implements
		PrivilegeService {
	@Autowired
	private PrivilegeDao privilegeDao;
	/* (non-Javadoc)
	 * @see CoreService.CoreServiceImpl#getCoreDao()
	 */
	@Override
	protected CoreDao<Privilege> getCoreDao() {
		return privilegeDao;
	}

	
}
