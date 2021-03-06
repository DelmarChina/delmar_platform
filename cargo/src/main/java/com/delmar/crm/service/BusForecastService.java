
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.crm.service;

import java.util.List;

import com.delmar.crm.model.BusForecast;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2015-04-21 08:33:00
 */
public interface BusForecastService extends CoreService<BusForecast> {
	/**
	 * @param ids
	 */
	public void deleteBusForecastList(Integer[] ids);
	public void deleteBusForecastByRecordId(Integer linkRecordId);
	public void deleteBusForecastById(Integer id);
	public List<BusForecast> selectByLinkRecordId(Integer linkRecordId);
}