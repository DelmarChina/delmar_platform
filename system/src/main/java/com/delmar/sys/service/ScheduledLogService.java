
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.sys.service;

import com.delmar.sys.model.ScheduledLog;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2015-08-24 16:48:41
 */
public interface ScheduledLogService extends CoreService<ScheduledLog> {
	/**
	 * @param ids
	 */
	public void deleteScheduledLogList(Integer[] ids);
}