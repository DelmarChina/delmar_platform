
/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：0532-66701118                                                          * 
 * email:liua@delmarchina.com						                          *
 *****************************************************************************/

package com.delmar.base.service;

import java.math.BigDecimal;

import com.delmar.base.model.Chargename;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2014-12-22 13:26:54
 */
public interface ChargenameService extends CoreService<Chargename> {
	
	public Integer GetIdByCode(String code) throws Exception;
	
	/**
	 * 根据运输货物的重量，体积，获取卡车类型
	 * @param grossWeight
	 * @param volume
	 * @return
	 */
	public Chargename selectConformTruck(BigDecimal grossWeight,
			BigDecimal volume,String extraType) ;
}