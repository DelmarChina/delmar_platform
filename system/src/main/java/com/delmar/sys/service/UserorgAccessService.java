
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.sys.service;

import java.util.List;

import com.delmar.core.service.CoreService;
import com.delmar.sys.model.UserorgAccess;

/**
 * @author 刘大磊 2015-01-13 09:38:52
 */
public interface UserorgAccessService extends CoreService<UserorgAccess> {
	public List<UserorgAccess> selectUserorgAccessByUserId(Integer userId);
}