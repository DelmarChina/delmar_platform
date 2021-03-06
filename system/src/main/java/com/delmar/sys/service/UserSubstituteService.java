
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.sys.service;

import com.delmar.sys.model.UserSubstitute;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2015-07-07 11:00:49
 */
public interface UserSubstituteService extends CoreService<UserSubstitute> {
	/**
	 * @param ids
	 */
	public void deleteUserSubstituteList(Integer[] ids);
}