/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.crm.dao;

import com.delmar.core.dao.CoreDao;
import com.delmar.crm.model.CustomerExtra;

/**
 * @author 刘大磊 2015-03-04 16:06:05
 */
public interface CustomerExterDao extends CoreDao<CustomerExtra> {
	
	public void updateTimesData(Integer id);

}
