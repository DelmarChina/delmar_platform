/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.base.dao;

import java.util.List;

import com.delmar.base.model.DatadictTrl;
import com.delmar.core.dao.CoreDao;

/**
 * @author 刘大磊 2015-02-06 11:07:48
 */
public interface DatadictTrlDao extends CoreDao<DatadictTrl> {

	/**
	 * @param typeId
	 * @param language
	 * @return
	 */
	List<DatadictTrl> getDatadictTrlByTypeId(Integer typeId, String language,Integer clientId);
	List<DatadictTrl> getDatadictTrlByTypeIdAndDate(Integer typeId,String requestDate,
			String language,Integer clientId);
	public void updateIndexOrder(Integer indexOrder,Integer datadictId) ;
}
