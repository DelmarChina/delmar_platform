/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：0532-66701118                                                                * 
 * email:liua@delmarchina.com						                               *
 *****************************************************************************/

package com.delmar.crm.dao.mybatis;

import org.springframework.stereotype.Repository;

import com.delmar.crm.dao.SaleSheetQuotaDao;
import com.delmar.crm.model.SaleSheetQuota;
import com.delmar.core.dao.mybatis.CoreDaoMyBatis;

/**
 * @author 刘大磊 2015-04-21 08:44:27
 */
@Repository("saleSheetQuotaDao") 
public class SaleSheetQuotaDaoMybatis extends CoreDaoMyBatis<SaleSheetQuota> implements SaleSheetQuotaDao {

	/* (non-Javadoc)
	 * @see com.delmar.core.dao.mybatis.CoreDaoMyBatis#getSqlName()
	 */
	@Override
	protected String getSqlName() {
		
		return "com.delmar.crm.mybatis.sql.SaleSheetQuotaMapper";
	}



}
