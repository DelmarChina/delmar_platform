
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												   *
 *	作者：刘大磊								                                               *
 * 电话：0532-66701118                                                                * 
 * email:liua@delmarchina.com						                               *
 *****************************************************************************/

package com.delmar.rate.service;

import com.delmar.rate.model.Ratemaster;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2014-12-22 17:09:41
 */
public interface RatemasterService extends CoreService<Ratemaster> {
	
	public Ratemaster getRateMasterByRateNo(String rateNo) throws Exception;

	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteRatemasterList(Integer[] ids);
	
	/**
	 * 删除单条记录
	 * @param id
	 */
	public void deleteRatemaster(Integer id);

}