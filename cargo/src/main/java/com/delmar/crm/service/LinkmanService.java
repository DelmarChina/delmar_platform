
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.crm.service;

import com.delmar.core.service.CoreService;
import com.delmar.crm.model.Linkman;

/**
 * @author 刘大磊 2015-03-04 16:06:05
 */
public interface LinkmanService extends CoreService<Linkman> {
	/**
	 * @param ids
	 */
	public void deleteLinkmanList(Integer[] ids);
	
	public Linkman getLinkman(Integer customerId,String ismain);
	public void updateTimesData(Integer id);
	public void deleteByCustomerId(Integer customerId);
	public void deleteById(Integer id);
	public String getNamebyId(Integer id);
}