/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delmar.base.dao.NameaccountsDao;
import com.delmar.base.model.Nameaccounts;
import com.delmar.base.service.NameaccountsService;
import com.delmar.core.dao.CoreDao;
import com.delmar.core.service.impl.CoreServiceImpl;

/**
 * @author 刘大磊 22014-12-22 13:26:54
 */
@Service("nameaccountsService")
public class NameaccountsServiceImpl extends CoreServiceImpl<Nameaccounts> implements
		NameaccountsService {
	@Autowired
	private NameaccountsDao nameaccountsDao;
	/* (non-Javadoc)
	 * @see CoreService.CoreServiceImpl#getCoreDao()
	 */
	@Override
	protected CoreDao<Nameaccounts> getCoreDao() {
		return nameaccountsDao;
	}

	
}
