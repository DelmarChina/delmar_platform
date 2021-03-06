
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.base.service;

import com.delmar.base.model.City;
import com.delmar.base.model.CityWebservice;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2015-03-16 17:51:25
 */
public interface CityWebserviceService extends CoreService<CityWebservice> {
	/**
	 * @param ids
	 */
	public void deleteCityWebserviceList(Integer[] ids);
	
	/**
	 * 根据查询 名获取 City
	 * @param queryName
	 * @return
	 */
	public City getCityByCityWebServiceQueryName(String queryName);
}